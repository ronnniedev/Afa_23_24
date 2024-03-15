package ficheros;

import java.util.Scanner;

public class Ejericio2 {
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			System.out.println("Cuantos valores tiene el vector: ");
			int tam = keyboard.nextInt();
			
			int v [] = new int [tam];
			Libreria.leerVector(v);
			Libreria.mostrarVector(v);
			Libreria.maximo(v);
			Libreria.posicionMaximo(v);
			Libreria.minimo(v);
			Libreria.posicionMinimo(v);
			Libreria.minimo(v);
			System.out.println("Introduce el valor a buscar: ");
			int valor = keyboard.nextInt();
			System.out.println("Estado encontrado: " + Libreria.buscarValor(v, valor));
			
			
			System.out.println("----->FASE2<-----");
			System.out.println("Indica el tamaño de ambos vectores: ");
			tam = keyboard.nextInt();
			System.out.println("Indica el maximo de dichos vectores: ");
			int num = keyboard.nextInt();
			
			int a[]=Libreria.generarVectorAleatorio(tam,num);
			int b[]=Libreria.generarVectorAleatorio(tam,num);
			
			System.out.println("\n----->A<-----");
			Libreria.mostrarVector(a);
			System.out.println("\n----->B<-----");
			Libreria.mostrarVector(b);
			
			int resul[] = Libreria.productoVectorial(a,b);
			
			System.out.println("\n----->Resultados<-----");
			Libreria.mostrarVector(resul);
			
			Libreria.calcularDesviacion(v);			
			
			
	}
}
