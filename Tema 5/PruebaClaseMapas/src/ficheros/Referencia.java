package ficheros;

import java.util.Objects;

public class Referencia {

	private int piso;
	private char letra;
	private boolean esCorrecta;
	
	
	public Referencia(int piso, char letra) {
		this.esCorrecta = true;
		
		if (piso < 1 || piso > 5) {
			this.esCorrecta = false;
		}else {
			this.piso = piso;
		}
		String letrasAdmitidas = "ABCDEF";
		
		
		boolean encontrada = false;
		
		for (int i = 0; i < letrasAdmitidas.length();i++) {
			if (letrasAdmitidas.charAt(i) == letra) {
				encontrada = true;
			}
		}
		if (!encontrada) {
			this.esCorrecta = false;
		}else {
			this.letra = letra;
		}
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(letra, piso);
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
		return letra == other.letra && piso == other.piso;
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


	/**
	 * @return the letra
	 */
	public char getLetra() {
		return letra;
	}


	/**
	 * @param letra the letra to set
	 */
	public void setLetra(char letra) {
		this.letra = letra;
	}


	/**
	 * @return the esCorrecta
	 */
	public boolean isEsCorrecta() {
		return esCorrecta;
	}


	/**
	 * @param esCorrecta the esCorrecta to set
	 */
	public void setEsCorrecta(boolean esCorrecta) {
		this.esCorrecta = esCorrecta;
	}
	
	
	
	
	
}
