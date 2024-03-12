package ejercicio1;

public class Prueba {

	public static void main(String[] args) {
		
		Tienda tienda = new Tienda();
		cargarProductos(tienda);
		System.out.println(tienda.listarProductos());
		nuevaVenta(tienda);
		System.out.println(tienda.listarVentas());
	}
	
	private static void nuevaVenta(Tienda tienda) {
		Factura nueva = new Factura();
		Cliente c = new Cliente("pepe","XXX");
		
		nueva.insertarCliente(c);
		Producto p= tienda.buscarRef("ref1");
		if (p!=null) {
			nueva.insertarDetalle(p, 10);
		} 
		p = tienda.buscarRef("ref3");
		if (p!=null) {
			nueva.insertarDetalle(p, 110);
		} 
		tienda.insertarVenta(nueva);
		
	}
	private static void cargarProductos(Tienda tienda) {
		Producto p1 = new Producto("ref1","nombre1", 100);
		tienda.insertarProducto(p1);
		Producto p2 = new Producto("ref2","nombre2", 110);
		tienda.insertarProducto(p2);
		ProductoGrande p3 = new ProductoGrande("ref3","nombre3", 120, 20);
		tienda.insertarProducto(p3);
		ProductoGrande p4 = new ProductoGrande("ref4","nombre4", 130, 10);
		tienda.insertarProducto(p4);
		ProductoGrande p5 = new ProductoGrande("ref5","nombre5", 140, 20);
		tienda.insertarProducto(p5);
	}
}
