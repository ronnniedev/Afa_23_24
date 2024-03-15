package ejercicio3;

public class Tecnico extends Operario {

	/**
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}
