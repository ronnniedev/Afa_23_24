package ficheros;

public class Profesor {

	private String nombre;
	private String telefono;
	/**
	 * @param nombre
	 * @param telefono
	 */
	public Profesor(String nombre, String telefono) {
		this.nombre = nombre;
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
		return "Profesor [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
}
