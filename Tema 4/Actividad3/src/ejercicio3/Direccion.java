package ejercicio3;

public class Direccion {
	protected String calle;
	protected String ciudad;
	protected int codigoPostal;
	protected String pais;
	
	public Direccion(String calle, String ciudad, int codigoPostal, String pais) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + ", pais=" + pais
				+ "]";
	}
	
	
	
	
}
