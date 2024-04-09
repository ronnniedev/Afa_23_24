package ejercicio6;

import java.util.ArrayList;
import java.util.List;


public class Carpeta {

	protected List<Informe> carpeta;
	protected String nombre;
	
	public Carpeta(String nombre) {
		this.carpeta =  new ArrayList<Informe>();
		this.nombre = nombre;
	}
	
	public void añadirInforme(Informe informe) {
		carpeta.add(informe);
	}
	
	public void quitarInforme() {
		
		carpeta.remove(carpeta.size()-1);
		
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarContenido() {
		
		System.out.println("-----Contenido de carpeta " + this.nombre + "-----");
		for (int i = 0; i < carpeta.size(); i++) {
			System.out.println(carpeta.get(i).toString());
		}
		
	}
	
	
	
	
	
	
}
