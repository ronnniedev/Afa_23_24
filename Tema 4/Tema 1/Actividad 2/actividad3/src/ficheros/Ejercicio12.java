package ficheros;


import java.util.Scanner;

public class Ejercicio12 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Escriba un programa en Java que solicite 10 números enteros
		 * positivos al usuario y calcule y muestre los siguientes valores:
		 * • La suma de todos los números leídos.
		 * • La media de los números.
		 * • El mayor número introducido.
		 * • El menor número introducido.
		 */
		
		double num,mayor,menor,suma,media,cont;
		boolean primero; //para establecer el primer numero comparador
		
		
		primero = false; //inicializo primero para tener un controlador
		mayor = 0;
		menor = 0;
		suma = 0;
		
		
		for (cont = 10; cont != 0; cont--) {
			
			System.out.println("Introduzca un numero: "); //introducimos un numero cada vez
			num = keyboard.nextInt();
			
			if (primero == false) {
				primero = true;
				mayor = num;
				menor = num;
			}else if (num > mayor) { // si el numero es mayor rompemos el mayor
				
				mayor = num;
				
			}else if (num < menor) { // si el menor establecido se supera reducimos el menor
				
				menor = num;
			}
			
			suma = suma + num; //sumamos todo 
			
			
		} media = suma / 10;
		
		System.out.print("Suma = " + suma);
		System.out.print(" Media = " + media);
		System.out.print(" Mayor = " + mayor);
		System.out.print(" Menor = " + menor);

	}

}
