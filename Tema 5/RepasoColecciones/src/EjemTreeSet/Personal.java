package EjemTreeSet;

public class Personal implements Comparable{
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Personal other=(Personal) o;
		return this.nombre.compareTo(other.nombre);
	}
	
	
	
	
}
