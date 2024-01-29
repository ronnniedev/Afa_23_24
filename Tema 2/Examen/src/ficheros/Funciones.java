package ficheros;

import java.util.Scanner;

public class Funciones {
	static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * Analiza si un numero introducido es primo
	 * @param num: entero
	 * @return boolean
	 */
	public static boolean esPrimo (int num) {
		
		int divisiones = 0;
		
		if (num < 0) num = num * -1;
			
		for (int cont = 1; cont<=num ; cont++) {
			
			int resul = num%cont; 
			
			if (resul==0) divisiones++;
			
		}
		
		if (divisiones == 2) return true;
		
		return false;
	}
	/**
	 *Nos indica cual es el siguiente primo consecutivo a un numero introducido
	 * @param num: entero
	 * @return entero
	 */
	public static int siguientePrimo (int num) {
		
		int divisiones = 0;
		
		while (divisiones != 2) {
			
			num++;
			divisiones = 0;
			for (int cont = 1; cont <= num; cont++) {
				
				int resul = num%cont;
				if (resul == 0)divisiones++;
			}
			
			
		}return num;
		
	
	}
	/**
	 * Cuenta el numero de digitos de un numero
	 * @param num : entero
	 * @return entero
	 */
	public static int digitos (int num) {
		
		int cont = 0;
		
		while (num > 0) {
			num = num/10;
			cont++;
		}
		
		return cont;
		
		
	}
	/** 
	 * Voltea un numero dado
	 * @param num : entero
	 * @return entero
	 */
	public static int voltea (int num) {
		
		int volteado= 0;
		
		while (num > 0) {
				
			int resul = num%10;
			num = num/10;
			volteado = volteado*10 + resul;
			
		}
		
		return volteado;
		
	}
	/** 
	 * Nos indica la posicion de una cifra empezando desde la derecha y partiendo de 0.
	 * @param num : entero
	 * @param pos: entero
	 * @return entero
	 */
	public static int digitoN(int num,int pos) {
		
		int cont = 0;
		int resul = 0;
		
		if (pos > digitos(num)) resul = -1;
		else while (cont <= pos) {
			
				resul = num%10;
				num = num/10;
				cont++;
			
			}
		return resul;
	}
	/** 
	 * Nos indica la posicion de un digito empezando desde la derecha y partiendo de 0.
	 * @param num : entero
	 * @param digito: entero
	 * @return entero
	 */
	public static int posicionDeDigito (int num, int digito) {
		
		int resul = digito-1;
		int cont = 0;
		
		while ( digito - resul != 0 && num != 0) {
			
			resul = num%10;
			num = num/10;
			if (resul != digito) cont++;
		
		}
		
		if (digito==resul) return cont;
		else return -1;
		
	}
	/** 
	 * Retira el ultimo numero de la derecha
	 * @param num : entero
	 * @return entero
	 */
	public static int quitarPorDetras(int num) {
		
		num = num/10;
		
		return num;
		
	}
	/** 
	 * Retira el ultimo numero de la izquierda
	 * @param num : entero
	 * @return entero
	 */
	public static int quitarPorDelante(int num) {
		
		int resul =num % (int) Math.pow(10, digitos(num)-1);
		
		return resul;
	}
	/** 
	 * Pega la cifra introducida en digito a la derecha del numero original
	 * @param num : entero
	 * @param digito: entero
	 * @return entero
	 */
	public static int pegarPorDetras(int num,int digito) {
		
		num = num * 10;
		num = num + digito;
		
		return num;
		
	}
	/** 
	 * Pega la cifra introducida en digito a la izquierda del numero original
	 * @param num : entero
	 * @param digito: entero
	 * @return entero
	 */
	public static int pegarPorDelante(int num,int digito) {
		
		digito = digito * (int) Math.pow(10, digitos (num));
		num = num + digito;
		
		return num;
		
	}
}
