package tareaExtra;

public class Principal {

	public static void main(String[] args) {
		
		ProductoEnAlmacen a = new ProductoEnAlmacen();
		Tienda t = new Tienda ();
	
		
		Producto p1 = new Producto (0, 2, "Leche de soja", true);
		Producto p2 = new Producto (1, 0, "Huevos de avestruz", false);
		Producto p3 = new Producto (2,-1,"DVDS",true);
		Producto p4 = new Producto (3,-1,"CDS",false);
		Producto p5 = new Producto (4,-1,"Impresoras",true);
		Producto p6 = new Producto (5,-1,"tvs",false);
		Producto p7 = new Producto (6, 2, "Leche de soja", true);
		
		Producto p[] = new Producto[7];
		
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		p[3] = p4;
		p[4] = p5;
		p[5] = p6;
		p[6] = p7;
		
		a.añadirProducto(p);
		
		System.out.println("\n-----------------Inicializamos almacen-------------------\n");
		
		a.visualizar();
		
		a.visualizarContando(p.length);
		
		for (int i = 0; i < 6; i++) {
			t.añadirProducto(p6, a);
		}
		
		
		t.visualizar();
		
		
	
		
		
	}
}
