package ejercicio6Clase;

import java.util.Objects;

public class Socio {

	private String nombre;
	private String nif;
	private String apellidos;
	private String numeroSocio;
	private String codigoPostal;
	
	public Socio(String nombre, String nif, String apellidos, String numeroSocio, String codigoPostal) {
		this.nombre = nombre;
		this.nif = nif;
		this.apellidos = apellidos;
		this.numeroSocio = numeroSocio;
		this.codigoPostal = codigoPostal;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the numeroSocio
	 */
	public String getNumeroSocio() {
		return numeroSocio;
	}

	/**
	 * @param numeroSocio the numeroSocio to set
	 */
	public void setNumeroSocio(String numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return this.nif.compareTo(other.getNif()) == 0;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", nif=" + nif + ", apellidos=" + apellidos + ", numeroSocio=" + numeroSocio
				+ ", codigoPostal=" + codigoPostal + "]";
	}
	
	
	
	
}
