package ficheros;

import java.util.Scanner;

public class Entrega1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {

		
		
		double resul = 0;
		
		int menu = Libreria.menu();
			
		if (menu == 1) {
			resul = Libreria.areaTriangulo();
				
			System.out.println("El area de un triangulo es : " + resul);
				
				
		}else if (menu == 2) {
			resul = Libreria.areaTrapecio();
				
			System.out.println("El area de un trapecio es : " + resul);
				
		}else if (menu == 3) {
			resul = Libreria.areaRectangulo();
				
			System.out.println("El area de un rectangulo es : " + resul);
				
		} else if (menu == 4) {
			resul = Libreria.areaCuadrado();
			System.out.println("El area de un rectangulo es : " + resul);
				
		} 
			
	}
		

}


