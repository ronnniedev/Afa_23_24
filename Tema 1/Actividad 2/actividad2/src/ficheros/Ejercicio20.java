package ficheros;

import java.util.Scanner;

public class Ejercicio20 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 20
		 * Dado el nombre o numero de mes y año comprobando si es bisiesto
		 *  o no , determinar el número de días del mes.
		 */
		
		int year;
		boolean bisiesto;
		String mes;
		
		bisiesto=false;
		
		System.out.println("Introduce el año de manera numerica: ");
		year = keyboard.nextInt();
		
		if (((year%4==0) && (year%100!=0)) || (year%400==0)) { //activamos la variable bisiesto si se cumple esta
															   // condicion
			bisiesto = true;
		}
		
		System.out.println("Introduce el mes de una de las dos maneras 01/enero 10/octubre: ");
		mes = keyboard.next();
		
		switch (mes) { // Introducimos toso los valores posibles que se pueden meter en el String mes
		case "01": {
			System.out.println("El Enero de " + year + " tiene 31 dias");
			break;
		}case "enero": {
			System.out.println("El Enero de " + year + " tiene 31 dias");
			break;
		}case "02": {
			if (bisiesto) {
				System.out.println("El Febrero de " + year + " tiene 29 dias"); //variable de bisiesto
			}else {
				System.out.println("El Febrero de " + year + " tiene 28 dias");
			}
			break;	
		}case "febrero": {
			if (bisiesto) {
				System.out.println("El Febrero de " + year + " tiene 29 dias");
			}else {
				System.out.println("El Febrero de " + year + " tiene 28 dias");
			}
			break;
		}case "03": {
			System.out.println("El Marzo de " + year + " tiene 31 dias");
			break;
		}case "marzo": {
			System.out.println("El Marzo de " + year + " tiene 31 dias");
			break;
		}case "04": {
			System.out.println("El Abril de " + year + " tiene 30 dias");
			break;
		}case "abril": {
			System.out.println("El Abril de " + year + " tiene 30 dias");
			break;
		}case "05": {
			System.out.println("El Mayo de " + year + " tiene 31 dias");
			break;
		}case "mayo": {
			System.out.println("El Mayo de " + year + " tiene 31 dias");
			break;
		}case "06": {
			System.out.println("El Junio de " + year + " tiene 30 dias");
			break;
		}case "junio": {
			System.out.println("El Junio de " + year + " tiene 30 dias");
			break;
		}case "07": {
			System.out.println("El Julio de " + year + " tiene 31 dias");
			break;
		}case "julio": {
			System.out.println("El Julio de " + year + " tiene 31 dias");
			break;
		}case "08": {
			System.out.println("El Agosto de " + year + " tiene 31 dias");
			break;
		}case "agosto": {
			System.out.println("El Agosto de " + year + " tiene 31 dias");
			break;
		}case "09": {
			System.out.println("El Septiembre de " + year + " tiene 30 dias");
			break;
		}case "septiembre": {
			System.out.println("El Septiembre de " + year + " tiene 30 dias");
			break;
		}case "10": {
			System.out.println("El Octubre de " + year + " tiene 31 dias");
			break;
		}case "octubre": {
			System.out.println("El Octubre de " + year + " tiene 31 dias");
			break;
		}case "11": {
			System.out.println("El Noviembre de " + year + " tiene 30 dias");
			break;
		}case "noviembre": {
			System.out.println("El Noviembre de " + year + " tiene 30 dias");
			break;
		}case "12": {
			System.out.println("El Diciembre de " + year + " tiene 31 dias");
			break;
		}case "diciembre": {
			System.out.println("El Diciembre de " + year + " tiene 31 dias");
			break;
		}default:
			System.out.println("Valor introducido no valido");
			break;
		}
		
		}

}
