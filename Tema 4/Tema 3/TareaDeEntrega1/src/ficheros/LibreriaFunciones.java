package ficheros;

import java.util.Scanner;

public class LibreriaFunciones {
	static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * Lee los valores de un vector
	 * @return vector de enteros
	 */
	public static int[] leerVector () {
	
		System.out.println("---------->LeerVector<----------\n");
		
		System.out.println("Introduce el tamaño del vector:");
		int tam = keyboard.nextInt();
		
		int v [] = new int [tam];
		for (int cont = 0 ; cont < v.length;cont++) {
			
			System.out.println("Escribe la posicion [" + cont + "] :");
			v [cont] = keyboard.nextInt();
			
		}
		
		return v;
	}
	/**
	 * Imprime en pantalla los valores del vector previamente introducido y su posicion
	 * @param v vector de enteros
	 */
	public static void imprimirVector (int v[]) {
		
		System.out.println("\n---------->ImprimirVector<----------\n");
	
		
		for (int cont = 0 ; cont < v.length;cont++) {
			
			System.out.println("[" + cont + "] = " + v[cont]);
			
			}
		
	}
	/**
	 * Muestra los valores repetidos en el vector y cuantas veces han sido introducidos
	 * @param v vector de enteros
	 */
	public static void mostrarRepetidos (int v[]) {
		
		System.out.println("---------->MostrarRepetidos<----------\n");
		boolean primero = true;
		boolean noHay = true;
		
		int max = 0;
		int min = 0;
		
		for (int cont = 0 ; cont < v.length;cont++) {
			
			
			if (primero) {
				primero = false;
				max = v[cont]; 
			    min = v[cont];
				
			}
			
			if (v[cont] > max) max = v[cont]; 
			else if (v[cont] < min) min = v[cont];
			
			
		}
		
		for (int num = min; num <= max ;num++) {
			
			int iguales = 0;
			
			for (int cont = 0 ; cont < v.length;cont++) {
				
				if (v[cont] == num) iguales++;
			
			}
			
			if (iguales >= 2) {
				System.out.println(num + " esta repetido " + iguales + " veces");
				noHay = false;
			} 
		}
		if (noHay) System.out.println("!!No hay numeros repetidos!!\n");
		 
	}
	/**
	 * Busca los valores ausentes entre el minimo y el maximo del vector
	 * @param v vector de enteros
	 */
	public static void buscarAusentes(int v[]) {
		
		System.out.println("\n---------->BUSCAR AUSENTES<----------\n");
		
		boolean primero = true;
		
		int max = 0;
		int min = 0;
			
		for (int cont = 0; cont < v.length;cont++) {
			
			if (cont== 0)System.out.print("[" + v[0] + ",");
			else if (cont == v.length-1) System.out.print(v[cont]+"]");
			else System.out.print(v[cont] + ",");
			
		}
		
		for (int cont = 0 ; cont < v.length;cont++) {
			
			
			if (primero) {
				primero = false;
				max = v[cont]; 
			    min = v[cont];
				
			}
			
			if (v[cont] > max) max = v[cont]; 
			else if (v[cont] < min) min = v[cont];
			
			
		}
		
		System.out.print(" max = " + max + " min = "+ min);
		primero = true;
		for (int num = min; num < max ;num++) {
			
			int iguales = 0;
			int cont = 0;
			
			for (cont = 0; cont < v.length;cont++) {
				
				if (v[cont] == num) iguales++;
			
			}
			
			
			if (iguales == 0) {
				if (primero) {
					
					System.out.print(" Faltan (" + num);
					primero = false;
					
				} else System.out.print("," + num );
				
			}
						
		}
		if(primero == false) System.out.println(")\n");
		else System.out.println(" No falta ningun numero \n");
	
	}
	/**
	 * Calcula el promedio del vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int promedio (int v[]) {
		
		System.out.println("---------->Promedio<----------\n");
		
		boolean primero = true;
		int max = 0;
		int min = 0;
		
		for (int cont = 0 ; cont < v.length;cont++) {
			
			
			if (primero) {
				primero = false;
				max = v[cont]; 
			    min = v[cont];
				
			}
			
			if (v[cont] > max) max = v[cont]; 
			else if (v[cont] < min) min = v[cont];
				
		}
		int valorMedio = (max+min)/2;
		primero = true;
		int diferencia = 0;
		int promedio = 0;
		
		for (int cont = 0; cont < v.length;cont++) {
			if (primero) {
				
				diferencia = Math.abs(valorMedio - v[cont]);
				promedio = v[cont];
				primero = false;
				
			}else if (diferencia > Math.abs(valorMedio - v[cont])) {
				diferencia = Math.abs(valorMedio - v[cont]);
				promedio = v[cont];
				
			}
		
		}
		
		return promedio;
	}
}
