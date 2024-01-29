package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 1
		 * Calcular la superficie y el perímetro de un cuadrado cuyo lado
		 * pediremos por teclado
		 */
	
		double perimetro;
		double area;
		double lado;
 
		System.out.println("Escribe la longitud del lado del cuadrado:"); 
		lado = keyboard.nextDouble();
		
		if (lado >= 0) {
			//si el lado tiene valores positivos hacemos el calculo
			area = lado * lado;
			perimetro  = lado*4;
				
			System.out.println("El perimetro del cuadrado es:" + perimetro);
			System.out.println("El area del cuadrado es:" + area );
		}else if (lado < 0) {
			//si el lado es menor que 0 no calculamos el resultado
			
			System.err.println("El valor introducido no es valido");
			
		}
		
		
	}

}
