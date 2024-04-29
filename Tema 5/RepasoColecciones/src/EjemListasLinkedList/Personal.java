package EjemListasLinkedList;

public class Personal {
	protected String nombre;

	public Personal(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Personal [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
