package ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Apartamento {
	
	private int piso;
	private char puerta;
	private List <Propietario> propietarios;
	
	public Apartamento(int piso, char puerta) {
		this.piso = piso;
		this.puerta = puerta;
		this.propietarios = new LinkedList<Propietario>();
	}
	
	public void añadirPropietarios(String nombre, String apellidos) {
		Propietario propietario = new Propietario(nombre,apellidos);
		propietarios.add(propietario);
	}
	
	public void listarPropietarios() {
		System.out.println("--------Lista Propietarios----------");
		for (int i = 0; i < propietarios.size();i++) {
			System.out.println(propietarios.get(i).toString());
		}
		
	}
	
	public List<Propietario> getPropietarios() {
		return this.propietarios;
	}

	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	/**
	 * @return the puerta
	 */
	public char getPuerta() {
		return puerta;
	}

	/**
	 * @param puerta the puerta to set
	 */
	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}


	@Override
	public String toString() {
		return "Apartamento [piso=" + piso + ", puerta=" + puerta + "]";
	}
	
}
