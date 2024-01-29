package ficheros;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 11
		 * Realice un menú de 2 opciones: En la opción 1: El usuario ingresa
		 * números indefinidamente, se analiza cada número ingresado. Si el
		 * número ingresado es par, se genera la tabla de multiplicar de dicho
		 * número. Si el número ingresado es impar, se generan 5 números
		 * impares aleatorios en el rango de 10 a 990. En la opción 2: El usuario
		 * ingresa 2 números, se divide el menor para el mayor y se muestra el
		 * resultado. Se resta el mayor menos el menor y se muestra el
		 * resultado. Si los números son iguales, se envía un mensaje a pantalla.
		 */
		
		
		int button = 0;
		
		while (button != 1) {
		int screen = 0; // lo pongo aqui arriba para que los datos se limpien
		double screenDos = 0;
		int comprobador = 1;
		int num = 0;
		System.out.println("Elija entre la opcion 1 y 2: ");
		int opcion = keyboard.nextInt();
		
		while (opcion < 1 || opcion > 2) {
			
			System.out.println("Por favor escriba 1 o 2:");
			opcion = keyboard.nextInt();
			
		}
			if (opcion == 1) { //el modulo de opcion 1
				
				System.out.println("Introduzca un numero");
				num = keyboard.nextInt();
					
				if (num%2==0) {
					for (int cont = 0; cont <= 10; cont++) {
							
						screen = num * cont;
						System.out.println(num + "*" + cont + "= " + screen);
							
					}
						
				}else {
					while (comprobador < 6) {
						int impar = (int) ((Math.random()*990)+10);
						if (impar%2 != 0) {
							System.out.println("--------------");
							System.out.println(impar + "(" + comprobador + ") ");
							comprobador++;
						}
							
					}
				}
					
			}else { //el modulo de opcion 2
				System.out.println("Introduce numeroA:");
				double numA = keyboard.nextDouble();
					
				System.out.println("Introduce numeroB");
				double numB = keyboard.nextDouble();
				
				if (numA > numB) {
					
				screenDos = (numB/numA);
				System.out.println(numB + " / " + numA + " = " + screenDos);
				screen = (int) (numA-numB);
				System.out.println(numA + "-" + numB + "= " + screen);
					
				}else if (numB > numA) {
					
					screenDos = (numA/numB);
					System.out.println(numA + " / " + numB + " = " + screenDos);
					screen = (int) (numB-numA);
					System.out.println(numB + "-" + numA + "= " + screen);
					
				}else System.out.println("Los numeros son iguales");
						
			}
			System.out.println("Si desea apagar el sistema teclee 1: ");
			button = keyboard.nextInt();
				
				
		}System.out.println("Sistema apagado");
		
	}

}
