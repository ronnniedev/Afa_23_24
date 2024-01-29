package Ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado=new Scanner(System.in);
	/**
	 * funcion que lee los valores de un vector por teclado
	 * @param v vector enteros
	 */
	public static void leerVector(int v[]) {
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"]");
			v[i]=teclado.nextInt();
		}
	}
	/**
	 * funcion que muestra los valores de un vector
	 * @param v vector enteros
	 */
	public static void mostrarVector(int v[]) {
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"]:"+v[i]);
		}
	}
	/**
	 * funcion que calcula el maximo de un vector
	 * @param v vector enteros
	 * @return entero
	 */
	public static int maximo(int v[]) {
		int max=v[0];
		for (int i=1;i<v.length;i++) {
			if(max<v[i]) {
				max=v[i];
			}
		}
		return max;
	}
	/**
	 * funcionq ue calcula el valor minimo de un vector
	 * @param v vector enteros
	 * @return entero
	 */
	public static int  minimo(int v[]) {
		int min=v[0];
		for (int i=1;i<v.length;i++) {
			if(min>v[i]) {
				min=v[i];
			}
		}
		return min;
	}
	/**
	 * muestra la posicion del maximo
	 * @param v vector enteros
	 */
	public static void posicionValorMaximo(int v[]) {
		int max=maximo(v);
		int posMax=-1;
		for (int i=1;i<v.length;i++) {
			if(max==v[i]) {
				posMax=i;
			}
		}
		System.out.println("Pos max "+posMax);
		
	}
	/**
	 * muestra la posicion del minimo 
	 * @param v vector enteros
	 */
	public static void posicionValorMinimo(int v[]) {
		int min=minimo(v);
		int posMin=-1;
		for (int i=1;i<v.length;i++) {
			if(min==v[i]) {
				posMin=i;
			}
		}
		System.out.println("Pos min "+posMin);
	}
	
	/**
	 * busca el valor de un numero en el vector
	 * @param v vector enteros
	 * @param valor entero
	 * @return boolean
	 */
	public static boolean buscarValor(int v[], int valor) {
		for (int i=1;i<v.length;i++) {
			if(v[i]==valor) {
				return true;
			}
		}
		return false;
	}
	/**
	 * calcula el porducto vectorial de dos vectores
	 * retirna un vector resul[i]=a[i]*b[i]
	 * @param a vector enteros
	 * @param b vector enteros
	 * @return vector enteros
	 */
	public static int [] productoVectorial(int a[], int b[]) {
		int resul[]=new int[a.length];
		for (int i=1;i<a.length;i++) {
			resul[i]=a[i]*b[i];
		}
		return resul;
	}
	/**
	 * genera un vector de tamaño "dim" con valores aleatorios 
	 * entre 1 y 9
	 * @param dim entero 
	 * @param num entero
	 * @return vector enteros
	 */
	public static int [] generarVectorAleatorio(int dim, int num) {
		int v[]=new int[dim];
		for (int i=0;i<v.length;i++) {
			v[i]=(int) (Math.random()*num+1);
		}
		return v;
	}
	
	/**
	 * calcula la media de un vector
	 * @param v vector enteros
	 * @return entero
	 */
	public static int media(int v[]) {
		int suma=0;
		for (int i=1;i<v.length;i++) {
			suma+=v[i];
		}
		return (suma/v.length);
	}
	
	/**
	 * calcula un vector donde cada posicion resul[i]=|media-v[i]|
	 * @param vector enteros
	 * @return vector enteros
	 */
	public static int [] calculaDiferencia(int v[]) {
		int valorMedia=media(v);
		int resul[]=new int[v.length];
		for (int i=1;i<v.length;i++) {
			resul[i]=Math.abs(valorMedia-v[i]);
		}
		return resul;
	}
	
	/**
	 * muestra la desviacion tipica de un vector.
	 * Se define la desviación tipica como la media de las 
	 * diferencias de cada elemento con la media del metor
	 * @param v vector enteros
	 */
	public static void calcularDesviación(int v[]) {
		int diff[]=calculaDiferencia(v);
		int mediaDiff=media(diff);
		System.out.println("Desviacion "+mediaDiff);
	}

}
