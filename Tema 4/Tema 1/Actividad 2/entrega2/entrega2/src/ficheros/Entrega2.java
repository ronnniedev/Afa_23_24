package ficheros;

import java.util.Scanner;

public class Entrega2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int num,pantalla,contenedor;

		contenedor = 0;
		
		System.out.println("Introduce un numero: ");
		num = keyboard.nextInt();
		
		while (num <= 0) {
			
			System.out.println("Erros numero mal introducido");
			System.out.println("Introduce de nuevo un numero positivo y mayor que 0: ");
			num = keyboard.nextInt();
			
		}
		
		while (num > 0) {
			
			pantalla= num%10;
			contenedor = contenedor * 10 + pantalla;
			num = num / 10;
			
			
		}System.out.println(contenedor);
		
		
		

	}

}
