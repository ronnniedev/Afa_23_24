package ficheros;

import java.util.Scanner;

public class ejercicio4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 4
		 * Escribir un programa que pregunte al usuario una cantidad a invertir, el
		 * interés anual y el número de años, y muestre por pantalla el capital
		 * obtenido en la inversión cada año que dura la inversión.
		 */
		
		double inversion,interes,time,year;
		boolean dosVeces;
		
		dosVeces = false;
		year = 0;
		inversion = 0;
		interes = -1;
		time = -1;
		
		while (inversion <= 0) {
			
			System.out.println("¿Cuanto quieres invertir?");
			inversion = keyboard.nextInt();
			
		}
		while (interes < 0) { //protegemos el algoritmo para no meter valores erroneos
			System.out.println("¿Con cuanto riesgo?");
			interes = keyboard.nextInt();
			
		}
		while (time < 0) {
			System.out.println("¿A cuantos años vista?");
			time = keyboard.nextInt();
			
		}
		if (time > 1) {//control para escritura de plural
			
			dosVeces = true;
			
		}
		
		while (time != 0) {
			
			year++;
			inversion = inversion + inversion * (interes/100);
			
			System.out.printf("En el año %.0f la inversion a ascendido a %.2f euros\n\n",year,inversion);
			
			time--;
			
		}if (dosVeces) { //si hay mas de 1 año escribimos años en vez de año
			System.out.printf("Tras %.0f años la inversion ha ascendido a %.2f euros",year,inversion);
			
		}else {
			
			System.out.printf("Tras %.0f año la inversion ha ascendido a %.2f euros",year,inversion);
			
		}
		
	}

}
