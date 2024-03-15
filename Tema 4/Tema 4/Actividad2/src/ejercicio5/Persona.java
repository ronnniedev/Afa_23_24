package ejercicio5;

public class Persona {
	
	protected String nombre;
	protected String apellidos;
	protected String nif;
	protected Direccion direccion;
	


	/**
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param direccion
	 */
	public Persona(String nombre, String apellidos, String nif, Direccion direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.direccion = direccion;
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

	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", direccion=" + direccion
				+ "]";
	}

	
	
	
}
