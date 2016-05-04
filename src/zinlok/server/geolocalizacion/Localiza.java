package zinlok.server.geolocalizacion;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;

import zinlok.server.snmp.Snmp;


public class Localiza {
	private File bbdd = null;
	private DatabaseReader.Builder constructor = null;
	private DatabaseReader buscador = null;
	
	public Localiza() throws IOException{
		// Abrimos la fase de datos y la reflejamos en "bbdd"
		this.bbdd=new File("/home/salas/git/GeoGestor/rsc/GeoLite2-City.mmdb");		
		this.constructor=new DatabaseReader.Builder(this.bbdd);
		this.buscador=this.constructor.build();
	}
	
	public void insertaLocalizacion(InetAddress ip, Snmp agente, int posicion) throws IOException, GeoIp2Exception{
		
		CityResponse global = this.buscador.city(ip);
		
		String ciudad = global.getCity().getName();
		String pais = global.getCountry().getName();
		if(ciudad.isEmpty())
			System.out.println("La IP no está en la BBDD, quizás sea una IP privada.");
		agente.getTabla()[posicion].setCiudad(ciudad);
		agente.getTabla()[posicion].setLocalizacion(pais);
	}
}
