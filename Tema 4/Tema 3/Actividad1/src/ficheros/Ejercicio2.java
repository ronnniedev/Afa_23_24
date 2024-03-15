package ficheros;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Actividad 2
		 * Escribir un programa con implemente las siguientes funciones para un
		 * vector de 10 posiciones de tipo entero.
		 * • void leerVector(int v[]) lee 10 números de tipo entero y los
		 * almacene en un vector
		 * • Implementar una función que muestre el contenido del vector
		 * indicando para cada elemento su posición en orden inverso
		 */
		
		int v [] = Libreria.leerVector();
		Libreria.mostrarVector(v);

	}

}
