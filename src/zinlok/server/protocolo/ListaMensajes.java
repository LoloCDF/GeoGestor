package zinlok.server.protocolo;

public class ListaMensajes implements ListaMensajesInterfaz {
	
	private String[] comandos = {"activate","response"};
	private String[] parametros = {"OK","ERROR"};
	
	public ListaMensajes(){
	}
	
	public String[] comandosValidos(){
		return this.comandos;
	}
	
	public String[] parametrosValidos(){
		return this.parametros;
	}
}
