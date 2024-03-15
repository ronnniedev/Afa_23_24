package ficheros;

import java.util.Scanner;

public class Ejercicio26b {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean cond=true;
		
		while (cond) {
			
			System.out.println("¿Desea continuar? (s/n)");
			String cadena=keyboard.next();
			char caracter=cadena.charAt(0); //el numero indica la podicion de caracter que lee
			
			if (caracter=='S' || caracter=='s') {
				
				cond=false;
				
			}
			
			
		}
		System.out.println("Fin!!!");

	}

}
