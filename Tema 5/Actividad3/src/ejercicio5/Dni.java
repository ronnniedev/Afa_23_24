package ejercicio5;

import java.util.Objects;

public class Dni {

	private String dni;

	public Dni(String dni) {
		this.dni = dni;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dni other = (Dni) obj;
		return this.dni.compareTo(other.dni) == 0;
	}



	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Dni [dni=" + dni + "]";
	}
	
	
	
	
}
