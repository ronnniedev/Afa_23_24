package ficheros;

public class Ejercicio9 {

	public static void main(String[] args) {

		/* Actividad 9.
		 * Se dice que un vector tiene un pico, si dada una posición i los valores
		 * de las posiciones -1 y i+1 son menores que ella.
		 * Se dice que un vector tiene un valle cuando dada una posición i los
		 * valores de las posiciones -1 y +1 son mayores que ella.
		 * Implementar una función que determine si tiene pico y una función
		 * que determine si un vector tiene valle.
		 */

		
		int v [] = Libreria.generaVectorInt(100, 1, 10);
		int max = Libreria.max(v);
		int min = Libreria.min(v);
		Libreria.mostrarVector(v);
		
		System.out.println();
		
		while (max >= min) {
			
			for (int i = 0;i< v.length; i++) {
				
				if (v[i] >= max) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
			max--;
			
		}
		int mesetas = 0;
		int picos = 0;
		int valles = 0;
		boolean haymeseta = false;
		
		for (int i = 0; i < v.length ; i++) {
		if (i == 0) {
			if (v[i] == v[i+1]) {
				haymeseta = true;
				mesetas++;
			}
		}	
			if (i != 0 && i != v.length-1) {
				if (v[i] != v[i+1] && haymeseta) {
					haymeseta = false;
				}else if (v[i] == v[i+1] && haymeseta == false) {
					haymeseta = true;
					mesetas++;
				}
				if (v[i] > v[i-1] && v[i] > v[i+1]) {
					System.out.print("p");
					picos++;
				}
				else if (v[i] < v[i-1] && v[i] < v[i+1]) {
					System.out.print("v");
					valles++;
				}else if ((v[i] == v[i-1] || v[i] == v[i+1])) {
					System.out.print("m");
				}
				else  {
					System.out.print("n");
					
				}
			}else System.out.print("n");
			
		}
		System.out.println("\n\nMesetas:" + mesetas);
		System.out.println("Picos: " + picos);
		System.out.println("Valles: " + valles);
			
		
	}

}
