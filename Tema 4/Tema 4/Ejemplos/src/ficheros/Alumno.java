package ficheros;

import java.util.Scanner;

public class Alumno {
	static Scanner keyboard=new Scanner(System.in);
	private String dni;
	private String nombre;
	private int edad; //nivel paquete si no le pones nada
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	public Alumno(String d, String n, int e) {
		dni = d;
		nombre = n;
		edad = e;

	}
	
	public Alumno() {
		dni = "000000000";
		nombre = "x";
		edad = 0;
		
		System.out.println("Escribe el dni:");
		dni = keyboard.next();
		
		System.out.println("Escribe el nombre:");
		nombre = keyboard.next();
		
		System.out.println("Escribe la edad:");
		edad = keyboard.nextInt();

	}
	
	public Alumno(String n, int e) {
		nombre = n;
		edad = e;

	}

	public void mostrarDatos() {
		System.out.println(dni + "-" + nombre + "-" + edad);

	}
	
	
}
