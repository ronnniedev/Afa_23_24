package ficheros;

public class Coche extends Vehiculo{
	
	
	protected int numeroPlazas;
	protected String color;
	
	public Coche(String matricula, int kms,int numeroPlazas,String color) {
		super(matricula, kms);
		this.numeroPlazas = numeroPlazas;
		this.color = color;
	}

	/**
	 * @return the numeroPlazas
	 */
	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	/**
	 * @param numeroPlazas the numeroPlazas to set
	 */
	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Coche [numeroPlazas=" + numeroPlazas + ", color=" + color + ", matricula=" + matricula + ", kms=" + kms
				+ "]";
	}
	
	
}
