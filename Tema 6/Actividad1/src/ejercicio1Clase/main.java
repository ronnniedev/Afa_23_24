package ejercicio1Clase;

public class main {

	public static void main(String[] args) {
		int num = 10;
		int den = 0;
		
		try {
			int cociente = num/den;
			
		}catch (ArithmeticException e){
			
			System.out.println("ERROR: division por cero");
			System.out.println("Den siempre != cero");
		}
		System.out.println("FIN!!");
		

	}

}
