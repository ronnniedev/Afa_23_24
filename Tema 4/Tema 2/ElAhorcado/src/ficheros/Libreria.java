package ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner keyboard = new Scanner(System.in);
	public static boolean comprobarLetra (char letra) {
		
		boolean valido = false;
		char ejemplo = '2';
		int cont = 0;
		
		while (ejemplo != '1' && valido == false) {
			
			if (ejemplo == letra) valido = true;
			String caracteres = "abcdefghijklmnopqrstuvwxyz1";
			ejemplo = caracteres.charAt(cont);
			cont++;
			
		}
		
		return valido;
	}

}
