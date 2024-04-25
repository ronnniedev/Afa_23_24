package Act3;

import java.util.Objects;

public class NombreUsuario {
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
	public int hashCode() {
		return Objects.hash(nombreValor);
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
		return nombreValor.compareTo(other.nombreValor)==0;
	}
	
	
}






