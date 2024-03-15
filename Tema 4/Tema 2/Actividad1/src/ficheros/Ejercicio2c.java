package ficheros;

import java.util.Scanner;

public class Ejercicio2c {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Lado ");
		int ladoP = keyboard.nextInt();
		Libreria.areaCuadrado(ladoP);
		int r= Libreria.perimetroCuadrado(ladoP);
		System.out.println("El valor calculado es " + r);
		
		System.out.println("Radio :");
		double radio = keyboard.nextDouble();
		Libreria.calcularAreaCirculo (radio);
		
		double resul  =  Libreria.perimetroCirculo(radio);
		
		System.out.println("El perimetro del circulo es "+ resul);
		
	}

}
