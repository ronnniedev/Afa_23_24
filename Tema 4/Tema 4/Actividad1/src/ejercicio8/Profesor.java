package ejercicio8;

public class Profesor {

	

	private String nombre;
	private String apellidos;
	private String domicilio;
	private String email;
	private int numAsignaturas;
	
	/** Constructor con 4 parametros para Profesor
	 * @param nombre : String
	 * @param apellidos : String
	 * @param domicilio : String
	 * @param email : String
	 */
	public Profesor(String nombre, String apellidos, String domicilio, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.email = email;
		this.numAsignaturas = 0;
	}
	/** Metodo get para nombre de la clase Profesor
	 */
	public String getNombre() {
		if (nombre == null) {
			return "ninguno";
		}else {
			return nombre;
		}
		
		
	}
	/** Metodo que contabiliza el numero de asignaturas que tiene un profesor 
	 * 
	 */
	public void añadirAsignaturas () {
		
		if (numAsignaturas == 6) {
			System.out.println("Este profesor no pede impartir mas asignaturas");
		}else {
			numAsignaturas++;
		}
	}
	/** Metodo que comprueba si un profesor tiene 0 asignaturas asignadas, si es asi lo borra 
	 * 
	 */
	public void comprobar () {
		
		if (this.numAsignaturas == 0) {
			System.out.println("Profesor " + getNombre() + " no tiene asignaturas asiganadas, sera borrado" );
			
			this.nombre = null;
			this.apellidos = null;
			this.domicilio = null;
			this.email = null;
		}
		
		
	}
	
	/** Metodo get para numAsignaturas de la clase Profesor
	 */
	public int getNumAsignaturas() {
		return numAsignaturas;
	}
	

	/** Metodo to String que enseña los 5 parametros de profesor especificados
	 * 
	 */
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio + ", email="
				+ email + ", numAsignaturas=" + numAsignaturas + "]";
	}
	
	public void añadirAnotacion (Alumno a,String asignatura, String anotacion) {
	
		a.añadirAnotacion(getNombre(),asignatura,anotacion);
		
		
	}
	
	
	
}
