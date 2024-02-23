package ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

public class Equipo {
	static Scanner keyboard=new Scanner(System.in);	
	private String nombre;
	private String patrocinador;
	private String color1;
	private String color2;
	private String categoria;
	private Participantes v[];
	private int numParticipantes;
	
	public Equipo(String nombre, String patrocinador, String color1, String color2,String categoria) {
		this.nombre = nombre;
		this.patrocinador = patrocinador;
		this.color1 = color1;
		this.color2 = color2;
		this.categoria = categoria;
		this.v = new Participantes [10];
		this.numParticipantes = 0;
	}
	
	public void añadirParticipantes (Participantes p) {
		
			v[this.numParticipantes] = p;
			this.numParticipantes++;

	}
	
	public void visualizar () {
	
		for (int i = 0; i < numParticipantes; i++) {
			
			System.out.println(v[i].toString());
			
		}
		
		
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", patrocinador=" + patrocinador + ", color1=" + color1 + ", color2="
				+ color2 + ", categoria=" + categoria + "]\nParticipantes-----\n" + Arrays.toString(v) + "\n";
	}

	

	
	
}
