package ejercicio1;

public class Tienda {
	private Producto productos[];
	private int contProductos;
	private Factura facturas[];
	private int contFacturas;
	/**
	 * 
	 */
	public Tienda() {
		productos = new Producto[10];
		contProductos=0;
		facturas = new Factura[10];
		contFacturas = 0;
	}
	
	public void insertarProducto(Producto p) {
		if (contProductos<productos.length) {
			productos[contProductos]=p;
			contProductos++;
			
		}else {
			System.out.println("Error no hay sitio");
		}
	}
	
	public String listarProductos() {
		String texto="";
		for (int i = 0; i < contProductos; i++) {
			texto+=productos[i].toString()+"\n";
		}
		
		return texto;
	}
	
	public Producto buscarRef(String refer) {
		
		for (int i = 0; i < contProductos; i++) {
			if (productos[i].ref.compareTo(refer) == 0) {
				return productos[i];
			}
		}
		return null;
	}
	
	public void insertarVenta(Factura f) {
		
		if (contFacturas < facturas.length) {
			facturas[contFacturas] = f;
			contFacturas++;
		}
	}
	
	public String listarVentas() {
		System.out.println(contFacturas);
		String texto ="";
		for (int i = 0; i < contFacturas; i++) {
			texto+=facturas[i].toString()+"\n";
		}
		
		return texto;
	}
}
