package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Cola {

	protected List<Persona> espectadores;

	public Cola() {
		
		this.espectadores = new ArrayList<Persona>();
		
	}
	
	public void añadirPersona(Persona p) {
		
		espectadores.add(p);
		
	}
	
	public Persona sacarPersona() {
		
		Persona carrier = null;
		
		if (espectadores.size() == 0) {
			System.out.println("La cola esta vacia");
			
		}else {
			carrier = espectadores.get(0);
			espectadores.remove(0);
			
		}
		
		return carrier;
	}
	
	public void mostrarEspectadores() {
		System.out.println("------Espectadores en cola------");
		
		for (int i = 0; i < espectadores.size(); i++) {
			Persona p = espectadores.get(i);
			System.out.println(p.toString());		
			
		}
		
	}
	
	
}
