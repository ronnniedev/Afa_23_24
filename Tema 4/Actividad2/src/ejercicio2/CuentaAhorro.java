package ejercicio2;

public class CuentaAhorro extends Cuenta{

	protected boolean estaActiva;
	
	public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		
		if (this.saldo >= 10000) {
			
			this.estaActiva = true;
			
		}else {
			
			this.estaActiva = false;
			
		}
	}
	
	public void consignar (float cantidad) {
		
		if (estaActiva) {
			super.consignar(cantidad);
		}else {
			System.out.println("Cuenta inactiva");
		}
		
	}
	
	public void retirar (float cantidad) {
		
		if (estaActiva) {
			super.retirar(cantidad);
			if (this.saldo < 10000) {
				estaActiva = false;
			}
		}else {
			System.out.println("Cuenta inactiva");
		}
		
	}
	
	public void extractoMensual () {
		
		if (estaActiva) {
			if (this.numRetiros > 4) {
				for (int i = numRetiros-4; i > 0; i--) {
					this.saldo -= 1000;
					
				}
			}else {
				super.extractoMensual();
			}
			
			if (this.saldo < 10000) {
				estaActiva = false;
			}
		}else {
			System.out.println("La cuenta esta inactiva");
		}
		
	}
	
	public void imprimir () {
		
		System.out.println("Saldo: " + this.saldo + " Comision mensual: " + this.comisionMensual + " Numero movimientos :"
				+ (this.numRetiros+this.numConsignas));
	}
	
}
