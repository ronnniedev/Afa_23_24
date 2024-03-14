package ficheros;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private String fechaDeNacimiento;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param fechaDeNacimiento
	 */
	public Alumno(String nombre, String apellidos, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fechaDeNacimiento
	 */
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * @param fechaDeNacimiento the fechaDeNacimiento to set
	 */
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ "]";
	}
	
	
	
	
}
