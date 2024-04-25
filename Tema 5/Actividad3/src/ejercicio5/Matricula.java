package ejercicio5;

import java.util.Objects;

public class Matricula {

	private String matricula;

	public Matricula(String matricula) {
		this.matricula = matricula;
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
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		return this.matricula.compareTo(other.matricula)==0;
	}

	@Override
	public String toString() {
		return "Matricula [matricula=" + matricula + "]";
	}
	
	
	
	
}
