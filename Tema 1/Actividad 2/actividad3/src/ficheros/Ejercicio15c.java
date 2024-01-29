package ficheros;

import java.util.Scanner;

public class Ejercicio15c {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce numero ");
		int num = keyboard.nextInt();
		int posActual = 0;
		boolean esMagico = true;
		
		while (num > 0 && esMagico == true) {
			
			int cifra = num%10;
			num = num / 10;
			posActual++;
			
			if (posActual%2 == 0 && cifra%2 != 0) {
				//error
				esMagico = false;
				
			}
			if (posActual%2!=0 && cifra%2 == 0) {
				
			}
			
		}
		if (esMagico==true) {
			System.out.println("El numero es magico");
		}else {
			System.out.println("El numero no es magico");
		}

	}

}
