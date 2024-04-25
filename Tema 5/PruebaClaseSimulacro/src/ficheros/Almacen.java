package ficheros;

import java.util.HashMap;
import java.util.Map;

public class Almacen {

	private Map <Referencia,Producto> productos;

	
	public Almacen() {
		this.productos = new HashMap<Referencia,Producto>();
	}
	
	public void añadirProducto(String codigo, String piso,String nombre, double precio) {
		boolean esCorrecto = true;
		
		int pisoNum = -1;
		for (int i = 0; i <piso.length(); i++) {
			if (Character.isDigit(piso.charAt(i))) {
				pisoNum = Integer.parseInt(piso);
			}else {
				esCorrecto = false;
			}
		}
		
		Referencia ref = new Referencia(codigo,pisoNum);
		
		
		if (pisoNum == -1) {
			System.out.println("Piso introducido no valido");
		}
		
	
		if (ref.getEstanteria() != "-1" && esCorrecto && !productos.containsKey(ref)) {
			Producto p = new Producto(ref,nombre,precio);
			productos.put(ref, p);
			System.out.println(ref.getEstanteria());
			System.out.println("Objeto registrado con exito");
		}else {
			if(!esCorrecto) {
				
				System.out.println("Piso introducido no valido");
			}
			if (ref.getEstanteria() == "-1") {
				System.out.println("Fallo al añadir, la clave esta mal escrita");
			}
			if (productos.containsKey(ref)) {
				System.out.println("Objeto ya introducido");
			}
		}
		
	}
	
	public Producto buscarProducto(String codigo,int piso) {
		Producto p = null;
		Referencia ref = new Referencia(codigo,piso);
		boolean esCorrecto = true;
		for (int i = 0; i < ref.getEstanteria().length(); i++) {
			if (!Character.isDigit(ref.getEstanteria().charAt(i))&& esCorrecto) {
				esCorrecto = false;
				System.out.println("ERROR referencia mal escrita");
			}
		}
		
		
		if (productos.containsKey(ref)) {
			p = productos.get(ref);
		}
		
		return p;
	
	}
	
	public void borrarProducto(String codigo,int piso) {
		Producto p = null;
		Referencia ref = new Referencia(codigo,piso);
		System.out.println("***********Borrar producto " + ref.getEstanteria() + "-" + ref.getPiso() 
							+ " ***************");
		boolean esCorrecto = true;
		for (int i = 0; i < ref.getEstanteria().length(); i++) {
			if (!Character.isDigit(ref.getEstanteria().charAt(i))&& esCorrecto) {
				esCorrecto = false;
				System.out.println("ERROR referencia mal escrita");
			}
		}
		if (productos.containsKey(ref)) {
			p = productos.remove(ref);
			System.out.println("Borrado con exito");
		}else {
			System.out.println("No se ha encontrado el producto");
		}
		
		
	}
	
	public Producto mostrarProductoMaxPrecio() {
		System.out.println("*******************MaxPrecio****************");
		Producto prod = null;
		int max = Integer.MIN_VALUE;
		for (Producto p: productos.values()) {
			p.getPrecio();
			if (p.getPrecio() > max) {
				prod = p;
			}
		}
		System.out.println("Producto con mayor precio:");
		prod = productos.get(prod.getCodRef());
		
		return prod;
	}
	
	public void mostrarProductosPorEstanteria(String estanteria) {
		System.out.println("*****Buscar estanteria E" + estanteria + "*****************");
		for (Producto p: productos.values()) {
		
			if (p.getCodRef().getEstanteria().compareTo("E" + estanteria)==0) {
				System.out.println(p.toString());
			}
		}
		
	}
	
	public void eliminarProductosPorEstanteria (String estanteria) {
		for (Producto p: productos.values()) {
			
			if (p.getCodRef().getEstanteria().compareTo("E" + estanteria)==0) {
				productos.remove(p.getCodRef());
				System.out.println("Producto eliminado con exito");
			}
		}
		
	}
	
	public void mostrarProducto() {
		System.out.println("*************Productos***************");
		for (Producto p: productos.values()) {
			System.out.println(p.toString());
		}
		
		
	}
	
	
}
