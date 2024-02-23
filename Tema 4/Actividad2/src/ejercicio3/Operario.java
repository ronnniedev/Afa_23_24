package ejercicio3;

public class Operario extends Empleado{

	/**
	 * @param nombre
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return  super.toString() + " -> Operario";
	}
}
