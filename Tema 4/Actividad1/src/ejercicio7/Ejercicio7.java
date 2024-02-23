package ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Polideportivo p1 = new Polideportivo ("Maricarmen","Calle viñedo de abajo", "300 m2");
		Polideportivo p2 = new Polideportivo ("Maricarmen2","Calle viñedo de abajoSuper", "700 m2");
		
		Usuarios u1 = new Usuarios ("n1", "a1 a12", "c1 ", 6389, "54678901Q", "26-7-1995");
		Usuarios u2 = new Usuarios ("n2", "a1 a12", "c1 ", 6389, "54678901Q", "26-7-1995");
		Usuarios u3 = new Usuarios ("n3", "a1 a12", "c1 ", 6389, "54678901Q", "26-7-1995");
		Usuarios u4 = new Usuarios ("n4", "a1 a12", "c1 ", 6389, "54678901Q", "26-7-1995");
		Usuarios u5 = new Usuarios ("n5", "a1 a12", "c1 ", 6389, "54678901Q", "26-7-1995");
		Usuarios u6 = new Usuarios ("n6", "a1 a12", "c1 ", 6389, "54678901Q", "26-7-1995");
		
		p1.añadir(u1);
		p1.añadir(u2);
		p1.añadir(u3);
		p2.añadir(u4);
		p2.añadir(u5);
		p2.añadir(u6);
		
		p1.añadirPistas(1, "Padel", true ,100 , "12-5-2022");
		p1.añadirPistas(2, "Badminton", false  ,200 , "17-5-2023");
		p2.añadirPistas(3, "Tenis", false  ,200 , "17-5-2021");
		p2.añadirPistas(4, "Balonmano", false  ,200 , "17-5-2019");
		
		p1.añadirReserva(1,"21-3-22", "22-4-23", u1);
		p1.añadirReserva(1,"21-3-22", "22-4-23", u2);
		p1.añadirReserva(4,"21-3-22", "22-4-23", u3);
		p2.añadirReserva(4,"21-3-22", "22-4-23", u4);

		p1.visualizar();
		p2.visualizar();
		
		
		
	}

}
