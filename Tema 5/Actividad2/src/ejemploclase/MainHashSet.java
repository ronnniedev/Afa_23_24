package ejemploclase;

public class MainHashSet {

	public static void main(String[] args) {
		
		Persona p1 = new Persona ("pepe",100);
		Persona p2 = new Persona ("Luis",200);
		Persona p3 = new Persona ("Juan",300);
		Persona p4 = new Persona ("Ana",400);

		Conjunto_HashSet prueba = new Conjunto_HashSet();
		prueba.añadirPersona(p1);
		prueba.añadirPersona(p2);
		prueba.añadirPersona(p3);
		prueba.añadirPersona(p4);
		
		prueba.mostrarConjunto();
		
		System.out.println("*********************************************");
		System.out.println("Añadimos Maria con 200 da ERROR");
		Persona p6 = new Persona("Maria",200);
		prueba.añadirPersona(p6);
		
		prueba.mostrarConjunto();
		
		System.out.println("*********************************************");
		System.out.println("Borramos p1");

		prueba.borrarPersona(p1);
		
		prueba.mostrarConjunto();
		
		System.out.println("*********************************************");
		System.out.println("Borramos a ana usando el siguiente objeto por que busca por codigo");
		Persona pNueva = new Persona("alba",400);
		prueba.borrarPersona(pNueva);
		
		prueba.mostrarConjunto();
		
		prueba.añadirPersona(p1);
		prueba.añadirPersona(p3);
		System.out.println("******************************************");
		prueba.mostrarConjunto();
		
		System.out.println("******************************************");
		System.out.println("Borramos con el codigo 100");
		prueba.borrarPersona(100);
		prueba.mostrarConjunto();
		
		
	}

}
