package ejercici4;

public class ProductosFrescos {

	protected String fechaDeCaducidad;
	protected int numeroLote;
	protected String fechaEnvasado;
	protected String paisOrigen;
	
	/**
	 * @param fechaDeCaducidad
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param paisOrigen
	 */
	public ProductosFrescos(String fechaDeCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numeroLote = numeroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	/**
	 * @return the fechaDeCaducidad
	 */
	public String getFechaDeCaducidad() {
		return fechaDeCaducidad;
	}

	/**
	 * @param fechaDeCaducidad the fechaDeCaducidad to set
	 */
	public void setFechaDeCaducidad(String fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
	}

	/**
	 * @return the numeroLote
	 */
	public int getNumeroLote() {
		return numeroLote;
	}

	/**
	 * @param numeroLote the numeroLote to set
	 */
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	/**
	 * @return the fechaEnvasado
	 */
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	/**
	 * @param fechaEnvasado the fechaEnvasado to set
	 */
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	/**
	 * @return the paisOrigen
	 */
	public String getPaisOrigen() {
		return paisOrigen;
	}

	/**
	 * @param paisOrigen the paisOrigen to set
	 */
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "ProductosFrescos [fechaDeCaducidad=" + fechaDeCaducidad + ", numeroLote=" + numeroLote
				+ ", fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}
	
	
	
	
}
