package ficheros;

import java.util.Scanner;

public class Ejemplo2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int v [] = new int [5];
		
		// rellenar un vector
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("["+i+"]");
			v[i]=keyboard.nextInt();
			
		}
		
		// mostrar vector 
		
		for (int i = 0; i < 5; i++) {
			System.out.println("["+i+"] = " + v[i]);
			
		}
	}

}
