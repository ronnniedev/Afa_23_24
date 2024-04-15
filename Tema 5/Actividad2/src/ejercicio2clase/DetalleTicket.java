package ejercicio2clase;

public class DetalleTicket {

	private String nombreProducto;
	private int cantidad;
	private int precioProducto;
	private int total;
	
	public DetalleTicket(Producto p, int cantidad) {
	
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

	@Override
	public String toString() {
		return "DetalleTicket [nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", precioProducto="
				+ precioProducto + ", total=" + total + "]";
	}
	
	
	
	
}
