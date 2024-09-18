package Modelo;

import Excepciones.ExamenExcepcion;
import Excepciones.FormatoExcepcion;

public class Alquiler {
	private Autobus autobus;
	private String nifCliente;
	private String fechaAlquiler;
	private int numDiasAlquiler;
	private int kms;
	
	public Alquiler(Autobus a, String nifCliente, String fechaAlquiler, int numDiasAlquiler, int km)
	{
		this.autobus = a;
		this.nifCliente = nifCliente;
		this.fechaAlquiler = fechaAlquiler;
		this.numDiasAlquiler = numDiasAlquiler;
		this.kms = km;

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
	 * @return the numDiasAlquiler
	 */
	public int getNumDiasAlquiler() {
		return numDiasAlquiler;
	}



	/**
	 * @param numDiasAlquiler the numDiasAlquiler to set
	 */
	public void setNumDiasAlquiler(int numDiasAlquiler) {
		this.numDiasAlquiler = numDiasAlquiler;
	}



	/**
	 * @return the kms
	 */
	public int getKms() {
		return kms;
	}



	/**
	 * @param kms the kms to set
	 */
	public void setKms(int kms) {
		this.kms = kms;
	}



	public double calcularImporte() {
		return 0.0;
	}



	@Override
	public String toString() {
		return "Alquiler [autobus=" + autobus.getMatricula() + ", nifCliente=" + nifCliente + ", fechaAlquiler=" + fechaAlquiler
				+ ", numDiasAlquiler=" + numDiasAlquiler +"]";
	}

	
	
}
