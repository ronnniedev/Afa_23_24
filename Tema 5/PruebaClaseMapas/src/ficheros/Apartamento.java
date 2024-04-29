package ficheros;

public class Apartamento {

	private Referencia codRef;
	private int capacidaMax;
	private double precio;
	private int contadorDeReservas;
	
	public Apartamento(Referencia codRef, int capacidaMax, double precio) {
		this.codRef = codRef;
		this.capacidaMax = capacidaMax;
		this.precio = precio;
		this.contadorDeReservas = 0;
	}

	/**
	 * @return the codRef
	 */
	public Referencia getCodRef() {
		return codRef;
	}

	/**
	 * @param codRef the codRef to set
	 */
	public void setCodRef(Referencia codRef) {
		this.codRef = codRef;
	}

	/**
	 * @return the capacidaMax
	 */
	public int getCapacidaMax() {
		return capacidaMax;
	}

	/**
	 * @param capacidaMax the capacidaMax to set
	 */
	public void setCapacidaMax(int capacidaMax) {
		this.capacidaMax = capacidaMax;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the contadorDeReservas
	 */
	public int getContadorDeReservas() {
		return contadorDeReservas;
	}

	/**
	 * @param contadorDeReservas the contadorDeReservas to set
	 */
	public void setContadorDeReservas(int contadorDeReservas) {
		this.contadorDeReservas = contadorDeReservas;
	}

	@Override
	public String toString() {
		return "Apartamento [Ref=Piso"+ codRef.getPiso() + "-Letra" +codRef.getLetra()+ ", capacidaMax=" + capacidaMax 
				+ ", precio=" + precio+ ", contadorDeReservas=" + contadorDeReservas + "]";
	}
	
	
	
	
	
}
