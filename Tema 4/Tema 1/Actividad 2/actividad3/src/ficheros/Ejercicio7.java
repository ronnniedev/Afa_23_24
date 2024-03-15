package ficheros;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Ejercicio 7
		 * Escribir una función que muestre las permutaciones con repetición
		 * que pueden hacerse con los números 1,2,3 y 4. También que muestre
		 * el número de estas.
		 */

		
		int unidad,decena,centena,millar,comprobador,permutaciones;
		
		unidad = 1;
		decena = 1;
		centena = 1;
		millar = 1;
		comprobador = 0;
		permutaciones = 0;
		
		
		while (comprobador != 16) {
			
			if (unidad == 4) { //si la unidad contiene un 4 saltamos linea
				System.out.println(millar + " , " + centena + " , " + decena + " , " + unidad + "         ");
			}else {
				System.out.print(millar + " , " + centena + " , " + decena + " , " + unidad + "         ");
			}
			
			unidad++;
			
			if (unidad == 5) {
				unidad = 1;
				decena++;
				
			}if (decena == 5) {
				
				decena = 1;
				centena++;
				
			}if (centena == 5) {
				centena = 1;
				millar++;
				
			}
			permutaciones++;
			comprobador = unidad + decena + centena + millar;
			
		}System.out.print(millar + " , " + centena + " , " + decena + " , " + unidad + "\t\t");
		permutaciones++; // la ultima permutacion se sale del bucle
		//para que
		//escriba el ultimo numero
		System.out.println("FIN!! el numero de permutaciones ha sido : " + permutaciones);
			
	}

}
