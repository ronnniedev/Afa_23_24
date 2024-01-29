package ficheros;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 4
		 * Calcular la varianza de un vector. Se define la varianza de un vector,
		 * como la suma de los cuadrados de cada elementos divido entre el
		 * numero de elementos
		 */
		
		double suma = 0;
		
		System.out.println("Escribeme el tamaño del vector");
		int tam = keyboard.nextInt();
		
		int [] v = Libreria.leerVector(tam);
		
		for (int i = 0; i < v.length; i++) suma = suma + (Math.pow(2, v[i]));
			
		System.out.println("La varianza de este vector es : " + suma/v.length);

	}

}
