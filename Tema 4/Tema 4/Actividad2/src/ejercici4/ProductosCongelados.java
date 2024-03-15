package ejercici4;

public class ProductosCongelados extends ProductosFrescos{
	
	protected int temperaturaMantenimiento;

	/**
	 * @param fechaDeCaducidad
	 * @param numeroLote
	 * @param fechaEnvasado
	 * @param paisOrigen
	 * @param temperaturaMantenimiento
	 */
	public ProductosCongelados(String fechaDeCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
			int temperaturaMantenimiento) {
		
		super(fechaDeCaducidad, numeroLote, fechaEnvasado, paisOrigen);
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	/**
	 * @return the temperaturaMantenimiento
	 */
	public int getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}

	/**
	 * @param temperaturaMantenimiento the temperaturaMantenimiento to set
	 */
	public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	@Override
	public String toString() {
		return "ProductosCongelados [temperaturaMantenimiento=" + temperaturaMantenimiento + ", fechaDeCaducidad="
				+ fechaDeCaducidad + ", numeroLote=" + numeroLote + ", fechaEnvasado=" + fechaEnvasado + ", paisOrigen="
				+ paisOrigen + "]";
	}
	
	
	
	
	
	
}
