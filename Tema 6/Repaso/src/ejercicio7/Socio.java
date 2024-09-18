package ejercicio7;

public class Socio implements Comparable{
	
	private String nif;
	private String nombre;
	private String apellidos;
	private static int NUMERO_SOCIOS= 1;
	private int numeroSocio;
	private String codigoPostal;
	
	
	public Socio(String nif, String nombre, String apellidos, String codigoPostal) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroSocio = NUMERO_SOCIOS;
		this.codigoPostal = codigoPostal;
		NUMERO_SOCIOS++;
	}
	
	
	public Socio(String nif) {
		this.nif = nif;
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
	public int getNumeroSocio() {
		return numeroSocio;
	}
	/**
	 * @param numeroSocio the numeroSocio to set
	 */
	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}
	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	@Override
	public int compareTo(Object o) {
		Socio other = (Socio) o;
		return this.nif.compareTo(other.getNif());
	}
	@Override
	public String toString() {
		return "Socio [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", numeroSocio=" + numeroSocio
				+ ", codigoPostal=" + codigoPostal + "]";
	}
	
	
	
	

}
