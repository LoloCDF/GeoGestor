package zinlok.server;

import java.lang.management.ManagementFactory;

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
import zinlok.server.snmp.Snmp;

public class Server {
	public static void main (String[] args){
		Snmp servidorSnmp = new Snmp();
		SirveCliente servidor = new SirveCliente(servidorSnmp);
		CompruebaNumClientes comprueba = new CompruebaNumClientes(servidor);
		
		
		servidor.start();
		comprueba.start();	   
		
		

        while(true);
		
	}
}
