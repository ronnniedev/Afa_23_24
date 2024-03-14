package ficheros;

public class Moto extends Vehiculo {

	protected int cc;
	public Moto(String matricula, int kms,int cc) {
		super(matricula, kms);
		this.cc = cc;
	}
	/**
	 * @return the cc
	 */
	public int getCc() {
		return cc;
	}
	/**
	 * @param cc the cc to set
	 */
	public void setCc(int cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Moto [cc=" + cc + ", matricula=" + matricula + ", kms=" + kms + "]";
	}

	
}
