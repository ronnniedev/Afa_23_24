package ficheros;

import java.util.Scanner;

public class Ejercicio8 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		/* Ejercicio 8
		 * Haz un motor de videojuegos para dos personajes (A y B). Funciona de
		 * la siguiente manera:
		 * • Empieza el combate y se decide aleatoriamente quien empieza.
		 * • Si ataca A restará su ataqueA a defensaB.
		 * • Cambio de turno. Le toca a B. Realiza el ataque.
		 * • Así hasta que alguno sea derrotado.
		 * Inicialmente parten con un valor aleatorio de puntos entre 1 – 100.
		 * Cada ataque viene determinado por dos valores aleatorios entre 1 –
		 * 50. Y siempre el mismo durante el combate. 
		 */
		
		
		
		int turnoA = 0;
		int turnoB = 0;
		int saludA = (int) ((Math.random()*100)+1); //calculo de estadisticas
		int saludB = (int) ((Math.random()*100)+1);
		final int ataqueA = (int) ((Math.random()*50)+1); // calculo de ataque
		final int ataqueB = (int) ((Math.random()*50)+1);
		final int orden   = (int) ((Math.random()*2)+1);
		
		boolean primerAtaque=true;
		
		
		while (saludA > 0 && saludB > 0) {
			
			if (primerAtaque) { //para saber quien ataca primero
				if (orden == 1) {
					turnoA = 1;
				}else {
					turnoB = 1;
				}
				primerAtaque=false;
			}
			
			while (turnoA != 0 && saludA > 0) {
				System.out.println("--------------------------------");
				System.out.println("Turno de A\n");
				System.out.println("Salud A: " + saludA);
				System.out.println("Salud B: " + saludB);
				
				System.out.println("Ataque de A: " + ataqueA +"\n");
				saludB = saludB - ataqueA;
				
				System.out.println("Pulsa cualquier tecla para atacar: ");
				keyboard.next(); //para avanzar
				
				System.out.println("\nB se queda con " + saludB + " puntos de vida");
				turnoB++; // para cambiar de turno
				turnoA--;
			}
			while (turnoB != 0 && saludB > 0) {
				System.out.println("--------------------------------");
				System.out.println("Turno de B\n");
				System.out.println("Salud A: " + saludA);
				System.out.println("Salud B: " + saludB);
				System.out.println("Ataque de B: " + ataqueB +"\n");
				saludA = saludA - ataqueB;
				
				System.out.println("Pulsa cualquier tecla para atacar: ");
				keyboard.next(); //para avanzar
				
				System.out.println("A se queda con " + saludA + " puntos de vida");
				turnoB--; //para cambiar de turno
				turnoA++;
			}
			
			
			
		}
		if (saludA < 0) {
			
			System.out.println("A ha caido derrotado");
			
		}else {
			
			System.out.println("B ha caido derrotado");
		}
		
	}

}
