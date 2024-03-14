package ficheros;

public abstract class Clases {

	protected String fechaInicio;

	/**
	 * @param fechaInicio
	 */
	public Clases(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaInicio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public String toString() {
		return "Clases [fechaInicio=" + fechaInicio + "]";
	}
	
	
	
	
	
}
