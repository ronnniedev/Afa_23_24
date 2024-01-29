package ficheros;

import java.util.Scanner;

public class extra1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int div,num,cant;
		
		div = 1;
		cant = 0;
		
		System.out.println("Introduce un numero: ");
		num = keyboard.nextInt();
		
		while (div <= num) {
			
			if (num%div == 0) {
				
				System.out.println(div);
				cant++;
				
			}
			
			div++;
			
		}System.out.println("El numero de divisores es: " + cant);

	}

}
