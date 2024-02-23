package ejercicio3;

public class Empleado {
	private String nombre;
	
	public Empleado() {
		this.nombre = "XXX";
	}

	/**
	 * @param nombre
	 */
	public Empleado(String nombre) {
		
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
	
	
	
	
	
}
