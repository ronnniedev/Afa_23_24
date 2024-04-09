package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion = -1;
		System.out.println("-------Bienvenido a mi taller-------\n");
		List<Coche> taller = new ArrayList<Coche>();
		while (opcion != 4) {
			
			System.out.println("Escriba una de las siguientes opciones: "
								+"\n-(1) Nueva reparacion"
								+ "\n-(2) Salida de vehiculo"
								+ "\n-(3) Listado de vehiculos"
								+ "\n-(4) Salir");
			opcion = keyboard.nextInt();
			
			switch(opcion) {
	        case 1:
	            crearReparacion(taller);
	            break;
	        case 2:
	            sacarVehiculo(taller);
	            break;
	        case 3:
	            listarCoches(taller);
	            break;
	        case 4:
	        	System.out.println("Apagando el sistema");
	        	break;
	        default:
	            System.out.println("Opción no válida");
			
		}
	
    }	

	}
	
	public static void crearReparacion(List <Coche> taller) {
		
		System.out.println("Escribeme el propietario del coche: ");
		String propietario = keyboard.next();
		
		System.out.println("Escribeme la marca del coche: ");
		String marca = keyboard.next();
		
		System.out.println("Escribeme la matricula del coche: ");
		String matricula = keyboard.next();
		
		Coche contenedor = new Coche(propietario,marca,matricula);
	
		taller.add(contenedor);
		
	}
	
	public static void listarCoches(List <Coche> taller) {
		
		for (Coche c: taller) {
			System.out.println(c);
		}
		
	}
	
	public static void sacarVehiculo(List <Coche> taller) {
		
		boolean encontrado = false;
		System.out.println("Escribe el nombre del propietario");
		String nombre = keyboard.next();
		
		for (int  i= 0; i < taller.size() && encontrado == false ;i++) {
			if (nombre.compareTo(taller.get(i).getPropietario()) == 0) {
				taller.get(i).setReparado(true);
				System.out.println(taller.get(i).toString());
				System.out.println("Reparacion eliminada");
				taller.remove(i);
				encontrado = true;
			}
		}
		if (encontrado == false) {
			System.out.println("No se ha encontrado a dicho propietario");
			
		}
		
	}
	
}

	
