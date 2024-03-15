package ficheros;


public class Ejercicio3 {

	public static void main(String[] args) {
		/*Ejercicio 3
		 * Escribir un programa que imprima la forma en diamante de la
		 * siguiente forma.
		 */
		
		boolean primero = false;
		
		
		
		for (int cont = 0; cont < 4; cont++) { //escribe las filas
			
			if (primero == false) {
				
				System.out.println("        *");
				primero = true;
				
			}
			for (int espacios = 6 - cont * 2; espacios != 0 ; espacios--) { //escribe los espacios, empiezan siendo 6
				
				System.out.print(" ");
					
			}
			
			for (int ast = 2 + cont * 2; ast != 0 ; ast--) { // escribe los asteriscos, empiezan siendo dos
				System.out.print(" *");
					
			
			}
			System.out.println();
				
		}for (int cont = 0; cont < 4; cont++) { // escribe el espejo, lo mismo pero al reves
			
			for (int espacios = 2 + cont * 2; espacios != 0; espacios--) {
				
				System.out.print(" ");
			}
			for (int ast = 6 - cont * 2; ast != 0; ast--) {
				System.out.print(" *");
				
			}
			if (cont == 3) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
