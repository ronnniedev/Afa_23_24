package ficheros;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 3 (operaciones básicas)
		 * Escriba un programa que pida una cantidad de segundos y que escriba
		 * cuántas horas, minutos y segundos son.
		 */
		int horas,minutos,segundos,memsegundos;
		
		System.out.println("Convertidor de segundos a minutos");
		
		System.out.print("Escriba una cantidad de segundos: ");
		segundos = keyboard.nextInt();
		
		memsegundos = segundos;
		
		
		minutos = segundos / 60; //al ser entero sale sin decimales
		segundos = segundos%60; // calculamos el resto del programa
		horas = minutos / 60;
		minutos = minutos%60; 
		
		
		System.out.println( memsegundos + " segundos son " + horas + " horas "+ minutos + " minutos y " + segundos 
				+ " segundos" );
		
	}

}
	
