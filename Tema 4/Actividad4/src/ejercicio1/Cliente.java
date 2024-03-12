package ejercicio1;

public class Cliente {

	private String nombre;
	private String telefono;
	
	/**
	 * @param nombre
	 * @param telefono
	 */
	public Cliente(String nombre, String telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
}
