package ejercicio2yo;

public abstract class Cuenta {

	protected long numCuenta;
	protected double saldo;
	protected Persona p;
	
	public Cuenta(long numCuenta,Persona c) {
		this.numCuenta = numCuenta;
		this.p = c;
	}

	public long getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Persona getC() {
		return p;
	}
	
	public void ingresar (double cantidad) {
		this.saldo = saldo + cantidad;
		
	}
	
	public abstract void retirar (double cantidad);
	
	public abstract void actualizarSaldo ();
	
	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo + ", p=" + p + "]";
	}
	
	
}
