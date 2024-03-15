package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cont = 0;
		
		System.out.print("Escriba un numero: ");
		double num1 = keyboard.nextDouble();
		
		System.out.print("Escriba otro numero: ");
		double num2 = keyboard.nextDouble();
		
		System.out.println("Escriba otro numero mas: ");
		double num3 = keyboard.nextDouble();
		
		if (num1 == num2 ||num2 == num3 || num3 == num1 ) {
			cont++;
		}
		if (num1==num2 && num2==num3) {
			cont++;
		}
		
		if (cont == 1)System.out.println("Dos de los tres numeros son iguales");	
		else if (cont == 2)System.out.println("Los tres numeros son iguales");
		else System.out.println("Todos los numeros son distintos");
			
			
	

	}

}
