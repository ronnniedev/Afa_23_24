package Ejer1;

import java.util.Iterator;

public class Banco {
	private Cuenta v[];
	
	/**
	 * contructor de la clase banco, dimensiona el vector a 4 posiciones
	 */
	public Banco() {
		v=new Cuenta[4];
	}
	
	/**
	 * insertar en la posicion pos un nuevo objeto de tipo Cuenta
	 * @param c objeto cuenta
	 * @param pos entero
	 */
	public void addCuenta(Cuenta c, int pos) {
		if(pos>=0 && pos<v.length) {
			v[pos]=c;
		}else {
			System.out.println("Error en pos");
		}
	}
	/**
	 * muestra por pantalla el contenido del vector v
	 */
	public void mostrarCuentas() {
		for (int i = 0; i < v.length; i++) {
			Cuenta c = v[i];
			System.out.println(c.toString());
		}
	}
}





