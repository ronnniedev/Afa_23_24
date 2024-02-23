package ejercicio1;

public class Prueba {

	public static void main(String[] args) {
		
		Libro l1 = new Libro ("libro1","autor1");
		
		l1.setPrecio(100);
		
		System.out.println(l1.toString());
		
		System.out.println("Precio con 12 % de iva " + l1.precioConIva(12));
		System.out.println("\n*********************************************\n");
		
		LibroTexto lt1 = new LibroTexto ("lt1","Autor", 4);
		lt1.setPrecio(200);
		
		System.out.println(lt1.toString());
		
		System.out.println("Precio con iva del 10% " + lt1.precioConIva(10));
		System.out.println("\n*********************************************\n");
		LibroTextoFacultad lf1 = new LibroTextoFacultad ("LibroFacultad", "autor1", 1, "Informatica");
		
		lf1.setPrecio(200);
		
		System.out.println(lf1.toString());
		System.out.println(lf1.precioConIva(5));
		
		System.out.println("\n*********************************************\n");
		Novela n = new Novela ("novela1", "autorN", TipoNovela.AVENTURAS);
		System.out.println(n.toString());
		
		

	}

}
