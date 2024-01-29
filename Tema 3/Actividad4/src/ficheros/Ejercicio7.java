package ficheros;

import java.util.Scanner;

public class Ejercicio7 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
	int [][]  m ={{ -1, 2, -1},
			      { 0, 0, 0},
				  {1, -2, 1},};
		
		
		
		Libreria.mostrarMatriz(m);
		Libreria.mostrarMatrizV2(m);
		
		if (Libreria.esMagica(m)) System.out.println("La matriz es magica");
		else System.out.println("La matriz no es magica");
		
		

	}

}
