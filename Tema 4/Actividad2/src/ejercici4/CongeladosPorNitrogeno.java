package ejercici4;

public class CongeladosPorNitrogeno extends ProductosCongelados{

	protected String metodo;
	protected int minExposicion;
	
	
	/**
	 * @param fechaDeCaducidad
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param paisOrigen
	 * @param temperaturaMantenimiento
	 * @param metodo
	 * @param minExposicion
	 */
	public CongeladosPorNitrogeno(String fechaDeCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
			int temperaturaMantenimiento, String metodo, int minExposicion) {
		super(fechaDeCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.metodo = metodo;
		this.minExposicion = minExposicion;
	}


	/**
	 * @return the metodo
	 */
	public String getMetodo() {
		return metodo;
	}


	/**
	 * @param metodo the metodo to set
	 */
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}


	/**
	 * @return the minExposicion
	 */
	public int getMinExposicion() {
		return minExposicion;
	}


	/**
	 * @param minExposicion the minExposicion to set
	 */
	public void setMinExposicion(int minExposicion) {
		this.minExposicion = minExposicion;
	}


	@Override
	public String toString() {
		return "CongeladosPorNitrogeno [metodo=" + metodo + ", minExposicion=" + minExposicion
				+ ", temperaturaMantenimiento=" + temperaturaMantenimiento + ", fechaDeCaducidad=" + fechaDeCaducidad
				+ ", numeroLote=" + numeroLote + ", fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen
				+ "]";
	}
	
	
	
}
