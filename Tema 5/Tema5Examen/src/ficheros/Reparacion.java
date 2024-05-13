package ficheros;

public class Reparacion {

	private static int NUM_VECES;
	private int codReparacion;
	private String dni;
	private Matricula matricula;
	private String fecha;
	
	public Reparacion(String dni, Matricula matricula, String fecha) {
		NUM_VECES++;
		this.codReparacion = NUM_VECES;
		this.dni = dni;
		this.matricula = matricula;
		this.fecha = fecha;
	}

	/**
	 * @return the codReparacion
	 */
	public int getCodReparacion() {
		return codReparacion;
	}

	/**
	 * @param codReparacion the codReparacion to set
	 */
	public void setCodReparacion(int codReparacion) {
		this.codReparacion = codReparacion;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the matricula
	 */
	public Matricula getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Reparacion [codReparacion=" + codReparacion + ", dni=" + dni + ", matricula=" + matricula + ", fecha="
				+ fecha + "]";
	}
	
	
	
	
	
	
}
