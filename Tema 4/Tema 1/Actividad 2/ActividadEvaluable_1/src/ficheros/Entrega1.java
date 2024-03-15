package ficheros;

import java.util.Scanner;

public class Entrega1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int numero,divisor,suma,resultado;
		divisor = -1; // restamos un al divisor para ignorar el 0
		suma = 0;
		numero = 1;
		
		while (numero != 0) { //hasta que no metamos 5 numeros no acaba el while
			
			System.out.println("Introduce un numero: ");
			numero = keyboard.nextInt();
			if (numero >= 0) {
				
					if (numero%5 == 0) { // es multiplo de 5
					
					suma = numero + suma; //sumamos el contenido del numero
					divisor ++; // le sumamos 1 al divisor	
			}
			
					
			}
			
			
		}
		if (suma == 0 || divisor == 0 ) {
			
			System.out.println("No se han introducidos valore validos");
		}else {
			resultado = suma / divisor; //hacemos la media
			
			System.out.println(divisor + " numeros son multiplos de 5 y positivos por lo que la media es :" + resultado);
		}
		
		
		
	}

}
