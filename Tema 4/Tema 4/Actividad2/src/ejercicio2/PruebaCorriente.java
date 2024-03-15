package ejercicio2;

/**
 * @author Veronica Gonzalez
 * @version 1.0
 */
public class PruebaCorriente {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(2000,12);
		cc.imprimir();
		cc.setComisionMensual(500);
		cc.retirar(3000);
		cc.imprimir();
		cc.consignar(500);
		cc.imprimir();
		cc.consignar(2000);
		cc.imprimir();
		cc.consignar(2000);
		cc.imprimir();
		cc.extractoMensual();
		cc.imprimir();

	}

}
