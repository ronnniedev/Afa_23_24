package ejercicio3;

public abstract class Persona implements I_Humano{

	protected String nombre;
	protected String apellidos;
	protected String nif;
	protected Direccion direccion;
	public static int contVeces = 0;
	
	public int getContVeces() {
		return contVeces;
	}
	
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


	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
