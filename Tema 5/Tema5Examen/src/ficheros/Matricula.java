package ficheros;

import java.util.Objects;

public class Matricula {
	private String matricula;

	public Matricula(String matricula) {
		this.matricula = comprobarMatricula(matricula);
	}
	
	public String comprobarMatricula(String newMat) {
		String texto = null;
		boolean esCorrecto = true;
		
		if (newMat.length() == 9) {
				if (Character.isDigit(newMat.charAt(0)) || newMat.charAt(1)== '-' == false 
					|| newMat.charAt(6)== '-' == false) {
					
					esCorrecto = false;
				}else {
					for (int i = 2; i < 6; i++) {
						if (!Character.isDigit(newMat.charAt(i))) {
							
							esCorrecto = false;
						}
					}
					for (int i = 7; i < newMat.length(); i++) {
						if (Character.isDigit(newMat.charAt(i))) {

							esCorrecto = false;
						}
					}
					
				}
		}else {
			esCorrecto = false;
		}
		
		if (esCorrecto) {
			texto = newMat;
		}
		
		return texto;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Matricula other = (Matricula) obj;
		return this.matricula.compareTo(other.matricula) == 0;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Matricula [matricula=" + matricula + "]";
	}

	
}
