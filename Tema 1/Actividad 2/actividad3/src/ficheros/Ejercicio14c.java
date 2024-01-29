package ficheros;

import java.util.Scanner;

public class Ejercicio14c {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		final int NUMERO_SECRETO = (int) ((Math.random()*20)+1);
		
		boolean condicion = true;
		int numIntentos = 0;
		
		while (true == condicion) {
			
			System.out.println("Pedir numero:");
			int num = keyboard.nextInt();
			numIntentos++;
			
			if (num == NUMERO_SECRETO) {
				
				condicion = false;
				
			} else if (num < NUMERO_SECRETO) {
				
				System.out.println("El numero secreto es mayor");
				
			}else {
				
				System.out.println("El numero secreto es menor");
				
			}
			
			
		}
		if (numIntentos < 5) System.out.println("Enhorabuena!!!");
		if (numIntentos >= 5 && numIntentos <= 10)  System.out.println("No esta mal");
		if (numIntentos > 10) System.out.println("Debes practicar mas");
		
		

	}

}
