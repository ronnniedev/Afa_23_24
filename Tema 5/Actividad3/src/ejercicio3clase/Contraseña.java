package ejercicio3clase;

public class Contraseña {

	private String valorContraseña;
	
	public Contraseña(String param) {
		if (comprobarContraseña(param)==true) {
			valorContraseña=param;
		}else {
			valorContraseña="XXX";
		}
		
	}
	/**
	 * comprueba que la contraseña es valida
	 * @param param
	 * @return
	 */
	public static boolean comprobarContraseña(String param) {
		boolean resul = true;
		if (param.length()<6 || param.length() > 10) {
			resul = false;
		}else {
			boolean mayEncontrada = false;
			boolean digitoEncontrado = false;
			for (int i = 0; i < param.length(); i++) {
				char car = param.charAt(i);
				if (Character.isUpperCase(car) == true) {
					mayEncontrada = true;
					
				}else {
					if (Character.isDigit(car) == true) {
						digitoEncontrado = true;
					}
				}
			}
			if (mayEncontrada == false || digitoEncontrado == false) {
				resul = false;
			}
		}
		return false;
	}
	/**
	 * @return the valorContraseña
	 */
	public String getValorContraseña() {
		return valorContraseña;
	}
	
	
	
}
