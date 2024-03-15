package ejercicio2yo;

import java.util.Scanner;

public class CuentaAhorro extends Cuenta{

	static Scanner keyboard=new Scanner(System.in);
	
	private double interes;
	private double saldoMinimo;
	
	public CuentaAhorro(long numCuenta, Persona c,double saldoMinimo) {
		
		super(numCuenta, c);
		this.interes = 0;
		this.saldoMinimo = saldoMinimo;
		
	}

	@Override
	public void retirar(double cantidad) {
		
		
		
		if (this.saldo - cantidad < this.saldoMinimo) {
			System.out.println("La cuenta no peude retirar tanto dinero");
		}else {
			saldo = saldo - cantidad;
		}
		
	}

	@Override
	public void actualizarSaldo() {
		System.out.println(this.saldo);
		this.saldo = this.saldo - (this.saldo*interes);
		System.out.println(this.saldo);
		
	}
	
	public void cambiarInteres() {
		
		System.out.println("Introduce el nuevo interes :");
		double num = keyboard.nextDouble();
		this.interes = num * 0.01;
		
	}

	@Override
	public String toString() {
		return "CuentaAhorro [interes=" + interes + ", saldoMinimo=" + saldoMinimo + ", numCuenta=" + numCuenta
				+ ", saldo=" + saldo + ", p=" + p + "]";
	}
	

	
	
	
}
