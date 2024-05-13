package ejemploClase;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Introduce numerador");
			int num = teclado.nextInt();
			System.out.println("Introduce denominador");
			int den = teclado.nextInt();
			
			int cociente = num/den;
			System.out.println("Cociente :" + cociente);
		}catch(Exception e){
			// callamos
			
		}
		System.out.println("Fin");

	}

}
