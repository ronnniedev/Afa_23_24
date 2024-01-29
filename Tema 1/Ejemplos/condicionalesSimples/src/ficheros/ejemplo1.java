package ficheros;

import java.util.Scanner;

public class ejemplo1 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int edad;
		
		System.out.println("¿Cual es tu edad?");
		edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println("eres mayor de edad");
			
		}else if (edad >= 16) {
			System.out.println("Eres casi mayor de edad");
			
		} else {
			System.out.println("Eres menor");
		}
		

	}

}
