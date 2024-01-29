package ficheros;

import java.util.Random;

public class Ejercicio33 {
	static Random rand = new Random();
	public static void main(String[] args) {
		/*Actividad 33
		 * Genera una combinación al azar para la lotería primitiva. Los números
		 * de la lotería son 6, comprendidos del 1 al 49. En esta versión no
		 * importa si se repite algún número.
		 */
		
		int num,cont;
		
		cont = 0;
		
		while (cont < 6) { //para que salgan 6 cifras
		
			num =  rand.nextInt(49);
			
			while (num == 0) { //por si sale un 0
				
				num = rand.nextInt(49);
			}
			
			cont++; //sube ciclo
			System.out.print( " Numero ( "+ cont + " ) "+ num + " ");
			
		}System.out.println("FIN!!!");
	}

}
