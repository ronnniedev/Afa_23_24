package ficheros;

import java.util.Scanner;

public class Ejercicio7 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 7
         * Determinar si un año pedido por teclado es bisiesto o no
		 * Todos los años bisiestos son divisibles entre 4.
		 * Aquellos años que son divisibles entre 4, pero no entre 100, son bisiestos.
		 * Sin embargo, los años divisibles entre 100 y entre 400 sí que son bisiestos
		 */
		int year;
		
		System.out.println("Introduce el año :");
		year = keyboard.nextInt();		
		if (year <= 0) {
			System.out.println("Este valor no puede ser introducido");		
		} else if (((year%4==0) && (year%100!=0)) || (year%400==0)) { 
			System.out.println("el año es bisiesto");
			/*Lo que he hecho es basicamente decirle que si el resto de la division entre el numero introducido es 0
			 * para las divisiones entre 4 pero no entre las de 100 es bisiesto, salvo en la excepsion de que sea 
			 * divisible entre las de 100 y 400.
			 */
		} else {
			System.out.println("El año no es bisiesto");
		}

	}

}
