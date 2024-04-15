package ejercicio2;

import java.util.Objects;

public class DetalleTicket {
	
	private String nombreProducto;
	private int cantidad;
	private int total;
	
	public DetalleTicket(Producto p, int cantidad) {
		boolean fallo = false;
		
		if (p == null) {
			System.out.println("El producto introducido es nulo");
		}else if (cantidad > p.getCantidad()) {
			System.out.println("No hay suficiente stock de " + p.getNombre() + "para realizar la venta");
		}else {
			this.nombreProducto = p.getNombre();
			this.cantidad = cantidad;
			this.total = p.getPrecio()*cantidad;
			p.setCantidad(p.getCantidad()-cantidad);
		}
		
	}
	
	

	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}



	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
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
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}



	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		total = total;
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(nombreProducto);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleTicket other = (DetalleTicket) obj;
		return Objects.equals(nombreProducto, other.nombreProducto);
	}



	@Override
	public String toString() {
		return "\n nombre=" + nombreProducto + ", cantidad=" + cantidad + ", Total=" + total;
	}
	
	
	
	

}
