package ficheros;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 5
		 * Escribir un programa en Java que determine si un número es mágico.
		 * Se dice que un número es mágico si las cifras que ocupan posiciones
		 * pares son ares y las que ocupan posiciones impares son impares.
		 * Ejemplo: 12345
		 * Pos 1 = 5
		 * Pos 2 = 4
		 *Pos 3 = 3
		 *Pos 4 = 4
		 *Pos 5 = 5 
		 */

		int num,numMemoria,contCifras,comprobador,cifra;
		boolean magico,negativo;
		
		magico = true;
		negativo = false;
		
		comprobador = 1;
		contCifras = 0;
		
		System.out.println("Introduce un numero: ");
		num = keyboard.nextInt();
		
		if (num<0) {
			num = num * -1;
			negativo = true;
		}
		
		numMemoria = num;
		
		while (numMemoria >= comprobador) { //contamos las cifras para saber cuantas tiene
			
			comprobador = 10 * comprobador;
			contCifras++;
			
		}
		
		cifra = contCifras;
		while (contCifras != 0) {
			contCifras--;
			
			num = numMemoria;
			num = num / (int) Math.pow(10,contCifras);
			
			
			if (cifra%2 == 0 && num%2==0 || num == 0 ) {
				
				
			}else if (cifra%2 != 0 && num%2 != 0 || num == 1) {
				
				
			}else {
				magico = false;
				
			}
			
			
			cifra--;
		}
		if (negativo) {
			
			numMemoria = numMemoria * -1;
			
		}
		
		if (magico) {
			System.out.println(numMemoria + " es un numero magico");
		}else {
			
			System.out.println(numMemoria + " no es un numero magico");
			
		}
		
	}

}
