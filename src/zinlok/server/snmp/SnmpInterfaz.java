package zinlok.server.snmp;

// Para iniciar servidor Snmp y manejar todo lo relacionado con él
public interface SnmpInterfaz {
	
	// Aumenta el número de clientes del servidor
	public void aumentaClientes();
	
	// Disminuye el número de clientes del servidor
	public void decrementaClientes();
	
	// Obtiene el número de clientes
	public int getNumClientes();
}
