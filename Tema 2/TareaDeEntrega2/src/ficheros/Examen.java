package ficheros;

import java.util.Scanner;

public class Examen {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		boolean mismasCifras = false;
		boolean inversos = false;
		boolean contieneDigito = false;
		int digito = 0;
		int sel = Libreria.menu();
		System.out.println("Introduce dos numeros enteros por favor\n");
		System.out.println("Introduce a: ");
		int a = keyboard.nextInt();
		
		if (a<0) a = a*-1;

		System.out.println("introduce b: ");
		int b = keyboard.nextInt();
		
		if (b<0) b = b*-1;

		if (sel == 1) {

			int cifrasA = Libreria.numeroDeDigitos(a);
			int cifrasB = Libreria.numeroDeDigitos(b);
			int inversoA = Libreria.numeroInverso(a);
			
			if (cifrasA == cifrasB) mismasCifras = true;
			if (inversoA == b) inversos = true;

			if (mismasCifras && inversos)
				System.out.println("Los numeros son cuñados");
			else
				System.out.println("Los numeros NO son cuñados");

		} else {

			while (a > 0 && contieneDigito == false) {

				digito = a % 10;

				contieneDigito = Libreria.contieneDigito(b, digito);

				a = a / 10;

			}

			if (contieneDigito)
				System.out.println("El numero es familia");
			else
				System.out.println("El numero no es familia");

		}
	}

}
