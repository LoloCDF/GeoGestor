package zinlok.server.geolocalizacion;

import java.net.InetAddress;

import zinlok.server.snmp.Snmp;

public interface LocalizaInterfaz {
	
	// Le pasamos una dirección IP y entrada de la tabla y nos la rellena
	public void insertaLocalizacion(InetAddress ip, Snmp agente, int posicion);
}
