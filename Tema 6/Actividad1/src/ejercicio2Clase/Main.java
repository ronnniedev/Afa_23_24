package ejercicio2Clase;

public class Main {

	public static void main(String[] args) {
		
		int lista[] = {1,2,3,4,5};
		
		
		try {
			for (int i = 0; i < lista.length; i++) {
				System.out.print(lista[i]+",");
			}
			System.out.println();
			lista[2]=33;
			for (int i = 0; i < lista.length; i++) {
				System.out.print(lista[i]+",");
			}
			System.out.println();
			lista[10] = 50;
			for (int i = 0; i < lista.length; i++) {
				System.out.print(lista[i]+",");
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR: fuera de rango");
			
		}
		
	}

}
