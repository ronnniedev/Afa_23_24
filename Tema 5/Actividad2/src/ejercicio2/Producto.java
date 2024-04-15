package ejercicio2;

public class Producto implements Comparable{

	private String nombre;
	private int cantidad;
	private int precio;
	
	public Producto(int numero) {
		
		this.nombre = "producto" + numero;
		this.cantidad = (int)((Math.random()*50)+1);
		this.precio = (int)((Math.random()*100)+1);
		
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
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}

	@Override
	public int compareTo(Object o) {
		return 1;
	}


	
	
	
	
}
