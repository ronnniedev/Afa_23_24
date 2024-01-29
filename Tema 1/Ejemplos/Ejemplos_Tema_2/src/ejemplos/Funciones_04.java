package ejemplos;

import java.util.Scanner;

public class Funciones_04 {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// funcion sin retornar nada => procedimiento
		presentacion("Numeros Pares o Impares");
		  
		do {
		    // Función para leer un numero entero
			int numero = leerNumero("Ingrese un numero: ");

		    // Función que detemrina si un  numero es par o no
		    boolean res = isPar(numero);
		    if(res == true) {
		    	System.out.println("El numero "+numero+" es par");
		    }
		    else {
		    	System.out.println("El numero "+numero+" es impar");
		    }
		     
		  } while (funcContinuar("Deseas continuar?") == true);		
	}

	/*
	 * Funcion que indica si queremos continuar o no 
	 */
	private static boolean funcContinuar(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println(mensaje);
		char c = teclado.next().charAt(0);
		if(c=='S' || c=='s'){
			return true;
		}
		return false;
	}

	/*
	 * Función que determina si un numero es par o impar
	 */
	private static boolean isPar(int numero) {
		if(numero%2 == 0) {
			return true;
		}
		return false;		
	}

	private static int leerNumero(String mensaje) {
		presentacion(mensaje);
		int n = teclado.nextInt();
		return n;
	}

	private static void presentacion(String mensaje) {
		System.out.println(mensaje);
		
	}
}
