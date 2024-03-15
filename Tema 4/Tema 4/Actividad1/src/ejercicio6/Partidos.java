package ejercicio6;

import java.util.Scanner;

public class Partidos {
	static Scanner keyboard=new Scanner(System.in);	
	private Equipo e[];
	private String campo;
	private String arbitro;
	private String incidencia;
	private int numEquipos;
	private Equipo v;
	private Equipo c;
	
	
	public Partidos(String campo, String arbitro, String incidencia,Equipo v,Equipo c) {
		this.campo = campo;
		this.arbitro = arbitro;
		this.incidencia = incidencia;
		this.e = new Equipo [6];
		this.numEquipos = 0;
		this.v = v;
		this.c = c;
		
	}
	
	public void añadirEquipo () {
		
		if (this.e.length != this.numEquipos) {
			
			System.out.println("Di el nombre del equipo: ");
			String nombre = keyboard.next();
			
			System.out.println("Di el nombre del patrocinador: ");
			String patrocinador = keyboard.next();
			
			System.out.println("Escribe el color 1: ");
			String color1 = keyboard.next();
			
			System.out.println("Escribe el color 2: ");
			String color2 = keyboard.next();
			
			System.out.println("Escribe la categoria: ");
			String categoria= keyboard.next();
			
			
			if (numEquipos == 0) { 
				Equipo e1 = new Equipo (nombre,patrocinador,color1,color2,categoria);
				e[0] = e1;
			}
			else if (numEquipos == 1) { 
				Equipo e2 = new Equipo (nombre,patrocinador,color1,color2,categoria);
				e[1] = e2;
			}
			else if (numEquipos == 2) { 
				Equipo e3 = new Equipo (nombre,patrocinador,color1,color2,categoria);
				e[2] = e3;
			}
			else if (numEquipos == 3) { 
				Equipo e4 = new Equipo (nombre,patrocinador,color1,color2,categoria);
				e[3] = e4;
				}
			else if (numEquipos == 4) { 
				Equipo e5 = new Equipo (nombre,patrocinador,color1,color2,categoria);
				e[4] = e5;
			}
			else if (numEquipos == 5) {
				Equipo e6 = new Equipo (nombre,patrocinador,color1,color2,categoria);
				e[5] = e6;
				}
			if (this.numEquipos%2 == 0) {
				System.out.print("---->Visitante");
			}else {
				System.out.print("---->Casa");
			}
			System.out.println(e[numEquipos].toString());
			//e[numEquipos].añadirParticipantes();
			numEquipos++;
		}
		
	}
	
	

	@Override
	public String toString() {
		return "Partidos [campo=" + campo + ", arbitro=" + arbitro + ", incidencia=" + incidencia + "]\n -----Visitante-----\n" + v + "\n -----Casa-----\n"
				+ c + "]";
	}

	public void visualizar () {
		
		for (int i = 0; i < this.numEquipos; i++) {
			
			System.out.println(e[i].toString());
			
		}
	
	}
	
	
}
