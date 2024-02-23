package ejercicio2clase;

public class PruebaCuentaAhorro {

	public static void main(String[] args) {
		CuentaAhorro ca = new CuentaAhorro (30000,12);
		ca.extractoMensual();
		ca.imprimir();
		ca.retirar(1000);
		ca.retirar(1000);
		ca.retirar(1000);
		ca.retirar(1000);
		ca.retirar(1000);
		ca.retirar(1000);
		ca.extractoMensual();
		System.out.println("Despues de retirar 6 veces 1000");
		ca.imprimir();
	}

}
