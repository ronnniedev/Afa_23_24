package ejerciciosFor;



public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		int numero,multiplicador,operando;
		
		numero = 0;
		multiplicador = 3;
		operando = 0;
		
		for (numero = 0 ; operando <= 10 ; operando++ ) {
			
			numero = multiplicador * operando;
			System.out.println(numero + " = " + multiplicador + " * " + operando );
			
			
		}
	}

}
