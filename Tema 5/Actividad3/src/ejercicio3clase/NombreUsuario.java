package ejercicio3clase;

public class NombreUsuario {

	private String valor;
	
	public NombreUsuario(String param) {
		if (comprobarNombreUsuario(param) == true) {
			this.valor = param;
		}else {
			this.valor = "XXX";
		}
	}
	/*
	 * funcion que comprueba que el nombre de usuario es correcto
	 * tener una longitud entre 4 y 6 caracteres
	 * solo puede contener caracteres
	 * 
	 */
	public static boolean comprobarNombreUsuario(String param) {
		boolean resul = false;
		if (param.length() < 4 || param.length()>6 ) {
			resul = false;
		}else {
			for (int i = 0; i < param.length();i++) {
				char car = param.charAt(i);
				if (Character.isLetter(car) == false) {
					resul = false;
				}
			}
		}
		return resul;
	}
	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	
	
}
