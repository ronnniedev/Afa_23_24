package ficheros;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Actividad 3
		 * ¿Cuál es el valor de la variable X después de la ejecución de estas
		 * expresiones
		 * X es real
		 * X = 2.0
		 * X = (X * X) * 2
		 * X = raíz (X + raix(x) + 5)
		 */
		
		double x;
		
		x = 2.0;
		//Realizamos la operacion para dar el primer resultado, syso adicional es para forzar un salto de linea.
		
		x = (x*x)*2;
		System.out.println("El valor de x en la primera expresion es :" + x);
		System.out.println();
		
		//Realizamos la segunda operacion para dar el siguiente resultado
		x = Math.sqrt(x+Math.sqrt(x)+5);
		System.out.println("El valor de x en la segunda expresion es :" + x);

	}

}
