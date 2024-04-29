package EjemHashSet;

import java.util.Objects;

public class Personal{
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
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Personal other = (Personal) obj;
		return nombre.compareTo(other.nombre)==0;
	}


	
	
	
	
}
