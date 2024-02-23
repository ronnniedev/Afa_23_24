package ejercicio2clase;

public class PruebaCuenta {

	public static void main(String[] args) {
		CuentaAhorro ca1 = new CuentaAhorro (1000,12);
		ca1.setComision(3); // Indicamos  3 euros de comision
		ca1.imprimir();
		ca1.extractoMensual();
		System.out.println("Despues de aplicar estactor mensual: ");
		ca1.imprimir();
	}

}
