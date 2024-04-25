package ficheros;

public class MainActMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Almacen almacen=new Almacen();
		almacen.añadirProducto("11","1","prod1",100.0);
		almacen.añadirProducto("12","1","prod2",110.0);
		almacen.añadirProducto("13","1","prod3",120.0);
		
		almacen.añadirProducto("11","2","prod4",140.0);
		almacen.añadirProducto("12","2","prod5",150.0);
		almacen.añadirProducto("13","2","prod6",160.0);
		
		almacen.mostrarProducto();
		System.out.println("*********************************");
		System.out.println("CONTROL ERRORES");
		//ERROR
		almacen.añadirProducto("X3","2","prod7",200.0);
		almacen.añadirProducto("13","X","prod7",200.0);
		almacen.añadirProducto("11","1","prod7",200.0);
		
		
		
		 
		System.out.println("*********************************");
		System.out.println("BUSCAR PRODUCTO E11-1");
		Producto p1=almacen.buscarProducto("11",1);
		if(p1==null) {
			System.out.println("Producto no encontrado");
		}else {
			System.out.println(p1.toString());
		}
		
		
		System.out.println("*********************************");
		System.out.println("BUSCAR PRODUCTO XX-1");
		Producto p2=almacen.buscarProducto("XX",1);
		if(p2==null) {
			System.out.println("Producto no encontrado");
		}else {
			System.out.println(p1.toString());
		}
		
		System.out.println("*********************************");
		System.out.println("BUORRAR PRODUCTO E11-1");
		almacen.borrarProducto("11",1);
		almacen.mostrarProducto();
		
		System.out.println("*********************************");
		System.out.println("PRECIO MAXIMO");
		Producto pMax=almacen.mostrarProductoMaxPrecio();
		if(pMax==null) {
			System.out.println("Produco max precio no encontrado");
		}else {
			System.out.println("Max precio "+pMax.toString());
		}
		
		
		System.out.println("*********************************");
		System.out.println("PRODUCTOS ESTANTERIA 11");
		almacen.mostrarProductosPorEstanteria("11");
		 
		System.out.println("*********************************");
		System.out.println("ELIMINAR PRODUCTOS ESTANTERIA E11");
		almacen.eliminarProductosPorEstanteria("11");
		almacen.mostrarProducto();
	
		
		
	}

}
