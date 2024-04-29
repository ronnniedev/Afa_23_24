package EjemListas;

public class Alumno extends Personal {

	private int edad;
	public Alumno(String nombre, int edad) {
		super(nombre);
		this.edad=edad;

	}
	@Override
	public String toString() {
		return "Alumno [nombre="+nombre+" edad=" + edad + "]";
	}

}
