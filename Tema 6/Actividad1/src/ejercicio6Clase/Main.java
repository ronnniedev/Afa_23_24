package ejercicio6Clase;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblio = new Biblioteca ("Biblioteca");
		cargaDatos(biblio);
		
		try {
			System.out.println(biblio.buscarLibro("11111"));
		} catch (LibroNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(biblio.buscarLibro("22222"));
		} catch (LibroNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(biblio.buscarLibro("33333"));
		} catch (LibroNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(biblio.buscarLibro("44444"));
		} catch (LibroNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(biblio.buscarSocio("nom6"));
		} catch (SocioNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
	
	private static void cargaDatos(Biblioteca biblio) {
			
		biblio.addSocio(new Socio ("111X","nom1","ape","cod1","33203"));
		biblio.addSocio(new Socio ("222X","nom2","ape","cod1","33203"));
		biblio.addSocio(new Socio ("333X","nom3","ape","cod1","33203"));
		biblio.addSocio(new Socio ("444X","nom4","ape","cod1","33203"));
		biblio.addSocio(new Socio ("555X","nom5","ape","cod1","33203"));
		
		// Lon
		biblio.addLibro(new Libro("11111","lib1","autores",Genero.COMEDIA));
		biblio.addLibro(new Libro("22222","lib2","autores",Genero.DRAMA));
		biblio.addLibro(new Libro("33333","lib3","autores",Genero.FICCION));
		biblio.addLibro(new Libro("44444","lib4","autores",Genero.HISTORIA));
		
		biblio.addPrestamos("111X","11111","20250510","20250512");
		biblio.addPrestamos("111X","22222","20250510","20250512");
		biblio.addPrestamos("222X","33333","20250513","20250515");
		biblio.addPrestamos("222X","44444","20250513","20250515");
		biblio.addPrestamos("333X","11111","20250520","20250522");
		
	}

}
