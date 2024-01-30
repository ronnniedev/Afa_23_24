package ejercicio4ejemplo;

public class Computador {
	private String marca;
	private int cantidadMemoria;
	private String caracteristicasProcesador;
	private String sistemaOperativo;
	private int precio;
	
	/** Metodo get para marca de la clase Computador
	 * @return String
	 */
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCantidadMemoria() {
		return cantidadMemoria;
	}
	public void setCantidadMemoria(int cantidadMemoria) {
		this.cantidadMemoria = cantidadMemoria;
	}
	public String getCaracteristicasProcesador() {
		return caracteristicasProcesador;
	}
	public void setCaracteristicasProcesador(String caracteristicasProcesador) {
		this.caracteristicasProcesador = caracteristicasProcesador;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	/** Metodo get para precio de la clase Computador
	 * @return entero
	 */
	public int getPrecio() {
		return precio;
	}
	
	/** Metodo set para precio de la clase Computador
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Computador(String marca, int cantidadMemoria, String caracteristicasProcesador, String sistemaOperativo,
			int precio) {
		this.marca = marca;
		this.cantidadMemoria = cantidadMemoria;
		this.caracteristicasProcesador = caracteristicasProcesador;
		this.sistemaOperativo = sistemaOperativo;
		this.precio = precio;
	}
	/** Metodo toString de clase Computador
	 */
	public String toString() {
	
		return "Computador [marca=" + marca + ", cantidadMemoria=" + cantidadMemoria + ", caracteristicasProcesador="
				+ caracteristicasProcesador + ", sistemaOperativo=" + sistemaOperativo + ", precio=" + precio + "]";
	}
	
	
	
}
