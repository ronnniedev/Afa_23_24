package ejemploclase2;

public class MainTreeSet {

	public static void main(String[] args) {
		
		PersonaTree p1 = new PersonaTree ("pepe",100);
		PersonaTree p2 = new PersonaTree ("Luis",200);
		PersonaTree p3 = new PersonaTree ("Juan",300);
		PersonaTree p4 = new PersonaTree ("Ana",400);

		Conjunto_TreeSet prueba = new Conjunto_TreeSet();
		prueba.añadirPersona(p1);
		prueba.añadirPersona(p2);
		prueba.añadirPersona(p3);
		prueba.añadirPersona(p4);
		
		prueba.mostrarConjunto();
		
		System.out.println("*********************************************");
		System.out.println("Añadimos Maria con 200 da ERROR");
		PersonaTree p6 = new PersonaTree("Maria",200);
		prueba.añadirPersona(p6);
		
		prueba.mostrarConjunto();
		
		System.out.println("*********************************************");
		System.out.println("Borramos p1");

		prueba.borrarPersona(p1);
		
		prueba.mostrarConjunto();
		
		System.out.println("*********************************************");
		System.out.println("Borramos a ana usando el siguiente objeto por que busca por codigo");
		PersonaTree pNueva = new PersonaTree("alba",400);
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
