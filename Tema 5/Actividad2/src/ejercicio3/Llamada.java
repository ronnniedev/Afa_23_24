package ejercicio3;

import java.util.Scanner;

public abstract class Llamada implements Comparable{
	
	static Scanner keyboard = new Scanner(System.in);
	protected static int ID_BASE = 0;
	protected int id;
	protected String numeroOrigen;
	protected String numeroDestino;
	protected int segundos;
	protected double importe;
	protected String tarifa;
	
	
	public Llamada(String numeroOrigen, String numeroDestino, int segundos) {
		++ID_BASE;
		this.id = ID_BASE;
		this.numeroOrigen = comprobarNumeros(numeroOrigen);
		this.numeroDestino = comprobarNumeros(numeroDestino);
		this.segundos = segundos;
		this.importe = 0;
		this.tarifa = "ERROR";
	}
	
	public String comprobarNumeros (String numero) {
		String texto = null;
		
		while (numero.length() > 9) {
			System.out.println("Numero introducido en llamada " + this.id+ " no valido por favor introduzca el valor de "
								+ "nuevo");
			numero = keyboard.next();
		}
		
		if (numero.length()<=9) {
			texto = numero;
		}
		return texto;
	}

	@Override
	public int compareTo(Object o) {
		return 1;
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
	 * @return the numeroOrigen
	 */
	public String getNumeroOrigen() {
		return numeroOrigen;
	}

	/**
	 * @param numeroOrigen the numeroOrigen to set
	 */
	public void setNumeroOrigen(String numeroOrigen) {
		this.numeroOrigen = numeroOrigen;
	}

	/**
	 * @return the numeroDestino
	 */
	public String getNumeroDestino() {
		return numeroDestino;
	}

	/**
	 * @param numeroDestino the numeroDestino to set
	 */
	public void setNumeroDestino(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	/**
	 * @return the importe
	 */
	abstract double getImporte(double segundos);

	/**
	 * @param importe the importe to set
	 */
	public void setImporte(int importe) {
		this.importe = importe;
	}

	

	@Override
	public String toString() {
		return "Llamada [id=" + id + ", numeroOrigen=" + numeroOrigen + ", numeroDestino=" + numeroDestino
				+ ", segundos=" + segundos + ", importe=" + importe + ", tarifa=" + tarifa + "]";
	}

	double getImporte() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
