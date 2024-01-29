package ficheros;

import java.util.Scanner;

public class Ejercicio19 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 19
		 * Los empleados de una fábrica trabajan por turnos: diurno y nocturno.
		 * Se debe calcular el jornal diario de acuerdo con los siguientes puntos:
		 * 
		 * • La tarifa por horas diurnas es de 20€
		 * • La tarifa por horas nocturnas es de 35€
		 * • Caso de ser domingo, la tarifa se incrementa en 10€ más para el
		 *   turno diurno y 15€ para el nocturno.
		 */
		
		String respuesta;// pondremos que decision sea la variable que guarde la respuesta
		boolean domingo = true; //iniciamlizamos el valor de respuesta para que lo lea el swicth
		boolean dia = true;
		double sueldo,horas;
		
		System.out.println("¿Es de dia o de noche? dia/noche ");
		respuesta = keyboard.nextLine();
		
		switch (respuesta) {
		
		case "dia":
            dia = true; //si es si se quedara como verdadero
            break;

        case "noche":
            dia = false; // si es falso la respuesta sera negativa
            break;
		}
		
		System.out.println("¿Es Domingo? si/no ");
		respuesta = keyboard.nextLine();
		
		switch (respuesta) { //determinamos si la variable domingo es verdadera
		
		case "si":
            domingo = true; //si es si se quedara como verdadero
            break;

        case "no":
            domingo = false; // si es falso la respuesta sera negativa
            break;
		} 
		
		System.out.println("Introduce el numero de horas : "); //introducimos los valores 
		horas = keyboard.nextDouble();
		
		if (dia) {
				
			sueldo = horas * 20;
			
			if (domingo) {
				
				sueldo = sueldo + 10;
			}
			
		}else {
			
			sueldo = horas * 35;
			
			if (domingo) {
				
				sueldo = sueldo + 15;
			}
		}
	
		System.out.println("El sueldo final seria: " + sueldo);
		

	}

}
