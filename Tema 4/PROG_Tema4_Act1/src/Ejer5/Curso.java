package Ejer5;

import java.util.Iterator;

public class Curso {
	private Estudiante v[];
	private int contEstudiante;
	
	public Curso() {
		v=new Estudiante[10];
		this.contEstudiante=0;
	}

	/**
	 * añadir un estudiante al vector
	 * @param e Estudiante
	 */
	public void addEstudiante(Estudiante e) {
		if(contEstudiante<v.length) {// tenemos hueco
			v[contEstudiante]=e;
			contEstudiante++;
		}else {
			System.out.println("No hay hueco");
		}
	}

	/**
	 * muestra la informacion de los alumnos
	 */
	public void listarAlumnos() {
		for (int i = 0; i < this.contEstudiante; i++) {
			Estudiante e=v[i];
			System.out.println(e.toString());
		}
	}
	
	/**
	 * Buscar un estudiante de acuerdo con su código 
	 * @param codEstudiante entero
	 */
	public void buscarAlumno(int codEstudiante) {
		boolean encontrado=false;
		for (int i = 0; i < this.contEstudiante && encontrado==false; i++) {
			Estudiante e=v[i];
			if(e.getCodigo()==codEstudiante) {
				// encontrado
				System.out.println(e.toString());
				encontrado=true;
			}
		}
		if(encontrado==false) {
			System.out.println("ERROR estudiante no encontrado");
		}
	}
}
