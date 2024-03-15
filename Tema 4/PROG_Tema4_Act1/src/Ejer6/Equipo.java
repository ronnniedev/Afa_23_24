package Ejer6;

import java.util.Arrays;
import java.util.Iterator;

public class Equipo {
	//nombre, patrocinador, color de la 1ª camiseta, 
	//color de la 2ª camiseta,
	//categoría
	private String nombre;
	private String patrocinador;
	private String colo1;
	private String color2;
	private String categoria;
	
	private Participante participantes[];
	private int contParticipantes;
	/**
	 * @param nombre
	 * @param patrocinador
	 * @param colo1
	 * @param color2
	 * @param categoria
	 */
	public Equipo(String nombre, String patrocinador, String colo1, String color2, String categoria) {
		this.nombre = nombre;
		this.patrocinador = patrocinador;
		this.colo1 = colo1;
		this.color2 = color2;
		this.categoria = categoria;
		
		this.participantes=new Participante[10];
		contParticipantes=0;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the patrocinador
	 */
	public String getPatrocinador() {
		return patrocinador;
	}
	/**
	 * @return the colo1
	 */
	public String getColo1() {
		return colo1;
	}
	/**
	 * @return the color2
	 */
	public String getColor2() {
		return color2;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @return the participantes
	 */
	public Participante[] getParticipantes() {
		return participantes;
	}
	/**
	 * @return the contParticipantes
	 */
	public int getContParticipantes() {
		return contParticipantes;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param patrocinador the patrocinador to set
	 */
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}
	/**
	 * @param colo1 the colo1 to set
	 */
	public void setColo1(String colo1) {
		this.colo1 = colo1;
	}
	/**
	 * @param color2 the color2 to set
	 */
	public void setColor2(String color2) {
		this.color2 = color2;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	
	public void añadirParticipante(Participante p) {
		if(this.contParticipantes<participantes.length) {
			int pos=this.contParticipantes;
			participantes[pos]=p;
			this.contParticipantes++;
		}
	}

	
	@Override
	public String toString() {
		String texto="******************************\n";
		texto+= "Equipo [nombre=" + nombre + ", "
				+ "patrocinador=" + patrocinador + 
				", colo1=" + colo1 + ", color2=" + 
				color2
				+ ", categoria=" + categoria + "]\n";
		
		for (int i = 0; i < contParticipantes; i++) {
			Participante p=participantes[i];
			texto+=p.toString();
		}
		return texto;
	}
	
	
	
	
	
	
}



