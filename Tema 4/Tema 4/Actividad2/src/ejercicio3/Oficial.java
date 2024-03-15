package ejercicio3;

public class Oficial extends Operario{
	
	/**
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
