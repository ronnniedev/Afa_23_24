package ficheros;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int elevacion = 0;
		int resul = 0;
		
		System.out.print("Introduce un numero para calcular su raiz: ");
		int num = keyboard.nextInt();
		
		
		while (num < 0) {
			
			System.out.println("ERROR no se puede calcular la raiz de " + num);
			System.out.print("Por favor introduzca un numero entero positivo para el calculo :");
			num = keyboard.nextInt();
			
		}
		
		while (num > resul) {
			elevacion++;
			resul = elevacion * elevacion;
			if (resul > num)elevacion--; //si la raiz es decimal le restamos 1 al cont
			
			
		}System.out.println("La raiz de " + num + " es " + elevacion);

	}

}
