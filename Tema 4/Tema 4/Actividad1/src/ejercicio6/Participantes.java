package ejercicio6;

public class Participantes {

	private String nombre;
	private String apellidos;
	private int edad;
	private String direccion;
	private int telefono;
	
	public Participantes(String nombre, String apellidos, int edad, String direccion, int telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Participantes [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}
	
	

}
