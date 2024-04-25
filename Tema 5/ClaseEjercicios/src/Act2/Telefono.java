package Act2;

import java.util.Objects;

public class Telefono {
	private String valor;
	
	public Telefono(String param) {
		if(comprobarTelefono(param)==true) {
			valor=param;
		}else {
			valor="XXX";
		}
	}

	/**
	 * comprobamos que es un string de 9 digitos
	 * @param param
	 * @return
	 */
	public static boolean comprobarTelefono(String param) {
		boolean resul=true;
		// cuerpo de la funcion
		if(param.length()!=9) resul=false;
	
		for(int i=0;i<param.length();i++) {
			char car=param.charAt(i);
			if(Character.isDigit(car)==false) resul=false;
		}
		
		return resul;
	}

	public String getValor() {
		return valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefono other = (Telefono) obj;
		return valor.compareTo(other.valor)==0;
	}
	
	
	
}




