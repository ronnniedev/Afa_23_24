package ficheros;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int plus = 0;
		int cifra = 0;
		int plustwo = 0;
		boolean first = true;
		
		System.out.println("Introduce tu año de nacimiento: ");
		int year = keyboard.nextInt();
		
		System.out.println("Introduce tu mes de nacimiento: ");
		int month = keyboard.nextInt();
		
		System.out.println("Introduce tu dia de nacimiento: ");
		int day = keyboard.nextInt();
		
		plus = day + month + year;
		System.out.println( day + " + " + month + " + " + year + " = " + plus );
		
		while (plus > 0) {
			
			cifra =	plus%10; 
			plus = plus/10;
		
			if (first)System.out.print(cifra + "+");
			else System.out.print("+" + cifra);
		
			plustwo = plustwo+cifra;
		}
		
		System.out.println("= " + plustwo);
		plus = 0;
		first = true;
		
		while (plustwo >0) {
			
			cifra =	plustwo%10; 
			plustwo = plustwo/10;
		
			System.out.println(plustwo);
			if (first && plustwo > 10)System.out.print(cifra + "+");
			else if(plustwo < 10)System.out.print(cifra);
			else System.out.print("+" + cifra ); 
			
			plus = plus + cifra;
		}System.out.println("Tu numero magico es :" + plus);
		

	}

}
