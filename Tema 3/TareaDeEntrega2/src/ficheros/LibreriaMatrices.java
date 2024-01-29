package ficheros;

import java.util.Scanner;

public class LibreriaMatrices {
	static Scanner keyboard = new Scanner(System.in);
	
	
	/**
	 * Lee las dimensiones de la matriz y escribe los valores introducidos por el usuario en la misma.
	 * @param m matriz enteros
	 */
	public static void leerMatriz (int m [][]) {
		
		for (int i = 0; i <m.length;i++) {
			for (int j = 0; j <m[0].length;j++) {
				
				System.out.println("Escribe la posicion [" + i + "] [" + j + "]");
				m [i][j] = keyboard.nextInt(); 
				
			}
			
		}	
		
	}
	/**
	 * Imprime la matriz previamente escrita en forma de cuadrado
	 * @param m matriz de enteros
	 */
	public static void imprimeMatriz (int m [][]) {
		
		
		for (int i = 0; i <m.length;i++) {
			boolean primero = true;
			for (int j = 0; j <m[0].length;j++) {
				if (primero) {
					System.out.print(m[i][j]);
					primero = false;
				} 
				else System.out.print("," + m[i][j]);
			}
			System.out.println();
		}
		
		
	}
	/**
	 * Muestra el maximo de una fila
	 * @param m vector de enteros
	 * @return entero
	 */
	public static int maximo (int m []) {
		
		 boolean primero = true;
		 int max = 0;
		
		for (int i = 0; i <m.length;i++) {
			
			if (primero) {
				primero = false;
				max = m[i]; 
			   
			}
			
			if (m[i] > max) max = m[i]; 
			
			
		}
		
		return max;	
	}
	/**
	 * Devuelve la posicion de un maximo en la columna de la fila previamente introducida
	 * @param m vector de enteros
	 * @return entero
	 */
	public static int posMax (int m []) {
		
		int max = maximo(m);
		int pos = 0;
		
		for (int i = 0;i <m.length;i++) {
			
			if (max == m[i]) return i;
			
		}
		return pos;
		
		
		
	}
	/**
	 * Analiza si todos los numeros de una fila son distintos
	 * @param m vector de enteros
	 * @return boolean
	 */
	public static boolean todosDistintos (int [] m) {
		
		for (int i = 0; i <m.length;i++) {
			int iguales = 0;
			for (int iAux = 0; iAux <m.length;iAux++) {
				
				if (m [i] == m [iAux]) iguales++;
				if (iguales==2) return false;
				
			}
			
		}return true;
		
		
	}
	/**
	 * Analiza las caracteristicas de la matriz para determinar si es mccud
	 * @param m matriz de enteros
	 * @return boolean
	 */
	public static boolean mccud (int [][] m) {
		
		boolean primero = true;
		int max = 0;
		int constante = 0;
		
		
		for (int j = 0; j <m[0].length;j++) { // si en todas las filas hay distintos pasamos condicion
			
			if (todosDistintos(m[j]) == false) return false;
			
		}
		
		for (int j = 0; j <m[0].length;j++) { //si cada fila tiene un maximo superior al anterior pasamos condicion
			// ademas si hay constante entre maximo pasamos condicion
		
			if (primero) {
				max = maximo (m[j]);
				primero = false;
				constante = max - maximo (m[j+1]);
			}else if (max < maximo (m[j])) {
				if (constante != max - maximo (m[j]))return false;
				max = maximo (m[j]);
			}
			else return false;
		}
		
		for (int j = 0; j <m[0].length;j++) { //si hay dos posiciones iguales de maximos iguales no es mcuud
			int iguales = 0;
			for (int jAux = 0; jAux <m[0].length;jAux++) {
				
				if (posMax (m[j])== posMax (m[jAux]))iguales++;
				if (iguales == 2)return false;
	
			}
		}
		
		return true;
	}

}
