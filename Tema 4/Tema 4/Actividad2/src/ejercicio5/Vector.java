package ejercicio5;

import java.util.Arrays;

public class Vector {

	protected Persona v[];
	protected int numPersonas;

	/**
	 * @param v
	 */
	public Vector() {
		this.v = new Persona[10];
		this.numPersonas = 0;
	}

	@Override
	public String toString() {
		return "Vector [v=" + Arrays.toString(v) + "]";
	}
	
	public void añadirALista (Persona p) {
		numPersonas++;
		for (int i = 0; i < numPersonas; i++) {
			if (v[i] == null) {
				v[i] = p;
			}
		}
		
	}
	
	public void visualizar() {
		
		for (int i = 0; i < numPersonas; i++) {
		System.out.println(v[i].toString());
			
			
		}
		
		
	}
	
	
	
	
	
	
	
}
