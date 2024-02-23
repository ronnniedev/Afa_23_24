package ejercici4;

public class CongeladosPorAire extends ProductosCongelados{

	protected int porcentajeNitrogeno;
	protected int porcentajeOxigeno;
	protected int porcentajeCarbono;
	protected int porcentajeVapor;
	
	/**
	 * @param fechaDeCaducidad
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param paisOrigen
	 * @param temperaturaMantenimiento
	 * @param porcentajeNitrogeno
	 * @param porcentajeOxigeno
	 * @param porcentajeCarbono
	 * @param porcentajeVapor
	 */
	public CongeladosPorAire(String fechaDeCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
			int temperaturaMantenimiento, int porcentajeNitrogeno, int porcentajeOxigeno, int porcentajeCarbono,
			int porcentajeVapor) {
		super(fechaDeCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeOxigeno = porcentajeOxigeno;
		this.porcentajeCarbono = porcentajeCarbono;
		this.porcentajeVapor = porcentajeVapor;
	}

	/**
	 * @return the porcentajeNitrogeno
	 */
	public int getPorcentajeNitrogeno() {
		return porcentajeNitrogeno;
	}

	/**
	 * @param porcentajeNitrogeno the porcentajeNitrogeno to set
	 */
	public void setPorcentajeNitrogeno(int porcentajeNitrogeno) {
		this.porcentajeNitrogeno = porcentajeNitrogeno;
	}

	/**
	 * @return the porcentajeOxigeno
	 */
	public int getPorcentajeOxigeno() {
		return porcentajeOxigeno;
	}

	/**
	 * @param porcentajeOxigeno the porcentajeOxigeno to set
	 */
	public void setPorcentajeOxigeno(int porcentajeOxigeno) {
		this.porcentajeOxigeno = porcentajeOxigeno;
	}

	/**
	 * @return the porcentajeCarbono
	 */
	public int getPorcentajeCarbono() {
		return porcentajeCarbono;
	}

	/**
	 * @param porcentajeCarbono the porcentajeCarbono to set
	 */
	public void setPorcentajeCarbono(int porcentajeCarbono) {
		this.porcentajeCarbono = porcentajeCarbono;
	}

	/**
	 * @return the porcentajeVapor
	 */
	public int getPorcentajeVapor() {
		return porcentajeVapor;
	}

	/**
	 * @param porcentajeVapor the porcentajeVapor to set
	 */
	public void setPorcentajeVapor(int porcentajeVapor) {
		this.porcentajeVapor = porcentajeVapor;
	}

	@Override
	public String toString() {
		return "CongeladosPorAire [porcentajeNitrogeno=" + porcentajeNitrogeno + ", porcentajeOxigeno="
				+ porcentajeOxigeno + ", porcentajeCarbono=" + porcentajeCarbono + ", porcentajeVapor="
				+ porcentajeVapor + ", temperaturaMantenimiento=" + temperaturaMantenimiento + ", fechaDeCaducidad="
				+ fechaDeCaducidad + ", numeroLote=" + numeroLote + ", fechaEnvasado=" + fechaEnvasado + ", paisOrigen="
				+ paisOrigen + "]";
	}

	
	
	
}
