package Ficheros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Empresa {
	private Set<Paquete> paquetes;
	private Set<Vehiculo> vehiculos;
	private static int NUM_PAQUETES = 0;
	private static int NUM_VEHICULOS = 0;

	
	public Empresa() {
		paquetes = new HashSet<Paquete>();
		vehiculos = new TreeSet<Vehiculo>();

	}
	
	// añade un paquete al conjunto siempre que cumpla que 
	// no existe un paquete con el mismo codigo ya incluido
	public void añadirPaquete(Paquete p) {
		boolean resultado = paquetes.add(p);
		if (resultado == true) {
			System.out.println("Paquete " + p.getCodigo() + " insertado correctamente");
			NUM_PAQUETES++;
		}else {
			System.out.println("Paquete no introducido");
		}
	}
	
	// añade un vehiculo al conjunto siempre que cumpla que 
	// no existe un vehiculo con la misma matricula ya incluido
	public void añadirVehiculo(Vehiculo v) {
		boolean resultado = vehiculos.add(v);
		if (resultado == true) {
			System.out.println("Paquete " + v.getMatricula()+ " insertado correctamente");
			NUM_VEHICULOS++;
		}else {
			System.out.println("Paquete no introducido");
		}
	}

	// metodo que muestra el numero total de paquetes asi 
	// como el detalle de cada uno de ellos
	public void mostrarPaquetes() {
		System.out.println("Numero de paquetes :" + NUM_PAQUETES);
		
		for (Paquete p : paquetes) {
			
			System.out.print(p.toString());
		}
	}
	

	// metodo que muestra el numero total de vehiculos asi 
	// como el detalle de cada uno de ellos

	public void mostrarVehiculos() {
		System.out.println("*****************************");
		System.out.println("Numero de vehiculos :" + NUM_VEHICULOS);
		
		for (Vehiculo v: vehiculos) {
			
			System.out.println(v.mostrarVehiculo());
		}
	}
	


	/* metodo que recibe los cps del dia a repartir entre los 
	vehiculos
	Pasos:
		Para cada cp
		    buscar vehiculo disponible ( sin asignación de cp)
		    Añadir todos los paquetes que tengas el cp seleccionado
   */
	public void repartirPaquetes(int cps[]) {
	int cont = -1;
		
	for (Vehiculo v: vehiculos) {
		cont++;
		if(v.getCpAsignado() == -1) {
			for (Paquete p: paquetes) {
				if (cont < cps.length) {
					if (p.getCp() == cps[cont]) {
						v.añadirPaquete(p);
					}
				}
				
				}
				
			}
		}
		
	}
	
	
	
	/* muestra el conjunto de vehiculos y la distribución
	 * de los paquetes asignados 
	 */
	public void mostrarReparto() {
		System.out.println("Reparto:\n");
		for (Vehiculo v: vehiculos) {
			System.out.println(v.mostrarVehiculo());
		}
		
	}
	
}
