package ficheros;

import java.util.Scanner;

public class Ejercicio7 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 7
		 * Vamos a diseñar una calculadora que se enciende y hasta que no
		 * tecleamos -1 no se apaga.
		 * Esta calculadora funciona de la siguiente manera:
		 * • Recogemos los datos A y B
		 * • Si operación es 1 calcula la raíz cuadrada de la suma de A y B
		 * • Si operación es 2 calcula A / B. Vigilamos que B no sea 0...
		 * • Si la operación es 3 calculamos la siguiente fórmula: ( A * B ) /2.5 
		 */

		double a = 0, b = 0;
		boolean apagado = false;
		
		while (apagado == false) {
			
			System.out.println("Introduce numero A: ");
			a = keyboard.nextDouble();
			
			if (a == -1) {
				
				apagado = true;
				
			}else {
				
				System.out.println("Introduce numero B:");
				b = keyboard.nextDouble();
				
			}
			if (b == -1 || apagado) {
				
				apagado = true;
				
			}else {
				
				System.out.println("Escribe entre estas 3 opciones de manera numerica: ");
				System.out.println("1-   Raizcuadrada(A+B)");
				System.out.println("2-   Calcula A/B");
				System.out.println("3-   (A/B)/2.5");
				System.out.println("Selecciona una opcion entre (1,2,3):");
				int opcion = keyboard.nextInt();
				
				if (opcion == -1) {
					
					apagado = true;
				}else {
					while (opcion < -1 || opcion > 3) {
						
						System.out.println("ERROR");
						System.out.println("Selecciona una opcion entre (1,2,3):");
						opcion = keyboard.nextInt();
						
					}if (opcion == -1) {
						
						apagado = true;
					}else {
						if (opcion == 1) System.out.println("Raizcuadrada(A+B) = " + (Math.sqrt(a+b)));
						else if (opcion == 2) {
							
							if (b == 0) {
								
								System.out.println("El resultado es infinito");
								
							}else System.out.println(" A/B = " + (a/b));
								
						}else {
							
							if (b == 0) System.out.println("El resultado es infinito");
							else System.out.println("(A/B)/2.5 = " + (a/b)/2.5);
							
							
						} 
					}
				}
				
				
				
			}
			
		}System.out.println("\nApagado del sistema");
		
	}

}
