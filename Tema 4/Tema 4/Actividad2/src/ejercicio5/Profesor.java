package ejercicio5;

public class Profesor extends Persona{

	protected String despacho;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param direccion
	 * @param despacho
	 */
	public Profesor(String nombre, String apellidos, String nif, Direccion direccion, String despacho) {
		super(nombre, apellidos, nif, direccion);
		this.despacho = despacho;
	}
	public Profesor(String nombre, String apellidos, String nif, Direccion direccion) {
		super(nombre, apellidos, nif, direccion);
	}
	/**
	 * @return the despacho
	 */
	public String getDespacho() {
		return despacho;
	}
	/**
	 * @param despacho the despacho to set
	 */
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	@Override
	public String toString() {
		return "Profesor [despacho=" + despacho + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif
				+ ", direccion=" + direccion + "]";
	}
	

	
	
	
	
}
