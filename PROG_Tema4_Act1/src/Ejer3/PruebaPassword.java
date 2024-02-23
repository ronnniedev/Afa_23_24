package Ejer3;


import java.util.Scanner;

public class PruebaPassword {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dim ");
		int dim=teclado.nextInt();
		System.out.println("Longitud ");
		int longitud=teclado.nextInt();
		
		Password v[]=new Password[dim];
		for (int i = 0; i < v.length; i++) {
			v[i]=new Password(longitud);
			System.out.println(v[i].getContraseña()+
					" "+v[i].esFuerte());
		}
	}

}
