package ejercicio3;

public class Contraseña {

	private String valor;
	
	
	
	public Contraseña(String password) {
		
		this.valor = comprobarContraseña(password);
		
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
		String resul = comprobarContraseña(valor);
		if (resul == "ERROR") {
			System.out.println("Contraseña nueva no valida");
		}else {
			this.valor = valor;
		}
		
	}


	/**
	 * Comprueba si la contraseña a introducir es valida
	 * @param password
	 * @return
	 */
	private String comprobarContraseña(String password) {
		String resul = password;
		boolean tieneMayuscula = false;
		boolean tieneDigito = false;
		
		if (password.length() < 6 || password.length() > 10) {
			System.out.println("Numero de caracteres no valido");
			resul = "ERROR";
		}
		
		for (int i = 0; i < password.length(); i++) {
			
			if (Character.isUpperCase(password.charAt(i)) == true && tieneMayuscula == false) {
				
				tieneMayuscula = true;
				
			}
			if (Character.isDigit(password.charAt(i)) == true && tieneDigito == false) {
				
				tieneDigito = true;
				
			}
			
		}
		
		if (tieneMayuscula == false) {
			System.out.println("No hay mayusculas en esta contraseña");
			resul = "ERROR";
		}
		if (tieneDigito == false) {
			System.out.println("No hay digitos en esta contraseña");
			resul = "ERROR";
		}
		
		return resul;
	}

	@Override
	public String toString() {
		return "Contraseña [valor=" + valor + "]";
	}
	
	
}
