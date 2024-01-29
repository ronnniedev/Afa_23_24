package ficheros;

import java.util.Scanner;

public class Ejercicio9 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 9
		 * Diseñe un algoritmo que califique el puntaje obtenido en el
		 * lanzamiento de tres dados en base a la cantidad de seis obtenidos
		 * (estos números deben ser generados aleatoriamente), de acuerdo a lo
		 * siguiente: a) Tres seis : Oro, b) Dos seis : Plata, c) Un seis : Bronce, d)
		 * ningún seis :Perdiste
		 */
		
		int six = 0;
		boolean encendido = true;
		
		while(encendido) {
			six = 0;
			for (int cont= 0; cont < 3 ; cont++) {
				 
				int dice = (int) ((Math.random()*6)+1);
				
				if (dice == 6) six++;
				
				System.out.println("----------");
				System.out.println(dice);
				
			}
			System.out.println("--------");
			if (six == 3) System.out.println("Ha obtenido oro con 3 seises");
			else if (six == 2)  System.out.println("Ha obtenido plata con 2 seises");
			else if (six == 1) System.out.println("Ha obtenido bronce con 1 seis");
			else System.out.println("Perdiste");
			
			System.out.println("Pulse 1 para apagar el sistema: ");
			six = keyboard.nextInt();
			
			if (six == 1) {
				
				encendido = false;
				
			}
		}
	}

}
