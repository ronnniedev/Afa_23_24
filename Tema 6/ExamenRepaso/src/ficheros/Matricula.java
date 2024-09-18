package ficheros;

public class Matricula {
	
	private String matricula;

	public Matricula(String matricula) throws FormatoException {
		this.matricula = comprobarMatricula(matricula);
	}
	
	public String comprobarMatricula(String matricula) throws FormatoException {
		String trozos[] = matricula.split("-");
		
		if(trozos.length == 2 && trozos[0].length() == 4 && trozos[1].length() == 3) {
			for(int i = 0; trozos[0].length() > i; i++) {
				if(!Character.isDigit(trozos[0].charAt(i))) {
					throw new FormatoException("1Matricula mal generada");
				}
				
			}
			for(int i = 0; trozos[1].length() > i; i++) {
				if(!Character.isAlphabetic(trozos[1].charAt(i)) || !Character.isUpperCase(trozos[1].charAt(i))) {
					throw new FormatoException("2Matricula mal generada");
				}
			}
			
			
		}else {
			throw new FormatoException("3Matricula mal generada");
		}
		
		return matricula;
		
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
