package ejercicio3;

public class Directivo extends Empleado {

	/**
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
	
}
