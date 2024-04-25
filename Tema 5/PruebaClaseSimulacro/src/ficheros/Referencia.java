package ficheros;

import java.util.Objects;

public class Referencia {

	private String estanteria;
	private int piso;
	
	public Referencia(String estanteria, int piso) {
		boolean esCorrecto = true;
		if (piso  > 0) {
			
			this.piso = piso;
			for (int i = 0; i < estanteria.length(); i++) {
				if (Character.isDigit(estanteria.charAt(i))) {
					this.estanteria = "E" + estanteria;
					
				}else {
					esCorrecto = false;
				}
			}
			
		}
		
		if (!esCorrecto) {
			this.estanteria = "-1";
		}
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(estanteria, piso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Referencia other = (Referencia) obj;
		
		return this.estanteria.compareTo(other.estanteria) == 0&& piso == other.piso;
	}
	

	/**
	 * @return the estanteria
	 */
	public String getEstanteria() {
		return estanteria;
	}

	/**
	 * @param estanteria the estanteria to set
	 */
	public void setEstanteria(String estanteria) {
		this.estanteria = estanteria;
	}

	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Referencia  = " +estanteria + "-" + piso + "]";
	}
	
	
	
	
	
}
