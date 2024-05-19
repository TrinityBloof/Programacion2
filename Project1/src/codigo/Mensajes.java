package codigo;

public class Mensajes {
	
	String mes = "vacio";
	String who = "vacio";
	
	public Mensajes(String m, String w) {
		this.mes = m;
		this.who = w;
	}
	
	public String getMessage() {
		return this.mes;
	}
	
	public String getWho() {
		return this.who;
	}
	
}
