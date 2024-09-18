package ejercicio7Clase;

public class Cliente implements Comparable<Cliente>{

	private String dni;
	private String nombre;
	private String telefono;
	
	public Cliente(String dni, String nombre, String telefono) throws FormatoException {
		comprobarDni(dni);
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Cliente (String dni) {
		
	}
	
	public void comprobarDni(String dni) throws FormatoException {
		if (dni.length() != 9) {
			throw new FormatoException("El dni no tiene el numero de caracteres correcto");
		}
		String numeros = dni.substring(0,8);
		for (int i = 0; i < numeros.length(); i++) {
			if (!Character.isDigit(dni.charAt(i))) {
				throw new FormatoException("El dni esta mal construido, hay una letra en lugar "
											+ "de un numero en las primeras 8 posiciones");
			}
		}
		
		if (!Character.isLetter(dni.charAt(8))) {
			throw new FormatoException("No hay letra en la ultima posicion");
		}
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	
	
	
	
}
