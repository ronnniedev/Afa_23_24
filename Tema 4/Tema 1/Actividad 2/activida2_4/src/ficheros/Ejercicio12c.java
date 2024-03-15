package ficheros;

import java.util.Scanner;

public class Ejercicio12c {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Introduce un numero bianrio");
		int num = keyboard.nextInt();
		
		int pos=0;
		int valorAcum=0;
		
		while (num > 0) {
			
			int resto =num%10;
			valorAcum = (int) ((resto*Math.pow(2, pos))+valorAcum);
			
			num = num/10;
			
			pos++;
			
		}
		System.out.println("El valor en decimal es "+valorAcum);
	}

}
