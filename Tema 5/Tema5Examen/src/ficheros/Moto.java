package ficheros;

public class Moto extends Vehiculo{
	private int cilindrada;
	
	public Moto(String matricula, int km,int cilindrada) {
		super(matricula, km);
		this.cilindrada = cilindrada;
	}

	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param cilindrada the cilindrada to set
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", matricula=" + matricula + ", km=" + km + "]";
	}

	
	
	
}
