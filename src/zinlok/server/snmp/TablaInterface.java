package zinlok.server.snmp;

// Definición de tabla con los atributos SNMP
public interface TablaInterface {
	
	public int getIpIndex();
	public void setIpIndex(int ipIndex);
	
	public String getIpAddr();
	public void setIpAddr(String ipAddr);
	
	public int getNconexiones();
	public void setNconexiones(int nconexiones);
	
	public String getUrl();
	public void setUrl(String url);
	
	public String getLocalizacion();
	public void setLocalizacion(String localizacion);
	
	public String getCiudad();
	public void setCiudad(String ciudad);
	
	public Boolean estaOcupado();
	public void ocupar();
	public void liberar();
	}
