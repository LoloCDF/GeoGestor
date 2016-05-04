package zinlok.server.cliente;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.maxmind.geoip2.exception.GeoIp2Exception;

import zinlok.server.geolocalizacion.Localiza;
import zinlok.server.snmp.Snmp;

public class SirveCliente extends Thread implements SirveClienteInterfaz {
	// Variables para el manejo de la tabla de clientes conectados
	private int maximo = 10;
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	private Cliente cliente = null;
	private ServerSocket skServidor;
	private Socket skCliente;
	private Snmp servidorSnmp = null;
	private Localiza localizador = null;
	// Puerto del servidor
	int puerto = 5000;
	
	// Manejo del bucle
	int i = 0;
	
	public SirveCliente(Snmp servidorSnmp){
		this.servidorSnmp=servidorSnmp;
	}
	
	public void run(){
		int i = 0;
		int posicion = -1;
		
		try{
			this.localizador=new Localiza();
			this.skServidor = new ServerSocket(this.puerto);
			System.out.println("Escucho el puerto "+this.puerto);
			
			while(true){				
				if (this.servidorSnmp.getNumClientes() < maximo){
					// Primera parte, cuando encontremos un cliente, lo atendemos
					this.skCliente=this.skServidor.accept();
					this.servidorSnmp.aumentaClientes();
					
					// ¿Ha vuelto a conectarse la IP?
					for (i=0;i<this.servidorSnmp.getTabla().length; i++){
						if(skCliente.getInetAddress().getHostAddress().equals(this.servidorSnmp.getTabla()[i].getIpAddr())){
							posicion=i;
							this.servidorSnmp.getTabla()[posicion].setNconexiones(this.servidorSnmp.getTabla()[posicion].getNconexiones()+1);
							i=this.servidorSnmp.getTabla().length;
						}
					}
					
					if (posicion==-1){
					// Buscamos si hay hueco libre
					for (i=0; i<this.servidorSnmp.getTabla().length; i++){
						if (!this.servidorSnmp.getTabla()[i].estaOcupado()){
							posicion=i;
							this.servidorSnmp.getTabla()[posicion].setNconexiones(this.servidorSnmp.getTabla()[posicion].getNconexiones()+1);
							i=this.servidorSnmp.getTabla().length;
						}
					}
					}
					this.servidorSnmp.getTabla()[posicion].ocupar();
					this.servidorSnmp.getTabla()[posicion].setIpAddr(this.skCliente.getInetAddress().getHostAddress());
					this.localizador.insertaLocalizacion(skCliente.getInetAddress(), servidorSnmp, posicion);
					
					System.out.println("Sirvo al cliente: " + this.skCliente.getInetAddress().toString());
					this.cliente=new Cliente(skCliente,servidorSnmp,posicion);
					this.cliente.start();
					this.listaClientes.add(this.cliente);
					posicion=-1;
				}
			}
		} catch( IOException e){
			System.out.println(e.getMessage());
		} catch (GeoIp2Exception e) {
			System.out.println("La IP no está en la BBDD, tal vez sea una IP privada.");
			System.out.println("Sirvo al cliente: " + this.skCliente.getInetAddress().toString());
			this.cliente=new Cliente(skCliente,servidorSnmp,posicion);
			this.cliente.start();
			this.listaClientes.add(this.cliente);
			posicion=-1;
		}
	}
	
	public ArrayList<Cliente> obtenerLista(){
		return listaClientes;
	}
	
	public void decrementaLista(){
		this.servidorSnmp.decrementaClientes();;
	}
	
	public int obtieneNumClientes(){
		return this.servidorSnmp.getNumClientes();
	}

}
