package Act1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taller taller=new Taller();
		Vehiculo v1=new Vehiculo("1234-ASD", 10, "XXX");
		Vehiculo v2=new Vehiculo("12D4-ASD", 10, "XXX");
		Vehiculo v3=new Vehiculo("1234-A4D", 10, "XXX");
		
		taller.añadirVehiculo(v1);
		taller.añadirVehiculo(v2);
		taller.añadirVehiculo(v3);
		
		taller.mostrarTaller_2();
	}

}
