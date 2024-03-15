package ficheros;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 14 
		 * Determinar el número de cifras de un número
		 * Ejemplo
		 * • 9560 tiene 4 cifras
		 * • 369 tiene 3 cifras
		 */
		
		double numero,comprobador,contador; //inicializamos variables
		
		comprobador = 1; //comprobador le meto un valor de 1 para hacer el estandar
		contador = 0;
		
		System.out.println("Introduce el numero: ");
		numero = keyboard.nextDouble();
		
		if (numero < 0) { //Si el numero es negativo lo invertimos asi
			
			numero *= -1;
			
		}
		
		while (numero >= comprobador) { //El contador seguira contando hasta que sea superior al numero
			
	    comprobador = comprobador * 10;
		contador++;
		
		
		}
		System.out.printf("El numero de cifras que tiene este numero es %.0f%n" ,contador);//sacamos texto en pantalla
	}

}
