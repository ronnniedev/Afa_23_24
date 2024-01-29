package ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner keyboard = new Scanner(System.in);
	
	
	
	/**
	 * Imprime un menu con dos selecciones, dependiendo del numero introducido se retorna un entero.
	 * @return entero 
	 */
	public static int menu() {
		
		System.out.println("-------------- Calculos cuñados ----------------\n");
		System.out.println("Introduce un numero entre las siguientes opciones:\n");
		System.out.println("1. numero cuñados");
		System.out.println("2. numeros familia\n");
		System.out.print("Escribelo aqui:");
		int sel = keyboard.nextInt();
		
		while (sel <= 0 || sel >= 3) {
			
			System.out.println("ERROR\n POR FAVOR INTRODUCE UNA OPCION VALIDA");
			
			System.out.println("-------------- Calculos cuñados ----------------\n");
			System.out.println("Introduce un numero entre las siguientes opciones:\n");
			System.out.println("1. numero cuñados");
			System.out.println("2. numeros familia");
			System.out.print("Escribelo aqui:");
			sel = keyboard.nextInt();
	
		}
		return sel;
	
	}
	
	/**
	 * Cuenta las cifras de un numero entero y retorna lo contado
	 * @param numero : entero
	 * @return entero 
	 */
	public static int numeroDeDigitos (int numero) {
		
		int cifras = 0;
		
		while (numero > 0) {
			
			numero = numero/10;
			cifras++;
		}
		
		return cifras;
		
	}
	/**
	 * Invierte un numero dado en la main
	 * @param numero : entero
	 * @return entero 
	 */
	public static int numeroInverso (int numero) {
		
		int suma = 0;
		int resul = 0;
		
		while (numero > 0) {
			
			resul = numero%10;
			suma = suma*10 + resul;
			numero = numero/10;
			
		}
		
		return suma;
		
	}
	/**
	 * Compara cada digito del numero para ver si el numero introducido lo tiene
	 * @param numero : entero
	 * @param digito : entero
	 * @return boolean
	 */
	public static boolean contieneDigito(int numero, int digito) {
		
		int resul = 0;
		boolean hayDigito = false;
		
		while (numero > 0) {
			resul = numero%10;
			
			resul = resul - digito;
			
			if (resul == 0) hayDigito = true;
			
			numero = numero/10;	
			
		}
		
		return hayDigito;
		
	}

}
