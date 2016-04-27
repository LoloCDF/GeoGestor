package zinlok.server.cliente;

import java.util.ArrayList;

public class CompruebaNumClientes extends Thread implements CompruebaNumClientesInterfaz{
	// Parámetros para comprobar
	SirveCliente servidor = null;
	
	public CompruebaNumClientes (SirveCliente servidor){
		this.servidor = servidor;
	}
	
	public void run (){
		// Parámetros para comprobar el número de conexiones existentes
		ArrayList<Cliente> listaClientes = null;
		int i = 0;
		
		listaClientes=this.servidor.obtenerLista();

		while(true){	
			for(i=0; i<listaClientes.size();i++){
				if (listaClientes.get(i).isAlive()==false){
					this.servidor.decrementaLista();
					listaClientes.remove(i);
				}
			}
		}			
	}
}
