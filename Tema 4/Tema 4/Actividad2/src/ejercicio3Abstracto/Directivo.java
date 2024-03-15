package ejercicio3Abstracto;

public class Directivo extends Empleado{

	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public void categoria() {
		System.out.print("Directivo ---> " + super.toString() + "\n");
		
	}
	public String mostrarNombre () {
		return toString();
	}
	
	
}
