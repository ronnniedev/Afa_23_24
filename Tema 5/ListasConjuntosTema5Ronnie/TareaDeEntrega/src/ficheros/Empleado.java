package ficheros;
/**
 * @author Veronica
 * @version 1.0
 */
public class Empleado extends Persona{

	protected String id;
	private static int NUM_CREACIONES = 0;
	
	/**
	 * Metodo constructor de empleado de 7 parametros
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param telefono
	 * @param correo
	 * @param genero
	 * @param edad
	 */
	public Empleado(String nombre, String apellidos, String nif, int telefono, String correo,Genero genero,
			int edad) {
		super(nombre, apellidos, nif, telefono, correo, genero, edad);
		NUM_CREACIONES++;
		this.id = crearIdentificacion();
		
	}
	/**
	 * Metodo constructor de Empleado de 6 parametros
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param telefono
	 * @param genero
	 * @param edad
	 */
	public Empleado(String nombre, String apellidos, String nif, int telefono,Genero genero,
			int edad) {
		super(nombre, apellidos, nif, telefono, genero, edad);
		NUM_CREACIONES++;
		this.id = crearIdentificacion();
		
	}
	/**
	 * Metodo get de id de clase Empleado
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Metodo set de id de clase Empleado
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Crea una identifacion para Empleado
	 */
	protected String crearIdentificacion() {
		
		return "E" + NUM_CREACIONES;
	}
	
	/**
	 * Metodo toString de 8 parametros
	 * @return String
	 */
	public String toString() {
		return "Empleado " + id + "\nnombre=" + nombre + "\napellidos=" + apellidos + "\nnif=" + nif + "\ntelefono="
				+ telefono + "\ncorreo=" + correo + "\nGenero=" + Genero + "\nedad=" + edad 
				+ "\n-----------------------------------------------------";
	}

	
	
	
	
	
}
