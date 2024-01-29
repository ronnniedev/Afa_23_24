package ficheros;

import java.util.Scanner;

public class MainEntrega {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		

		int v [] = LibreriaFunciones.leerVector();
		LibreriaFunciones.imprimirVector(v);
		LibreriaFunciones.mostrarRepetidos(v);
		LibreriaFunciones.buscarAusentes(v);
		
		
		System.out.println("El valor promedio de este vector es:" + LibreriaFunciones.promedio(v));
	}

}
