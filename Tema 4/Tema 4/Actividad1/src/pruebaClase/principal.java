package pruebaClase;

import java.util.Scanner;

public class principal {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
	
		
		Tienda t = new Tienda();
		
		Electrodomestico e1 = new Electrodomestico("iden1", "lavadora", "fagor,",120.0,false);
		Electrodomestico e2 = new Electrodomestico("iden2", "frigorifico", "fagor,",2000,true);
		Electrodomestico e3 = new Electrodomestico("iden3", "lavadora", "fagor,",120.0,false);
		Electrodomestico e4 = new Electrodomestico("iden4", "frigorifico", "fagor,",2000,false);
		Electrodomestico e5 = new Electrodomestico("iden5", "lavadora", "fagor,",120.0,false);
		Electrodomestico e6 = new Electrodomestico("iden6", "frigorifico", "fagor,",2000,true);
		Electrodomestico e7 = new Electrodomestico("iden7", "lavadora", "fagor,",120.0,false);
		Electrodomestico e8 = new Electrodomestico("iden8", "frigorifico", "fagor,",23,true);
		Electrodomestico e9 = new Electrodomestico("iden9", "lavadora", "fagor,",120.0,false);
		Electrodomestico e10 = new Electrodomestico("iden10", "frigorifico", "fagor,",24124,true);
		
		t.añadirElectrodomestico(e1);
		t.añadirElectrodomestico(e2);
		t.añadirElectrodomestico(e3);
		t.añadirElectrodomestico(e4);
		t.añadirElectrodomestico(e5);
		t.añadirElectrodomestico(e6);
		t.añadirElectrodomestico(e7);
		t.añadirElectrodomestico(e8);
		t.añadirElectrodomestico(e9);
		t.añadirElectrodomestico(e10);
		t.añadirElectrodomestico(e10); //se ve que no pueden añadirse mas electrodomesticos
		
		t.visualizar();
		
		t.borrarElectrodomestico(e9.getId());
		System.out.println("\n--------------------------------\n");
		t.visualizar();
		
		System.out.println("\n----------------Stock--------------\n");
		
		t.visualizarStock();
		
		System.out.println("Introduce el identificador: ");
		String iden = keyboard.next();
		
		t.visualizarPrecio(iden);

	}

}
