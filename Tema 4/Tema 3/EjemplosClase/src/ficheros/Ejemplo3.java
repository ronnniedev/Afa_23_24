package ficheros;

import java.util.Scanner;

public class Ejemplo3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Dime dimension: ");
		int dim = keyboard.nextInt();
		
		int v [] = new int [dim];
		
		// rellenar un vector
		
		for (int i = 0; i < dim; i++) {
			
			System.out.println("["+i+"]");
			v[i]=keyboard.nextInt();
			
		}
		
		// mostrar vector 
		
		for (int i = 0; i < dim; i++) {
			System.out.println("["+i+"] = " + v[i]);
			
		}

	}

}
