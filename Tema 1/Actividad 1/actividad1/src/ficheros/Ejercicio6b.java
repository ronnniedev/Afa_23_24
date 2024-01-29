package ficheros;

import java.util.Scanner;

public class Ejercicio6b {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		//Actividad 6
		//Se tienen 3 variables A, B y C. escribe las instrucciones necesarias
		//para intercambiar sus valores, san cuales sean, de manera que:
		//• B tome el valor de A original B = 3
		//• C tome el valor de B original C = 2
		//• A tome el valor de C original A = 1
		
		
		
		int a,b,c;
		System.out.println("Introduce el valor de a :");
		a = teclado.nextInt();
		System.out.println("Introduce el valor de b :");
		b = teclado.nextInt();
		System.out.println("Introduce el valor de c :");
		c = teclado.nextInt();
		System.out.println("a = "+ a + " b = "+ b + " c = "+ c);
		
		a = a + b + c;
		b = a - b - c;
		c = a - b - c;
		a = a - b - c;
		
		System.out.println("a = "+ a + " b = "+ b + " c = "+ c);

		/* 
		* Este codigo usa la transferencia de informacion, cuando sumamos todas las variables en
		* A hacemos que esta tenga la informacion de las tres variables en 1 
		* Asignamos la variable a la que le queramos trasnferir la informacion de A y restamos 
		* A=A+B+C
		* B=A-B-C
		* B=(A+B+C)-(B+C)
		* B=A
		* lo mismo con C con los nuevos datos de A
		* C=A-B-C
		* C=(A+B+C)-(A+C)
		* C=B
		* Y finalmente A
		* A=A-B-C
		* A=(A+B+C)-(A+B)
		* A=C
		* 
		*/
	}

}
