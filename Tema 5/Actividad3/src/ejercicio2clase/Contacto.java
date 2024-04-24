package ejercicio2clase;

public class Contacto {

	private String nombre;
	private Telefono telefono;
	private String direccion;
	
	public Contacto( String valorTelefono, String nombre, String direccion) {
		this.nombre = nombre;
		this.telefono = new Telefono(valorTelefono);
		this.direccion = direccion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the telefono
	 */
	public Telefono getTelefono() {
		return telefono;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono.getValor() + ", direccion=" + direccion + "]";
	}
	
	
	
	
}
