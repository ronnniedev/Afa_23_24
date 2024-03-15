package ficheros;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Actividad 8
		 * En Java, para generar números pseudoaleatorios, se puede utilizar la
		 * función Math.random() definida en la clase java.lang.Math. Dicha
		 * función genera una secuencia de números pseudoaleatorios que se
		 * supone sigue una distribución uniforme (esto es, todos los valores
		 * aparecerán con la misma probabilidad). Escriba un programa que
		 * compruebe si el generador de números pseudoaleatorios de Java
		 * genera realmente números aleatorios con una distribución uniforme.
		 * Sugerencia: Genere un gran número de números aleatorios (entre 0 y
		 * 100, por ejemplo) comprendidos entre 1 y 10 y compruebe que la
		 * distribución resultante del número de veces que aparece cada
		 * número es (más o menos) uniforme. Para ello, una vez calculado el
		 * vector, realizaremos el conteo de cuantas veces aparece cada valor.
		 * Una vez realizado el conteo, calcular la media y ver si la dispersión de
		 * los valores es compacta.
		 */

		
		 int v [] = Libreria.generaVectorInt(100, 1, 50);
		 int suma = 0;
		 
		 for (int i = 0; i < v.length; i++) {
	     
			 suma = v[i] + suma;
				
		}
		 
		 suma = suma/100;
		 
		 
		 System.out.println("La distribucion tiene valor de :" + suma);
		 
		  
	}

}
