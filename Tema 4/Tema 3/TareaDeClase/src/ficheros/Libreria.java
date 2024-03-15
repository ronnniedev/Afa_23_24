package ficheros;

public class Libreria {
	
	/**
	 * Detecta si el valor introducido en dicha posicion es valle
	 * @param v vector de enteros
	 * @param pos : entero
	 * @return boolean
	 */
	public static boolean esValle (int v[],int pos) {
		
			
			if (v[pos] < v[pos-1] && v[pos] < v[pos+1]) {
				return true;
			}
			
		
		
		return false;
	}
	/**
	 * Detecta si el valor introducido en dicha posicion es pico
	 * @param v vector de enteros
	 * @param pos : entero
	 * @return boolean
	 */
	public static boolean esPico (int v[],int pos) {
		
		for (int i = 1; i < v.length-1 ; i++) {
			
			if (v[i] > v[i+1] && v[i] > v[i-1]) {
				
				return true;
			}
			
		}
		
		return false;
	}
	/**
	 * Cuenta el numero de valles que tiene dicho vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int numeroValle (int v[]) {
		
		int cont = 0;
		
		for (int i = 1; i < v.length-1 ; i++) {
			
			if (esValle (v,i))cont++;
			}
		
		return cont;
	}
	/**
	 * Compara el resto de picos y te dice cual es el mayor
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int valorPicoMasAlto (int v[]) {
		 
 		int max = v[0];
	 
 		for (int i = 1; i < v.length-1 ; i++) {
			
			if (esPico (v,i) && v[i]>max) max= v[i];
			
			}
 		
 		return max;
	 
 	}
	/**
	 * Analiza el vector y nos dice si tiene una meseta
	 * @param v vector de enteros
	 * @return boolean
	 */
	public static boolean tieneMeseta (int v[]) {
		
		for (int i = 0; i < v.length ; i++) {
			
			if (i == v.length && v[i] == v[i-1])return true;
			else if (v[i] == v[i+1]) return true;
		}
		return false;
		
	}
	/**
	 * Cuenta el numero de mesetas en el vector
	 * @param v vector de enteros
	 * @return entero
	 */
	public static int numeroMesetas (int v[]) {
		
		int cont = 0;
		boolean hayMeseta = false;
		if (tieneMeseta(v)) {
			
			for (int i = 0; i < v.length-1 ; i++) {
				
				if (v[i] == v[i+1] && hayMeseta == false) { 
					cont++;
					hayMeseta = true;
				}else if (hayMeseta && v[i] != v[i+1]) hayMeseta = false;
				
			}
			
		}
		
		return cont;
		
		
	}
	
	
	
}

 	
