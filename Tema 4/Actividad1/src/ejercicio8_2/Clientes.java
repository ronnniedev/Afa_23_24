package ejercicio8_2;

public class Clientes {

	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private String nacimiento;
	
	public Clientes(String nombre, String apellidos, String telefono, String email, String nacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.nacimiento = nacimiento;
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nacimiento
	 */
	public String getNacimiento() {
		return nacimiento;
	}

	/**
	 * @param nacimiento the nacimiento to set
	 */
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		return "Clientes [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email
				+ ", nacimiento=" + nacimiento + "]";
	}
	
	
	
	
}
