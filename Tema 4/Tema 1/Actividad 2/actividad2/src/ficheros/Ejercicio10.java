package ficheros;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Actividad 10
		 * Realiza un conversor de grados centígrados a grados Farenheir.
		 * Nuestro algoritmo debe poder hacer la conversión en ambos sentidos
		 * F = ( (9/5)* C)+32
		 * C = (F – 32) * ( 5 / 9 ) se despeja la ecuacion apra obtener la nueva ecuacion
		 * F = Grados Farenheir 
		 * C = Grados Celsius
		 */
		
		//Voy a hacer dos pequeños modulos para realizar la conversion
		
		int opcion;
		double grados;
		double resultado;
		
		//Creamos un pequeño menu con dos opciones para el conversor
		System.out.println("Bienvenidx al sistema de conversion de temperaturas, por favor seleccione entre estas 2 "
				+ "opciones");
		System.out.println("- Escriba 1 para convertir grados Celsius a Farenheir");
		System.out.println("- Escriba 2 para convertir grados Farenheir a Celsius");
		opcion = keyboard.nextInt();
		
		if (opcion == 1) {
			// realizamos el conversor a grado Farenheir
			System.out.println("Introduzca el valor de grados Celsius a convertir en grados Farenheir :");
			grados = keyboard.nextDouble();
			
			resultado =  9.0 / 5 * grados +32; // importante acordarse del double al lado para que salga con
													 // decimales
		
			System.out.println(grados + " grados celsius equivalen a "+  resultado + "grados farenheir");	
		} else if (opcion == 2) {
			// realizamos el conversor a grados Celsius
			System.out.println("Introduzca el valor de grados Farenheir a convertir en grados Celsius :");
			grados = keyboard.nextDouble();
			
			resultado = ((grados - 32 )* 5 )/ 9.0 ; 
			
			System.out.println(grados + " grados Farenheir equivalen a "+  resultado + "grados Celsius");
		} else {
			
			System.out.println("El valor introducido no equivale a ninguna opcion existente");
		}
	
	}

}
