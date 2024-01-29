package ficheros;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio1
		 * Escriba un programa en Java que genere la siguiente serie:
		 * 5,10,15,20,25,30… El programa preguntará primero cuantos términos
		 * se quieren mostrar y después mostrará la serie correspondiente. 
		 */
		
		int num,salida,multiplo;
		boolean primero;
		
		multiplo = 1;
		salida = 5;
		primero = false;
		
		System.out.println("¿Cuanto numeros quieres mostrar?");
		num = keyboard.nextInt(); //pedimos por pantalla los numeros
		
		while (num != 0) {
			
			if (primero == false) { // booleano para distinguir el primero
				
				primero = true;
				salida  = 5 * multiplo;
				System.out.print(salida);
				
			}else { // si no funcionamiento normal
				
				salida  = 5 * multiplo;
				System.out.print("->" + salida);
			
			}
			
			multiplo++;
			num--;
		}

	}

}
