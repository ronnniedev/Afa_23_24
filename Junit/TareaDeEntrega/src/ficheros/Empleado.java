package ficheros;
/**
 * @author Veronica
 * @version 1.0
 */
public class Empleado extends Persona{

	protected String id;
	private static int numCreaciones = 0;
	
	public static int getNumCreaciones() {
		return numCreaciones;
	}
	public static void setNumCreaciones(int numCreaciones) {
		Empleado.numCreaciones = numCreaciones;
	}
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
	public Empleado(String nombre, String apellidos, String nif, int telefono
					, String correo,Genero genero,int edad) {
		super(nombre, apellidos, nif, telefono, correo, genero, edad);
		numCreaciones++;
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
	public Empleado(String nombre, String apellidos, String nif, int telefono,Genero genero
					,int edad) {
		super(nombre, apellidos, nif, telefono, genero, edad);
		numCreaciones++;
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
	 * @return String
	 */
	protected String crearIdentificacion() {
		
		return "E" + numCreaciones;
	}
	
	/**
	 * Metodo toString de 8 parametros
	 * @return String
	 */
	public String toString() {
		return "Empleado " + id + "\n  nombre=" + nombre + "\n  apellidos=" + apellidos 
				+ "\n  nif=" + nif + "\n  telefono="+ telefono + "\n  correo=" + correo 
				+ "\n  Genero=" + Genero + "\n  edad=" + edad + "\n------------------------"
				+ "-----------------------------";
	}

	
	
	
	
	
}
