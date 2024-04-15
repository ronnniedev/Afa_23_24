package ejercicio1;

public class Reserva {

	private Cliente c;
	private Habitacion h;
	private String fechaIngreso;
	private int diasEstancia;
	
	public Reserva(Cliente c, Habitacion h, String fechaIngreso, int diasEstancia) {
		this.c = c;
		this.h = h;
		this.fechaIngreso = fechaIngreso;
		this.diasEstancia = diasEstancia;
	}

	/**
	 * @return the c
	 */
	public Cliente getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(Cliente c) {
		this.c = c;
	}

	/**
	 * @return the h
	 */
	public Habitacion getH() {
		return h;
	}

	/**
	 * @param h the h to set
	 */
	public void setH(Habitacion h) {
		this.h = h;
	}

	/**
	 * @return the fechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the diasEstancia
	 */
	public int getDiasEstancia() {
		return diasEstancia;
	}

	/**
	 * @param diasEstancia the diasEstancia to set
	 */
	public void setDiasEstancia(int diasEstancia) {
		this.diasEstancia = diasEstancia;
	}

	@Override
	public String toString() {
		return "\nReserva [\nc=" + c + ", \nh=" + h + ", \nfechaIngreso=" + fechaIngreso + ", diasEstancia=" + diasEstancia
				+ "]";
	}
	
	
	
}
