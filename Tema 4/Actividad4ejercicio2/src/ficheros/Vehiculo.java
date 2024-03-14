package ficheros;

public abstract class Vehiculo {

	protected String matricula;
	protected int kms;
	/**
	 * @param matricula
	 * @param kms
	 */
	public Vehiculo(String matricula, int kms) {
		super();
		this.matricula = matricula;
		this.kms = kms;
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
	 * @return the kms
	 */
	public int getKms() {
		return kms;
	}
	/**
	 * @param kms the kms to set
	 */
	public void setKms(int kms) {
		this.kms = kms;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", kms=" + kms + "]";
	}
	
	
}
