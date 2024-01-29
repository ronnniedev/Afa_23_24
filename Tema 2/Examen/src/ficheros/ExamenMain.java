package ficheros;

import java.util.Scanner;

public class ExamenMain {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("esPrimo(17) = " + Funciones.esPrimo(17));
		System.out.println("esPrimo(20) = " + Funciones.esPrimo(20));
		System.out.println("siguientePrimo (17) =" + Funciones.siguientePrimo(17));
		System.out.println("siguientePrimo (20) =" + Funciones.siguientePrimo(20));
		System.out.println("digitos (1234) = " + Funciones.digitos(1234));
		System.out.println("voltea (1234) = " + Funciones.voltea(1234));
		System.out.println("digitoN (1234,1) = " + Funciones.digitoN(1234, 1));
		System.out.println("digitoN (1234,0) = " + Funciones.digitoN(1234, 0));
		System.out.println("digitoN (1234,6) = " + Funciones.digitoN(1234, 6));
		System.out.println("posicionDigito(12345,2) = " + Funciones.posicionDeDigito(12345,2) );
		System.out.println("posicionDigito(12345,6) = " + Funciones.posicionDeDigito(12345,6) );
		System.out.println("quitarPorDetras (12345) = " + Funciones.quitarPorDetras(12345));
		System.out.println("quitarPorDelante (12345) = " + Funciones.quitarPorDelante(12345));
		System.out.println("pegaPorDetras (12345,9) = " + Funciones.pegarPorDetras (12345,9));
		System.out.println("pegaPorDelante (12345,9) = " + Funciones.pegarPorDelante (12345,9));
	}

}
