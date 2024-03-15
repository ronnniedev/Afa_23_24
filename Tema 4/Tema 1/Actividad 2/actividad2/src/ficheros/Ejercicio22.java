package ficheros;

import java.util.Scanner;

public class Ejercicio22 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Actividad 22
		 * Suma todos los números impares que hay entre 1 y 20 mostrando el
		 * resultado al final (a) . Generaliza lueg este ejercicio para dos números
		 * cualquier pedidos por teclado, deberá ir de menor a mayor.
		 */
		int numero;
		int suma;
		
		numero = 0;
		suma = 0;
		
		while (numero < 20) { //0 es el limite con el que trabajamos
			
			if (numero%2 != 0) { //numero marca el superior siendo este 20
				System.out.print(numero + " ");
				suma = suma + numero;
				numero++;
			}else {
				numero++;
			}
			
			
		} System.out.println("\nLa suma de los impares entre 1 y 20 es : "+suma);
	}	

}
