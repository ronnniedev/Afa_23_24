package ficheros;

public class Ejercicio33p {

	public static void main(String[] args) {
		
		int veces;
		veces = 1;
		
		while (veces <= 6) {
			int num = (int) ((Math.random ()*49 + 1));
			
			System.out.println("Pos ( " + veces + " )= " +num);
			
			veces++;
			
			
		}

	}

}
