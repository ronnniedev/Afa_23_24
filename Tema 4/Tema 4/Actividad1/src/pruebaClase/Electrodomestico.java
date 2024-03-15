package pruebaClase;

public class Electrodomestico {

	private String id;
	private String nombre;
	private String fabricante;
	private	double precio;
	private boolean enStock;
	
	/** Constructor de 5 parametros para Electrodomestico
	 * @param id
	 * @param nombre
	 * @param fabricante
	 * @param precio
	 * @param enStock
	 */
	public Electrodomestico(String id, String nombre, String fabricante, double precio, boolean enStock) {
		this.id = id;
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.precio = precio;
		this.enStock = enStock;
	}
	
	/** Metodo get para id de la clase Electrodomestico
	 */
	public String getId() {
		return id;
	}

	/** Metodo set para id de la clase Electrodomestico
	 */
	public void setId(String id) {
		this.id = id;
	}

	/** Metodo get para nombre de la clase Electrodomestico
	 */
	public String getNombre() {
		return nombre;
	}

	/** Metodo set para nombre de la clase Electrodomestico
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Metodo get para Fabricante de la clase Electrodomestico
	 */
	public String getFabricante() {
		return fabricante;
	}

	/** Metodo set para Fabricante de la clase Electrodomestico
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/** Metodo get para precio de la clase Electrodomestico
	 */
	public double getPrecio() {
		return precio;
	}

	/** Metodo set para precio de la clase Electrodomestico
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/** Metodo get para EnStock de la clase Electrodomestico
	 * @return boolean
	 */
	public boolean getEnStock() {
		return enStock;
	}

	/** Metodo set para EnStock de la clase Electrodomestico
	 */
	public void setEnStock(boolean enStock) {
		this.enStock = enStock;
	}


	/** Metodo toString para la clase Electrodomestico con 5 parametros
	 */
	public String toString() {
		return "Electrodomestico [id=" + id + ", nombre=" + nombre + ", fabricante=" + fabricante + ", precio=" + precio
				+ ", enStock=" + enStock + "]";
	}
	
	
	
	
	
}
