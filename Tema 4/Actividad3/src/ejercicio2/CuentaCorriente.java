package ejercicio2;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(long numCuenta, double saldo, int cantidad) {
		super(numCuenta, saldo, cantidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirar() {
		// TODO Auto-generated method stub
		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
		}
	}

}
