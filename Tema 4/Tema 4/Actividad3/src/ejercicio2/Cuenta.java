package ejercicio2;

public abstract class Cuenta {

	protected long numCuenta;
	protected double saldo;
	protected int cantidad;
	
	public Cuenta(long numCuenta, double saldo, int cantidad) {
		super();
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.cantidad = cantidad;
	}

	public long getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(long numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo + ", cantidad=" + cantidad + "]";
	}

	public void ingresar (double cantidad) {
		this.saldo = this.saldo+cantidad;
		
		
	}
	
	public abstract void retirar ();
	
}
