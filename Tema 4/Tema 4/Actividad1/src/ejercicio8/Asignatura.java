package ejercicio8;

public class Asignatura {

	private String nombre;
	private String nombreProfesor;
	private int numHoras;
	private int notaAsignatura;
	private String nombreCompañero;
	private String anotacion;
	
	/** Constructor con 2 parametros para Asignatura
	 * @param nombre : String
	 * @param numHoras : int
	 */
	public Asignatura(String nombre, int numHoras) {
		this.nombre = nombre;
		this.nombreProfesor = "ninguno";
		this.numHoras = numHoras;
		this.notaAsignatura = 0;
		this.nombreCompañero = "Ninguno";
		this.anotacion = "Ninguna";
	}
	/** Constructor con 2 parametros para Asignatura
	 * @param nombre : String
	 * @param nombreProfesor : String
	 * @param numHoras : int
	 */
	public Asignatura(String nombre, String nombreProfesor, int numHoras) {
		this.nombre = nombre;
		this.nombreProfesor = nombreProfesor;
		this.numHoras = numHoras;
		this.notaAsignatura = 0;
		this.nombreCompañero = "Ninguno";
		this.anotacion = "Ninguna";
	}

	
	/** Metodo toString que enseña los 6 parametros de Reservas especificados
	 */
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nombreProfesor=" + nombreProfesor + ", numHoras=" + numHoras
				+ ", notaAsignatura=" + notaAsignatura + ", nombreCompañero=" + nombreCompañero + ", anotacion="
				+ anotacion + "]";
	}
	/** etodo que añade el nombre de un profesor dentro de una asignatura concreta
	 * @param p : Profesor
	*/
	public void añadirTutor (Profesor p) {
		
		if (p.getNumAsignaturas()== 6) {
			System.out.println("Este profesor no puede aceptar mas asignaturas");
		}else {
			this.nombreProfesor = p.getNombre();
		}
	}
	/** Metodo get para nombre de la clase Asignatura
	 */
	public String getNombre() {
		return nombre;
	}

	/** Metodo get para nombreProfesor de la clase Asignatura
	 */
	public String getNombreProfesor() {
		return nombreProfesor;
	}

	/** Metodo get para numHoras de la clase Asignatura
	 */
	public int getNumHoras() {
		return numHoras;
	}
	public int getNotaAsignatura() {
		return notaAsignatura;
	}
	public void setNotaAsignatura(int notaAsignatura) {
		this.notaAsignatura = notaAsignatura;
	}
	public String getNombreCompañero() {
		return nombreCompañero;
	}
	public void setNombreCompañero(String nombreCompañero) {
		this.nombreCompañero = nombreCompañero;
	}
	public String getAnotacion() {
		return anotacion;
	}
	public void setAnotacion(String anotacion) {
		this.anotacion = anotacion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	
	
	
}
