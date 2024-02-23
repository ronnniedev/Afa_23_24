package ejercici4;

public class ProductosRefrigerados extends ProductosCongelados{

	protected String organismoSupervisor;

	/**
	 * @param fechaDeCaducidad
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param paisOrigen
	 * @param temperaturaMantenimiento
	 * @param organismoSupervisor
	 */
	public ProductosRefrigerados(String fechaDeCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
			int temperaturaMantenimiento, String organismoSupervisor) {
		super(fechaDeCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.organismoSupervisor = organismoSupervisor;
	}

	/**
	 * @return the organismoSupervisor
	 */
	public String getOrganismoSupervisor() {
		return organismoSupervisor;
	}

	/**
	 * @param organismoSupervisor the organismoSupervisor to set
	 */
	public void setOrganismoSupervisor(String organismoSupervisor) {
		this.organismoSupervisor = organismoSupervisor;
	}

	@Override
	public String toString() {
		return "ProductosRefrigerados [organismoSupervisor=" + organismoSupervisor + ", temperaturaMantenimiento="
				+ temperaturaMantenimiento + ", fechaDeCaducidad=" + fechaDeCaducidad + ", numeroLote=" + numeroLote
				+ ", fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}

	
	
	
	
}
