package ficheros;

import java.util.Scanner;

public class Ejercicio23 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 23
		 * Calcula el factorial de un numero entero. El factorial es el resultado de
		 * multiplicar ese número por todos los números menores que él.
		 * Ejemplo: 4! = 4*3*2*1 = 24
		 */
		int numero,contador,factorial;
		contador = 0;
		
		System.out.println("Introduce un numero entero: ");
		numero = keyboard.nextInt();
		
		
		factorial = numero; //factorial recoge el primer valor del numero, es el numero base para multiplicar
		contador = numero; //contador tambien para ir restandolo
		
		if (numero >= 0) { //mientras el numero sea superior a 0 se calcula
			contador --;
			while (contador >= 1) {  //superior o igual que 1 para que no multiplique por 0
				factorial = factorial * contador;
				System.out.println(factorial);
				contador--;	 //cada pasada le resta una cifra hasta 1
			}
			
		}else if (numero <= 0) { //si el valor es negativo 
			
			contador ++;
			while (contador <= -1) { //inferior igual que -1 para que no multiplique por 0
				factorial = factorial * contador;
				System.out.println(factorial);
				contador++;	// cada pasada le suma una cifra hasta -1
			}
		}
		
		System.out.println("El valor factorial de " + numero + " es : " + factorial); //imprimimos resultado
		
	}

}
