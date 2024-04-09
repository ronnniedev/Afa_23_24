package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Sesion {
	
	protected String titulo;
	protected String fecha;
	protected List<Persona> espectadores;
	protected double recaudacion;
	
	public Sesion(String titulo, String fecha) {
		this.titulo = titulo;
		this.fecha = fecha;
		this.espectadores = new ArrayList<Persona>();
		this.recaudacion = 0;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the espectadores
	 */
	public List<Persona> getEspectadores() {
		return espectadores;
	}

	/**
	 * @param espectadores the espectadores to set
	 */
	public void setEspectadores(List<Persona> espectadores) {
		this.espectadores = espectadores;
	}
	
	public void añadirPersona(Persona p) {
		
		espectadores.add(p);
		
	}
	
	public void mostrarEspectadores() {
		System.out.println("------Titulo de sesion: " + this.titulo + "------");
		
		for (int i = 0; i < espectadores.size(); i++) {
			System.out.println(espectadores.get(i).toString());
		}
	}
	
	public double cantidadTotalRecaudada() {
		double cantidad = 0;
		
		
		for (int i = 0; i < espectadores.size(); i++) {
			Persona p = espectadores.get(i);
			cantidad = cantidad + p.getPrecioEntrada();
			
		}
		return cantidad;
	}

	@Override
	public String toString() {
		return "Sesion [titulo=" + titulo + ", fecha=" + fecha + ", recaudacion=" + cantidadTotalRecaudada()
		
		
		
		
		+ "]";
	}

	
	
	
	
	
	
	
	
}
