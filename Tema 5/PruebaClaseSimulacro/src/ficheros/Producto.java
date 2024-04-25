package ficheros;

public class Producto {
	
	private Referencia codRef;
	private String nombre;
	private double precio;
	
	public Producto(Referencia codRef, String nombre, double precio) {
		this.codRef = codRef;
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * @return the codRef
	 */
	public Referencia getCodRef() {
		return codRef;
	}

	/**
	 * @param codRef the codRef to set
	 */
	public void setCodRef(Referencia codRef) {
		this.codRef = codRef;
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
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [codRef=" + codRef + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
