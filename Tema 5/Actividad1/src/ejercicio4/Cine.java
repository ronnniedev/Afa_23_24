package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cine {
	
	static Scanner keyboard = new Scanner(System.in);
	protected List<Sesion> sesiones;
	protected Cola fila;

	public Cine() {
		
		this.sesiones = new ArrayList<Sesion>();
		this.fila = new Cola();
	
	}
	
	public  void añadirPersonaenLaCola(Persona p) {
		
		fila.añadirPersona(p);
		
	}
	
	public void crearSesion() {
		
		System.out.println("Escribeme el nombre de la sesion: ");
		String nombre = keyboard.next();
	
		System.out.println("Escribeme la fecha de la sesion: ");
		String fecha = keyboard.next();
		
		Sesion carrier = new Sesion(nombre,fecha);
		
		sesiones.add(carrier);
	}
	
	public void añadirPersonaSesion() {
		
		Persona carrier = fila.sacarPersona();
		
		if (carrier == null) {
			
			return;
		}else {
			System.out.println("Dime el nombre de la sesion donde desea ingresar: ");
			String nombre = keyboard.next();
			boolean encontrado = false;
			
			
			for (Sesion s: sesiones) {
				if (s.getTitulo().compareTo(nombre) == 0) {
					s.añadirPersona(carrier);
					s.mostrarEspectadores();
					encontrado = true;
				}
			}
			if (encontrado == false) {
				System.out.println("No se ha encontrado dicha sesion");
				
			}
			
		}
		
	}
	
	public void listarCola() {
		
		fila.mostrarEspectadores();

	}
	
	public void mostrarSesiones() {
		System.out.println("------Sesiones en el cine------");
		
		for (int i = 0; i < sesiones.size(); i++) {
			Sesion carrier = sesiones.get(i);
			System.out.println(carrier.toString());
			
		}
		
	}
	
	
}
