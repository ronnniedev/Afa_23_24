package ejemploclase2;



public class PersonaTree implements Comparable{
	private String nombre;
	private int cod;
	
	public PersonaTree(String nombre, int cod) {
		this.nombre = nombre;
		this.cod = cod;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cod=" + cod + "]";
	}
	public int compareTo(Object obj) {
		PersonaTree p = (PersonaTree) obj;
		if(cod==p.cod) return 0;
		if(cod<p.cod) return -1;
		return 1;
		
	}
	
	
}
