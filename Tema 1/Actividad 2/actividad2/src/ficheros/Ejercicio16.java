package ficheros;

import java.util.Scanner;

public class Ejercicio16 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 16
		 * Dada una hora por teclado (horas, minutos y segundos) realizar un
		 * algoritmo que muestre la hora después de incrementar un segundo.
		 */
		
		int numHora,numMin,numSec;
		
		String hora24; // Declaramos un string para contener el valor en tiempo introducida
		System.out.print("Escriba la hora en formato hh:mm:ss:"); //pedimos al usuario que escriba la hora
		hora24=keyboard.next();
		String[] horaminutos = hora24.split(":"); //declaramos un split para que distinga datos
		String hora = horaminutos[0]; // el numero revela el numero de ":" que salta para leer datos
		String minutos = horaminutos[1];
		String segundos = horaminutos[2];
		
		numHora = Integer.parseInt(hora); //transformamos los valores en INT
		numMin = Integer.parseInt(minutos);
		numSec = Integer.parseInt(segundos);
		
		if (numHora >=  0 && numHora <= 24 && numMin >= 0 && numMin <=59 && numSec >= 0 && numSec <= 59) {
			
			numSec++;
						
			if (numSec == 60) {
				numSec = 00;
				numMin++;
			}
			if (numMin == 60) {
				numMin = 00;
				numHora++;
			}
			if (numHora == 24) { // si el contador llega a 24 se resetea a 0
				numHora = 00;
			}
			System.out.printf("%d:%d:%d", numHora , numMin , numSec); //%d sirve para formatear el texto y señala los 
			// int
		}
		else {
			System.err.println("Valor introducido no valido");
		}
	}

}
