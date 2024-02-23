package ejercicio5;

public class Direccion {

	protected String calle;
	protected String ciudad;
	protected int codigoPostal;
	protected String pais;
	
	/**
	 * @param calle
	 * @param ciudad
	 * @param codigoPostal
	 * @param pais
	 */
	public Direccion(String calle, String ciudad, int codigoPostal, String pais) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}

	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the codigoPostal
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "---->Direccion calle=" + calle + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + ", pais=" + pais
				+ "]";
	}
	
	
	
	
}
