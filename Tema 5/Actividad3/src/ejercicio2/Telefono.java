package ejercicio2;

import java.util.Objects;

public class Telefono {
	
	private String telefono;

	public Telefono(String telefono) {
		this.telefono = comprobarTelefono(telefono);
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
	public int hashCode() {
		return Objects.hash(telefono);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefono other = (Telefono) obj;
		return (telefono.compareTo(other.telefono) == 0);
	}



	public String comprobarTelefono(String telefono) {
		String texto = "Formato no correcto";
		
		if (telefono.length() != 9) {
			
			System.out.println("El telefono introducido no es valido");
			
		}else {
			
			texto = telefono;
		}
		
		return texto;
	}

	@Override
	public String toString() {
		return "Telefono [telefono=" + telefono + "]";
	}
	
	
	
	
}
