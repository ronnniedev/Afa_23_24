package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Excepciones.ExamenExcepcion;
import Excepciones.FormatoExcepcion;

public class Autobus {
	private static int diasMes[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	private Matricula matricula;
	private int numPlazas;
	private final double PRECIO_DIA = 100;
	private double precioKm;
	private List <Integer>calendario;

	
	
	public Autobus(String m, int numPlazas,double precioKm) throws FormatoExcepcion{
		Matricula mat = new Matricula (m);
		this.matricula = mat;
		this.numPlazas = numPlazas;
		this.precioKm = precioKm;
		this.calendario = new ArrayList();
		
	}

	public static int CalcularDia(String fecha) throws FormatoExcepcion {
		String trozos[] = fecha.split("/");

		int dia = Integer.parseInt(trozos[0]);
		int mes = Integer.parseInt(trozos[1]);
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia < 1 || dia > 31) {
				throw new FormatoExcepcion("ERROR fecha en dia fuera de rango");
			}
		} else if (mes == 2) {
			if (dia < 1 || dia > 28) {
				throw new FormatoExcepcion("ERROR fecha el mes 2 no tiene " + trozos[0]);
			}
		} else {
			if (dia < 1 || dia > 30) {
				throw new FormatoExcepcion("ERROR fecha en dia fuera de rango");
			}
		}
		if (mes < 1 || mes > 12) {
			throw new FormatoExcepcion("ERROR fecha en mes fuera de rango");
		}
		for (int i = 0; i < mes - 1; i++) {
			dia += diasMes[i];
		}
		
		return dia;
	  
	}
	
	
	public void alquilar(String fechaAlquiler, int numDiasAlquiler) throws FormatoExcepcion, ExamenExcepcion{
		
		String trozos[] = fechaAlquiler.split("/");
		int numeroDia = CalcularDia(fechaAlquiler);
		int diasReserva = numDiasAlquiler;
		
		while(numDiasAlquiler != 0) {
		for (int i = 0; i < calendario.size();i++) {
			if (calendario.get(i)== numeroDia) {
				throw new ExamenExcepcion("Error autobus no disponible el dia " + trozos[0]);
			}
		}
		numeroDia++;
		numDiasAlquiler--;
		
		}
		numeroDia = numeroDia - diasReserva;
		for (int i = diasReserva; i != 0;i--) {
			calendario.add(numeroDia);
			numeroDia++;
		}
		
	}
	public boolean estaDisponible(String fecha, int numDias) throws FormatoExcepcion {
		boolean bien = true;
		int numeroDia = CalcularDia(fecha);
		
		while(numDias != 0) {
		for (int i = 0; i < calendario.size();i++) {
			if (calendario.get(i)== numeroDia) {
				bien = false;
			}
		}
		numeroDia++;
		numDias--;
		
		}
		return bien;
	}

	/**
	 * @return the matricula
	 */
	public Matricula getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the numPlazas
	 */
	public int getNumPlazas() {
		return numPlazas;
	}

	/**
	 * @param numPlazas the numPlazas to set
	 */
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	/**
	 * @return the precioDia
	 */
	public double getPrecioDia() {
		return PRECIO_DIA;
	}


	/**
	 * @return the precioKm
	 */
	public double getPrecioKm() {
		return precioKm;
	}

	/**
	 * @param precioKm the precioKm to set
	 */
	public void setPrecioKm(double precioKm) {
		this.precioKm = precioKm;
	}

	/**
	 * @return the calendario
	 */
	public List<Integer> getCalendario() {
		return calendario;
	}

	/**
	 * @param calendario the calendario to set
	 */
	public void setCalendario(List<Integer> calendario) {
		this.calendario = calendario;
	}

	@Override
	public String toString() {
		return "Autobus [matricula=" + matricula + ", numPlazas=" + numPlazas + ", precioDia=" + PRECIO_DIA
				+ ", precioKm=" + precioKm + "]";
	}
	
	
}
