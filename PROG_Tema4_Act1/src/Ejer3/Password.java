package Ejer3;

public class Password {
	private int longitud;
	private String contraseña;
	
	/**
	 * constructor por defecto
	 */
	public Password() {
		this.longitud=8;
		generarPassword();
	}
	/**
	 * constructor con el parametro longitud
	 * @param longitud entero
	 */
	public Password(int longitud) {
		this.longitud=longitud;
		generarPassword();
	}
	/**
	 * generamos de forma aleatoria la contraseña
	 * mayusculas mnusculas y numero
	 */
	private void generarPassword() {
		this.contraseña="";
		for(int i=1;i<=longitud;i++) {
			int tipo=(int)(Math.random()*3);
			if(tipo==0) {
				int valor=(int)(Math.random()*10);
				contraseña=contraseña+valor;
			}
			if(tipo==1) {
				int valor=(int)(Math.random()*26);
				char letraMay=(char) ('A'+valor);
				contraseña=contraseña+letraMay;
			}
			if(tipo==2) {
				int valor=(int)(Math.random()*26);
				char letraMin=(char) ('a'+valor);
				contraseña=contraseña+letraMin;
			}
		}
	}
	/**
	 * metodo get para el atributo longitud
	 * @return int
	 */
	public int getLongitud() {
		return longitud;
	}
	/**
	 * metodo get para la contraseña
	 * @return string
	 */
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * metodo set para el atributo longitud
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
/**
 * Devuelve un booleano si es fuerte o no, 
 * para que sea fuerte debe tener mas de 2 mayúsculas,
 *  mas de 1 minúscula y mas de 5 números.
 * @return boolean
 */
	public boolean esFuerte() {
		int contNumero=0;
		int contMin=0;
		int contMay=0;
		for(int i=0;i<this.longitud;i++) {
			char car=this.contraseña.charAt(i);
			if(Character.isDigit(car)==true) {
				contNumero++;
			}
			if(Character.isUpperCase(car)==true) {
				contMay++;
			}
			if(Character.isLowerCase(car)==true) {
				contMin++;
			}
		}
		if(contNumero<=5) return false;;
		if(contMay<=2) return false;
		if(contMin<=1) return false;
		
		return true;
	}

	

}
