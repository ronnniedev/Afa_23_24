package ejercicio7Clase;

public class Reparacion {

	private static int CONTADOR=0;
	private int codRep;
	private String dni;
	private Matricula m;
	private String fecha;
	
	public Reparacion(String dni, Matricula m, String fecha) {
		CONTADOR++;
		this.codRep = CONTADOR;
		this.dni = dni;
		this.m = m;
		this.fecha = fecha;
	}

	/**
	 * @return the codRep
	 */
	public int getCodRep() {
		return codRep;
	}

	/**
	 * @param codRep the codRep to set
	 */
	public void setCodRep(int codRep) {
		this.codRep = codRep;
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
	 * @return the m
	 */
	public Matricula getM() {
		return m;
	}

	/**
	 * @param m the m to set
	 */
	public void setM(Matricula m) {
		this.m = m;
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
		return "Reparacion [codRep=" + codRep + ", dni=" + dni + ", m=" + m + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
