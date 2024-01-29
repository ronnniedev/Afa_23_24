package ejemplos;

import java.util.Scanner;

public class Condicionales_02 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final double APROBADO = 5.0;
		final double NOTABLE = 7.0;
		final double SOBRESALIENTE = 9.0;
	    final double MAYORIA_EDAD = 18;


	    double calificacion = 0.0;
		String nombre = "";
		int edad = 0;

		System.out.println("Introduce tu nombre: ");
		nombre = teclado.next();
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();

		// Condicional simple
		if (edad >= MAYORIA_EDAD) {
			System.out.println("Hola "+nombre+", eres mayor de edad");
		} else {
			System.out.println("Hola "+nombre+", eres menor de edad");
		}


		System.out.println("Introduce tu calificación: ");
		calificacion = teclado.nextDouble();
		System.out.println("Hola "+nombre+", tu calificación es $calificacion");

		// Condicional múltiple
		// Modo if-else-if-else-if-else-if-else-if-else-if-else
		if (calificacion < APROBADO) {
			System.out.println("Has suspendido");
		} else if (calificacion < NOTABLE) {
			System.out.println("Has aprobado");
		} else if (calificacion < SOBRESALIENTE) {
			System.out.println("Has sacado un notable");
		} else {
			System.out.println("Has sacado un sobresaliente");
		}

		if (calificacion<APROBADO) {
			System.out.println("Has suspendido");
		} else {
			if (calificacion<NOTABLE) {
				System.out.println("Has aprobado");
			} 
			else {
				if (calificacion<SOBRESALIENTE) {
					System.out.println("Has sacado un notable");
				} else {
					System.out.println("Has sacado un sobresaliente");
				}
			}
		}

		if (calificacion<APROBADO) {
			System.out.println("Has suspendido");
		} else if (calificacion >= APROBADO && calificacion < NOTABLE) {
			System.out.println("Has aprobado");
		} else if (calificacion >= NOTABLE && calificacion < SOBRESALIENTE) {
			System.out.println("Has sacado un notable");
		} else {
			System.out.println("Has sacado un sobresaliente");
		}

		if (calificacion<APROBADO) {
			System.out.println("Has suspendido");
		} else if (calificacion >= APROBADO) {
			if (calificacion < NOTABLE) {
				System.out.println("Has aprobado");
			} else if (calificacion >= NOTABLE) {
				if (calificacion < SOBRESALIENTE) {
					System.out.println("Has sacado un notable");
				} else {
					System.out.println("Has sacado un sobresaliente");
				  }
			}
		}
	
		System.out.println("Fin");
	}
}
