package ejercicio5;

public class Prueba {

	public static void main(String[] args) {
		

		Direccion d1 = new Direccion ("Calle Teodoro Cuesta","Gijon", 33207, "España");
		Direccion d2 = new Direccion ("Calle Marginado Gonzalez","Oviedo", 33208, "Dinamarca");
		Estudiante e1 = new Estudiante("Martin Pereira", "Mugo Bañil", "7848412'", d1, 1);
		Estudiante e2 = new Estudiante("e2", "Mugo Bañil", "7848412'", d2, 2);
		Profesor p1 = new Profesor("Pelaez", "Martin Prieto", "2783782913", d1, "ArribaDerecha");
		Profesor p2 = new Profesor("Pelaez", "Martin Prieto", "2783782913", d2, "ArribaDerecha");
		Vector listaPersonas = new Vector();
		
		listaPersonas.añadirALista(p2);
		listaPersonas.añadirALista(p1);
		listaPersonas.añadirALista(e1);
		listaPersonas.añadirALista(e2);
		
		System.out.println(e1.toString());
		
		listaPersonas.visualizar();
		
	}

}
