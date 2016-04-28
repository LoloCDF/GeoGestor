package zinlok.server;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import com.sun.jdmk.comm.HtmlAdaptorServer;
import com.sun.management.comm.SnmpAdaptorServer;
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpStandardMetaServer;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;

import zinlok.server.cliente.*;
import zinlok.server.geogestor.*;

public class Server {
	public static void main (String[] args){
		SirveCliente servidor = new SirveCliente();
		CompruebaNumClientes comprueba = new CompruebaNumClientes(servidor);
		
		   MBeanServer server;
	        ObjectName htmlObjName;
	        ObjectName snmpObjName;
	        ObjectName mibObjName;
	        ObjectName trapGeneratorObjName;
	        int htmlPort = 8082;
	        int snmpPort = 8085; // non-standard
		
		servidor.start();
		comprueba.start();	   
		
        try {
            server = MBeanServerFactory.createMBeanServer();
            String domain = server.getDefaultDomain();

            // Create and start the HTML adaptor.
            //
            htmlObjName = new ObjectName( domain +
				":class=HtmlAdaptorServer,protocol=html,port=" 
					 + htmlPort);
            HtmlAdaptorServer htmlAdaptor = new HtmlAdaptorServer(htmlPort);
            server.registerMBean(htmlAdaptor, htmlObjName);
            htmlAdaptor.start();

            // Create and start the SNMP adaptor.
            //
            snmpObjName = new ObjectName(domain +
                ":class=SnmpAdaptorServer,protocol=snmp,port=" + snmpPort);
            SnmpAdaptorServer snmpAdaptor = new SnmpAdaptorServer(snmpPort);
            server.registerMBean(snmpAdaptor, snmpObjName);
            snmpAdaptor.start();

            // The rest of the code is specific to our SNMP agent

            // Send a coldStart SNMP Trap (use port = snmpPort+1)
            // Trap communities are defined in the ACL file
            //
            snmpAdaptor.setTrapPort(new Integer(snmpPort+1));
            snmpAdaptor.snmpV1Trap(0, 0, null);

            // Create the MIB-II (RFC 1213) and add it to the MBean server.
            //
            mibObjName = new ObjectName("snmp:class=RFC1213_MIB");
            GEOGESTOR_MIB mib2 = new GEOGESTOR_MIB();
            // The MBean will register all group and table entry MBeans
            // during its pre-registration
            server.registerMBean(mib2, mibObjName);

            // Bind the SNMP adaptor to the MIB
            mib2.setSnmpAdaptorName(snmpObjName);
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        while(true);
		
	}
}
