package ejercicio2clase;

public class Cuenta {

	protected float saldo;
	protected int numeroConsignaciones;
	protected int numeroRetiros;
	protected float tasaAnual;
	protected float comision;
	
	/**
	 * @param saldo
	 * @param tasaAnual
	 */
	public Cuenta(float saldo, float tasaAnual) {
		this.numeroConsignaciones = 0;
		this.numeroRetiros = 0;
		this.comision = 0;
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}
	/**
	 * Asigna un saldo 
	 * @param cantidad
	 */
	public void consignar (float cantidad) {
		this.saldo += cantidad;
		this.numeroConsignaciones++;
		
	}
	/**
	 * Retira una cantidad determinada de la cuenta
	 * @param cantidad
	 */
	public void retirar (float cantidad) {
		if (cantidad <= this.saldo) {
			saldo -= cantidad;
			this.numeroRetiros++;
		}
		
		
	}
	/**
	 * Calcular interes
	 * TasaAnual 12% => TasaNual = 12
	 */
	public void calcularInteres() {
		float cantidad = saldo*this.tasaAnual/100;
		this.saldo = saldo + cantidad/12;
		System.out.println("Interes mensual: "+cantidad/12);
		
		
	}
	
	public void extractoMensual () {
		calcularInteres(); //actualizamos el saldo
		saldo = saldo - comision;
	
	}
	/**
	 * @return the tasaAnual
	 */
	public float getTasaAnual() {
		return tasaAnual;
	}
	/**
	 * @param tasaAnual the tasaAnual to set
	 */
	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}
	/**
	 * @return the comision
	 */
	public float getComision() {
		return comision;
	}
	/**
	 * @param comision the comision to set
	 */
	public void setComision(float comision) {
		this.comision = comision;
	}
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numeroConsignaciones=" + numeroConsignaciones + ", numeroRetiros="
				+ numeroRetiros + ", tasaAnual=" + tasaAnual + ", comision=" + comision + "]";
	}
	
	
	
	
	
}
