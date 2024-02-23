package ejercicio5;

public class Estudiante extends Persona{
	protected int id;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param direccion
	 * @param id
	 */
	public Estudiante(String nombre, String apellidos, String nif, Direccion direccion, int id) {
		super(nombre, apellidos, nif, direccion);
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif
				+ ", direccion=" + direccion + "]";
	}

	
	
}
