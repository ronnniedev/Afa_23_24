package Ejer1;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	
	/** contructor con dos parametros
	 * @param titular String 
	 * @param cantidad real
	 */
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}


	/** contructor con un solo parametro
	 * @param titular string
	 */
	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0.0;
	}


	/** metodo get del atributo titular
	 * @return String
	 */
	public String getTitular() {
		return titular;
	}


	/** metodo set del atributo titular
	 * @param titular : string
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}


	/** metodo get del atributo cantidad
	 * @return real
	 */
	public double getCantidad() {
		return cantidad;
	}


	/** Metodo set del atributo cantidad
	 * @param cantidad real
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Metodo toString de la clas cuenta
	 * @return string
	 */
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	/**
	 * metodo para icnrementar la cantidad en funcion del parametro
	 * @param cantidad real
	 */
	public void ingresar(double cantidad) {
		if(cantidad>=0) {
			this.cantidad+=cantidad;
		}
	}
	
	public void retirar(int cantidadACuenta) {
		if(this.cantidad<cantidadACuenta) {
			this.cantidad=0;
		}else {
			this.cantidad-=cantidadACuenta;
		}
	}
}







