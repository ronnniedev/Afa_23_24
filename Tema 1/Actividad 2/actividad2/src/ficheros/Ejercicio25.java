package ficheros;

import java.util.Scanner;

public class Ejercicio25 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 25
		 * Calcula la media para una cantidad indefinida de números. El
		 * programa parará de pedir números cuando se le introduzca un número
		 * negativo, en ese momento nos dará la media de los números
		 * introducidos hasta ese momento y la cantidad de los mismos ( sin
		 * incluir al negativo que usamos para acabar)
		 */

		double numero,suma,divisor;
		
		suma = 0;
		divisor = 0;
		numero = 0;
		
		
		
		while (numero >= 0) { //mientras el numero sea superior a 0 el while funciona
			
			System.out.println("Escribe un numero :");
			numero = keyboard.nextDouble();
			
			if (numero >= 0) { //ponemos un if para que en la ultima pasada cuando el numero sea negativo no meta el 
							   // numero negativo a la media
				suma = suma + numero; //realizamos la suma
				divisor++; // sumamps 1 al divisor
			}
		}
		if (divisor == 0) { //esto es para que no salga NaN si el primer numero introducido es negativo
			System.out.println("Al ser el numero negativo el primero en ser introducido no se hace media");
			
		}else {
			suma = suma / divisor;
			
			System.out.println("La media de los " + divisor + " numeros introducidos es : " + suma);
		}
		
		
		
		
	}

}
