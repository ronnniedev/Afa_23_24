package ejercicio2yo;

public class CuentaCorriente extends Cuenta {

	private double interes;
	
	public CuentaCorriente(long numCuenta, Persona c) {
		super(numCuenta, c);
		this.interes = 0.015;
		//----->hector eres sun puto<-----
		
	}

	
	@Override
	public void retirar(double cantidad) {
		this.saldo = saldo - cantidad;
		
	}

	@Override
	public void actualizarSaldo() {
		this.saldo = this.saldo - (saldo*interes);
		
	}
	
	@Override
	public String toString() {
		return "CuentaCorriente [interes=" + interes + ", numCuenta=" + numCuenta + ", saldo=" + saldo + ", p=" + p
				+ "]";
	}

	
	

	
	
	
	
}
