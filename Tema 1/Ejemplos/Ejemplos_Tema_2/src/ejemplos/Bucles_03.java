package ejemplos;

import java.util.Scanner;

public class Bucles_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		char tecla;
		char secreto ='a';
		int intentos = 0;

		System.out.println("Adivina la tecla: ");
		tecla = teclado.next().charAt(0);
		intentos = intentos + 1;
		
		// Un bucle while, que se repite  mientras se cumpla la condicion
		while(tecla != secreto) {
			System.out.println("Has pulsado la tecla "+tecla);
			intentos = intentos + 1;
			System.out.println("Adivina la tecla: ");
		    tecla = teclado.next().charAt(0);
		}

		

		// Para no repetir lo de pedir las letras usamos do-while 

		intentos = 0;
		secreto = 'b';
		do {
			System.out.println("Adivina la tecla: ");
			tecla = teclado.next().charAt(0);
			System.out.println("Has pulsa la tecla $tecla");
			intentos = intentos + 1;
		} while(tecla != secreto);

		System.out.println("Has acertado en "+intentos+" intentos que la tecla es "+secreto);
		

		// Bucle definido, indico las veces que se repite
		System.out.println("Bucle definido de 1 a 10");
		for (int i=1;i<=10;i++) {
			System.out.println("El valor de i es "+i);
		}

		System.out.println("Bucle definido de 10 a 1");
		for (int i=10;i>1;i--) {
			System.out.println("El valor de i es "+i);
		}
		
		System.out.println("Bucle definido de 1 a 10 de 2 en 2");
		for (int i=1;i<=10;i+=2) {
			System.out.println("El valor de i es "+i);
		}
		System.out.println("Bucle definido de 10 a 1 de 2 en 2");
		for (int i=10;i>=1;i-=2) {
			System.out.println("El valor de i es "+i);
		}
				  
	}

}
