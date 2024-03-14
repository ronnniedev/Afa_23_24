package ficheros;

import java.util.Scanner;

public class Main {
	static Scanner keyboard=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Funciona");
		Tienda t1 = new Tienda();
		cargarProductos(t1);
		System.out.println("Productos Al Inicio \n****************************************************** ");
		System.out.println(t1.mostrarProductos());
		System.out.println(t1.buscarProducto());
	
	}
	
	public static void cargarProductos(Tienda t1) {
		Producto p1 = new Producto (1 ,"prod1",100,100.0);
		Producto p2 = new Producto (2,"prod2",100,100.0);
		ProductoEnOferta p3 = new ProductoEnOferta (3,"prod3",300,300.0,2,10);
		ProductoEnOferta p4 = new ProductoEnOferta (4,"prod4",300,300.0,4,5);
		t1.añadirProducto(p1);
		t1.añadirProducto(p2);
		t1.añadirProducto(p3);
		t1.añadirProducto(p4);
		
		
	}
	
	public static void nuevaVenta(Tienda t1) {
		Producto contenedor = t1.buscarProducto();
		if (contenedor == null) {
			System.out.println("No se encuentra el producto especificado");
			return;
		}
		
		System.out.println("Dime el numero de productos a vender");
		int cant = keyboard.nextInt();
		
		if (contenedor.getExistencias() < cant) {
			System.out.println("ERROR \n No hay suficientes existencias para la venta, regresando a main");
			return;
		}
		
		DetalleVenta dv= new DetalleVenta(cant);
		
		
		Venta v = new Venta (1,"Mauricio Colmenero");
		
		
		v.añadirDetalle(dv);
		
		
		
		
		
		
		
	}
	
	
	

}
