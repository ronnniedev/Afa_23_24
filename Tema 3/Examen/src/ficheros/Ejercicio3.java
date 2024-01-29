package ficheros;


public class Ejercicio3 {

	public static void main(String[] args) {
		int [][] matriz={{ 5, 7, 5, 4, 2},
				{ 5, 3, 9, 6, 5},
				{ 1, 4, 7, 7, 6},
				{ 8, 6, 2, 9, 4}};
		
		int ctes [] = {6,2,6,2};
		
		int resul [] = Libreria.calcularPrimeraDerivada(matriz,ctes);
		Libreria.mostrarVector(resul);

	}

}
