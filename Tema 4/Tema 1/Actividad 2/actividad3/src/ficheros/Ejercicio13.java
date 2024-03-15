package ficheros;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 13
		 * Escriba un programa en Java que solicite números al usuario hasta
		 * que se hayan introducido 10 números o la suma de todos los números
		 * leídos sea mayor que 100. A continuación mostrar un mensaje
		 * indicando qué condición se ha cumplido (es decir, si se han
		 * introducido 10 números o si su suma es mayor que 100).
		 */
		
		int suma,cont,num;
		
		cont = 0;
		suma = 0;
		
		while (cont != 10 && suma <= 100) { // si no se cumplen ambas condiciones a la vez el bucle deja de funcionar
			
			cont++;
			System.out.println("Introduzca (" + cont + ") numero: ");
			num = keyboard.nextInt();
			
			suma = suma + num;
			
		}
		if (suma > 100 && cont == 10) { //si se cumplen ambas condiciones imprimimos en pantalla
			
			System.out.println("Ambas condiciones se han cumplido siendo la suma final " + suma);
			
		}else if (suma > 100) { // si solo la suma imprimimos esto
			
			System.out.println("La suma es superior a 100 siendo esta :" + suma);
			
		}else { // si no esto
			
			 System.out.println("Se han introducido 10 numeros");
			
		}
		
		

	}

}
