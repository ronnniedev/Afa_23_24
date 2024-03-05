package ejercicio3;

public class Colegio {
	
	private Persona v[];
	
	public Colegio() {
		v=null;
	}
	
	public void insertarPersona(Persona p) {
		if (v==null) {
			v = new Persona[1];
			v[0]=p;
		}else {
			int newTam = v.length +1;
			Persona vNuevo[] = new Persona[newTam];
			for (int i = 0; i < v.length; i++) {
				vNuevo[i] = v[i];
				
			}
			vNuevo[v.length] = p;
			v = vNuevo;
			
			
		}
	}
	
	public void listarColegio() {
		for (int i = 0; i < v.length; i++) {
			v[i].identificate();
		}
		
		
	}

}
