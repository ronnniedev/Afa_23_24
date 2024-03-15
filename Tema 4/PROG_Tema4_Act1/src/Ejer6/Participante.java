package Ejer6;

public class Participante {
	//nombre, apellidos, edad, dirección, teléfono
	private String nombre;
	private String apellidos;
	private int edad;
	private String direccion;
	private String telefono;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param direccion
	 * @param telefono
	 */
	public Participante(String nombre, 
			String apellidos, int edad, 
			String direccion, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", direccion="
				+ direccion + ", telefono=" + telefono + "]\n";
	}
	
	
}
