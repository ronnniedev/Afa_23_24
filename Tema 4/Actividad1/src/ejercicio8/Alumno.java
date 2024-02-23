package ejercicio8;

public class Alumno {

	private String dni;
	private int expediente;
	private String nombre;
	private String apellidos;
	private String domicilio;
	private String telefono;
	private String email;
	private Asignatura a[];
	
	/** Constructor con 7 parametros para Alumno
	 * @param dni : String
	 * @param expediente : int
	 * @param nombre: String
	 * @param apellidos : String
	 * @param domicilio : String
	 * @param telefono : String
	 * @param email : String
	 */
	public Alumno(String dni, int expediente, String nombre, String apellidos, String domicilio, String telefono,
			String email) {
		
		this.dni= dni;
		this.expediente = expediente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
		this.a = new Asignatura [0];
		
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", expediente=" + expediente + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", domicilio=" + domicilio + ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	public void añadirAsignatura(String NombreAsignatura, Curso c) {
		
		Asignatura contenedor = c.comprobarAsignatura(NombreAsignatura);
		
		if (contenedor == null) {
			System.out.println("ERROR");
		}else {
			int tam = this.a.length;
			int nuevoTam= this.a.length+1;
			Asignatura nuevoVector[] = new Asignatura [nuevoTam];
			
			for (int i = 0; i < tam; i++) {
				nuevoVector [i] = this.a [i];
			}
			
			int posNuevo = nuevoTam-1;
			nuevoVector[posNuevo]=contenedor;
			
			this.a = nuevoVector;
		}
		
		
	}
	
	public void añadirNota(int nota, String asignatura) {
		
		for (int i = 0; i < this.a.length; i++) {
			
			if (this.a[i].getNombre().compareTo(asignatura)== 0) {
				
				this.a[i].setNotaAsignatura(nota);
				return;
			} 
		}
		System.out.println("No se encontro la asignatura en este alumno");
		
	}
	
	public void visualizarAlumnos () {
		System.out.println("-----Alumnos-----");
		System.out.println(toString());
		
		
		System.out.println("-----Asignaturas cursadas-----");
		for (int i = 0; i < this.a.length; i++) {
			System.out.println(this.a[i].toString());
			
		}
		
	}
	
	public void añadirCompañero (Alumno al,String asignatura) {
		
		for (int i = 0; i < this.a.length; i++) {
			
			if (this.a[i].getNombre().compareTo(asignatura)== 0) {
				
				this.a[i].setNombreCompañero(al.getNombre());
				return;
			} 
		}
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void añadirAnotacion (String nombreProfesor ,String asignatura,String anotacion) {
		
		String texto = nombreProfesor + " escribio la siguiete anotacion: " + anotacion;
		
		System.out.println(texto);
		
		for (int i = 0; i < this.a.length; i++) {
			
			if (this.a[i].getNombre().compareTo(asignatura)== 0) {
				this.a[i].setAnotacion(texto);
				System.out.println("entro");
				return;
			} 
		}
		
	}
	
	
	
	
}
