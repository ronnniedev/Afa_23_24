package ficheros;

import java.util.Scanner;

public class Ejercicio19 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 19
		 * Diseña una función que pregunte al usuario la fecha actual y la fecha
		 * de nacimiento de una persona; el programa determinará la edad. 
		 */
		
		boolean valido = false;
		int yearOrigin = 0;
		int monthOrigin = 0;
		int dayOrigin = 0;
		int year = 0;
		int month = 0;
		int day = 0;
		
		
		while (valido == false) {
			System.out.println("------------CALCULADORA DE EDAD---------------");
			System.out.println("Introduce tu fecha de nacimiento:");
			yearOrigin = keyboard.nextInt();
			
			System.out.println(Libreria.bisiesto(yearOrigin));
			
			if (Libreria.bisiesto(yearOrigin)) System.out.println("Ten en cuenta que el año es bisiesto");
			
			System.out.println("Introduce tu mes de nacimiento:");
			monthOrigin = keyboard.nextInt();
			
			System.out.println("Introduce tu dia de nacimiento:");
			dayOrigin = keyboard.nextInt();
			
			valido = Libreria.validarFecha(yearOrigin,monthOrigin,dayOrigin);
				
		}
		valido = false;
		
		while (valido == false) {
			
			System.out.println("Introduce año actual:");
			year = keyboard.nextInt();
			
			System.out.println(Libreria.bisiesto(year));
			
			if (Libreria.bisiesto(year)) System.out.println("Ten en cuenta que el año es bisiesto");
			
			System.out.println("Introduce mes actual:");
			month = keyboard.nextInt();
			
			System.out.println("Introduce el dia natural:");
			day= keyboard.nextInt();
			
			valido = Libreria.validarFecha(year,month,day);
				
		}
		
		Libreria.calcularEdad(year,month,day,yearOrigin,monthOrigin,dayOrigin);
		
		
		
	
		
		
		
		
			
		
		
		
		

	}

}
