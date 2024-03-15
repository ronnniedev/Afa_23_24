package ficheros;

import java.util.Scanner;

public class Ejercicio4b {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Cual es el tamaño del vector?");
		int tam = keyboard.nextInt();
		
		double v[] = Libreria.generaVector(tam);
		Libreria.mostrarVector(v);
		Libreria.ordena (v);
		Libreria.mostrarVector(v);

	}
	
	

}
