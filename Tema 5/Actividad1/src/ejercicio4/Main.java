package ejercicio4;

public class Main {

	public static void main(String[] args) {
		
		Cine c = new Cine();
		Persona per1 = new Persona ("Per1");
		Persona per2 = new Persona ("Per2");
		Persona per3 = new Persona ("Per3");
		Persona per4 = new Persona ("Per4");
		Persona per5 = new Persona ("Per5");
		Persona per6 = new Persona ("Per6");
		
		c.añadirPersonaenLaCola(per1);
		c.añadirPersonaenLaCola(per2);
		c.añadirPersonaenLaCola(per3);
		c.añadirPersonaenLaCola(per4);
		c.añadirPersonaenLaCola(per5);
		c.listarCola();
		
		c.crearSesion();
		c.crearSesion();
		c.mostrarSesiones();
		
		c.añadirPersonaSesion();
		c.listarCola();
		c.añadirPersonaSesion();
		c.listarCola();
		c.añadirPersonaSesion();
		c.listarCola();
		
		c.añadirPersonaenLaCola(per6);
		c.listarCola();
		
		c.mostrarSesiones();
		
		
		

	}

}
