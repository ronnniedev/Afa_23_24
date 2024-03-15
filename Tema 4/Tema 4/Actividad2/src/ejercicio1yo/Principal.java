package ejercicio1yo;

import ejercicio1.LibroTextoFacultad;

public class Principal {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("Libro 1", "Mauricio");
		l1.setPrecio(100);
		System.out.println(l1.toString());
		
		
		LibroTexto lt1 = new LibroTexto ("Libro texto 1"," Arturito ",1);
		lt1.setPrecio(200);
		System.out.println(lt1.toString());
		
		LibroTextoFacultad lf1 = new LibroTextoFacultad ("Facultita", "Autorgenerico",2, "Ovedo");
		lf1.setPrecio(400);
		System.out.println(lf1.toString());
		
		
		Novela n1 = new Novela ("Novela 1", "Dieguito" , TipoNovela.AVENTURAS);
		n1.setPrecio(300);
		System.out.println(n1.toString());
		

	}

}
