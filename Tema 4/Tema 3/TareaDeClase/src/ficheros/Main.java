package ficheros;

public class Main {

	public static void main(String[] args) {
		
		int [] relieve = {2,4,3,5,5,5,5,7,9,8,6,5,7,8,12,8,10,9,7,6,4,3,4,4,4,2,0};
		
		System.out.println("Numero valles: "+ Libreria.numeroValle(relieve));
		System.out.println("Valor maximo pico: " + Libreria.valorPicoMasAlto(relieve));
		System.out.println("Numero de mesetas: " + Libreria.numeroMesetas(relieve));

	}

}
