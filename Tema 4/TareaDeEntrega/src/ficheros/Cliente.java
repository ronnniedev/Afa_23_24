package ficheros;
/**
 * @author Veronica
 * @version 1.0
 */
public class Cliente extends Persona{
	
	protected String id;
	private static int numCreaciones = 0;
	
	/**
	 * Contructos de 7 parametros de la clase Persona
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param telefono
	 * @param correo
	 * @param genero
	 * @param edad
	 */
	public Cliente(String nombre, String apellidos, String nif, int telefono, String correo, Genero genero,
			int edad) {
		super(nombre, apellidos, nif, telefono, correo, genero, edad);
		numCreaciones++;
		this.id = crearIdentificacion();
	}
	
	/**
	 * Metodo constructor de 6 parametros de la clase Cliente
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param telefono
	 * @param genero
	 * @param edad
	 */
	public Cliente(String nombre, String apellidos, String nif, int telefono,Genero genero,
			int edad) {
		super(nombre, apellidos, nif, telefono, genero, edad);
		numCreaciones++;
		this.id = crearIdentificacion();
		
	}
	
	
	
	/**
	 * Metodo get de numCreaciones de clase Cliente
	 * @return the numCreaciones
	 */
	public static int getNumCreaciones() {
		return numCreaciones;
	}

	/**
	 * Metodo get id de la clase Cliente
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Metodo set de id de la clase Persona
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Metodo que le asigna una identificacion a cada objeto de Cliente
	 */
	protected String crearIdentificacion() {
		return "C" + numCreaciones;
	}

	/**
	 * Metodo toString de 8 parametros de la clase Cliente
	 */
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", telefono="
				+ telefono + ", correo=" + correo + ", Genero=" + Genero + ", edad=" + edad + "]";
	}
	
	
	
}
