package ficheros;

import java.util.Scanner;

public class ejercicio_02B {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double prestamo, cuota;
		int mes;
		
		mes = 0;
		cuota = 10;
		
		System.out.println("introduce el valor del prestamo");
		prestamo = teclado.nextDouble();
		prestamo = prestamo + prestamo * 0.05;
		
		System.out.println("Su deuda final es: "+prestamo);
		
		while (prestamo>0) {
			
			prestamo = prestamo - cuota;
		
			if (prestamo < 0) {
				cuota = prestamo + cuota;
				prestamo = prestamo - prestamo;
			}
			
			System.out.println("mes( "+mes+" ): "+cuota+ " euros ( cantidad pendiente" +prestamo);
			cuota = cuota*2;
			mes++;
		}
	}

}
