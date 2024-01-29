package ficheros;

import java.util.Scanner;

public class Ejercicio17 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 17
		 * Realiza un algoritmo que resuelva una ecuación de segundo grado. El
		 * programa pedirá por teclado los 3 coeficientes y mostrará las posibles
		 * soluciones: no tiene solución, una única solución ( y su valor) o dos
		 * soluciones ( y sus valores)
		 */

		double a,b,c,resultadoUno,resultadoDos;
		
		
		System.out.println("Sabiendo que la formula para calcular ecuaciones de segundo grado es "
				+ "(-b (+-) square(b^2-4ac))/2a)");
		System.out.println();
		System.out.println("Introduce el valor de a: ");
		a = keyboard.nextDouble();
		System.out.println("Introduce el valor de b: ");
		b = keyboard.nextDouble();
		System.out.println("Introduce el valor de c: ");
		c = keyboard.nextDouble();
		
		resultadoUno = (-b - Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a); //Math.pow() es para multiplicar valores por si
		resultadoDos = (-b + Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a); // mismo
		
		
		if (Math.pow(b,2)-( 4 * (a * c)) > 0 ) { //se mete el discriminate, si superir a 0 dos solucion, si 0 1 y <0 
			// ninguna
			System.out.printf("Tiene dos soluciones , las cuales son %.0f%n y %.0f%n",resultadoUno,resultadoDos);
		}
		else if (Math.pow(b,2)-( 4 * (a * c)) == 0) {
			
			System.out.printf("Tiene una solucion , las cual es  %.0f%n", resultadoUno);
			
		}else {
			
			System.out.println("No tiene soluciones");
		}
		
	}

}
