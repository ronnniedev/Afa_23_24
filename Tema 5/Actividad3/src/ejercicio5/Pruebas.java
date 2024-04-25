package ejercicio5;

public class Pruebas {

	public static void main(String[] args) {
		
		Taller t = new Taller();
		Vehiculo v = new Vehiculo("ABCD1","OPEL");
		Vehiculo v1 = new Vehiculo("ABCD2","OPEL");
		Vehiculo v2 = new Vehiculo("ABCD3","OPEL");
		Vehiculo v3 = new Vehiculo("ABCD3","OPEL");//este da error
		Vehiculo v4 = new Vehiculo("ABCD4","OPEL");
		
		Cliente c = new Cliente("XXXX1","Marcos");
		Cliente c2 = new Cliente("XXXX2","Diego");
		Cliente c3 = new Cliente("XXXX3","Mauricio");
		Cliente c4 = new Cliente("XXXX3","Mauricio");
		
		t.insertarVehiculo(v);
		t.insertarVehiculo(v1);
		t.insertarVehiculo(v2);
		t.insertarVehiculo(v3);
		t.insertarVehiculo(v4);
		
		t.insertarCliente(c);
		t.insertarCliente(c2);
		t.insertarCliente(c3);
		t.insertarCliente(c4); // este da error
		
		t.insertarReparacion("XXXX1", "ABCD1");
		t.insertarReparacion("XXXX1", "ABCD1");
		t.insertarReparacion("XXXX2", "ABCD3");
		t.insertarReparacion("XXXX2", "ABCD4");
		t.insertarReparacion("XXXX2", "ABCD2");
		t.insertarReparacion("XXXX3", "ABCD3");
		t.insertarReparacion("XXXa3", "ABCD3");
		t.insertarReparacion("XXXX3", "ABCD7");
		
		t.mostrarDatos();
		
		t.reparacionesPorCliente("XXXX1");
		t.reparacionesPorCliente("XXXX2");
		t.reparacionesPorCliente("XXXX3");
		t.reparacionesPorCliente("XXXX4");
		
		t.reparacionesPorVehiculo("ABCD1");
		t.reparacionesPorVehiculo("ABCD4");
		t.reparacionesPorVehiculo("ABCD12");
		
		
		

	}
	
	

}
