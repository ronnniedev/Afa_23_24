package ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Apartamento {

	private int numeroDePlanta;
	private char puerta;
	private List <Propietario>propietarios;
	
	public Apartamento(int numeroDePlanta, char puerta) {
		this.numeroDePlanta = numeroDePlanta;
		this.puerta = puerta;
		this.propietarios = new LinkedList<Propietario>();
	}

	public int getNumeroDePlanta() {
		return numeroDePlanta;
	}

	public void setNumeroDePlanta(int numeroDePlanta) {
		this.numeroDePlanta = numeroDePlanta;
	}

	public char getPuerta() {
		return puerta;
	}

	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}

	public List<Propietario> getPropietarios() {
		return propietarios;
	}
	
	public void añadirPropietarios(String nombre, String apellidos) {
		Propietario p = new Propietario(nombre,apellidos);
		propietarios.add(p);
	}

	public void setPropietarios(List<Propietario> propietarios) {
		this.propietarios = propietarios;
	}

	@Override
	public String toString() {
		return "Apartamento [numeroDePlanta=" + numeroDePlanta + ", puerta=" + puerta + ", propietarios=" + propietarios
				+ "]";
	}
	
	
	
	
	
	
	
}
