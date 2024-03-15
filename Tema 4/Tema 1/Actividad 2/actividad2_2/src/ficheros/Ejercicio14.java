package ficheros;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un numero: ");
		num = keyboard.nextInt();
		
		while (num > 1) {
			
			int div = 2;
			
			while (num%div == 0) {
				div++;
				
			}
			
			System.out.println(div);
			num = num / div;
			
		}
	}

}
