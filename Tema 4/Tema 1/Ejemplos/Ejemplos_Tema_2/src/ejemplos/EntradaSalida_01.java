package ejemplos;

import java.util.Scanner;

public class EntradaSalida_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Zona de declaración de variables y constantes
		  final int MAYORIA_EDAD = 18;
		  int edad = 18;
		  String nombre = "";

		  // Dime tu nombre
		  // println escribe y salta de linea "\n"
		  // print escribe y no salta de linea		 

		  System.out.println("Dime tu nombre: ");
		  
		  // Declaramos el teclado
		  Scanner teclado = new Scanner(System.in);
		  
		  // leer una cadena
		  nombre = teclado.next();
		  
		  // leer un entero
		  System.out.println("Dime tu edad: ");
		  edad = teclado.nextInt();
		  
		  System.out.println(nombre+" tiene "+edad+" años");

		  System.out.println("Fin del programa");


	}

}
