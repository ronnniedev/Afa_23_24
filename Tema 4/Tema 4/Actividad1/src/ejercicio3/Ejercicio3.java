package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Cuantas contraseñas quieres?");
		int dim = keyboard.nextInt();
		
		System.out.println("Dime la longitud de la contraseña: ");
		int longitud = keyboard.nextInt();
		
		Password v[] = new Password [dim];
		
		for (int i = 0; i < v.length; i++) {
			 v [i] = new Password (longitud);
			
		}
		
		boolean verdad[] = new boolean [dim];
		
		for (int i = 0; i < verdad.length; i++) verdad [i] = v[i].esFuerte(v[i].getContraseña());
		
		for (int i = 0; i < verdad.length; i++) {
		
			System.out.println("La contraseña " + i + " es " + v[i].getContraseña() + " Fuerte = " + verdad[i]);
			
		}
		
		
		
		
	}
	
}
