package ejercicio2clase;

public class CuentaAhorro extends Cuenta{
	
	protected boolean estaActiva;
	
	public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		if (saldo < 10000) {
			estaActiva = false;
		}else {
			estaActiva = true;
		}
		
	}
	/**
	 * Llamamos al metodo del padre si la cuenta esta activa
	 * @param cantidad real
	 */
	public void consignar (float cantidad) {
		
		if (true == estaActiva) {
			super.consignar(cantidad);
		}else {
			System.out.println("La cuenta no esta activa");
			
		}
	}
	/** Returar : es posible retirar el dinero de la cuenta si esta actiova
	 *  Debe invocar el motodor heredado
	 */
	public void retirar (float cantidad) {
	
		if (true == estaActiva) {
			super.retirar(cantidad);
			if (saldo < 10000) {
				estaActiva = false;
			}
		}
	
	}
	/**
	 * 
	 */
	
	public void extractoMensual () {
		if (numeroRetiros > 4) {
			int excesoRetiros = numeroRetiros -4;
			setComision(excesoRetiros*1000);
		}else {
			setComision(0);
		}
		
		super.extractoMensual();
		
		if (saldo < 10000) {
			estaActiva = false;
		}else {
			estaActiva = true;
		}
		
	}
	
	public void imprimir () {
		
		System.out.println("Saldo: " + this.saldo + "\n Comision : " + this.comision + "\n Num Transacciones: "
				+ "" + (this.numeroConsignaciones+this.numeroRetiros));
		

	}

}
