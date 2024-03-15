package ejercicio2;

public class Cuenta {
	
	protected float saldo;
	protected int numConsignas;
	protected int numRetiros;
	protected float TasaAnual;
	protected float comisionMensual;
	
	
	/**
	 * @param saldo
	 * @param tasaAnual
	 */
	public Cuenta(float saldo, float tasaAnual) {
		this.numConsignas = 0;
		this.numRetiros = 0;
		this.comisionMensual = 0;
		this.saldo = saldo;
		TasaAnual = tasaAnual;
	}
	
	public void consignar (float cantidad) {
		
		if (cantidad > 0) {
			this.saldo += cantidad;
			numConsignas++;
		}else {
			System.out.println("Valor introducido no valido");
		}
		
	}
	
	public void retirar (float cantidad) {
		if (cantidad > 0) {
			this.saldo -= cantidad;
			numRetiros++;
			
		}else {
			System.out.println("Numero introducido no valido");
		}

	}
	
	public void calcularInteres () {
		float cantidad = (this.saldo/100)*this.TasaAnual;
		
		this.saldo = this.saldo + cantidad/12;
		
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", TasaAnual=" + TasaAnual + ", ComisionMensual=" + comisionMensual + "]";
	}

	/**
	 * @return the comisionMensual
	 */
	public float getComisionMensual() {
		return comisionMensual;
	}

	/**
	 * @param comisionMensual the comisionMensual to set
	 */
	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}
	
	public void extractoMensual() {
		calcularInteres();
		saldo = saldo - this.comisionMensual ;
		
	}
	
}
