package ficheros;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Actividad 4
		 * ¿Cuál es el valor de las variables X, Y y Z después de estas
		 * instrucciones?
		 * X, Y son enteros
		 * Z es lógico
		 * X = 5
		 * Y = X – 2;
		 * X = Y * 2 + 1
		 * Z = (X > (Y + 5))
		 */
			
			int x;
			int y;
			boolean z;
			
			x = 5;
			y = x - 2;
			x = y * 2 + 1;
			
			z = (x > (y + 5));
			
			System.out.println("El valor de X es: " + x);
			System.out.println("El valor de Y es: " + y);
			System.out.println("El valor de Z es: " + z);
			
			//El valor Z sale falso por que al final de las ejecuciones X no es mayor que (Y + 5) Es decir, 8.

	}

}
