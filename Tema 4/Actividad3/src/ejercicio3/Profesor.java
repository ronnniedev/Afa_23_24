package ejercicio3;

public class Profesor extends Persona {

	protected String despacho;
	
	public Profesor(String nombre, String apellidos, String nif, Direccion direccion, String despacho) {
		super(nombre, apellidos, nif, direccion);
		this.despacho = despacho;
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



	@Override
	public void identificate() {
		
		System.out.println("Profesor: " + this.despacho);
		System.out.println(this.toString());
		contVeces++;
	}

	
	
	
	
	
}
