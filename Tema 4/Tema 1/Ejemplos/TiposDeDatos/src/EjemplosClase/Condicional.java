package EjemplosClase;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edadAlumno = 20;
		
		// Condicionales simples
		
		if (edadAlumno >= 18) {			
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		
		// Condicionales múltiples
		if (edadAlumno >= 18) {
			System.out.println("Eres mayor de edad");
		} else if (edadAlumno >= 16) {
			System.out.println("Casi eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		
		// Condicionales múltiples
		char vocal = 'a';
		switch (edadAlumno) {
			case 'a': {
				System.out.println("Eres la primera vocal");						
			}
			case 'e': {
				System.out.println("Eres la segunda vocal");						
			}
			case 'i': {
				System.out.println("Eres la tercera vocal");						
			}
			case 'o': {
				System.out.println("Eres la cuarta vocal");						
			}
			case 'u': {
				System.out.println("Eres la ultima vocal");						
			}
			default: {
				System.out.println("No eres vocal");						
			}
		};	
	}

}
