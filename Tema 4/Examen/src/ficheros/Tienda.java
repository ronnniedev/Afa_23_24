package ficheros;

import java.util.Scanner;

public class Tienda {
	static Scanner keyboard=new Scanner(System.in);
	private Producto p[];

	/**
	 * @param p
	 */
	public Tienda() {
		this.p = new Producto[0];
	}
	
	public void añadirProducto(Producto newP) {
		
		int newTam = p.length +1;
		
		Producto newV[] = new Producto[newTam];
		
		for (int i = 0; i < p.length; i++) {
			
			newV[i] = p[i];
		}
		
		newV[p.length] = newP;
		
		p = newV;
		
	}
	
	public String  mostrarProductos() {
		String texto = "";
		
		for (int i = 0; i < p.length; i++) {
			
			texto = texto + p[i].toString() + "\n";
		}
		
		texto = texto + "******************************";
		
		return texto;
		
		
	}
	
	public Producto buscarProducto() {
		Producto contenedor = null;
		
		System.out.println("Introduce el codigo del producto: ");
		int cod = keyboard.nextInt();
		
		for (int i = 0; i < p.length; i++) {
			if (p[i].getCod() == cod) {
				contenedor = p[i];
				
			}
		
		}
		
		return contenedor;
	}
	
	
}
