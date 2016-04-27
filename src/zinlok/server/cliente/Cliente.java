package zinlok.server.cliente;

import java.net.*;
import zinlok.server.protocolo.*;

import java.io.*;

public class Cliente extends Thread implements ClienteInterfaz {
	// Variable que guarda el socket del cliente
	private Socket miSocket;
	
	public Cliente(Socket skCliente){
		this.miSocket = skCliente;
	}
	
	public void run(){
		
		// Clase de comunicaciones
		Comunicacion comunicaciones = null;
		
		// Mensaje
		Mensaje mensaje = null;
		
		// Leemos del stream para ver que nos pide el cliente		
		try {
			comunicaciones = new Comunicacion(this.miSocket);
			mensaje=comunicaciones.leeMensaje();
			
			// Comprobamos que se ha mandado algo correcto
			if (mensaje!=null){
				
				if (mensaje.obtieneComando().compareTo("activate")==0){
					System.out.println("Recibido mensaje: "+mensaje.obtieneComando()+mensaje.obtieneParametro());
				}
			}
			
			System.out.println("Se ha cerrado la conexión con el cliente: "+miSocket.getInetAddress().getHostAddress());
			this.miSocket.close();
		}
		catch (IOException ex){
			System.out.println("Problema al cerrar el socket.");
		}
				
		Thread.currentThread().interrupt();		
	}
}
