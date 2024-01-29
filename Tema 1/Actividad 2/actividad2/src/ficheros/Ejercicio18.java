package ficheros;

import java.util.Scanner;

public class Ejercicio18 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 18
		 * Determinar el precio de un billete de tren, conociendo la distancia a
		 * recorrer y sabiendo que si el número de días de estancia es superior a
		 * 7 y la distancia superior a 800km el billete tiene una reducción del 30%.
		 * El precio del km es de 2,5€
		 */
		
		double distancia,diasEstancia,precioBillete;
		
		System.out.println("Introduzca los kilometros a recorrer: "); //pedimos os datos en referente al problema
		distancia = keyboard.nextDouble ();
		
		System.out.println("Introduzca los dias de estancia: ");
		diasEstancia = keyboard.nextDouble ();
		
		if (diasEstancia < 0 || distancia < 0) { // si se introducen valores no validos
			System.err.println("Valores introducidos no validos : ");
		}
		
		else if (diasEstancia > 7 && distancia > 800) { // Condiciones del descuento
			
			precioBillete = ( 2.5 * 0.7 ) * distancia; //Calculo con descuento
			
			System.out.println(" El precio del billete es :" + precioBillete);

		} else {
			precioBillete = 2.5 * distancia; // Precio sin descuento 
			
			System.out.println(" El precio del billete es :" + precioBillete);
		}
		
		
		
	}

}
