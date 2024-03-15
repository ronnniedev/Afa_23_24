package ejercicio2;

public class CuentaCorriente extends Cuenta{

	protected float sobregiro;
	
	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.sobregiro = 0;
	}
	@Override
	public void retirar(float cantidad) {
		super.retirar(cantidad);
		if (this.saldo < 0) {
			this.sobregiro = saldo;
			this.saldo = 0;
		}
		
	}
	
	@Override 
	public void consignar (float cantidad) {
		float ingreso = sobregiro +cantidad;
		if (ingreso >=  0) {
			super.consignar(ingreso);
			sobregiro = 0;
		} else {
			sobregiro = ingreso;
			this.numConsignas++;
		}
	
	}
	@Override
	public void extractoMensual () {
		super.extractoMensual();
		
	}
	
	public void imprimir () {
		System.out.println("\n-----------------------------------------------------\n");
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Comision mensual: " + this.comisionMensual);
		System.out.println("Transaciones realizadas: " + (this.numConsignas + this.numRetiros));
		System.out.println("Sobregiro: " + this.sobregiro);
		
		
	}
	
	
}
