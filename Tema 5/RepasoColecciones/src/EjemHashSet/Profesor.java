package EjemHashSet;

public class Profesor extends Personal {

	private double sueldo;
	public Profesor(String nombre, double sueldo) {
		super(nombre);
		this.sueldo=sueldo;
	}
	@Override
	public String toString() {
		return "Profesor [nombre="+nombre+" sueldo=" + sueldo + "]";
	}

}
