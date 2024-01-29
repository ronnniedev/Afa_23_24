package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Dame tu nombre: ");
		String nombre = keyboard.next();
		
		System.out.println("Dime tu edad:");
		int edad = keyboard.nextInt();
		
		System.out.println("Con que genero te identificas, asegurate de escribir H para hombre y "
				+ "M para mujer");
		char sexo = keyboard.next().charAt(0);
		
		System.out.println("Dime tu peso:");
		double peso = keyboard.nextDouble();
		
		System.out.println("Dime tu altura:");
		double altura = keyboard.nextDouble();
				
		Persona p1 = new Persona (nombre,edad,sexo,peso,altura);
		Persona p2 = new Persona (nombre,edad,sexo);
		Persona p3 = new Persona ();
		
		
		
		System.out.println("Dame tu nombre: ");
		nombre = keyboard.next();
		p3.setNombre(nombre);
		
		System.out.println("Dime tu edad:");
		edad = keyboard.nextInt();
		p3.setEdad(edad);
		
		System.out.println("Con que genero te identificas, asegurate de escribir H para hombre y "
				+ "M para mujer");
		sexo = keyboard.next().charAt(0);
		p3.setSexo(sexo);
		
		System.out.println("Dime tu peso:");
		peso = keyboard.nextDouble();
		p3.setPeso(peso);
		
		System.out.println("Dime tu altura:");
		altura = keyboard.nextDouble();
		p3.setAltura(altura);
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		Persona v[] = new Persona [3];
		
		v[0] = p1;
		v[1] = p2;
		v[2] = p3;
		
		for (int i = 0; i < v.length; i++) {
		
			System.out.print(v[i].getNombre() + " "); 
			Libreria.lectorDePeso(v[i].calcularIMC());
			
		}
		
		for (int i = 0; i < v.length; i++) {
			
			Libreria.comprobarEdad(v[i].getNombre(),v[i].esMayorDeEdad());
			
		}
		
	}

}
