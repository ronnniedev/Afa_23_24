package Act3.TreeMap;

import java.util.Objects;

public class NombreUsuario implements Comparable{
	private String nombreValor;
	
	public NombreUsuario(String param) {
		if(comprobarNombreUsuario(param)==true) {
			this.nombreValor=param;
		}else {
			this.nombreValor="XXX";
		}
	}

	/**
	 * El nombre de usuario debe de cumplir las siguientes 
	 * condiciones
	 * o Tener una longitud entre 4 y 6 caracteres
	 * o Solo puede contener caracteres
	 * @param param
	 * @return
	 */
	public static boolean comprobarNombreUsuario(String param) {
		boolean resul=true;
		if(param.length()<4 || param.length()>6) resul=false;
		for(int i=0;i<param.length();i++) {
			Character car=param.charAt(i);
			if(Character.isLetter(car)==false) resul=false;
		}
		return resul;
	}

	public String getNombreValor() {
		return nombreValor;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		NombreUsuario other =(NombreUsuario) o;
		return nombreValor.compareTo(other.nombreValor);
	}

}






