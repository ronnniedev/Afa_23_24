package ficheros;

import java.util.Scanner;

public class Ejercicio16 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 16
		 * Dada una hora por teclado (horas, minutos y segundos) implementar
		 * una función que recibe como parámetro una hora , la incrementa un
		 * segundo y muestra un mensaje con la nueva hora.
		 */

		int hora = -1;
		int minuto = -1;
		int sec = -1;
		
		while (hora < 0 || hora > 24) {
			
			System.out.println("Escribe la hora en formato de horas: ");
			hora = keyboard.nextInt();
			
		}
		
		while (minuto < 0 || minuto > 60) {
			
			System.out.println("Escribe los minutos en formato de horas: ");
			minuto = keyboard.nextInt();
			
		}
		
		while (sec < 0 || sec > 60) {
			
			System.out.println("Escribe los segundos en formato de horas: ");
			sec = keyboard.nextInt();
			
		}
		
		Libreria.sumarTiempo(hora,minuto,sec);
		
		
		
		
	}

}
