package ejercicio7Clase;

public class Matricula {

	private String matricula;

	public Matricula(String matricula) throws FormatoException {
		comprobarMatricula(matricula);
		this.matricula = matricula;
	}
	
	public static void comprobarMatricula(String mat) throws FormatoException {
		if(mat.length() != 9) {
			throw new FormatoException("No tiene la longitud correcta");
		}

		if (!Character.isLetter(mat.charAt(0)) || !Character.isUpperCase(mat.charAt(0))) {
			throw new FormatoException("El primer caracter no es una letra");
		}
		String trozos[]=mat.split("-");
		
		if (trozos.length != 3) {
			throw new FormatoException("La mat no esta bien construida");
		}
		
		for (int i = 0; i < trozos[1].length(); i++) {
			if (!Character.isDigit(trozos[1].charAt(i))) {
				throw new FormatoException("Hay una letra en la segunda parte de la matricula");
			}
		}
		
		for (int i = 0; i < trozos[2].length(); i++) {
			if (Character.isDigit(trozos[2].charAt(i))) {
				throw new FormatoException("Hay una letra un numero parte de la matricula");
			}
			
			if (!Character.isUpperCase(trozos[2].charAt(i))) {
				throw new FormatoException("No es mayuscula una de las letras");
			}
		}
		
		
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Matricula [matricula=" + matricula + "]";
	}
	
	
	
	
}
