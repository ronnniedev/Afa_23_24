package ficheros;

public class Vehiculo {
	protected Matricula matricula;
	protected int km;
	
	
	public Vehiculo(String matricula, int km) {
		Matricula m = new Matricula(matricula);
		this.matricula = m;
		this.km = km;
	}


	/**
	 * @return the matricula
	 */
	public Matricula getMatricula() {
		return matricula;
	}


	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}


	/**
	 * @return the km
	 */
	public int getKm() {
		return km;
	}


	/**
	 * @param km the km to set
	 */
	public void setKm(int km) {
		this.km = km;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", km=" + km + "]";
	}
	
	
	
	
	

}
