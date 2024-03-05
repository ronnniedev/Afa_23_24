package ficheros;
/**
 * @author Veronica
 * @version 1.0
 */
public class Television extends Electrodomestico {

	protected int resolucion;

	/**
	 * Constructor que llama al constructor base y por defecto de clase Television
	 * @param altura
	 */
	public Television() {
		super();
		this.resolucion = 43;
		this.precio = PRECIO_BASE;
	}
	/**
	 * Constructor con valores por defecto de la clase padre , de dos parametros de la clase Television
	 * @param precio
	 * @param peso
	 */
	public Television (int precio, int peso) {
		super();
		this.resolucion = 43;
		this.peso = peso;
		this.precio = precio;
	}

	/**
	 * Metodo get de Resolucion de la clase Television
	 * @return the altura
	 */
	public int getResolucion() {
		return resolucion;
	}
	/**
	 * Metodo que calcula el precio final de la clase Television
	 * @return int
	 */
	public int precioFinal() {
		return this.precio+ precioPeso()+precioConsumo() +precioResolucion();
	}
	/**
	 * Calcula el incremento del precio final en funcion de la resolucion
	 * @return
	 */
	public int precioResolucion() {
		int precio = 0;
		
		if (this.resolucion > 50) {
			precio = 100;
		}
		
		return precio;
		
	}

	/**
	 * Metodo toString de 5 parametros de la clase Television
	 */
	public String toString() {
		return "Television [resolucion=" + resolucion + ", consumo=" + consumo + ", precio=" + precio + ", peso=" + peso
				+ ", color=" + color + "]";
	}
	
	
	
	
	
	
}
