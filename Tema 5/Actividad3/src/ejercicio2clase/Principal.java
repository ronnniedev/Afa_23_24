package ejercicio2clase;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agenda agenda = new Agenda();
		
		agenda.nuevaEntrada("123123123", "nombre1", "dir1");
		agenda.nuevaEntrada("456456456", "nombre2", "dir2");
		agenda.nuevaEntrada("789789789", "nombre3", "dir3");
		agenda.nuevaEntrada("123456789", "nombre4", "dir4");
		agenda.nuevaEntrada("123123123", "nombre1", "dir1");
		
		Contacto c1=agenda.buscarContactosTelefono("123123123");
		
		System.out.println("*********Prueba********");
		if (c1 == null) {
			System.out.println("Contacto no encontrado");
		}else {
			System.out.println("Buscamos 123123123");
			System.out.println("\t" + c1.toString());
		}
		
		System.out.println("*********Prueba********");
		Contacto c2=agenda.buscarContactosTelefono("230921123");
		
		if (c2 == null) {
			System.out.println("Contacto no encontrado");
		}else {
			System.out.println("Buscamos 230921123");
			System.out.println("\t" + c2.toString());
		}
		
		System.out.println("*********Prueba********");
		Contacto c3=agenda.buscarContactoNombre("nombre2");
		
		if (c3 == null) {
			System.out.println("Contacto no encontrado");
		}else {
			System.out.println("Buscamos nombre1");
			System.out.println("\t" + c3.toString());
		}
		
		System.out.println("*********Prueba********");
		c3=agenda.buscarContactoNombre("nombre5");
		if (c3 == null) {
			System.out.println("Contacto no encontrado");
		}else {
			System.out.println("Buscamos nombre4");
			System.out.println("\t" + c3.toString());
		}
		

	}

}
