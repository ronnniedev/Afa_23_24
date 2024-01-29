package ficheros;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 13 (While)
		 * Escriba un programa que pida primero dos números enteros (mínimo
		 * y máximo) y que después pida números enteros situados entre ellos.
		 * El programa terminará cuando se escriba un número que no esté
		 * comprendido entre los dos valores iniciales. El programa termina
		 * escribiendo la cantidad de números escritos. 
		 */
		
		int limiteSup,limiteInf,num,cont;
		
		
		System.out.println("Introduce el limite superior: ");
		limiteSup = keyboard.nextInt();
		System.out.println("Introduce el limite inferior: ");
		limiteInf = keyboard.nextInt();
		
		while (limiteSup < limiteInf) {
			
			System.out.println("El limite inferior esta mal introducido, introduzca un valor menor al superior : ");
			limiteInf = keyboard.nextInt();
			
		}
		
		cont = 1;
		System.out.print("Introduce un numero (" + cont + ") :");
		num = keyboard.nextInt();
		cont++;
		
		while (num > limiteInf && num < limiteSup) {
			
			System.out.print("Introduce un numero (" + cont + ") :");
			num = keyboard.nextInt();
			
			cont++;
			
		}
		cont--;
		System.out.println("FIN");
		System.out.println("Se han introducido " + cont + " numeros");

	}

}
