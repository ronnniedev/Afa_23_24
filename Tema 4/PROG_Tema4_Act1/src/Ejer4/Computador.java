package Ejer4;

public class Computador {
	private String marca;
	private int cantidadMemoria;
	private String caracteristicasProcesador;
	private String sistemaOperativo;
	private double precio;
	/**
	 * @param marca
	 * @param cantidadMemoria
	 * @param caracteristicasProcesador
	 * @param sistemaOperativo
	 * @param precio
	 */
	public Computador(String marca, 
			          int cantidadMemoria, 
			          String caracteristicasProcesador, 
			          String sistemaOperativo,
			double precio) {
		this.marca = marca;
		this.cantidadMemoria = cantidadMemoria;
		this.caracteristicasProcesador = caracteristicasProcesador;
		this.sistemaOperativo = sistemaOperativo;
		this.precio = precio;
	}
	/**
	 * metodo get del traibuto marca
	 * @return string
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * metodo set del atributo marca
	 * @param string
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * metodo ges del atirbuto cantidad de memoria
	 * @return int
	 */
	public int getCantidadMemoria() {
		return cantidadMemoria;
	}
	/**
	 * metodo set del atributo cantidad de memoria
	 * @param int
	 */
	public void setCantidadMemoria(int cantidadMemoria) {
		this.cantidadMemoria = cantidadMemoria;
	}
	/**
	 * metodo get del atributo caracteristicas del procesador
	 * @return String
	 */
	public String getCaracteristicasProcesador() {
		return caracteristicasProcesador;
	}
	/**
	 * Metodo set del atributo caracteristicas
	 * @param String 
	 */
	public void setCaracteristicasProcesador(String caracteristicasProcesador) {
		this.caracteristicasProcesador = caracteristicasProcesador;
	}
	/**
	 * metodo get del atributo SO
	 * @return String
	 */
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	/**
	 * metodo set del atributo SO
	 * @param String
	 */
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	/**
	 * metodo get del atributo precio
	 * @return real
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * metodo set del atributo precio
	 * @param real
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Computador [marca=" + marca + ", cantidadMemoria=" + cantidadMemoria + ", caracteristicasProcesador="
				+ caracteristicasProcesador + ", sistemaOperativo=" + sistemaOperativo + ", precio=" + precio + "]";
	}
	
	
	
	
}
