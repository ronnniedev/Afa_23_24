package ficheros;

import java.util.Scanner;

public class Ejercicio29 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 29
		 * Realiza un algoritmo que introducidas las notas de N alumnos nos
		 * indicará cuantos aprobados y cuantos suspensos hay. Generaliza este
		 * ejercicio para una cantidad indefinida de notas (pararemos con una
		 * nota negativa). Amplia el ejercicio indicando no solo cuantos
		 * aprobados hay, también cuantos sobresalientes, notables, bienes,
		 * aprobados y suspensos.
		 */
		
		int nota,aprobados,suspensos,cont;
		nota = 0; //inicializamos la variable para arrancar el programa
		aprobados = 0;
		suspensos = 0;
		
		System.out.println("Introduce el numero de alumnos a evaluar: ");
		cont = keyboard.nextInt();
		
		while (cont != 0) { //hasta que el contador no llege a 0 no acabamos el bucle
			
			System.out.println("Introduce una nota: ");
			nota = keyboard.nextInt(); // se introduce el numero por teclado
			cont--;
			
			if (nota <=10) { // para no meter numeros mayores que 10 en el programa y que sea ignorado
				
				if (nota >= 5) { // si la nota es superior a 5 es un aprobado, se suma
					aprobados++;
				
				}else if (nota >= 0 && nota < 5) { // si la nota es inferior a 5 se suma a suspensos
					suspensos++;
				}
			}
		}
		System.out.println("El numero de aprobados es " + aprobados + " y el de suspensos es " + suspensos);

	}

}
