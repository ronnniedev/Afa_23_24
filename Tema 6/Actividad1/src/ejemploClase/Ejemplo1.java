package ejemploClase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Introduce numerador");
			int num = teclado.nextInt();
			System.out.println("Introduce denominador");
			int den = teclado.nextInt();
			
			int cociente = num/den;
			System.out.println("Cociente :" + cociente);
		}catch(ArithmeticException e){
			System.out.println("Error: div por cero");
			
		}catch(InputMismatchException e2){
			
			System.out.println("ERROR: Lectura incorrecta de enteros");
		}finally {
			System.out.println("Continuamos.....");
		}
		System.out.println("Fin");
		
		
		
	}

}
