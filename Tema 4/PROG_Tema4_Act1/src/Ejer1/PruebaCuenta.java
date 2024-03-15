package Ejer1;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c1 = new Cuenta("pepe",150.0);
		System.out.println(c1.toString());
		Cuenta c2 = new Cuenta("juan",200.0);
		Cuenta c3 = new Cuenta("paco");
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		c1.setCantidad(100.0);
		System.out.println("Nueva cantidad: "+c1.toString());
		
		// c1=> cantidad=100
		c1.ingresar(200.0); 
		// cantidad=300
		if(c1.getCantidad()==300.0) {
			System.out.println("El metodo es correcto");
		}else {
			System.out.println("El metodo no es correcto");
		}
		
		// c1=> cantidad=300
		c1.retirar(100);
		// c1=> cantidad=200
		if(c1.getCantidad()==200.0) {
			System.out.println("El metodo retirar funciona ");
		}else {
			System.out.println("El metodo retirnar no funciona");
		}
		
		//c1=> cantidad=200
		c1.retirar(300);
		// c1=> cantidad=0
		if(c1.getCantidad()==0) {
			System.out.println("El metodo retirar funciona ");
		}else {
			System.out.println("El metodo retirnar no funciona");
		}
	}

}
