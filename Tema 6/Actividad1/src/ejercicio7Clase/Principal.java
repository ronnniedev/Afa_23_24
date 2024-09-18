package ejercicio7Clase;

public class Principal {

	public static void main(String[] args) {
		
		Taller taller = new Taller();
		
		try {
			Matricula.comprobarMatricula("B-1234-AB");
			System.out.println("bien1");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			Matricula.comprobarMatricula("C-1234-A2");
			System.out.println("bien2");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			Matricula.comprobarMatricula("D-1234-3B");
			System.out.println("bien3");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			Matricula.comprobarMatricula("E-123-AB");
			System.out.println("bien4");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			Matricula.comprobarMatricula("E-12S3.AB");
			System.out.println("bien5");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			Matricula.comprobarMatricula("1-1243.AB");
			System.out.println("bien5");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			Matricula.comprobarMatricula("a-1243.AB");
			System.out.println("bien5");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	

}
