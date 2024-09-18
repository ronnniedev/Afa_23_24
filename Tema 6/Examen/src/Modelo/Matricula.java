package Modelo;

import java.util.Objects;

import Excepciones.FormatoExcepcion;

public class Matricula {
	private String cadena;
	
	public Matricula(String m) throws FormatoExcepcion {
		comprobarMatricula(m);
		this.cadena = m;
	}

	private void comprobarMatricula(String m) throws FormatoExcepcion  {
		
		
		if (m.length() != 8) {
			throw new FormatoExcepcion("ERROR matricula long!= 8");
		}
		
		for (int i = 0; i < 4; i++) {
			if (!Character.isDigit(m.charAt(i))) {
				throw new FormatoExcepcion("ERROR matricula no digito pos: " + (i));
			}
		}
		
		
		if (m.charAt(4) != '-') {
			throw new FormatoExcepcion("ERROR matricula no guion");
		}
		
		
		for (int i = 5; i < m.length(); i++) {
			if (!Character.isLetter(m.charAt(i))) {
				throw new FormatoExcepcion("ERROR matricula no letra pos: " + (i));
			}
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(cadena);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		return this.cadena.compareTo(other.cadena) == 0;
	}

	@Override
	public String toString() {
		return cadena;
	}
	
	
	
	

	
	
	
}
