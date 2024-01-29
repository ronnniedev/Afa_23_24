package ficheros;

import java.util.Scanner;

public class Ejercicio6 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 6
		 * Tenemos la pantalla del móvil bloqueada. Partiendo de un
		 * PIN_SECRETO, intentaremos desbloquear la pantalla. Tenemos hasta
		 * 3 intentos. Simula el proceso con un programa java. En caso de
		 * acceder, lanza al usuario 'login correcto'. Sino, 'llamando al policía'.
		 */

		int pinSecreto=1234;
		boolean hayError = false;
		
		for (int pos=1;pos<=4 && hayError == false;pos++) {
			
			System.out.println(" Digito (" + pos + ")");
			int digito=keyboard.nextInt();
			int digitoSecreto= (int) ( pinSecreto/Math.pow(10, 4-pos));
			pinSecreto = (int) (pinSecreto%Math.pow(10,4-pos));
			if (digito != digitoSecreto) {
				System.out.println("ERROR");
				hayError= true;
			}
		}
		
	}

}
