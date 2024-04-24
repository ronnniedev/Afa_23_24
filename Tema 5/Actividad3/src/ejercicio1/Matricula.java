package ejercicio1;

import java.util.Iterator;
import java.util.Objects;

public class Matricula {

	private String valor;
	
	public Matricula(String matricula) {
		if (comprobarMatricula(matricula)==true) {
			this.valor=matricula;
		}else {
			this.valor="-1";
		}
	}
	
	
	
	/**
	 * @return the valor
	 */
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
		return (valor.compareTo(other.valor)==0);
	}



	/**
	 * Comprobar que la matricula es correcta DDDD-LLL
	 * 1- Si long != 8 error
	 * 2- Si alguno de los 3 primeris digitos no es digito error
	 * 3.- pos 4 tiene que ser un guin
	 * @param matricula
	 * @return
	 */
	private boolean comprobarMatricula(String matricula) {
		boolean resul = true;
		
		if (matricula.length()!= 8) {
			resul = false;
			System.out.println("Error en longitud de matricula");
		}
		for (int i = 0; i<4; i++) {
			char car = matricula.charAt(i);
			if (Character.isDigit(car)== false) {
				resul = false;
				System.out.println("Error no digito pos " + i);
			}
		}
		
		char car= matricula.charAt(4);
		
		if (car!='-') {
			System.out.println("ERROR no hay guion pos 4");
		}
		
		for (int i = 5;i<8;i++) {
			car = matricula.charAt(i);
			if (Character.isLetter(car)== false) {
				resul = false;
				System.out.println("ERROR no letra pos");
			}
			
		}
		return resul;
	}



	@Override
	public String toString() {
		return "Matricula [valor=" + valor + "]";
	}
	
	
}
