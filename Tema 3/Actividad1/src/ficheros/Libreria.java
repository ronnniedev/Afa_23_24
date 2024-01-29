package ficheros;
import java.util.Scanner;

public class Libreria {
	static Scanner keyboard = new Scanner(System.in);
	
	public static void MostrarValores(int v[]) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("[" + i + "] = " + v[i]);
			
		}
		
		
		
	}
	
	public static int[] leerVector () {

		int v [] = new int [10];
		
		for (int i = 0 ; i < v.length ; i++) {
			
			System.out.println("Escribe el valor de la posicion [" + i + "]");
			v [i] = keyboard.nextInt();
		}
		
		return v;
		
	}
	/*
	 * Lee el vector habiendo introducido previamente el tamaño del mismo
	 * @param int : tam
	 * @return vector de enteros
	 */
	public static int[] leerVector (int tam) {

		int v [] = new int [tam];
			
		for (int i = 0 ; i < v.length ; i++) {
				
			System.out.println("Escribe el valor de la posicion [" + i + "]");
			v [i] = keyboard.nextInt();
		}
			
		return v;
		
	}
	
	/*
	 * Lee el vector habiendo introducido previamente el tamaño del mismo
	 * @param int : tam
	 * @return vector de enteros
	 */
	public static float[] leerVectorFloat (int tam) {

		float v [] = new float [tam];
			
		for (int i = 0 ; i < v.length ; i++) {
				
			System.out.println("Escribe el valor de la posicion [" + i + "]");
			v [i] = keyboard.nextFloat();
		}
			
		return v;
		
	}
	
	public static void mostrarVector (int v[]) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("[" + i + "] = " + v[i]);
			
		}
		
	}
	
	
	public static void mostrarVector (float v[]) {
		for (int i = 0; i < v.length; i++) System.out.print("[" + i + "] = " + v[i] + " ");
			
		
	}
	public static void mostrarVector (double v[]) {
		for (int i = v.length-1 ; i >= 0 ; i--)  System.out.print("["+ i + "] = " + v [i]);
		
		System.out.println();
		
	}
	
	public static int suma (int v[]) {
		
		int suma = 0;
	for (int i = 0; i < v.length;i++) suma = suma + v[i];
	
		return suma;
		
	}
	
	public static int max (int v[]) {
		
		int max = v[0];
		
		for (int i = 0; i <v.length;i++) if (v[i]>max) max = v[i];
		
		return max;
	}
	
	public static int Posmax (int v[]) {
		
		int max = v[0];
		int posMax = 0;
		
		for (int i = 0; i <v.length;i++) if (v[i]>max) {
			max = v[i];	
			posMax =i;
			
		}
		
		return posMax;
	}
	
	
	public static int min (int v[]) {
		
		int min = v[0];
		
		for (int i = 0; i <v.length;i++) if (v[i]<min) min = v[i];
		
		return min;
	}
	
	public static int posMin (int v[]) {
		
		int min = v[0];
		int posmin = 0;
		
		for (int i = 0; i <v.length;i++) if (v[i]<min) {
			min = v[i];
			posmin = i;
		} 
		
		return posmin;
	}
	
	public static int sumaNumerosPares(int v[]) {
		
		int suma = 0;
		
		for (int i = 0; i < v.length;i++) {
			
			if (v[i]%2==0) suma = suma + v[i];
			
		}
		
		return suma;
		
	}
	
	public static int sumaNumerosImpares (int v[]) {
		
		int suma = 0;
		
		for (int i = 0; i < v.length;i++) {
			
			if (v[i]%2!=0) suma = suma + v[i];
			
		}
		
		return suma;
		
		
	}
	
	public static void ordena (double v[]) {
		
		for (int iter = 0; iter < v.length; iter++) {
			double pivote = v[iter];
			int posPivote = iter;
			
			for (int i = iter+1; i<v.length;i++) {
				
				if (v[i]<pivote) {
					pivote = v[i];
					posPivote=i;
					
				}
				
			}
			
			double aux = v[iter];
			v[iter] = v[posPivote];
			v[posPivote]=aux;
			
		}
		
		
	}
	/*
	 * Genera un vector de manera aleatoria introduciendo previamente el tamaño.
	 * @param int: tam
	 * @return vector de reales
	 */
	
	public static double[] generaVector (int tam) {
		double v [] = new double [tam];
		for (int i = 0; i < tam; i++) {
			v [i] =(int) ((Math.random()*tam)+1);
			
		}
		
		return v;
	}
	/*
	 * Genera un vector de manera aleatoria introduciendo previamente el tamaño.
	 * @param int: tam
	 * @param int: min
	 * @param int: max
	 * @return vector de reales
	 */
	public static double[] generaVector (int tam, int min, int max) {
		double v [] = new double [tam];
		for (int i = 0; i < tam; i++) {
			v [i] =(int) ((Math.random()*max)+min);
			
		}
		
		return v;
	}
	public static int[] generaVectorInt (int tam, int min, int max) {
		int v [] = new int [tam];
		for (int i = 0; i < tam; i++) {
			v [i] =(int) ((Math.random()*max)+min);
			
		}
		
		return v;
	}
	public static int busqueda (float [] v, float value) {
		
	for (int i = 0; i < v.length ; i++) {
		
		if (v[i] == value) return i;
		
	}
	
	return -1;

	}
	
	/*
	 * Ordena los pares y los impares del vector reescribiendolos a posteriori.
	 * @param vector de reales
	 */
	
	public static void ordenaPares (float v[]) {
		
		float vAux [] = new float [v.length];
		int cont = 0;
		
		for (int i = 0; i < v.length; i++) { //ordena los pares
			
			if (v[i]%2 == 0) {
				vAux [cont] = v[i];
				cont++;	
			}
			
		}	

		for (int i = 0; i < v.length; i++) { //ordena los impares
			
			if (v[i]%2 != 0) {
				vAux [cont] = v[i];
				cont++;	
			}
			
		}
		for (int i = 0; i < v.length; i++) { //sobreescribe el vector
			
			v[i] = vAux [i];
			
		}
		
	}
	/*
	 * Cuenta el numero de veces que aparece un valor en un vector
	 * @param vector de enteros
	 * @param int: valor
	 * @return entero
	 */
	
	public static int buscarValor (int v[],int valor) {
		
		int cont = 0;
		
		for (int i = 0; i<v.length; i++) {
			
			if (v[i]==valor) cont++; 
			
		}
		
		return cont;
	
	}
	


}
