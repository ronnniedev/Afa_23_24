package ficheros;

public class Ejercicio2 {

	public static void main(String[] args) {
		/* Actividad 2
		 * ¿Cuáles son los valores finales de la variables A,B y C después de la
		 * ejecución de estas expresiones
		 * A, B, C son enteros
		 * A=3
		 * B = 4
		 * C = A + 2 * B
		 * C = C + B
		 * B = C – A
		 * 
		 */
		
		long a;
		long b;
		long c;
		
		a = 3;
		b = 4;
	
		c = a + 2 * b;
		c = c + b;
		b = c - a;
		System.out.println("a = " + a + " b = "+ b + " c = " +c);

	}

}
