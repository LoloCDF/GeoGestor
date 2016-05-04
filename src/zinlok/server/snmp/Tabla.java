package zinlok.server.snmp;

public class Tabla implements TablaInterface{
	private int ipIndex = 0;
	private String ipAddr = "0.0.0.0";
	private int nconexiones = 0;
	private String url = "none";
	private String localizacion = "desconocida";
	private String ciudad = "desconocida";
	private Boolean ocupado = false;
	
	public int getIpIndex(){
		return this.ipIndex;
	}
	public void setIpIndex(int ipIndex){
		this.ipIndex=ipIndex;
	}
	
	public String getIpAddr(){
		return this.ipAddr;
	}
	public void setIpAddr(String ipAddr){
		this.ipAddr=ipAddr;
	}
	
	public int getNconexiones(){
		return this.nconexiones;
	}
	public void setNconexiones(int nconexiones){
		this.nconexiones=nconexiones;
	}
	
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url=url;
	}
	
	public String getLocalizacion(){
		return this.localizacion;
	}
	public void setLocalizacion(String localizacion){
		this.localizacion=localizacion;
	}
	
	public String getCiudad(){
		return this.ciudad;
	}
	public void setCiudad(String ciudad){
		this.ciudad=ciudad;
	}
	
	public Boolean estaOcupado(){
		return this.ocupado;
	}
	
	public void ocupar(){
		this.ocupado=true;
	}
	
	public void liberar(){
		this.ocupado=false;
	}
}
