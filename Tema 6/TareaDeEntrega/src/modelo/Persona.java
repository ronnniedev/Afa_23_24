package modelo;

import java.util.Objects;

import excepciones.IncorrectLengthException;

/**
 * @author Veronica
 * @version 1.0
 */
public abstract class Persona {
	
	protected String nombre;
	protected String apellidos;
	protected String nif;
	protected int telefono;
	protected String correo;
	protected Genero genero;
	protected int edad;
	
	/** 
	 * Metodo Contructor de 7 parametros de la clase Persona
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param telefono
	 * @param correo
	 * @param genero
	 * @param edad
	 */
	public Persona(String nombre, String apellidos, String nif, int telefono, String correo, Genero genero,
			int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.telefono = telefono;
		this.correo = correo;
		this.genero = genero;
		this.edad = edad;
	}

	/**
	 * Metodo constructor de 6 parametros de la clase Persona
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param telefono
	 * @param genero
	 * @param edad
	 */
	public Persona(String nombre, String apellidos, String nif, int telefono,Genero genero, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.correo = "ninguno";
		this.telefono = telefono;
		this.genero = genero;
		this.edad = edad;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return this.nif.compareTo(other.nif)==0;
	}


	/**
	 * Crea una identificacion para el objeto mencionado
	 * @return
	 */
	protected abstract String crearIdentificacion();

	/**
	 * Metodo get de nombre de la clase Persona
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set de nombre de la clase Persona
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 *metodo get de apellidos de la clase Persona
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo set de apellidos de la clase Persona
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo get de nif de la clase Persona
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * Metodo set de Nif de la clase persona
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * Metodo get de telefono de la clase Persona
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Metodo set telefono de la clase Persona
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * Metodo get de correo de la clase Persona
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Metodo set de correo de la clase Persona
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Metodo get genero de la clase Persona
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Metodo set genero de la clase Persona
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * Metodo get edad de la clase Persona
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Metodo set edad de la clase Persona
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo toString de 7 parametros de la clase Persona
	 */
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", telefono=" + telefono
				+ ", correo=" + correo + ", Genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	
	

}
