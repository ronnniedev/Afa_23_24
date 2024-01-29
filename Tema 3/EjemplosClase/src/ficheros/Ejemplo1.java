package ficheros;


import java.util.Scanner;

public class Ejemplo1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int v [] = new int [5];
		
		//leer valores
		
		for (int i =0 ; i < 5; i++) {
			
			v [i]=i;
			
		}
		
		// mostrar
		
		for (int i = 0; i < 5 ; i++) {
			
			System.out.println("[" + i + "] = " + v[i]);
		}
		
		

	}

}
