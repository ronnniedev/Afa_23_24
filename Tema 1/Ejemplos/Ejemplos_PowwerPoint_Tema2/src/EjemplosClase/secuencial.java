package EjemplosClase;
import java.util.Scanner;

public class secuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Secuencia
		System.out.println("Hola");
		System.out.println("Introduce tu nombre:");

		// leemos el nombre
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.next();
		System.out.println("Encantado de conocerte "+nombre);

	}

}
