package ejercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Taller {

	private Map<Matricula,Vehiculo> coches;
	
	public Taller() {
		coches = new HashMap<Matricula,Vehiculo>();
		
	}
	
	public void añadirVehiculo(Vehiculo v) {
		if (coches.containsKey(v.getMatricula()) == true) {
			System.out.println("ERROR matricula ya incluida");
		}else {
			if (v.getMatricula().getValor().compareTo("-1") == 0) {
				System.out.println("Error matricula incorrecta");
			}else {
				coches.put(v.getMatricula(), v);
				System.out.println("Vehiculo añadido");
			}
		
		}
		
		
	}
	
	public void mostrarTaller() {
		for (Vehiculo v: coches.values()) {
			System.out.println(v.toString());
		}
	}
	
	public void mostrarTaller2() {
		
		for (Entry<Matricula, Vehiculo> par:coches.entrySet()) {
			System.out.println("clave: " + par.getKey());
			System.out.println("\tclave: " + par.getValue());
		}
		
	}
}
