package ficheros;

import java.util.Scanner;

public class Ejercicio32 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 31
		 * Determinar si un número introducido por teclado es primo o no. Un
		 * número primo solo es divisible por él mismo y por la unidad 
		 */
		
		int numero,cont,division,comprobador;
		
		comprobador = 0;
		numero = 100;
		cont = numero; //igualamos el contador al numero
		
		
		while (numero != 0) {
			while (cont > 0) {
				
				division = numero%cont; //si el resto es 0 sumamos 1 mas al comprobador, si no restamos uno al contador
				
				if (division == 0) {
					comprobador++;
					cont--;
					
				}else {
					cont--;
					
				}	
			
		}if (comprobador == 2) { //si solo tiene dos resultados siendo este la unidad y si mismo, es primo
			System.out.print(numero + " ");
			numero--;
			comprobador = 0;
			cont = numero;
			
		}else { // si tiene mas, no
			
			numero--;
			comprobador = 0;
			cont = numero;
		}
				
			
		}System.out.println("Fin!!");
		

	}

}