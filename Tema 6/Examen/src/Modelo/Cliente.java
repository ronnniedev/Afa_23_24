package Modelo;

public class Cliente implements Comparable{
	private String nif;
	private String nombre;
	
	public Cliente(String nif, String nombre) {
		this.nif = nif;
		this.nombre = nombre;
	}

	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [nif=" + nif + ", nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Object o) {
		Cliente other =(Cliente) o;
		return this.nif.compareTo(other.getNif());
	}
	
	
	
	
	
	
}
