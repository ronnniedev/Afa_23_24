package ficheros;

public class Pruebas {

	public static void main(String[] args) {
	
		/*Cliente c = new Cliente("53783768Q","Veronica","987678987");
		
		Cliente c1 = new Cliente("537837682","Veronica","987678987");
		Cliente c2 = new Cliente("53783768","Veronica","987678987");
		Cliente c3 = new Cliente("53Q783768","Veronica","987678987");
		
		System.out.println(c.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	*/
		
		Taller t = new Taller();
		
		
		Moto m1 = new Moto("B-1234-AB",1234,120);
		Moto m2 = new Moto("Z-6789-HZ",21412,130);
		Coche c1 = new Coche("Y-6137-MZ",2131,"Opel","Corsa");
		Coche c2 = new Coche("K-3234-BX",21314,"Porche","Omega");
		Cliente cl1 = new Cliente("53783768Q","Maria","98423942");
		Cliente cl2 = new Cliente("21345632A","Maria","98423942");
		Cliente cl3 = new Cliente("89123843X","Maria","98423942");
		
		t.añadirVehiculos(m1);
		t.añadirVehiculos(m2);
		t.añadirVehiculos(c1);
		t.añadirVehiculos(c2);
		t.mostrarVehiculos();
		
		t.añadirClientes(cl1);
		t.añadirClientes(cl2);
		t.añadirClientes(cl3);
		t.mostrarClientes();
		
		t.añadirReparaciones("53783768Q", "B-1234-AB", "20240304");
		t.añadirReparaciones("21345632A", "Z-6789-HZ", "20240423");
		t.añadirReparaciones("89123843X", "Y-6137-MZ", "20240423");
		t.añadirReparaciones("53783768Q", "K-3234-BX", "20240423");
		
		t.mostrarReparaciones();
		
		t.reparacionesPorCliente("53783768Q");
		
		
		
		
	}

}
