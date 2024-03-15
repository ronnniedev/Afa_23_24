package ejercicio1;

public class ProductoGrande extends Producto{

	private double plusMontaje;

	/**
	 * @param ref
	 * @param nombre
	 * @param precio
	 * @param plusMontaje
	 */
	public ProductoGrande(String ref, String nombre, double precio, double plusMontaje) {
		super(ref, nombre, precio);
		this.plusMontaje = plusMontaje;
	}

	@Override
	public String toString() {
		return "ProductoGrande [plusMontaje=" + plusMontaje + ", ref=" + ref + ", nombre=" + nombre + ", precio="
				+ precio + "]";
	}

	public double precioConIva(int porcentaje) {
		double precioTotal= precio+plusMontaje;
		return (precioTotal+(precioTotal*porcentaje/100));
	}
}
