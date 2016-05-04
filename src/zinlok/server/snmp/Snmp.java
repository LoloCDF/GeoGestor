package zinlok.server.snmp;

import java.util.Vector;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

import com.sun.management.snmp.SnmpOid;
import com.sun.management.snmp.SnmpPdu;
import com.sun.management.snmp.SnmpValue;
import com.sun.management.snmp.SnmpVarBind;
import com.sun.management.snmp.agent.*;

import com.sun.management.comm.SnmpAdaptorServer;
import com.sun.management.snmp.manager.SnmpRequest;

import zinlok.server.geogestor.GEOGESTOR_MIB;

public class Snmp implements SnmpInterfaz {
	// Atributos gestionables
	private int numClientes = 0;
	private Tabla[] tabla ={null,null,null};
	
	public Snmp() {
		// Creamos las filas de la tabla
		for (int i=0; i<3; i++){
			tabla[i]=new Tabla();
			tabla[i].setIpIndex(tabla[i].getIpIndex()+i+1);
		}
				
        GEOGESTOR_MIB mib = new GEOGESTOR_MIB(this);
        int port = 5001;
        SnmpAdaptorServer snmpAdaptor = new SnmpAdaptorServer(port);

		  try {
	            // The agent is started on a non standard SNMP port: 8085

	            // Start the adaptor
	            snmpAdaptor.start();

	            // Send a coldStart SNMP Trap
	            snmpAdaptor.snmpV1Trap(0, 0, null);

	            // Create the MIB you want in the agent (ours is MIB-II subset)
				// Initialize the MIB so it creates the associated MBeans
	            mib.init();

	            // Bind the MIB to the SNMP adaptor
	            mib.setSnmpAdaptor(snmpAdaptor); 
	            
	            
	            // Inicializamos la tabla
		  } catch (Exception e) {
	            e.printStackTrace();
	        }
        
	}
	
	public void aumentaClientes(){
		this.numClientes++;
	}
	
	public void decrementaClientes(){
		this.numClientes--;
	}
	
	public int getNumClientes(){
		return this.numClientes;
	}
	
	public Tabla[] getTabla(){
		return this.tabla;
	}
}
