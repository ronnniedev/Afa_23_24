package ejercicio7;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca("La biblio");
		
		try {
			b.añadirLibro("El señor anillos","Tolkie","Drama");
			b.añadirLibro("Wompa","Tolkien","Drama");
			b.añadirLibro("Ajedrez para dummies","Tolkien","miasma");
			b.añadirLibro("Pepinillo","Tolkien","roma");
			b.añadirLibro("Roma Gallardo","Tolkien","Drama");
		}catch(YaEnListaException e1) {
			System.out.println(e1);
		}
		
		Socio s1 = new Socio("123","Marcos","Sinergia","123312");
		Socio s2 = new Socio("1237","Marcos","Sinergia","123312");
		Socio s3 = new Socio("1234","Marcos","Sinergia","123312");
		Socio s4 = new Socio("1235","Marcos","Sinergia","123312");
			
		try {
			b.añadirSocio(s1);
			b.añadirSocio(s2);
			b.añadirSocio(s3);
			b.añadirSocio(s4);
		}catch(YaEnListaException e1) {
			System.out.println(e1);
		}
		System.out.println("----------Prueba encontrar Libro---------");
		try {
			b.encontradorLibro("1");
		}catch(LibroNotFoundException e1) {
			System.out.println("ajdhjaksd");
		}
		
	
		System.out.println("----------Prueba encontrar Socio---------");
		try {
			b.encontradorSocio("1237s");
		}catch(SocioNotFoundException e1) {
			System.out.println("ajdhjaksd");
		}
		
		b.listarLibros();
		b.listarSocios();

	}

}
