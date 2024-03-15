package ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner keyboard = new Scanner(System.in);
	public static void leerVector (int v []) {
		
		for (int i = 0; i < v.length; i++) {
			
			System.out.print("Escribe el valor[" + i + "]: ");
			v [i] = keyboard.nextInt();
			
		}
	
	}
	
	public static void mostrarVector (int v []) {
		
		for (int i = 0; i < v.length; i++) {
			
			System.out.println("[" + i + "] = " + v[i]);
			
			
		}
	
	}
	
	public static void maximo (int v[]){
		
		
		int max = v[0];
		
		for (int i = 0; i < v.length; i++) {
			
			if (v[i] > max) max = v[i];
			
		}
		System.out.println("El maximo es " + max);
	}
	
	public static void minimo (int v[]) {
		
		int min = v[0];
		
		 for (int i = 0; i < v.length; i++) {
			 
			if (v[i] < min) min = v[i];
			
		}
		 System.out.println("El minimo es " + min);
		
	}
	
	public static void posicionMaximo (int v[]){
		int max = v[0];
		int pos = 0;
		
		for (int i = 0; i < v.length; i++) {
			
			if (v[i] > max) { 
				max = v[i];
				pos = i;
			}
			
		}
		System.out.println("La posicion del maximo es " + pos);
	}
	
	public static void posicionMinimo (int v[]){
		int min = v[0];
		int pos = 0;
		
		for (int i = 0; i < v.length; i++) {
			
			if (v[i] < min) { 
				min = v[i];
				pos = i;
			}
			
		}
		System.out.println("La posicion del minimo es " + pos);
	}
	
	public static boolean buscarValor (int []v, int valor) {
		
		for (int i = 0; i < v.length; i++) if (v[i] == valor) return true;
			
		return false;
	}
	
	public static int[] generarVectorAleatorio (int tam ,int num) {
		
		int v [] = new int [tam];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) ((Math.random()*num)+1);
		}
		
		return v;
	}
	
	public static int [] productoVectorial (int [] a , int [] b) {
		
		int resul [] = new int [a.length];
		
		for (int i = 0; i < resul.length; i++) {
			
			resul [i] = a[i] * b [i];
			System.out.println("[" + i + "] " + a[i] + " * " + b[i] + " = " + resul[i]);
		}
		
		
		return resul;
	}
	
	public static int media (int []v) {
		int resul = 0;
		
		for (int i = 0; i < v.length; i++) {
			
			resul = resul + v [i];
			
		}
		
		return resul/v.length;
	}
	
	public static int [] calculaDiferencia (int []v) {
		int media = media(v);
		int resul [] = new int [v.length];
		
		for (int i = 0; i < resul.length; i++) {
			resul [i] = Math.abs(media-v[i]);
		}
		System.out.println("----->Original<-----");
		mostrarVector(resul);
		
		return resul;
		
		
	}
	
	/**
	 * Genera una matrix de enteros a partir de las dimensiones de la misma , su minimo y maximo.
	 * @param filas entero
	 * @param columnas entero
	 * @param min entero
	 * @param max entero
	 * @return matriz de enteros
	 */
	public static int [][] generarMatrizInt (int filas , int columnas ,int min, int max) {
		
		int m [][] = new int [filas] [columnas];
		
		for (int i = 0; i < m.length ; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m [i][j] = (int) ((Math.random()*(max+1))+min);
			}
			
		}	
		return m;	
	}
	
	/**
	 * Dibujo un cuadro de matriz esteticamente 
	 * @param m : matriz de enteros
	 */
	public static void mostrarMatrizV2(int [][]m) {
		
		System.out.print("|   |");
		
			for (int j = 0; j < m[0].length; j++) {
			
				System.out.print(j + " |");
			}
			System.out.println();
		
			for (int i = 0; i < m.length; i++) {
			
			
				System.out.print("| " + i + " |");
			
				for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] < 10 && m[i][j] >= 0) System.out.print(""+m[i][j]+ " |");
				else if (m[i][j] < 0) System.out.print(""+m[i][j]+ "|");
				else System.out.print(""+m[i][j]+ "|");
				
				}
				System.out.println();
				
			}
			
		}
	/**
	 * Busca un valor dado dentro de la matriz
	 * @param m : matriz de enteros
	 * @param valor entero
	 */
	public static void buscarValor (int [][]m , int valor) {
		
		boolean esta = false;
		int posI = -1;
		int posJ = -1;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m [i][j] == valor) { 
					esta = true;
					posI = i;
					posJ = j;
				}
			}
		}
		
		if (esta) System.out.println("El valor se encuentra en la matriz en las coordenadas ["+posI+"," + posJ+ "]");
		else System.out.println("El valor no se encuentra en la matriz");
		
	}
	/**
	 * Suma las filas de una matriz
	 * @param m : matriz de enteros
	 * @return vector de enteros
	 */
	public static int [] sumaPorFilas (int[][] m) {
		
		int v [] = new int [m.length];
		
		for (int i = 0; i < m.length; i++) {
			int suma = 0;
			for (int j = 0; j < m[0].length; j++) {
				suma = suma + m[i][j];
				
			}
			v [i] = suma;
		}
		
		
		return v;
	}
	/**
	 * Suma las columnas de una matriz
	 * @param m : matriz de enteros
	 * @return vector de enteros
	 */
	public static int [] sumaPorColumnas (int[][] m) {
		
		int v [] = new int [m.length];
		
		for (int j = 0; j < m[0].length; j++) {
			int suma = 0;
			for (int i = 0; i < m.length; i++) {
				suma = suma + m[i][j];
				
			}
			v [j] = suma;
		}
		
		
		return v;
	}
	/**
	 * Suma la diagonal de una matriz
	 * @param m : matriz de enteros
	 * @return vector de enteros
	 */
	public static int calcularSumaDiagonal (int [][] m) {
		int suma = 0;
		int j = 0;
		
		for (int i = 0; i < m.length; i++) {
			
			suma = suma + m[i][j];
			j++;
		}
		
		return suma;
	}
	/**
	 * Suma la diagonal inversa de una matriz
	 * @param m : matriz de enteros
	 * @return vector de enteros
	 */
	public static int calcularSumaDiagonalInversa (int [][] m) {
		int suma = 0;
		int j = m[0].length-1;
		
		for (int i = 0; i < m.length; i++) {
			
			suma = suma + m[i][j];
			j--;
		}
		
		return suma;
	}
	/**
	 * Calcula los valores par ahacer que la diagonal de una matriz sean 0
	 * @param m : matriz de enteros
	 * @return vector de enteros
	 */
	public static int [] diagonalizarMatriz (int [][] m) {
		
		int v [] = new int [m.length];
		int j = 0;
		
		for (int i = 0; i < m.length; i++) {
			
			v[i] = m[i][j]*-1;
			j++;		
		}
		
		 j = 0;
		
		for (int i = 0; i < v.length; i++) {
			
			m[i][j] = m[i][j] + v[i];
			j++;
		}
		
		return v;
		
	}
	/**
	 * Controla si la parte triangular superior de una matriz tiene solo 0
	 * @param m : matriz de enteros
	 * @return boolean
	 */
	public static boolean matrizTriangularSuperior (int [][] m) {
		int cont = 0;
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[0].length; j++) {
				if (j > cont && m[i][j] != 0) return false;
			}
		
			cont++;
		}
		
		return true;
		
	}
	/**
	 * Controla si la parte triangular inferior de una matriz tiene solo 0
	 * @param m : matriz de enteros
	 * @return boolean
	 */
	public static boolean matrizTriangularInferior (int [][] m) {
		int cont = 0;
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[0].length; j++) {
				if (j < cont && m[i][j] != 0)return false;
					
		
			}
		
			cont++;
		}
		
		return true;
		
	}
	/* Muestra la matriz escrita sin estilizar
	 * @param m : matriz de enteros
	 */
	public static void mostrarMatriz (int [][] m) {
		
		System.out.println("------------->MostrarMatriz<-------------\n");
		
		for (int i = 0; i < m.length ; i++) {
			
			for (int j = 0; j < m[0].length ; j++) {
				if(m[i][j] > 0 && m[i][j] < 10)System.out.print(m[i][j] + "  ");
				else System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	
	public static int [][] calcularTraspuesta (int m[][]){
		
		int m2 [][] = new int [m.length][m[0].length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m2 [j][i] = m[i][j];
			}
		}
		
		return m2;
	}
	
	public static int [][] sumaMatrices (int a [][], int b[][]){
		
		int c [][] = new int [a.length][a[0].length];
		
		if (a.length == a[0].length && b.length == b[0].length && a.length == b.length && b[0].length == a[0].length ) {
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					
					c [i][j] = a[i][j] + b[i][j];
					
				}
			}
		}else System.out.println("Matrices de dimensiones distintas");
		
		return c;
	}
	
	public static int [] calcularDiferencia (int v[]) {
		int media  = media(v);
		int resul [] = new int [v.length];
		
		for (int i = 0; i < v.length; i++) {
			
			resul [i] = Math.abs(v[i] - media);
		}
		
		return resul;
	}
	
	public static void calcularDesviacion (int v[]) {
		int difer [] = calcularDiferencia(v);
		int media  = media(difer);
		
		System.out.println("La desviacion media es de " + media);
		
		
	}

}
