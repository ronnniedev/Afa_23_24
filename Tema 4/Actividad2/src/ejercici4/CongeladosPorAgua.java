package ejercici4;

public class CongeladosPorAgua extends ProductosCongelados{
	protected int gramosPorLitro;

	/**
	 * @param fechaDeCaducidad
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param paisOrigen
	 * @param temperaturaMantenimiento
	 * @param gramosPorLitro
	 */
	public CongeladosPorAgua(String fechaDeCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
			int temperaturaMantenimiento, int gramosPorLitro) {
		super(fechaDeCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
		this.gramosPorLitro = gramosPorLitro;
	}

	/**
	 * @return the gramosPorLitro
	 */
	public int getGramosPorLitro() {
		return gramosPorLitro;
	}

	/**
	 * @param gramosPorLitro the gramosPorLitro to set
	 */
	public void setGramosPorLitro(int gramosPorLitro) {
		this.gramosPorLitro = gramosPorLitro;
	}

	@Override
	public String toString() {
		return "CongeladosPorAgua [gramosPorLitro=" + gramosPorLitro + ", temperaturaMantenimiento="
				+ temperaturaMantenimiento + ", fechaDeCaducidad=" + fechaDeCaducidad + ", numeroLote=" + numeroLote
				+ ", fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}
	
	
}
