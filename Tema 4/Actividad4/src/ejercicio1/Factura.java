package ejercicio1;

public class Factura {
	private static int CONT_FACTURAS=0;
	
	private int numFact;
	private Cliente c;
	private DetalleFactura detalles[];
	private int contDetalles;
	
	public Factura() {
		CONT_FACTURAS++;
		numFact = CONT_FACTURAS;
		detalles = new DetalleFactura[10];
		contDetalles=0;
	}
	
	public void insertarCliente(Cliente c) {
		this.c = c;
	}
	
	public void insertarDetalle(Producto p,int cantidad) {
		DetalleFactura detalle = new DetalleFactura(p,cantidad);
		if (contDetalles<detalles.length) {
			detalles[contDetalles] = detalle;
			contDetalles++;
		}
	}
	@Override
	public String toString() {
		String texto = "Factura :" + this.numFact + "\n";
		texto += c.toString() + "\n";
		for (int i = 0; i < contDetalles; i++) {
			texto += "\t" + detalles[i].toString() + "\n";
		}
		return texto;
	}
	
	public double calcularImporte() {
		double total = 0.0;
		for (int i = 0; i < contDetalles; i++) {
			total += detalles[i].precioTotal();
		}
		return total;
	}
	
	
	
}
