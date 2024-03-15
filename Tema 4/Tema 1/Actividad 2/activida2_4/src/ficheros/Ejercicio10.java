package ficheros;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 10
		 * Al ingresar el número de día y el número de mes, devolver la estación
		 * de año de acuerdo a la siguiente tabla 
		 */
		
		System.out.print("Introduzca el mes de manera numerica del 1 al 12: ");
		int mes = keyboard.nextInt();
		int dia = 0;
		while (mes > 12 || mes < 1) {
			System.out.print("Introduzca un mes valido:");
			
		}
		if (mes == 1|| mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			
			System.out.print("Introduce un dia del 1 al 31: ");
			dia = keyboard.nextInt();
			while (dia < 1 || dia > 31) {
				
				System.out.println("Por favor introduce un dia valido entre 1 y 31:");
				dia = keyboard.nextInt();
			}
			
		}else if (mes == 2) {
			System.out.print("Introduce un dia del 1 al 29: ");
			dia = keyboard.nextInt();
			while (dia < 1 || dia > 29) {
				
				System.out.println("Por favor introduce un dia valido entre 1 y 29:");
				dia = keyboard.nextInt();
			}
		}else {
			System.out.print("Introduce un dia del 1 al 30: ");
			dia = keyboard.nextInt();
			while (dia < 1 || dia > 30) {
				
				System.out.println("Por favor introduce un dia valido entre 1 y 30:");
				dia = keyboard.nextInt();
			}
			
		}
		if (mes == 12 && dia >= 21 || mes == 3 && dia <= 20 || mes == 1 || mes == 2) System.out.println("Es invierno"); 
		else if (mes == 3 && dia >=21 || mes == 6 && dia <=21 || mes == 4 || mes == 5) 
		System.out.println("Es primavera");
		else if (mes == 6 && dia >=22 || mes == 9 && dia <=22 || mes == 7 || mes == 8) System.out.println("Es verano");
		else System.out.println("Es otoño");
	}

}
