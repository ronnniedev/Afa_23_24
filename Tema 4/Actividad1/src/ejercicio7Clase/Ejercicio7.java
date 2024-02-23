package ejercicio7Clase;

public class Ejercicio7 {

	public static void main(String[] args) {

		Polideportivo poli = new Polideportivo ("poli","dirl", 100);
		
		poli.añadirPista(1, TipoPista.FUTBOL, true, 100, "20240110");
		poli.añadirPista(2, TipoPista.PADEL, true, 120, "20240111");
		poli.añadirPista(3, TipoPista.PATINAJE, true, 110, "20240112");
		poli.añadirPista(4, TipoPista.TENIS, true, 130, "20240113");
		
		System.out.println(poli.toString());
		
		Usuarios u1 = new Usuarios ("u1", "ape", "email", "XXX", "XXX", "XXX");
		Usuarios u2 = new Usuarios ("u1", "ape", "email", "XXX", "XXX", "XXX");
		Usuarios u3 = new Usuarios ("u1", "ape", "email", "XXX", "XXX", "XXX");
		
		Pistas p0=poli.getPista(0);
		Reservas r1 = new Reservas ("20240215" , "20240117", p0);
		r1.añadirUsuario(u1);
		r1.añadirUsuario(u2);
		System.out.println(r1.toString());
		
		
		
		
		
	}

}
