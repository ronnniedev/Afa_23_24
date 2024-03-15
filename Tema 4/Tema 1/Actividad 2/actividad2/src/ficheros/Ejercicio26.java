package ficheros;

import java.util.Scanner;

public class Ejercicio26 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 26
		 * Mostrar el mensaje “¿Desea terminar (s/n)?” el programa terminará
		 * cuando el usuario pulse ‘S’ o ‘s’, en otro caso el programa continuará
		 * indefinidamente.
		 */
		boolean s ;
		String answer;
		
		s = true; //ponemos s como caracter de funcionamiento del progama
		
		while (s) {  // mientras sea true este funciona
			
			System.out.println("¿Desea terminar s/n?"); 
			answer = keyboard.next();	//hacemos llamada a la lectura de la consola
			
			switch (answer) {
			case "s" :{ // si escribimos s o S el boolean cambia a falso
				s = false;
				break;
			}case "S" :{
				s = false;
				break;
			}
			default:
			}
		}
		System.out.println("Programa terminado"); 
		
	} 

}
