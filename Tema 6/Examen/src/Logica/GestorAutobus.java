package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import Excepciones.ExamenExcepcion;
import Excepciones.FormatoExcepcion;
import Modelo.Alquiler;
import Modelo.Autobus;
import Modelo.Cliente;
import Modelo.Matricula;

public class GestorAutobus {

	private Map <Matricula,Autobus> autobuses;
	private Set <Cliente> clientes;
	private List <Alquiler> alquileres;
	public GestorAutobus() {
		this.autobuses = new HashMap <Matricula,Autobus>();
		this.clientes = new TreeSet<Cliente>();
		this.alquileres = new ArrayList<Alquiler>();
	}

	public String generarFactura(String nif) throws ExamenExcepcion {
		Cliente c1 = new Cliente (nif,"Pruebas");
		
		if (!clientes.contains(c1)) {
			throw new ExamenExcepcion("Error nif no encontrado");
		}
		
		String texto = "";
		double total = 0;
		
		for (int i = 0; i < alquileres.size(); i++) {
			if (alquileres.get(i).getNifCliente().compareTo(nif) == 0) {
				double importe = ((alquileres.get(i).getAutobus().getPrecioDia()*alquileres.get(i).getNumDiasAlquiler())
						+(alquileres.get(i).getAutobus().getPrecioKm()*alquileres.get(i).getKms()));
				texto += alquileres.get(i).toString() + "Importe: " 
				+importe +"\n";
				total = total + importe;
			}
		}
		
		texto += "Total importe: " + total;
		
	 return texto;
		
	}
	public String autobusesDisponibles(String fecha, int numDias, int numPlazas) throws FormatoExcepcion {
		String texto = "";
		for (Autobus b: autobuses.values()) {
			if (b.getNumPlazas() >= numPlazas && b.estaDisponible(fecha, numDias)) {
				texto += b.toString() + b.getCalendario() + "\n";
			}
		}
		return texto;
	}
	
	public void alquilarAutocar(String matricula, String nif, String fecha, 
                int numDias, int numKm) throws FormatoExcepcion, ExamenExcepcion  {
		Matricula m = new Matricula(matricula);
	if (!autobuses.containsKey(m)) {
		throw new ExamenExcepcion("Matricula no encontrada");
	}
	
	Cliente c1 = new Cliente(nif,"comparador");
	
	if (!clientes.contains(c1)) {
		throw new ExamenExcepcion("Cliente no encontrado");
	}
	
	autobuses.get(m).alquilar(fecha, numDias);
	
	Alquiler a = new Alquiler (autobuses.get(m),nif,fecha,numDias,numKm);
	
	alquileres.add(a);
		
	}
	public String listarTodosLosAutobuses() {
		String texto = "Autobuses : " + autobuses.size() + "\n";
		for (Autobus b: autobuses.values()) {
			texto += b.toString() +"\n";
		}
		return texto;
	}
	
	public String  listarAlquileresAutobus(String matricula) throws ExamenExcepcion, FormatoExcepcion {
		Matricula m = new Matricula(matricula);
		
		if (!autobuses.containsKey(m)) {
			throw new ExamenExcepcion("Error matricula no encontrado");
		}
		Autobus a = autobuses.get(m);
		int numeroVeces = 0;
		for (int i = 0; i < alquileres.size(); i++) {
			if (alquileres.get(i).getAutobus().getMatricula() == a.getMatricula()) {
				numeroVeces++;
			}
		}
		String texto = "Autobus: " + matricula + " total alquileres: " + numeroVeces + "\n";
		
		for (int i = 0; i < alquileres.size(); i++) {
			if (alquileres.get(i).getAutobus().getMatricula() == a.getMatricula()) {
				texto += alquileres.get(i).toString() + "Importe: " 
				+ ((alquileres.get(i).getAutobus().getPrecioDia()*alquileres.get(i).getNumDiasAlquiler())
				+(alquileres.get(i).getAutobus().getPrecioKm()*alquileres.get(i).getKms()))+"\n";
			}
		}
		return texto;
	}

	
	public String  listarAlquileresCliente(String nif) throws ExamenExcepcion {
		
		Cliente c1 = new Cliente (nif,"Pruebas");
		
		if (!clientes.contains(c1)) {
			throw new ExamenExcepcion("Error nif no encontrado");
		}
		int numeroVeces = 0;
		for (int i = 0; i < alquileres.size(); i++) {
			if (alquileres.get(i).getNifCliente().compareTo(nif) == 0) {
				numeroVeces++;
			}
		}
		String texto = "Cliente: " + nif + " total alquileres: " + numeroVeces + "\n";
		
		for (int i = 0; i < alquileres.size(); i++) {
			if (alquileres.get(i).getNifCliente().compareTo(nif) == 0) {
				texto += alquileres.get(i).toString() + "Importe: " 
				+ ((alquileres.get(i).getAutobus().getPrecioDia()*alquileres.get(i).getNumDiasAlquiler())
				+(alquileres.get(i).getAutobus().getPrecioKm()*alquileres.get(i).getKms()))+"\n";
			}
		}
		return texto;
	}
	
	public void addAutobus(Autobus a) throws ExamenExcepcion {
		Matricula m = a.getMatricula();
		if (autobuses.containsKey(m)) {
			throw new ExamenExcepcion("Error matricula duplicada");
		}
		autobuses.put(m, a);
		
		
	}
	
	public void addCliente(Cliente c) throws ExamenExcepcion  {
		if (!clientes.add(c)) {
			throw new ExamenExcepcion("Cliente ya añadido previamente");
		}
	}


	
	
}
