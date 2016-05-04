package zinlok.server.cliente;

import java.net.*;
import zinlok.server.protocolo.*;
import zinlok.server.snmp.Snmp;

import java.io.*;

public class Cliente extends Thread implements ClienteInterfaz {
	// Variable que guarda el socket del cliente
	private Socket miSocket;
	private Snmp agente = null;
	private int posicion = 0;
	
	public Cliente(Socket skCliente, Snmp agente, int posicion){
		this.miSocket = skCliente;
		this.agente = agente;
		this.posicion = posicion;
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
			this.agente.getTabla()[this.posicion].liberar();
			this.miSocket.close();
		}
		catch (IOException ex){
			System.out.println("Problema al cerrar el socket.");
		}
				
		Thread.currentThread().interrupt();		
	}
}
