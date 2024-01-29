package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		
		String nombre = "pepito";
		double cant = 67.73;
		double num = 1;
		
		
		
		
		System.out.println("Escribe el nombre del titular: ");
		nombre = keyboard.next();
		
		Cuenta cuenta = new Cuenta (nombre,cant);
		char selector = 'x';
		
		while (selector != 'a') {
			
			cant = cuenta.getCantidad();
			
			System.out.println("Usuario: " + cuenta.getTitular());
			System.out.println("Su saldo es de:" + cuenta.getCantidad());
			System.out.println("\n ¿Que desea realizar?");
			System.out.println("-Si desea apagar escriba 'a'");
			System.out.println("-Si desea retirar escriba 'r'");
			System.out.println("-Si desea ingresar escriba 'i'");
			selector = keyboard.next().charAt(0);
			
			if (selector == 'r') {
				System.out.println("Su saldo actual es de " + cuenta.getCantidad());
				System.out.println("¿Cuanto desea retirar?");
				num = keyboard.nextDouble();
				
				if (num > cuenta.getCantidad()) {
					
				cuenta.setCantidad(0);
				
				}else cuenta.setCantidad(cant-num);
				
				
			}else if (selector == 'i') {
				
				num = 0;
				System.out.println("Su saldo actual es de " + cuenta.getCantidad());
				System.out.println("¿Cuanto desea ingresar?");
				num = keyboard.nextDouble();
				while (num < 0) {
					
					System.out.println("No puede retirar en esta modalidad, por favor seleccione una cantidad a ingresar "
							+ " o escriba 0 para salirse de la misma");
					System.out.println("Su saldo actual es de " + cuenta.getCantidad());
					System.out.println("¿Cuanto desea ingresar?");
					num = keyboard.nextDouble();
					
				}
				System.out.println(cant);
				cuenta.setCantidad(cant + num);
				System.out.println("Comprobacion: " + cuenta.getCantidad());
				
			}
			if (selector != 'a') {
				System.out.println("Su nuevo saldo y informacion de la cuenta es la siguiente: ");
				System.out.println(cuenta.toString());
			}else System.out.println("Apagando el sistema");
			
		}
	}

}
