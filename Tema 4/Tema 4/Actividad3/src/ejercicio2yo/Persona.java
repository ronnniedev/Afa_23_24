package ejercicio2yo;

public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String nif;
	
	public Persona(String nombre, String apellidos, String nif) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		
	}

	@Override
	public String toString() {
		return "\nUsuario ---> Nombre" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + "]";
	}
	
	
	
	
}
