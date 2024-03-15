package Ejer4;

import java.util.Scanner;

public class PruebaTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tienda tienda = new Tienda("Tienda Cuántica","Pepito Pérez",123456, 5);
		Computador computador1 = new Computador("Acer",
	     	50, "Intel iCore 7", "Windows", 18500000);
		Computador computador2 = new Computador("Toshiba", 80, "Intel iCore 5", "Windows",
		15500000);
		Computador computador3 = new Computador("Mac", 100, "Intel iCore 7", "Mac", 2500000);
		tienda.añadir(computador1);
		tienda.añadir(computador2);
		tienda.añadir(computador3);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce marca ");
		String marca = sc.next();
		System.out.println("El computador a buscar: " + marca + 
         	" se encuentra en la posición " + tienda.buscar(marca));
		
		tienda.imprimir();
		
		tienda.eliminar(marca);
		System.out.println("************************");
		tienda.imprimir();
	}

}
