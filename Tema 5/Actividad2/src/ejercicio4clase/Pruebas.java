package ejercicio4clase;

public class Pruebas {

	public static void main(String[] args) {
		
		Empresa e = new Empresa();
		e.añadirPersona(new Cliente("pepe",30,"XXXX"));
		e.añadirPersona(new Cliente("juan",35,"XXXX"));
		e.añadirPersona(new Cliente("carlos",40,"XXXX"));

		Directivo d = new Directivo("Juan", 49,2000,"XXX");
		d.añadirEmpleado("luis",20,1000);
		d.añadirEmpleado("ana",20,1000);
		d.añadirEmpleado("juan",20,1000);
		d.añadirEmpleado("carlos",20,1000);
		
		Directivo d2 = new Directivo("Juan", 49,2000,"XXX");
		d2.añadirEmpleado("luis",20,1000);
		d2.añadirEmpleado("ana",20,1000);
		d2.añadirEmpleado("juan",20,1000);
		d2.añadirEmpleado("carlos",20,1000);
		
		e.añadirPersona(d2);
		
		e.mostrarPersonas();
	}

}
