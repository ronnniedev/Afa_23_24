package ficheros;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 4
		 * Una compañia de seguros tiene contratados a n vendedores. Cada uno
		 * hace tres ventas a la semana. Su politica de pagos es que un vendedor
		 * recibe un sueldo base, y un 10% extra por comisión de sus ventas. El
		 * gerente de su comañía desea saber cuánto dinero obtendrá en la
		 * semana cada vendedor por concepto de comisiones por las ventas
		 * realizadas, y cuanto tomando en cuentra el sueldo base y sus
		 * comisiones.
		 */
		
		double comision = 0;
		
		System.out.println("Introduzca el sueldo base del empleado: ");
		double sueldoBase = keyboard.nextInt();
		
		for (int cont = 1; cont <= 3; cont++) {
			System.out.println("Introduzca el valor de la venta " + cont + " :");
			double venta = keyboard.nextInt();
			
			comision = comision + venta * 0.1;
			
		}
		System.out.println("El valor de las comisiones del empleado es de : " + comision);
		
		sueldoBase = sueldoBase + comision;
		
		System.out.println("El dinero que  va a percibir el empleados es de " + sueldoBase + " euros");
		 

	}

}
