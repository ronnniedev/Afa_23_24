package ficheros;

import java.util.Scanner;

public class Ejercicio8p {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce un numero: ");
		int suma;
		
		suma = 0;
		
		int N=keyboard.nextInt();
		
		for (int num = 0; num <= N; num++) {
			
			int fact=1;
			
			for (int cont=1;cont <=num;cont++) {
				fact=fact*cont;	
			}
			suma = suma + fact;
			
			
			System.out.println(num + "! : " + fact);
			
		} System.out.println("La suma total es: " + suma);

	}

}
