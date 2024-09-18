package Modelo;

import java.util.ArrayList;
import java.util.List;

import Excepciones.ExamenExcepcion;
import Excepciones.FormatoExcepcion;

public class Autobus {
	private static int diasMes[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	private Matricula matricula;
	private int numPlazas;
	private double precioDia;
	private double precioKm;
	
	//calendario;
	
	
	public Autobus(String m, int numPlazas,double precioKm){

	}
	
	
	
	public int CalcularDia(String fecha) {
		return 0;	  
	}
	public void alquilar(String fechaAlquiler, int numDiasAlquiler){
		
		
	}
	public boolean estaDisponible(String fecha, int numDias) {
		return false;
	}
}
