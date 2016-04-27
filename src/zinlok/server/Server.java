package zinlok.server;

import zinlok.server.cliente.*;

public class Server {
	public static void main (String[] args){
		
		SirveCliente servidor = new SirveCliente();
		CompruebaNumClientes comprueba = new CompruebaNumClientes(servidor);
		
		servidor.start();
		comprueba.start();
		
		while(true);
	}
}
