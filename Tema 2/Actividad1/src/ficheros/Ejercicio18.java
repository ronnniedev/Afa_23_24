package ficheros;

import java.util.Scanner;

public class Ejercicio18 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 18
		 * Implementar una función se simule la devolución de monedas de una
		 * máquina expendedora. El programa principal lee la cantidad de dinero
		 * y la función calcula la cantidad de monedas necesarias para cubrir la
		 * cantidad
		 * Por ejemplo 3,47 :
		 * • 1 moneda de 2 €
		 * • 1 moneda de 1€
		 * • 2 de 20 cts
		 * • 1 de 5 cts
		 * • 1 de 2 cts
		 */
		
		System.out.println("Introduce la cantidad de euros a cambiar: ");
		double money = keyboard.nextDouble();
		
		Libreria.calcularCambio(money);

	}

}
