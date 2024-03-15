package ficheros;

import java.util.Scanner;

public class Ejercicio9 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {

		int num,contador,factorial,memcont,suma;
		
		suma = 1;
		contador = 1; // el contador siempre empieza en 0
		memcont = contador; // memcont siempre contendra el valor de memoria
		factorial = 1; //el primer factorial siempre va a ser 0 por lo que lo inicializamos asi
		
		System.out.println("Introduce un numero: "); //introducimos el numero
		num = keyboard.nextInt();
		
		System.out.println("0 ! = 1");
		
		while (memcont <= num) { //hasta que memcont no tenga el mismo valor que num no paramos
			
			while (contador >= 1) {  //superior o igual que 1 para que no multiplique por 0
				
				factorial = factorial * contador;
				contador--;	 
				
			} 
			
			System.out.println(memcont + " ! = " +  factorial);
			
			suma = suma + factorial;
			memcont++; //memcont aumenta
			factorial = memcont;
			contador = memcont - 1;// el contador empezara con el valor de memoria -1 para hacer el factorial
		
			
		} System.out.println("Suma de los factoriales desde 0 hasta " + num + " es " + suma);
			
			

	}

}
