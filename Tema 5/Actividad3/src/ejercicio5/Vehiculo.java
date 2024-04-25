package ejercicio5;

public class Vehiculo {

	private String matricula;
	private String modelo;
	
	
	
	public Vehiculo(String matricula, String modelo) {
		this.matricula = matricula;
		this.modelo = modelo;
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


	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
}
