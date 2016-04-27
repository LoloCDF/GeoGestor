package zinlok.server.cliente;

import java.util.ArrayList;

/* No requiere ningún parámetro de entrada */
public interface SirveClienteInterfaz {
	/* Método de ejecución principal del hilo.
	 * -> Recibe: nada
	 * -> Devuelve: nada
	 */
	public void run();
	
	/* Obtenemos la lista de conexiones al servidor
	 * -> Recibe: nada
	 * -> Devuelve: lista de objetos "Cliente"
	 */
	public ArrayList<Cliente> obtenerLista();
	
	/* Método para decrementar el número de clientes cuando se desconecte
	 * uno.
	 * -> Recibe: nada
	 * -> Devuelve: nada
	 */
	public void decrementaLista();
	
	/* Método para obtener el número de clientes según el server
	 * -> Recibe: nada
	 * -> Devuelve: nada
	 */
	public int obtieneNumClientes();
}
