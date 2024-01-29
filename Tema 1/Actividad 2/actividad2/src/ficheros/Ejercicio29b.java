package ficheros;

import java.util.Scanner;

public class Ejercicio29b {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Amplia el ejercicio indicando no solo cuantos
		 * aprobados hay, también cuantos sobresalientes, notables, bienes,
		 * aprobados y suspensos.
		 */
		
		int nota,aprobados,suspensos,sobresalientes,notables,bienes;
		nota = 0; //inicializamos la variable para arrancar el programa
		
		sobresalientes = 0;
		notables = 0;
		bienes = 0;
		aprobados = 0;
		suspensos = 0;
		
		while (nota >= 0) {
			System.out.println("Introduce una nota: ");
			nota = keyboard.nextInt(); // se introduce el numero por teclado
			
			if (nota <=10) { // para no meter numeros mayores que 10 en el programa y que sea ignorado
				
				if (nota >= 5) { // si la nota es superior a 5 es un aprobado, se suma
					aprobados++;
					if (nota >= 6 && nota < 7) {
						bienes++;;
					}else if (nota >= 7 && nota < 9) {
						notables++;
					}else if (nota >= 9) {
						sobresalientes++;
					}
					
				}else if (nota >= 0 && nota < 5) { // si la nota es inferior a 5 se suma a suspensos
					suspensos++;
					
				}	
			}
			
			
		}
		System.out.println("El numero de aprobados es " + aprobados + " y el de suspensos es " + suspensos);
		
		System.out.println(" De los aprobados" + bienes + " son con nota de bien " + notables + " son con notable "
				+ sobresalientes + " son sobresaliente");

	}

}
