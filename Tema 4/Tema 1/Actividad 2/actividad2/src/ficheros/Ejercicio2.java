package ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 2
		 * Calcular la superficie y el perímetro de un rectángulo cuyos datos
         * pediremos por teclado 
		 */
		
		double perimetro;
		double area;
		double base;
		double altura;
		
		System.out.println("Escribe la longitud de la base del rectangulo:");
		base = keyboard.nextDouble();
		
		keyboard = new Scanner(System.in);
		System.out.println("Escribe la longitud de la altura del rectangulo:");
		altura = keyboard.nextDouble();
		
		
		if (base >= 0 && altura >= 0) {
		
			area = base*altura;
			perimetro = base*2 + altura*2;
			
			System.out.println("El perimetro del rectangulo es: "+ perimetro);
			System.out.println("El area del rectangulo es: "+ area);
			
		} else {
			if (altura < 0 && base < 0) {
				System.err.println("ERROR ambos valores introducidos son negativos");
				
			}
			else if (altura < 0) {
				System.err.println("ERROR la altura es negativa");
				
			}
			else if (base < 0) {
				System.err.println("ERROR la base es negativa");
			}
		}
		
		
		

	}

}
