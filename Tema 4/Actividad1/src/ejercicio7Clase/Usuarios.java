package ejercicio7Clase;

public class Usuarios {
	// nombre, apellidos,email,telefono
	// dniy fecha de nacimiento
	
	
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	private String dni;
	private String fecha;
	
	public Usuarios(String nombre, String apellidos, String email, String telefono, String dni, String fecha) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.dni = dni;
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", apellidos=" + apellidos 
				+ ", email=" + email + ", telefono=" + telefono
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
