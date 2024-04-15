package ejercicio1;

import java.util.Objects;

public class Cliente  {

	private String nombre;
	private String dni;
	private String apellidos;
	private double descuento;
	private TipoCliente tipo;
	private final double DESCUENTO_BASE = 0.1;
	
	public Cliente(String nombre, String dni, String apellidos, TipoCliente tipo) {
		this.nombre = nombre;
		this.dni = dni;
		this.apellidos = apellidos;
		this.tipo = tipo;
		if (this.tipo == TipoCliente.HABITUAL) {
			this.descuento = DESCUENTO_BASE;
		}else {
			this.descuento = 0;
		}
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
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
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
	 * @return the tipo
	 */
	public TipoCliente getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, nombre, tipo);
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
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "\nCliente [nombre=" + nombre + ", dni=" + dni + ", apellidos=" + apellidos + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
}
