package ejercicio8;

public class Curso {

	private int codigo;
	private String nombre;
	private String aula;
	private String horario;
	private String tutor;
	private Asignatura a[];
	
	
	/** Constructor con 5 parametros para Curso
	 * @param codigo : int
	 * @param nombre : String
	 * @param aula : String
	 * @param horario : String
	 * @param p : clase profesor
	 */
	public Curso(int codigo, String nombre, String aula, String horario,Profesor p) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.aula = aula;
		this.horario = horario;
		this.a = new Asignatura [0];
		this.tutor = p.getNombre();
	}
	/** Constructor con 4 parametros para Curso
	 * @param codigo : int
	 * @param nombre : String
	 * @param aula : String
	 * @param horario : String
	 */
	public Curso(int codigo, String nombre, String aula, String horario) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.aula = aula;
		this.horario = horario;
		this.a = new Asignatura [0];
		this.tutor = "Ninguno";
	}

	/** Metodo to string que muestra los 5 parametros de curso
	 * 
	 */
	public String toString() {
		return "Curso [codigo=" + codigo + ", nombre=" + nombre + ", aula=" + aula + ", horario=" + horario + ", tutor="
				+ tutor +"]";
	}
	/** Metodo que añadir una asignatura concreta al curso ademas de asignarselo a un profesor
	 * @param nombre : String
	 * @param p : Profesor
	 * @param numHoras : int
	 */
	public void añadirAsignatura(String nombre, Profesor p, int numHoras) {
		Asignatura contenedor= new Asignatura(nombre, p.getNombre(), numHoras);
		
		if (p.getNumAsignaturas() == 6) {
			System.out.println("Este profesor no puede impartir mas asignaturas");
		}else {
			p.añadirAsignaturas();
			int tam = a.length;
			int nuevoTam= a.length+1;
			Asignatura nuevoVector[] = new Asignatura [nuevoTam];
			
			for (int i = 0; i < tam; i++) {
				nuevoVector [i] = a [i];
			}
			
			int posNuevo = nuevoTam-1;
			nuevoVector[posNuevo]=contenedor;
			
			this.a = nuevoVector;
		}
		
		
		
		
		
	}
	/** Metodo que muestra el curso y las asignaturas del mismo
	 * 
	 */
	public void visualizar () {
		
		System.out.println("-----Curso-----");
		System.out.println(toString());
		System.out.println("-----Asignaturas del curso-----");
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i].toString());
			
		}
		
		
		
		
		
	}
	/** Metodo que asigna el nombre del tutor al curso
	 * 
	 */
	public void añadirTutor(Profesor p) {
		
		this.tutor = p.getNombre();
		
	}
	/** Metodo que busca una calse concreta por el nombre y lo retorna.
	 * @param nombreAsignatura
	 * @return class
	 */
	public Asignatura comprobarAsignatura (String nombreAsignatura) {
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].getNombre().compareTo(nombreAsignatura) == 0) {
				return a[i];
			}
			
		}
		
		return null;
		
	}
	

	
	
}
