package ficheros;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 4
		 * Implementar un código modular con una función que calcule la raíz
		 * cuadrada de un numero que recibe como parámetro, teniendo la
		 * precaución de no llamar a la función si el numero es negativo, en cuyo
		 * caso se muestra un mensaje de error.
		 */
		
		
		int resul = 0;
		System.out.println("Por favor introduzca un numero positivo: ");
		int num = keyboard.nextInt();
		
		if (num < 0) System.out.println("Error\n Se ha introducido un numero negativo \n FIN DE PROGRAMA");
		else resul = Libreria.raizEntera(num);
		
		System.out.println("El resultado es :" + resul);
		
		
		
	}
	/**
	 * Calcula la raiz cuadrada del numero y lo imprime en pantalla
	 * @param num : entero
	 */
	

}
