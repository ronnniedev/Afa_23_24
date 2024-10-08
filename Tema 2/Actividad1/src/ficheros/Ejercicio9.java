package ficheros;

import java.util.Scanner;

public class Ejercicio9 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 9
		 * Con un programa modular, determinar el numero de cifras de un
		 * numero. Por ejemplo 9560 debe indicar que tiene 4 cifras, el numero -
		 * 365 debe indicar que tiene 3 cifras
		 */
		
		System.out.println("Escribe una cifra: ");
		int num = keyboard.nextInt();
		
		System.out.println(num + " tiene " + contarCifras(num) + " cifras ");

	}
	/**
	 * Cuenta las cifras
	 * @param num : entero
	 * @return cont : entero
	 */
	public static int contarCifras (int num) {
		
		int cont = 0;
		
		if (num < 0) num = num * -1;
		
		while (num > 0) {
			
			num = num/10;
			cont++;
			
		}
		
		System.out.println(cont);
		return cont;
	}

}
