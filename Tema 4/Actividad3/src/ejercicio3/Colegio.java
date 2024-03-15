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
	
	public Persona buscarPersona(String nif) {
		for (int i = 0; i < v.length; i++) {
			Persona p = v[i];
			if (p.getNif().compareTo(nif)==0) {
				return p;
			}
		}
		return null;
	}
	
	public int borrarPersona(String nif) {
		int pos = -1;
		for (int i = 0; i < v.length; i++) {
			Persona p = v[i];
			if (p.getNif().compareTo(nif)==0) {
				pos = i;
			}
		}
		System.out.println(pos);
		if (pos != -1) {
			int nuevoTam= v.length -1;
			Persona vNuevo[] = new Persona[nuevoTam];
			for (int i = 0; i < pos; i++) {
				vNuevo[i] = v[i];
				
			}
			for (int i = pos+1; i < v.length; i++) {
				vNuevo[i-1]=v[i];
			}
			v = vNuevo;
			
		}
		return  pos;
	}
	
	public void listarColegio() {
		for (int i = 0; i < v.length; i++) {
			v[i].identificate();
		}
		
		
	}

}
