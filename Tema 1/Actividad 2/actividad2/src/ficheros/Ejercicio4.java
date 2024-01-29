package ficheros;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 4
         * Diseña un algoritmo que calcule la media de tres números que
         * pediremos al usuario. Se deben dar como resultado la media con
         * decimales y redondeada (redondeo hacia arriba y hacia abajo)
		 */
		
		double media;
		double a;
		double b;
		double c;
		
		System.out.println("Escribe el primer numero: ");
		a = keyboard.nextDouble();
		
		keyboard = new Scanner(System.in);
		System.out.println("Escribe el segundo numero: ");
		b = keyboard.nextDouble();
		
		keyboard = new Scanner(System.in);
		System.out.println("Escribe el tercer numero: ");
		c = keyboard.nextDouble();
		
		media = (a+b+c) / 3;
		
		System.out.printf("La media de las tres cantidades es: %.2f \n" , media); // % señala el contenido  a formatear 
																				  // .2f para señalar 2 decimales 
																				  // \n salto de linea 
	
		media = Math.round(media); // valor de liberia Math para redondear por defecto
		
		System.out.printf("La media redondeada de las tres cantidades es: %.0f \n" , media); //para 0 decimales
		
		
	}

}
