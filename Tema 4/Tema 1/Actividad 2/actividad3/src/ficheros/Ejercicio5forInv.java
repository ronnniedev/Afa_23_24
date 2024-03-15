package ficheros;

import java.util.Scanner;

public class Ejercicio5forInv {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		
		int altura,largo,memoria;
		
		altura = 0;
		
		while (altura <= 0) { //comprobador de errores
			
			System.out.println("¿Cuanto asteriscos tiene de altura el triangulo?");
			altura = keyboard.nextInt();
			
			if (altura <= 0) {
				
				System.out.println("Introduce la altura de nuevo en numeros enteros y positivos");
				altura = keyboard.nextInt();
				
			}
			
			memoria = 0;
			
			
			for (; altura >= memoria; altura--) {
				
				for (largo = altura ; largo > 0; largo--) {
				
					if (largo == 1) {
						
						System.out.println(" * ");
						
					}else {
						System.out.print(" * ");
						
					}
					
				}
				
			}
			
		}

	}

}