package ficheros;

import java.util.Scanner;

public class Ejemplo4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Dime dim");
		int tam = keyboard.nextInt();
		
		int v[] = new int [tam];
		leerVector(v);
		mostrarVector(v);
		
	}
	
	public static void leerVector(int v[]) {
		for (int i=0; i<v.length ; i++) { //el length indica que tamaño tiene el vector
			
		}
	}
	
	public static void mostrarVector (int v[]) {
		for (int i = 0; i <v.length ; i++) {
			
			System.out.println("[" + i + "]=" + v[i]);
			
		}
	}

}
