package ejercicio3;

public class Estudiante extends Persona {

	protected int id;
	private static int contEstudiante = 0;

	public Estudiante(String nombre, String apellidos, String nif, Direccion direccion) {
		super(nombre, apellidos, nif, direccion);
		contEstudiante++;
		this.id = contEstudiante;
	}

	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif
				+ ", direccion=" + direccion + "]";
	}



	@Override
	public void identificate() {
		
		System.out.println("---> Estudiante");
		System.out.println(toString());
		contVeces++;
		
	}

	
	
	
}
