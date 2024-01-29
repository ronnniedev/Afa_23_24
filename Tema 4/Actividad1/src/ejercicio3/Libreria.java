package ejercicio3;

public class Libreria {

	/** genera un numero entre el max y min especificado
	 * @param min : entero
	 * @param max : entero
	 * @return entero
	 */
	public static int generaNumeros (int min,int max) {
	
		max+= 1;
		return (int) (Math.random()*max)+min;
		
	}
}
