package ficheros;

import java.util.Scanner;


public class Libreria {
	static Scanner keyboard = new Scanner(System.in);
	/**
	 * Comprueba si el numero del Dni es valido
	 * @param dni : entero
	 * @return boolean
	 */
	public static boolean comprobarDni(int dni) {
		
		boolean comprobacion = false;
		
		
		if (dni <= 99999999) comprobacion = true;
		
		return comprobacion;

	}/**
	 * Indica a que letra pertenece el DNI introducido
	 * @param dni : entero
	 * @return character
	 */
	public static char letraDni (int dni) {
		
		int resul = dni%23;
		
		
		switch (resul) {
		case (0): return 't';
		case (1): return 'r';	
		case (2): return 'w';	
		case (3): return 'a';
		case (4): return 'g';
		case (5): return 'm';
		case (6): return 'y';
		case (7): return 'f';
		case (8): return 'p';
		case (9): return 'd';
		case (10): return 'x';
		case (11): return 'b';
		case (12): return 'n';
		case (13): return 'j';
		case (14): return 'z';
		case (15): return 's';
		case (16): return 'q';
		case (17): return 'v';
		case (18): return 'h';
		case (19): return 'l';
		case (20): return 'c';
		case (21): return 'k';
		}
		
		return 'e';
	}
	/**
	 * Comprueba si la letra introducida por el usuario y el numero son concordantes
	 * @param letraDni : char
	 * @param dni : entero
	 * @return boolean
	 */
	public static boolean dniValido (char letraDni, int dni) {
		
		char letra = letraDni (dni); //llamamos a la funcion para determinar que letra es el entero del dni
		boolean iguales = false;
		
		
		if (letra == letraDni) {
			
			iguales = true;
			
		}
		
		return iguales;
			
	}

}
