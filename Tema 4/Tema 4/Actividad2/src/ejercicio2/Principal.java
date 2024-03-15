package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
		CuentaAhorro ca1 = new CuentaAhorro (14000,12);
		ca1.setComisionMensual(1);
		ca1.imprimir();
		System.out.println("Despues de aplicar extractor mensual: ");
		ca1.retirar(1);
		ca1.retirar(1);
		ca1.retirar(1);
		ca1.retirar(1);
		ca1.retirar(1);
		ca1.retirar(1);
		ca1.extractoMensual();
		ca1.imprimir();
		

	}

}
