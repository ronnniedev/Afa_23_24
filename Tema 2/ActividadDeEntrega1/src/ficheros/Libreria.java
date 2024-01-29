package ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner keyboard = new Scanner(System.in);
	/**
	 * Pregunta al usuario una opcion del 1 al 4 y lo retorna a la main 
	 * @return entero
	 */
	public static int menu() {
		
		System.out.println("CALCULO DE AREAS  ================================================");
		System.out.println("1 - Calcular el area de un triángulo");
		System.out.println("2 - Calcular el area de un trapecio");
		System.out.println("3 - Calcular el area de un rectangulo");
		System.out.println("4 - Calcular el area de un cuadrado");
		
		System.out.println("Selecciona 1  opcion ( si quiere apagar el sistema escriba 0): ");
		int sel = keyboard.nextInt();
		
		return sel;
		
	}
	/**
	 * Pregunta por los valores de un triangulo y calcula su area
	 * @return real
	 */
	public static double areaTriangulo () {
		
		System.out.print("Introduce la base del triangulo: ");
		double base = keyboard.nextDouble();
		
		System.out.println("Introduce la altura del triangulo");
		double altura = keyboard.nextDouble();
		
		double area = (base*altura)/2;
		
		
		
		return area;
	}
	/**
	 * Pregunta por los valores de un trapecio y calcula su area.
	 * @return real
	 */
	public static double areaTrapecio() {
		
		System.out.println("Introduce la longitud de la base mayor (B) :");
		double B = keyboard.nextDouble();
		
		System.out.println("Introduced la longitud de la base menor (b):");
		double b = keyboard.nextDouble();
		
		System.out.println("Introduce la altura del trapecio (h):");
		double h = keyboard.nextDouble();
		
		double area = h * ((b+B)/2);
		
		return area;
	}
	/**
	 * Pregunta por los valores de un rectangulo y calcula su area.
	 * @return real
	 */
	public static double areaRectangulo() {
		
		System.out.println("Introduce el tamaño de la base del rectangulo (b): ");
		double b = keyboard.nextDouble();
		
		System.out.println("Introduce la altura del rectangulo (h):");
		double h = keyboard.nextDouble();
		
		double area = b * h;
		
		return area;
		
		
	}
	/**
	 * Pregunta por los valores de un cuadrado y calcula su area.
	 * @return real
	 */
	public static double areaCuadrado() {
		
		System.out.println("Introduce el tamaño del lado del cuadrado: ");
		double l = keyboard.nextDouble();
		
		
		
		double area = l * l;
		
		return area;
		
		
		
	}
 
}
