package ejercicio4;

public class Computadoras {

	private String marca;
	private int memoria;
	private String iso;
	private int precio;
	
	/** Constructor con 4 parametros para Computadoras
	 * @param marca
	 * @param memoria
	 * @param iso
	 * @param precio
	 */
	public Computadoras(String marca, int memoria, String iso, int precio) {
		this.marca = marca;
		this.memoria = memoria;
		this.iso = iso;
		this.precio = precio;
	}

	/** Metodo toString que enseña los 4 parametros de Computadoras
	 */
	public String toString() {
		return "[marca=" + marca + ", memoria=" + memoria + ", iso=" + iso + ", precio=" + precio + "]";
	}

	/** Metodo get para marca de la clase computadoras
	 */
	public String getMarca() {
		return marca;
	}
	/** Metodo set para marca de la clase computadoras
	 * @param marca : String
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/** Metodo get para memoria de la clase computadoras
	 */
	public int getMemoria() {
		return memoria;
	}
	/** Metodo set para memoria de la clase computadoras
	 * @param memoria : entero
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	/** Metodo get para iso  de la clase computadoras
	 */
	public String getIso() {
		return iso;
	}

	/** Metodo set para iso de la clase computadoras
	 * @param iso : String
	 */
	public void setIso(String iso) {
		this.iso = iso;
	}

	/** Metodo get para precio de la clase computadoras
	 */
	public int getPrecio() {
		return precio;
	}
	
	/** Metodo set para precio de la clase computadoras
	 * @param precio : entero
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
	
	
}
