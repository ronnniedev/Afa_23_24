package ficheros;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 4
		 * Escribir un programa en Java para adivinar un número entre 1 y 20 que
		 * previamente se ha definido como una constante. El programa irá
		 * pidiendo números al usuario y, siempre que dicho número no coincida
		 * con el número secreto, le indicará si el número introducido es mayor o
		 * menor que el número secreto que tiene que adivinar. Al final, el
		 * programa indicará la cantidad de intentos que se han necesitado para
		 * adivinar el número. Si el número de intentos es menor que 5 se
		 * mostrará “Enhorabuena!”. Si es un valor entre 5 y 10 se mostrará el
		 * mensaje “No está mal”. Si el número de intentos es mayor que 10 se
		 * mostrará el mensaje “Debe practicar más”.
		 * Para calcular números aleatorios
		 * Math.ramdom()*CantidadNumeros+inicio
		 */
		
		
		int secreto,num,intentos;
		boolean premio;
		
		premio = false; // booleano de premio , si no se cumple queda como falso
		intentos = 0;
		secreto = (int) (Math.random ()*20) + 1; // generamos el numero del premio
		 
		 
		while (premio == false) { // siempre que no haya premios esto funciona
			
			System.out.println("Introduce un numero: ");
			num = keyboard.nextInt();
			
			if (num == secreto) { //si se cumple premio se activa el booleano
				
				premio = true;
				
			}else if (num < secreto) {
				
				 System.out.println("El numero secreto es mayor");
				 
			}else{
				
				System.out.println("El numero secreto es menor");
				
			}
			
			
			intentos++; // siempre que acabe el bucle metemos un intento
			
		}
		if (intentos <= 5) { // menos de 5 enhorabuena
			
			System.out.println("Enhorabuena, has usado " + intentos + " intentos");
			
		}else if (intentos <= 10) { // menos de 10 no esta mal
			
			System.out.println("No esta mal, has usado "+ intentos + " intentos");
			
		}else { // si no debes practicar mas
			
			System.out.println("Debes practicar mas, has usado " + intentos + " intentos");
			
		}
		 
	}
	

}
