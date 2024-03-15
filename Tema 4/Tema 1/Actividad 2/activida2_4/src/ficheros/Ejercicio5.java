package ficheros;


import java.util.Scanner;

public class Ejercicio5 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 5
		 * Crea un algoritmo para la sucesión de Fibonacci. La sucesión de
		 * Fibonacci es la siguiente serie:
		 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
		 * Pista: Empezando por 0 y 1, el siguiente número es la suma de los dos
		 * números últimos 
		 */
		int numUno = 0;
		int numDos = 1;
		
		System.out.println("¿Cuantos numeros de la secuencia quieres?");
		int cifras = keyboard.nextInt();
		
		for (int cont = 0; cont <= cifras ; cont++) {
			
			if (cont == cifras) { //para escribir sin la coma
				if (cont%2 == 0) { // distinguimos entre par y impar para ir intercalando
					System.out.print(numUno + " ");
					numUno = numUno + numDos;
				}else {
					System.out.print(numDos + " ");
					numDos= numUno + numDos;
				}
			}else { // para escribir con la coma
				if (cont%2 == 0) { // distinguimos entre par y impar
					System.out.print(numUno + ", ");
					numUno = numUno + numDos;
				}else {
					System.out.print(numDos+ ", ");
					numDos= numUno + numDos;
				}
			}
			
		}
		

	}

}
