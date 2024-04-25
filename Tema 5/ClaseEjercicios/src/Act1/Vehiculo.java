package Act1;

public class Vehiculo {
	private Matricula matricula;
	private int km;
	private String marca;
	
	public Vehiculo(String m, int km, String marca) {
		matricula=new Matricula(m);
		this.km=km;
		this.marca=marca;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public int getKm() {
		return km;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula.getValor() + 
				", km=" + km + ", marca=" + marca + "]";
	}
	
	
}
