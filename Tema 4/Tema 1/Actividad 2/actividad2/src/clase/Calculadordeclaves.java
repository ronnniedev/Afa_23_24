package clase;

import java.util.Scanner;

public class Calculadordeclaves {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		// Escribir un numero entero y decir cuantas de las cifras que la componen son pares

		int num,numMemoria,comprobadorCifras,comprobador,pares,impares;
		
		System.out.println("Escribe un numero: ");
		num = keyboard.nextInt();
		
		numMemoria = num; //guarda en memoria el numero
		comprobadorCifras = 0; //cuenta las cifras que tiene el numero
		comprobador = 1;//efectua el calculo para el comprobador
		pares = 0;
		impares = 0;
		
		while (numMemoria >= comprobador) { //contamos las cifras para saber cuantas tiene
			
			comprobador = 10 * comprobador;
			comprobadorCifras++;
			
		}
		
		while (comprobadorCifras != 0) { //descomponemos el numero por cifras y calculamos el resto
			comprobadorCifras--;
			num = numMemoria;
			num = num / (int) Math.pow(10,comprobadorCifras); //descomponemos el numero
			num = num%2;
			
			if (num == 0) { //comprobamos resto
				
				pares++;
				
			}else {
				
				impares++;
				
			}
			
		}System.out.println("Pares: " + pares + " Impares: " + impares);
	

		
		
	}

}
