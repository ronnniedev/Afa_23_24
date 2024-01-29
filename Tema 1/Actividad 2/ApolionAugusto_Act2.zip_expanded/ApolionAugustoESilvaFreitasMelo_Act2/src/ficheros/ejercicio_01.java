package ficheros;

import java.util.Scanner;

public class ejercicio_01 {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int num,liminf,limsup,suma,fueraintervalo,igualintervalo;
		
		num = 1;
		suma = 0;
		fueraintervalo = 0;
		igualintervalo = 0;
		
		System.out.println("Escriba un límite inferior: ");
		liminf = teclado.nextInt();
		
		System.out.println("Escriba un límite superior: ");
		limsup = teclado.nextInt();
		
		while (liminf>=limsup) {
			System.out.println("Vuelve a darme un límite inferior: ");
			liminf = teclado.nextInt();
			System.out.println("Vuelve a darme un límite superior: ");
			limsup = teclado.nextInt();
		}
		
		/*System.out.println("Introduce un número: ");
		num = teclado.nextInt();*/
		
		while (num!=0) {
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();
			
			if (num<limsup && num>liminf) {
				suma=suma+num;
			}
			/*else if (num>limsup || num<liminf) {
				
				fueraintervalo++;*/
			
			else if (num == limsup || num == liminf) {
				igualintervalo++;
				fueraintervalo++;
			}
			else if (num!=0) {
				fueraintervalo++;
			}
		}	
		System.out.println("La suma de los numeros que estan fuera del intervalo es, "+suma+" "
				+ "y hay "+fueraintervalo+" fuera del inrtervalo y "+igualintervalo+" "
						+ "igual al intervalo.");

	}
}


