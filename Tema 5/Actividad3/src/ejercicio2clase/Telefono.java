package ejercicio2clase;

import java.util.Objects;

public class Telefono {

	private String valor;

	public Telefono(String valorParam) {
		
		if (comprobarTelefono(valorParam) == true) {
			
			this.valor =  valorParam;
			
		}else {
			this.valor = "ERROR";
		}
		
	}
	
	private boolean comprobarTelefono(String valorParam) {
	
		boolean resul = true;
		
		if (valorParam.length() != 9) {
			resul = false;
			
		}
		
		for (int i = 0; i < valorParam.length(); i++) {
			char car = valorParam.charAt(i);
			if (Character.isDigit(car) == false) {
				resul = false;
			}
			
		}
		
		return resul;
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
		this.valor = valor;
	}
	
	
	
	
	
}
