package ficheros;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestorApartamentos {

	private Map <Referencia,Apartamento>apartamentos;

	public GestorApartamentos() {
		
		this.apartamentos = new HashMap<Referencia,Apartamento>();
	}
	
	public void añadirApartamento(int piso,char letra,int capacidad,double precio) {
		Referencia r = new Referencia (piso,letra);
		
		if (r.isEsCorrecta()) {
			if (!apartamentos.containsKey(r)) {
				Apartamento a = new Apartamento (r,capacidad,precio);
				apartamentos.put(r, a);
				System.out.println("Añadido con exito");
			}else {
				System.out.println("Error clave duplicada");
			}
			
		}else {
			System.out.println("Referencia incorrecta");
		}
	}
	
	public void mostrarApartamentos() {
		
		for (Apartamento a: apartamentos.values()) {
			System.out.println(a.toString());
		}
		
	}
	
	public void buscarApartamentosPorCapacidad(int capacidad) {
		for (Apartamento a: apartamentos.values()) {
			if (a.getCapacidaMax() >= capacidad) {
				System.out.println(a.toString());
			}
		}
	}

	public void eliminarApartamento(String referencia) {
		Referencia r = null;
		int piso = -1;
		char letra = 'Z';
		boolean pisoEncontrado = false;
		boolean letraEncontrada = false;
		
		
		for (int i = 0; i < referencia.length() ;i++) {
			if (Character.isDigit(referencia.charAt(i))) {
				String pisoString = "" + referencia.charAt(i);
				piso = Integer.parseInt(pisoString);
				pisoEncontrado = true;
			}
			if (i == referencia.length()-1 && comprobarLetra(referencia.charAt(i))) {
				letra = referencia.charAt(i);
				letraEncontrada = true;
			}
		}
		
		if (letraEncontrada && pisoEncontrado) {
			r = new Referencia(piso,letra);
			if (apartamentos.containsKey(r)) {
				apartamentos.remove(r);
			}else {
				System.out.println("ERROR al remover el piso");
			}
		}
		
	}
	
	public boolean comprobarLetra (char letra) {
		
		String letrasAdmitidas = "ABCDEF";
		boolean encontrada = false;
		
		for (int i = 0; i < letrasAdmitidas.length();i++) {
			if (letrasAdmitidas.charAt(i) == letra) {
				encontrada = true;
			}
		}

		return encontrada;
	}

	public void hacerReserva(String referencia,int personas) {
		Referencia r = null;
		int piso = -1;
		char letra = 'Z';
		boolean pisoEncontrado = false;
		boolean letraEncontrada = false;
		
		
		for (int i = 0; i < referencia.length() ;i++) {
			if (Character.isDigit(referencia.charAt(i))) {
				String pisoString = "" + referencia.charAt(i);
				piso = Integer.parseInt(pisoString);
				pisoEncontrado = true;
			}
			if (i == referencia.length()-1 && comprobarLetra(referencia.charAt(i))) {
				letra = referencia.charAt(i);
				letraEncontrada = true;
			}
		}
		System.out.println("");
		r = new Referencia(piso,letra);
		if (letraEncontrada && pisoEncontrado && r.isEsCorrecta()) {
			
			if (apartamentos.containsKey(r)) {
				
					if (apartamentos.get(r).getCapacidaMax() >= personas) {
						
						apartamentos.get(r).setContadorDeReservas(apartamentos.get(r).getContadorDeReservas() +1);
					}else {
						System.out.println("El piso no tiene la capacidad necesaria");
					}
					
				}else {
					System.out.println("Piso no encontrado");
				}
			}else {
				System.out.println("Error , referencia mal formada");
			}
		}

	public void mostrarApartamentosPorPiso(int i) {
		
		for (Apartamento a: apartamentos.values()) {
		
			if (a.getCodRef().getPiso() == i) {
				System.out.println(a.toString());
			}
		}
		
	}

	public void apartamentoConMayorCapacidad() {
		int max = Integer.MIN_VALUE;
		Apartamento contenedor = null;
		
		for (Apartamento a: apartamentos.values()) {
			if (a.getCapacidaMax() > max) {
			
				max = a.getCapacidaMax();
				contenedor = a;
			}
		}
		
		if (contenedor != null) {
			System.out.println(contenedor.toString());
		}
		
		
	}
		
}
