package ficheros;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double prestamo, cuota;
		int mes;
		
		mes = 0;
		cuota = 10; 
		
		System.out.println("Introduce el valor del prestamo: ");
		prestamo = keyboard.nextDouble();
		
		prestamo = prestamo + prestamo * 0.05; //calculamos el valor de deuda final
		
		System.out.println(" Su deuda final es : " + prestamo + "\n");
		
		while (prestamo > 0) { // siempre y cuando haya deuda el while funciona
			
			prestamo = prestamo - cuota;
			
			if (prestamo < 0) {
				
				cuota = prestamo + cuota;
				prestamo = prestamo - prestamo;
				
			}
			
			mes++; //suma
			System.out.println("Mes ( " + mes + " ): " + cuota + " euros ( cantidad pendiente " + prestamo + " )\n" );
			cuota = 10 * Math.pow(2, mes);
			
		}System.out.println("Han pasado "+ mes + " meses ");

	    }

	}