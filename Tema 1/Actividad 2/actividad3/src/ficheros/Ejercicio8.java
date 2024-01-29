package ficheros;

import java.util.Scanner;

public class Ejercicio8 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 8
		 *Leer por teclado un número entero N no negativo y mostrar el factorial
		 *de todos los números desde 0 hasta N.
		 *El factorial de un número entero se expresa mediante el símbolo ‘!’ y se
		 *define de la siguiente forma:
		 *Si n = 0 entonces 0! = 1
		 *Si n > 0 entonces
		 *n! = n * (n – 1) * (n – 2) * …. * 3 * 2 * 1
		 *Por ejemplo, n = 5 entonces
		 *5! = 5 * 4 * 3 * 2 * 1 = 120
		 */
		
		
		int num,contador,factorial,memcont;
		
		contador = 1; // el contador siempre empieza en 0
		memcont = contador; // memcont siempre contendra el valos de memoria
		factorial = 1; //el primer factorial siempre va a ser 0 por lo que lo inicializamos asi
		
		System.out.println("Introduce un numero: "); //introducimos el numero
		num = keyboard.nextInt();
		
		System.out.println("0 ! = 1");
		
		while (memcont <= num) {
			
			while (contador >= 1) {  //superior o igual que 1 para que no multiplique por 0
				
				factorial = factorial * contador;
				contador--;	 
			}
			
			System.out.println(memcont + " ! = " +  factorial);
			
			memcont++; //memcont aumenta
			factorial = memcont;
			contador = memcont - 1;// el contador empezara con el valor de memoria -1 para hacer el factorial
		
			
		}
			
			

	}

}
