package Ficheros;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vehiculo implements Comparable {
	
	private String matricula;
	private String dni;
	private String nombre;
	private int cpAsignado;
	private List<Paquete> paquetesAsignados;
	// añadir atributos necesarios
	
	
	// completar constructor
	public Vehiculo(String matricula,String dni,String nombreConductor) {
		this.matricula = matricula;
		this.dni = dni;
		this.nombre = nombreConductor;
		this.cpAsignado = -1;
		this.paquetesAsignados = new LinkedList<Paquete>();
	}
	
	

	/**
	 * @return the cpAsignado
	 */
	public int getCpAsignado() {
		return cpAsignado;
	}



	/**
	 * @param cpAsignado the cpAsignado to set
	 */
	public void setCpAsignado(int cpAsignado) {
		this.cpAsignado = cpAsignado;
	}



	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}



	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	public void añadirPaquete(Paquete p) {
		this.cpAsignado = p.getCp();
		paquetesAsignados.add(p);
	}


	// mostrar los datos del vehiculo asi como los
	// paquetes asignados si los tuviera
	public String mostrarVehiculo(){
	if (this.cpAsignado == -1) {
		return "Vehiculo [matricula=" + matricula + ", dni=" + dni + ", nombre=" + nombre + ", cpAsignado=" + cpAsignado
		+ "]";
	}else {
		return "Vehiculo [matricula=" + matricula + ", dni=" + dni + ", nombre=" + nombre + ", cpAsignado=" + cpAsignado
				+ "]" + paquetesAsignados.toString();
	}
		
	}


	@Override
	public int compareTo(Object o) {
		Vehiculo v = (Vehiculo)o;
		return this.matricula.compareTo(v.matricula);
	}
	
	
}
