package ejercicio2clase;

public class PruebaAhorro {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente (1000,12);
		cc.imprimir();
		System.out.println("Retirar 400");
		cc.retirar(400);
		cc.imprimir();
		System.out.println("Retirar 900");
		cc.retirar(900);
		cc.imprimir();
		System.out.println("Consignar 100");
		cc.consignar(100);// giro = 200 saldo = 0
		cc.imprimir();
		System.out.println("Consignar 500");
		cc.consignar(500);// giro = 0 saldo = 300
		cc.imprimir();

	}

}
