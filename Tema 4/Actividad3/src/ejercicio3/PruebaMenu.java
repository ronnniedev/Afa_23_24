package ejercicio3;

import java.util.Scanner;

public class PruebaMenu {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		
		Colegio colegio = new Colegio();
		cargarDatos(colegio);
		int opcion = menu();
		
		while (opcion != 0) {
			switch (opcion) {
			case 1:{
				insertarProfesor(colegio);
				break;
			}
			case 2:{
				insertarAlumno(colegio);
				break;
			}
			case 3:{
				colegio.listarColegio();
				break;
				}
			};
			opcion=menu();
			
		}
		
	}
	
	private static int menu() {
		
		System.out.println("\n\n*******************");
		System.out.println("1.- Insertar Profesor");
		System.out.println("2.- Insertar Estudiante");
		System.out.println("3.- Listar colegio");
		System.out.println("4.- Buscar persona");
		System.out.println("5.- Borrar persona");
		System.out.println("0.- Salir ");
		System.out.println("opcion");
		int opcion = keyboard.nextInt();
		return opcion;
	}
	
	private static void cargarDatos(Colegio colegio) {
		
		Direccion d1 = new Direccion ("Calle motriz", "Oviedo", 33207, "Portugal");
		Direccion d2 = new Direccion ("d2", "Oviedo", 33207, "Portugal");
		
		Estudiante e1 = new Estudiante ("Mariano","Rajoy","38493294",d1);
		Estudiante e2 = new Estudiante ("e2","Rajoy","38493294",d1);
		
		Profesor p1 = new Profesor ("Ana","Por favor", "721847123", d2, "Ala derecha");
		Profesor p2 = new Profesor ("p2","Por favor", "721847123", d2, "Ala derecha");
		
		Persona v[] = new Persona [4];
		
		v[0] = p1;
		v[1] = p2;
		v[2] = e1;
		v[3] = e2;
		
		for (int i = 0; i < v.length; i++) {
			colegio.insertarPersona(v[i]);
		}
		
	}
	
	private static void insertarAlumno (Colegio colegio) {
		Direccion d2 = new Direccion ("d2", "Oviedo", 33207, "Portugal");
		System.out.println("Nif: ");
		String hif = keyboard.next();
		System.out.println("Nombre: ");
		String nombre = keyboard.next();
		System.out.println("Apellidos");
		String ape = keyboard.next();
		
		Estudiante a = new Estudiante (hif,nombre,ape,d2);
		colegio.insertarPersona(a);
		
	}
	
	public static void insertarProfesor(Colegio colegio) {
		Direccion d1 = new Direccion ("Calle motriz", "Oviedo", 33207, "Portugal");
		System.out.println("Nif: ");
		String hif = keyboard.next();
		System.out.println("Nombre: ");
		String nombre = keyboard.next();
		System.out.println("Apellidos");
		String ape = keyboard.next();
		System.out.println("Despacho: ");
		String des = keyboard.next();
		
		Profesor p = new Profesor(hif,nombre,ape,d1,des);
		colegio.insertarPersona(p);
		
		
	}

}
