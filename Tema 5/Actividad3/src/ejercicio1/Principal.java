package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taller taller = new Taller();
		taller.añadirVehiculo(new Vehiculo("1234-ASD",10,"XXX"));
		taller.añadirVehiculo(new Vehiculo("1234-ASD",10,"XXX"));
		taller.añadirVehiculo(new Vehiculo("5678-ASE",10,"XXX"));
		taller.añadirVehiculo(new Vehiculo("5555-BCF",10,"XXX"));
		taller.mostrarTaller();
		taller.mostrarTaller2();
		
		//errorres de insercicon
		System.out.println("ERRORES***********");
		taller.añadirVehiculo(new Vehiculo("1234-ASD",10,"XXX"));
		System.out.println("ERROR 12D4");
		taller.añadirVehiculo(new Vehiculo("12D4-ASD",10,"XXX"));
		System.out.println("ERROR A5D");
		taller.añadirVehiculo(new Vehiculo("1234-A5D",10,"XXX"));
	}

}
