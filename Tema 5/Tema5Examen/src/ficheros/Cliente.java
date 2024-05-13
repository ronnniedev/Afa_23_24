package ficheros;

public class Cliente implements Comparable {

	private String dni;
	private String nombre;
	private String telefono;
	
	
	public Cliente(String dni, String nombre, String telefono) {
		this.dni = comprobarDni(dni);
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String comprobarDni(String dni) {
		String texto = "Dni mal introducido";
		boolean esCorrecto = true;
		
		
		if (dni.length() != 9) {
			esCorrecto = false;
		}else {
			for (int i = 0; i < dni.length()-1 && esCorrecto; i++) {
				if (!Character.isDigit(dni.charAt(i))) {
					System.out.println(dni.charAt(i));
					esCorrecto = false;
				}
			}
			if (Character.isDigit(dni.charAt(8))) {
				esCorrecto = false;
			}
		}
		
		if (esCorrecto) {
			texto = dni;
		}
		
		return texto;
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
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}

	@Override
	public int compareTo(Object o) {
		Cliente other = (Cliente)o;
		return this.dni.compareTo(other.getDni());
	}
	
	
	
	
}
