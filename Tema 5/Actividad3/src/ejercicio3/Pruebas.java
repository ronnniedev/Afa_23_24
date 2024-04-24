package ejercicio3;

public class Pruebas {

	public static void main(String[] args) {
		
		Gestor g = new Gestor();
		Login.nuevoRegistro("abcdfg", "Abcdef2");
		Login.nuevoRegistro("tyufgh", "Abcdef1");
		Login.nuevoRegistro("zarftg", "Abcdef1");
		
		g.logearse("zarftg", "Abcdef1");
		g.logearse("abcdfg", "Abcdef2");
		Login.nuevaContraseña("zarftg","Abcdef1","A");
		g.logearse("zarftg", "Abcdef1");
		g.logearse("zartg", "Abcdef1"); // usuario introducido no localizado
		
		g.registroDeLogins();
		
		g.logearse("tyufgh", "Abcdef1");
		
		g.registroDeLogins();
	}

}
