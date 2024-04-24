package ejercicio3;

import java.util.Objects;

public class NombreUsuario {
	
	private String valor;
	
	public NombreUsuario (String nombre) {
		
		this.valor = comprobarNombre(nombre);
		
		
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NombreUsuario other = (NombreUsuario) obj;
		return this.valor.compareTo(other.valor) == 0;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}



	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}



	private String comprobarNombre (String nombre) {
		String resul = nombre;
		boolean fallo = false;
		
		if (nombre.length() < 4 || nombre.length() > 6) {
			System.out.println("El numero de caracteres no es correcto");
			resul = "ERROR";
		}
		for (int i = 0; i < nombre.length(); i++) {
			if(Character.isLetter(nombre.charAt(i)) == false && fallo == false) {
				System.out.println("Hay un caracter no valido");
				fallo = true;
				resul = "ERROR";
			}
			
		}
			
		return resul;
	}



	@Override
	public String toString() {
		return "NombreUsuario [valor=" + valor + "]";
	}
	
	
	
	

}
