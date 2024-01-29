package ficheros;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int m [][] = Libreria.generarMatrizInt(5, 5, 1, 9);
		// int m[][]= Libreria2.crearMatriz();
		Libreria2.mostrarMatriz(m);
		Libreria2.trianguloSuperior(m);
		Libreria2.trianguloInferior(m);
		System.out.println("\n----->Simetrica<-----\n");
		System.out.println(Libreria2.esSimetrica(m));
	}

}
