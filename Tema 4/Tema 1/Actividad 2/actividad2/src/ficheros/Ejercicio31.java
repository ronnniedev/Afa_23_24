package ficheros;

import java.util.Scanner;

public class Ejercicio31 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 31
		 * Determinar si un número introducido por teclado es primo o no. Un
		 * número primo solo es divisible por él mismo y por la unidad 
		 */
		
		int numero,cont,division,comprobador;
		
		comprobador = 0;
		
		System.out.println("Introduce un numero: ");
		numero = keyboard.nextInt();
		
		
		
		if (numero < 0) { //metemos un inversor por si metemos un numero negativo
			
			numero = numero * -1;
			System.out.println(numero);
		}
		
		cont = numero; //igualamos el contador al numero
		
		while (cont > 0) {
			
			division = numero%cont; //si el resto es 0 sumamos 1 mas al comprobador, si no restamos uno al contador
			
			if (division == 0) {
				comprobador++;
				cont--;
				
			}else {
				cont--;
				
			}
			
			
		}if (comprobador == 2) { //si solo tiene dos resultados siendo este la unidad y si mismo, es primo
			System.out.println("El numero es primo");
			
		}else { // si tiene mas, no
			
			System.out.println("El numero no es primo");
		}
		

	}

}
