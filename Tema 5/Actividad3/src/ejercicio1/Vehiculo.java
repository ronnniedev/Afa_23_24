package ejercicio1;

public class Vehiculo {

	private Matricula matricula;
	private int km;
	private String modelo;
	
	public Vehiculo(String matValor,int km,String modelo) {
		matricula = new Matricula(matValor);
		this.km = km;
		this.modelo = modelo;
		
	}
	
	

	/**
	 * @return the matricula
	 */
	public Matricula getMatricula() {
		return matricula;
	}



	/**
	 * @return the km
	 */
	public int getKm() {
		return km;
	}



	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}



	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula 
				+ ", km=" + km + ", modelo=" + modelo + "]";
	}
	
	
	
}
