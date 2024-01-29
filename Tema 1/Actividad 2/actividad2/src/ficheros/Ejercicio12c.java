package ficheros;

import java.util.Scanner;

public class Ejercicio12c {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		int ant = keyboard.nextInt();
		int cont = 1;
		boolean consecutivos = true;
		
		
		System.out.println("Introduzca un numero");; //introducimos los valores 
		
		while ( cont < 5 ) {
			
			System.out.println("Num ");
			int act = keyboard.nextInt();
			
			if ((ant - act) != 1 && (ant - act) != -1) {
				consecutivos = false;
			}
			ant = act; //excepciones donde el numero puede ir hacia delante o hacia atras
			// avance
			cont = cont +1;
			
		}
		if ( consecutivos == true ) {
			
			System.out.println("TODOS consecutivos");
			
		}else {
			System.out.println("ERROR");
			
		}
		
		
	}
		
	}


