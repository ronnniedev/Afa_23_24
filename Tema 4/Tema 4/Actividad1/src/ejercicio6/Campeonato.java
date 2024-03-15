package ejercicio6;

import java.util.Scanner;

public class Campeonato {
	static Scanner keyboard=new Scanner(System.in);	
	private Partidos p[];
	private int numPartidos;
	
	public Campeonato() {
		
		this.p = new Partidos [10];
		this.numPartidos = 0;
	}
	public void añadirPartido (String campo, String arbitro, String incidencia, Equipo visitante,Equipo casa) {
		
		Partidos carrito = new Partidos (campo,arbitro,incidencia, visitante, casa);
		
		p[this.numPartidos] = carrito;
		this.numPartidos++;
		visualizar();
		
		
	}
	
	public void visualizar () {
		
		System.out.println(this.numPartidos);
		for (int i = 0; i < this.numPartidos; i++) {
			System.out.println(p[i].toString());
			
		}
	
	}
	
}
