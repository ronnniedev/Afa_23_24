package ficheros;

public class Alquiler {
	
	private Autobus autobus;
	private String nifCliente;
	private String fechaAlquiler;
	private int diasAlquiler;
	private int kilometrosRecorridos;
	
	
	public Alquiler(Autobus autobus, String nifCliente, String fechaAlquiler, int diasAlquiler,
			int kilometrosRecorridos) {
		this.autobus = autobus;
		this.nifCliente = nifCliente;
		this.fechaAlquiler = fechaAlquiler;
		this.diasAlquiler = diasAlquiler;
		this.kilometrosRecorridos = kilometrosRecorridos;
	}


	/**
	 * @return the autobus
	 */
	public Autobus getAutobus() {
		return autobus;
	}


	/**
	 * @param autobus the autobus to set
	 */
	public void setAutobus(Autobus autobus) {
		this.autobus = autobus;
	}


	/**
	 * @return the nifCliente
	 */
	public String getNifCliente() {
		return nifCliente;
	}


	/**
	 * @param nifCliente the nifCliente to set
	 */
	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}


	/**
	 * @return the fechaAlquiler
	 */
	public String getFechaAlquiler() {
		return fechaAlquiler;
	}


	/**
	 * @param fechaAlquiler the fechaAlquiler to set
	 */
	public void setFechaAlquiler(String fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}


	/**
	 * @return the diasAlquiler
	 */
	public int getDiasAlquiler() {
		return diasAlquiler;
	}


	/**
	 * @param diasAlquiler the diasAlquiler to set
	 */
	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}


	/**
	 * @return the kilometrosRecorridos
	 */
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}


	/**
	 * @param kilometrosRecorridos the kilometrosRecorridos to set
	 */
	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}


	@Override
	public String toString() {
		return "Alquiler [autobus=" + autobus + ", nifCliente=" + nifCliente + ", fechaAlquiler=" + fechaAlquiler
				+ ", diasAlquiler=" + diasAlquiler + ", kilometrosRecorridos=" + kilometrosRecorridos + "]";
	}
	
	

}
