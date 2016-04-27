package zinlok.server.cliente;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SirveCliente extends Thread implements SirveClienteInterfaz {
	// Variables para el manejo de la tabla de clientes conectados
	private int maximo = 10;
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	private Cliente cliente = null;
	private int numeroActual = 0;
	private ServerSocket skServidor;
	private Socket skCliente;
	
	// Puerto del servidor
	int puerto = 5000;
	
	// Manejo del bucle
	int i = 0;
	
	public SirveCliente(){
	}
	
	public void run(){
		try{
			this.skServidor = new ServerSocket(this.puerto);
			System.out.println("Escucho el puerto "+this.puerto);
			
			while(true){				
				if (numeroActual < maximo){
					// Primera parte, cuando encontremos un cliente, lo atendemos
					this.skCliente=this.skServidor.accept();
					this.numeroActual++;
					System.out.println("Sirvo al cliente: " + this.skCliente.getInetAddress().toString());
					this.cliente=new Cliente(skCliente);
					this.cliente.start();
					this.listaClientes.add(this.cliente);
				}
			}
		} catch( Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<Cliente> obtenerLista(){
		return listaClientes;
	}
	
	public void decrementaLista(){
		this.numeroActual--;
	}
	
	public int obtieneNumClientes(){
		return this.numeroActual;
	}

}
