package ficheros;

public class Producto {

	private int cod;
	private String descripcion;
	private int existencias; 
	private double precio;
	
	/**
	 * @param descripcion
	 * @param existencias
	 * @param precio
	 */
	public Producto(int cod,String descripcion, int existencias, double precio) {
		this.descripcion = descripcion;
		this.existencias = existencias;
		this.precio = precio;
		this.cod = cod;
	}

	/**
	 * @return the cod
	 */
	public int getCod() {
		return cod;
	}

	/**
	 * @param cod the cod to set
	 */
	public void setCod(int cod) {
		this.cod = cod;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the existencias
	 */
	public int getExistencias() {
		return existencias;
	}

	/**
	 * @param existencias the existencias to set
	 */
	public void setExistencias(int existencias) {
		this.existencias = existencias;
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
		return "Producto [cod = "+ cod + ",descripcion=" + descripcion + ", existencias=" + existencias + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
}
