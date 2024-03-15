package ficheros;

import java.util.Scanner;

public class ejercicio3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 3
		*Escribir un programa que pida al usuario un número entero positivo y
		*muestre por pantalla la cuenta atrás desde ese número hasta cero
		*separados por comas
		*/
		
		int num; // declaro el numero
		
		num = 0;
		
		while (num <= 0) { //introduce un numero
			
			System.out.println("Introduce un numero: ");
			num = keyboard.nextInt();
			
		}
		
		System.out.println("La cuenta atras seria: \n");
		
		while (num != 0) {
			
			if (num == 1) {
				
				System.out.println(num);
			}else {
				System.out.print(num + ", ");
				
				
			}
			num--;
			
			
			
		}System.out.println("FIN!!!");

	}

}
	
