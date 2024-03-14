package ficheros;

public class DetalleVenta {

	private int cantidad;
	
	

	/**
	 * @param cantidad
	 */
	public DetalleVenta(int cantidad) {
		this.cantidad = cantidad;
		
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

	@Override
	public String toString() {
		return "DetalleVenta [cantidad=" + cantidad + "]";
	}
	
	
	
}
