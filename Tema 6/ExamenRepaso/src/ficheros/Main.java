package ficheros;

public class Main {

	public static void main(String[] args) {
		cargarDatos();
		pruebaFecha();
		pruebaMatricula();
		// pruebaAutobus();
		// pruebaListarAlquileresAutobus(cargarDatos());
		// pruebaListarAlquileresCliente(cargarDatos());
		// pruebaAutocaresDisponibles(cargarDatos());
		// pruebaGenerarFactura(cargarDatos());
	}
	
	private static void pruebaMatricula() {
		// TODO Auto-generated method stub
		try {
			Matricula m1 = new Matricula("1234-ABC");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		try {
			Matricula m1 = new Matricula("1234ABC");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("1234ABC " + e.toString());
		}
		try {
			Matricula m1 = new Matricula("123-ABCD");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("123-ABCD " + e.toString());
		}
		try {
			Matricula m1 = new Matricula("12345-AB");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("12345-AB " + e.toString());
		}
		try {
			Matricula m1 = new Matricula("1234*ABC");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("1234*ABC " + e.toString());
		}
		try {
			Matricula m1 = new Matricula("1X34-ABC");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("1X34-ABC " + e.toString());
		}
		try {
			Matricula m1 = new Matricula("1234-A1C");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("1234-A1C " + e.toString());
		}
	}
	
	
	private static void pruebaListarAlquileresAutobus(Gestor gestor) {
		// TODO Auto-generated method stub
		try {
			System.out.println(gestor.listarAlquileresAutobus("1234-ABC"));
		} catch (ExamenException | FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

		try {
			System.out.println(gestor.listarAlquileresAutobus("1234-XXX"));
		} catch (ExamenException  | FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("1234-XXX : " + e.toString());
		}
	}
	
	private static void pruebaGenerarFactura(Gestor gestor) {
		// TODO Auto-generated method stub
		try {
			System.out.println(gestor.generarFactura("111X"));
		} catch (ExamenException  e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

		try {
			System.out.println(gestor.generarFactura("666666X"));
		} catch (ExamenException  e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

	}

	private static void pruebaAutocaresDisponibles(Gestor gestor) {
		// TODO Auto-generated method stub
		try {
			System.out.println(gestor.autobusesDisponibles("12/01/2024", 5, 7));
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void pruebaListarAlquileresCliente(Gestor gestor) {
		// TODO Auto-generated method stub
		try {
			System.out.println(gestor.listarAlquileresCliente("111X"));
		} catch (ExamenException  e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

		try {
			System.out.println(gestor.listarAlquileresCliente("9999X"));
		} catch (ExamenException  e) {
			// TODO Auto-generated catch block
			System.out.println("9999X " + e.toString());
		}
	}



	

	private static void pruebaFecha() {
		// TODO Auto-generated method stub
		int valor1;
		try {
			valor1 = Autobus.CalcularDia("01/01/2024");
			System.out.println("30/01 :" + valor1);
			valor1 = Autobus.CalcularDia("30/01/2024");
			System.out.println("30/01 :" + valor1);
			valor1 = Autobus.CalcularDia("30/04/2024");
			System.out.println("30/04 :" + valor1);
			valor1 = Autobus.CalcularDia("31/12/2024");
			System.out.println("30/04 :" + valor1);
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

		try {
			valor1 = Autobus.CalcularDia("40/01/2024");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("40/01: " + e.toString());
		}
		try {
			valor1 = Autobus.CalcularDia("20/15/2024");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("20/15: " + e.toString());
		}
		try {
			valor1 = Autobus.CalcularDia("31/02/2024");
		} catch (FormatoException e) {
			// TODO Auto-generated catch block
			System.out.println("31/02: " + e.toString());
		}

	}

	private static void pruebaAutobus() {
		// TODO Auto-generated method stub
		Gestor gestor = new Gestor();

		try {
			Autobus a1=new Autobus("1234-ABC", 5, 10.0);
			a1.alquilar("10/01/2024",5);
			a1.alquilar("10/02/2024",5);
			gestor.addAutobus(a1);
			Autobus a2=new Autobus("1235-ABC", 10, 15.0);
			a2.alquilar("10/01/2024",5);
			a2.alquilar("10/02/2024",5);
			gestor.addAutobus(new Autobus("1236-ABC", 5, 10.0));
			gestor.addAutobus(new Autobus("1237-ABC", 10, 15.0));
			gestor.addAutobus(new Autobus("1238-ABC", 7, 10.0));
			System.out.println(gestor.listarTodosLosAutobuses());
		} catch (FormatoException | ExamenException  e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	
		try {
			Autobus a = new Autobus("1234-ABC", 5, 10.0);
			a.alquilar("10/01/2024",5);
			a.alquilar("10/02/2024",5);
			gestor.addAutobus(a);
		} catch (FormatoException | ExamenException  e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
		try {
			Autobus a = new Autobus("1234-XXX", 5, 10.0);
			a.alquilar("10/01/2024",5);
			a.alquilar("12/01/2024",5);
			gestor.addAutobus(a);
		} catch (FormatoException| ExamenException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

	}
	
	private static Gestor cargarDatos() {
		// TODO Auto-generated method stub
		Gestor gestor = new Gestor();
		
			try {
				gestor.addAutobus(new Autobus("1234-ABC", 5, 10.0));
				gestor.addAutobus(new Autobus("1235-ABC", 10, 15.0));
				gestor.addAutobus(new Autobus("1236-ABC", 5, 10.0));
				gestor.addAutobus(new Autobus("1237-ABC", 10, 15.0));
				gestor.addAutobus(new Autobus("1238-ABC", 7, 10.0));

				gestor.addCliente(new Cliente("111X", "cliente1"));
				gestor.addCliente(new Cliente("222X", "cliente2"));
				gestor.addCliente(new Cliente("333X", "cliente3"));
				gestor.addCliente(new Cliente("444X", "cliente4"));

				gestor.alquilarAutocar("1234-ABC", "111X", "10/01/2024", 5, 100);
				gestor.alquilarAutocar("1235-ABC", "222X", "10/01/2024", 5, 100);
				gestor.alquilarAutocar("1234-ABC", "111X", "10/02/2024", 5, 100);
				gestor.alquilarAutocar("1235-ABC", "222X", "10/02/2024", 5, 100);
				gestor.alquilarAutocar("1236-ABC", "333X", "10/03/2024", 5, 100);
				gestor.alquilarAutocar("1237-ABC", "444X", "10/03/2024", 5, 100);
				gestor.alquilarAutocar("1236-ABC", "333X", "10/04/2024", 5, 100);
				gestor.alquilarAutocar("1237-ABC", "444X", "10/04/2024", 5, 100);
				
			} catch (ExamenException  | FormatoException e) {
				System.out.println(e.getMessage());
			}
			return gestor;
			
	}
	
	
	

}
