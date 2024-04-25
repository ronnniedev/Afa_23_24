package Act3;

public class Contraseña {
	private String valorContraseña;
	
	public Contraseña(String param) {
		if(comprobarcontraseña(param)==true) {
			this.valorContraseña=param;
		}else {
			this.valorContraseña="XXX";
		}
	}

	/**
	 * o Debe de tener una longitud entre 6 y 10 caracteres
	 * o Debe contener al menos un carácter mayuscula y un
	 *         número
	 * @param param
	 * @return
	 */
	public static boolean comprobarcontraseña(String param) {
		// TODO Auto-generated method stub
		boolean resul=true;
		if(param.length()<6 || param.length()>10) resul=false;
		else {
			boolean hayMay=false;
			boolean hayDigito=false;
			for(int i=0;i<param.length();i++) {
				char car=param.charAt(i);
				if(Character.isUpperCase(car)==true)
					hayMay=true;
				else	
					if(Character.isDigit(car)==true)
						hayDigito=true;
			}
			if(hayDigito==false || hayMay==false) {
				resul=false;
			}
		}
		return resul;
	}

	public String getValorContraseña() {
		return valorContraseña;
	}
	
	
}



