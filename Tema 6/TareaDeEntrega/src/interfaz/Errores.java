package interfaz;

import logica.Consigna;

public class Errores {

	public static void main(String[] args) {
		
		System.out.println(Consigna.comprobarDni("73783768Q")); //true
		System.out.println(Consigna.comprobarDni("16236128A3")); //False se sale de los 9 caracteres
		System.out.println(Consigna.comprobarDni("53783768q")); //False la letra no es Uppercase
		System.out.println(Consigna.comprobarDni("537837689")); //False el caracter 8 es numerico
		System.out.println(Consigna.comprobarDni("5378376A")); //False No es 9 el numero de caracteres
		
	}

}
