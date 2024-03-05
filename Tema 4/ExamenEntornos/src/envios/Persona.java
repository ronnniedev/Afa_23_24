package envios;

public class Persona {
	private String dni;
	private String nom;
	
	public Persona(String d,String n) {
		this.dni=d;
		this.nom=n;
	}
	
	public String getDni() {
		return this.dni;
	}
	public String getNombre() {
		return this.nom;
	}
	
	public void setDni(String d) {
		this.dni=d;
		}
	public void setNombre(String n) {
		this.nom=n;
		}
		public String toString() {
		return "DNI: "+this.dni	+"\nNOMBRE: "+this.nom+"\n";
	}
	
	
	
}
