package Act1;

import java.util.Objects;

public class Matricula {
	private String valor;
	
	
	public Matricula(String valorParam) {
		if(comprobarMatricula(valorParam)==true) {
			valor=valorParam;
		}else {
			valor="X";
		}
	}

	//comprobar dddd-lll
	public static boolean comprobarMatricula(String valorParam) {
		// TODO Auto-generated method stub
		boolean resul=true;
		if(valorParam.length()!=8) resul=false;
		else {
			// 4 primeros son digitos
			for(int i=0;i<4;i++) {
				char c=valorParam.charAt(i);
				if(Character.isDigit(c)==false) {
					resul=false;
				}
			}
			if(valorParam.charAt(4)!='-') resul = false;
			// 3 ultimos letras
			for(int i=5;i<8;i++) {
				char c=valorParam.charAt(i);
				if(Character.isLetter(c)==false) {
					resul=false;
				}
			}
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
		Matricula other = (Matricula) obj;
		return valor.compareTo(other.valor)==0;
	}

	@Override
	public String toString() {
		return "Matricula [valor=" + valor + "]";
	}
	
	
}
