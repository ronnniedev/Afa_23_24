package ejercicio1_clase;

import java.util.Objects;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellidos;
	private final int DESCUENTO = 5;
	
	public Cliente(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the dESCUENTO
	 */
	public int getDESCUENTO() {
		return DESCUENTO;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return (this.dni == other.dni);
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
	
}
