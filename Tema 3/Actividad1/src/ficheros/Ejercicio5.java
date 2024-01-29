package ficheros;

import java.util.Scanner;

public class Ejercicio5 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 5
		 * Calcular la mediana de un vector. Es aquella que deja tantos menores
		 * como mayores. solución ordenar y retornar la posición central
		 */
		
		System.out.println("Dime el tamaño del vector: ");
		int tam = keyboard.nextInt();
		
		int [] v= Libreria.leerVector(tam);
		int [] vMin= new int [tam];
		int suma = 0;
	
		for (int cont = 0; cont < v.length ;cont++) {

			int min = Libreria.min(v);
			
			vMin[cont]= min;
			v[Libreria.posMin(v)] = Libreria.max(v)+1;
			System.out.print(vMin[cont]+ ",");
			suma = suma + vMin[cont];
		}
		System.out.println();
		int comprobador = suma/2;
	
		for (int i = 0 ;suma > comprobador; i++) {
			
			suma = suma - vMin[i];
			
			if (suma < comprobador) System.out.println("La posicion del meridiano es:" + i);
			
		}
	}

}
