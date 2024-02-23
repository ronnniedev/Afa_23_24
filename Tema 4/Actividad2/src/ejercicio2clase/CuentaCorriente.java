package ejercicio2clase;

public class CuentaCorriente extends Cuenta{
	
	protected float giro;
	
	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.giro = 0;
	}
	@Override
	public void retirar (float cantidad) {
		if (cantidad <= saldo) {
			super.retirar(cantidad);
		}else {
			this.giro = cantidad - this.saldo;
			this.saldo = 0;
			this.numeroRetiros++;
		}
		
	}
	@Override
	public void consignar(float cantidad) {
		if (this.giro > 0) {
			// saldo = 0
			if (this.giro <= cantidad) {
				this.saldo = cantidad - giro;
				this.giro = 0;
			}else {
				this.giro -= cantidad;
			}
			
		}else {
			super.consignar(cantidad);
		}
		
	}
	
	public void imprimir () {
		
		System.out.println("Saldo : " + saldo + "\n comision :" + comision + "\n\t Numero transacciones : " + (numeroRetiros
				+numeroConsignaciones));
		
	}
	
	
}
