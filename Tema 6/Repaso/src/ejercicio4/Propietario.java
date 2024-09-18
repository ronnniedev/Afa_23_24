package ejercicio4;

public class Propietario {
	
	String nombre;
	String apellidos;
	
	
	public Propietario(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	

}
