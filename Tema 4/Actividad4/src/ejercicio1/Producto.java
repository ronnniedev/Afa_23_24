package ejercicio1;

public class Producto {

	protected String ref;
	protected String nombre;
	protected double precio;
	/**
	 * @param ref
	 * @param nombre
	 * @param precio
	 */
	public Producto(String ref, String nombre, double precio) {
		super();
		this.ref = ref;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Producto [ref=" + ref + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public double precioConIva(int porcentaje) {
		return (precio+(precio*porcentaje/100));
	}
	/**
	 * En el padre el metodo es final y no se puede sobrescribir 
	 * @param porcentaje
	 * @return
	 */
	public final double precioConDto(int porcentaje) {
		
		return (precio - (precio*porcentaje/100));
	}
	
}
