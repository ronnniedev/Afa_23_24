package ficheros;

import java.util.Scanner;

public class EjemploBucle3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cont = 1;
		int pares = 0;
		int suma = 0;
		int numero;
				
		while (cont <= 5) {
			// leer numero
			System.out.println("Introduce un numero: ");
			numero = keyboard.nextInt();
			// mostrar numero
			System.out.println("( "+ (cont) +" )" + " = " + numero);
			
			suma = suma + numero;
			numero = numero % 2;
			
			if (numero <0) {
				numero *= -1;
			}
			
			if (numero == 0) {
				System.out.println("El numero es par");
				
				pares ++;
			}
			else {
				System.out.println("El numero no es par");
			}
			// avance del bucle
			cont++;
			
			
		}
		System.out.println("Has obtenido " + (pares) + " pares");
		System.out.println("La suma es :" + suma);
	}

}
