package zinlok.server.protocolo;

// Simple lista con los comandos aceptados por el protocolo
public interface ListaMensajesInterfaz {
	
	/* Devuelve una lista con comándos estándar
	 * 	-> Recibe: nada
	 * 	-> Devuelve: lista con comándos
	 */
	public String[] comandosValidos();
	
	/* Devuelve una lista con parámetros estándar
	 * 	-> Recibe: nada
	 * 	-> Devuelve: lista con parámetros
	 */
	public String[] parametrosValidos();
	
}