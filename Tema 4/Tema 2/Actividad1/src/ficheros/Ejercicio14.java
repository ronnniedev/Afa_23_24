package ficheros;

public class Ejercicio14 {

	public static void main(String[] args) {
		/* Actividad 14
		 * Reutiliza el ejercicio anterior para mostrar los números primos que hay
		 * entre el 1 y el 100
		 */
		
		boolean primero = true;
		
		for (int cont = 1; cont <= 100; cont++) {
			
			boolean primos = Libreria.primos(cont);
			
			if (primos && primero) System.out.print(cont + ",");
			else if (primos) System.out.print("," + cont);
			
			
		}System.out.println("APAGADO DEL SISTEMA");

	}

}
