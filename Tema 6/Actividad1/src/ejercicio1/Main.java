package ejercicio1;

import java.util.Scanner;

public class Main {
	static Scanner keyboard=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("vacio");
		String ejemplo = keyboard.nextLine();
		
		System.out.println("Mira esto");
		String segundaPalabra = keyboard.next();
		System.out.println(ejemplo);
		System.out.println(segundaPalabra);
	}

}
