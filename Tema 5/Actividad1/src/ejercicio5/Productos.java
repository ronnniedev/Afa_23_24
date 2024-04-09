package ejercicio5;




public class Productos {
	
	protected int precio;
	protected String nombre;
	protected static int numProductos = 0;
	
	
	public Productos() {
		this.precio = (int)(Math.random()*20);
		this.nombre = "Producto" + numProductos;
		numProductos++;
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


	@Override
	public String toString() {
		return "Productos [precio=" + precio + ", nombre=" + nombre + "]";
	}
	
	
}
