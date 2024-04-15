package ejercicio3clase;

public abstract class Llamada implements Comparable{

	protected static int CONT_LLAMADAS;
	protected int id;
	protected String numOrigen;
	protected String numDestino;
	protected int duracionSeg;
	
	public Llamada(String numOrigen, String numDestino, int duracionSeg) {
		
		this.id =++CONT_LLAMADAS;
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.duracionSeg = duracionSeg;
	}
	
	public abstract double getImporte();

	@Override
	public int compareTo(Object o) {
		Llamada other= (Llamada) o;
		return id-other.id;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the numOrigen
	 */
	public String getNumOrigen() {
		return numOrigen;
	}

	/**
	 * @param numOrigen the numOrigen to set
	 */
	public void setNumOrigen(String numOrigen) {
		this.numOrigen = numOrigen;
	}

	/**
	 * @return the numDestino
	 */
	public String getNumDestino() {
		return numDestino;
	}

	/**
	 * @param numDestino the numDestino to set
	 */
	public void setNumDestino(String numDestino) {
		this.numDestino = numDestino;
	}

	/**
	 * @return the duracionSeg
	 */
	public int getDuracionSeg() {
		return duracionSeg;
	}

	/**
	 * @param duracionSeg the duracionSeg to set
	 */
	public void setDuracionSeg(int duracionSeg) {
		this.duracionSeg = duracionSeg;
	}

	/**
	 * @return the cONT_LLAMADAS
	 */
	public static int getCONT_LLAMADAS() {
		return CONT_LLAMADAS;
	}

	@Override
	public String toString() {
		return "Llamada [id=" + id + ", numOrigen=" + numOrigen + ", numDestino=" + numDestino + ", duracionSeg="
				+ duracionSeg + "]";
	}

	

	
	
	
	
}
