package ficheros;
/**
 * @author Veronica
 * @version 1.0
 */
public class Electrodomestico {
	
	protected char consumo;
	protected final char CONSUMO_BASE = 'F';
	protected final int PRECIO_BASE = 200;
	protected final int PESO_BASE = 8;
	protected int precio;
	protected int peso;
	protected Color color;
	
	
	/**
	 * Constructor por defecto de clase Electrodomestico
	 */
	public Electrodomestico() {
		this.consumo = CONSUMO_BASE;
		this.peso = PESO_BASE;
		this.precio = precioFinal() + PRECIO_BASE;
		this.color = Color.BLANCO;
	}
	/**
	 * Contructor de 2 parametros de clase Electrodomestico
	 * @param consumo
	 * @param precio
	 * @param peso
	 * @param color
	 */
	public Electrodomestico(int precio, Color color) {
		
		this.consumo = 'A'; //por defecto al no pedir consumo por teclado
		
		if (comprobarConsumoEnergetico(this.consumo) == false) {
	
			this.consumo = CONSUMO_BASE;
			
		}
		this.peso = PESO_BASE;
		this.precio = precio; // preguntado en clase, el precio es metido desde la main
		this.color = color;
	}
	/**
	 * Comprueba si el consumo introducido es correcto
	 * @param letra
	 * @return
	 */
	private boolean comprobarConsumoEnergetico(char letra) {
		
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F' ) {
			
			return true;
		}else {
			return false;
		}
			
	}
	/**
	 * Calcula el precio final de electrodomestico
	 * @return
	 */
	public int precioFinal() {
		return this.precio + precioConsumo() + precioPeso();
		
	}
	/**
	 * Devuelve el incremento de precio en funcion del consumo de la clase Electrodomestico
	 * @return
	 */
	public int precioConsumo() {
		
		int precio = -1;
	
		if (this.consumo == 'F' || this.consumo == 'E') {
			precio = 40;
			
		}else if (this.consumo == 'D') {
			precio = 50;
			
		}else if (this.consumo == 'C') {
			precio = 70;
			
		}else if (this.consumo == 'B') {
			precio = 90;
			
		}else{
			precio = 110;
			
		}
		
		return precio;
		
	}
	/**
	 * Devuelve el incremento del precio en funcion del peso de la clase Electrodomestico
	 * @return
	 */
	public int precioPeso () {
		
		int precio = -1;
		
		if (this.peso >= 0 && this.peso <= 29) {
			precio = 10;
			
		}else if (this.peso >= 30 && this.peso <= 69) {
			precio = 50;
		}else if (this.peso >= 70 && this.peso <= 79) {
			precio = 80;
		}else {
			precio = 100;
		}
		return precio;
		
	}
	
	
	/**
	 * Metodo get de consumo de la clase Electrodomestico
	 * @return the consumo
	 */
	public char getConsumo() {
		return consumo;
	}
	/**
	 * Metodo get de CONSUMO_BASE de la clase Electrodomestico
	 * @return the cONSUMO_BASE
	 */
	public char getCONSUMO_BASE() {
		return CONSUMO_BASE;
	}
	/**
	 * Metodo get de PRECIO_BASE de la clase Electrodomestico
	 * @return the pRECIO_BASE
	 */
	public int getPRECIO_BASE() {
		return PRECIO_BASE;
	}
	/**
	 * Metodo get de PESO_BASE de la clase Electrodomestico
	 * @return the pESO_BASE
	 */
	public int getPESO_BASE() {
		return PESO_BASE;
	}
	/**
	 * Metodo get de precio de la clase Electrodomestico
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * Metodo get de Peso de la clase Electrodomestico
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * Metodo get de Color de la clase Electrodomestico
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * Metodo toString de 4 parametros de la clase Electrodomestico
	 */
	public String toString() {
		return "Electrodomestico [consumo=" + consumo + ", precio=" + precio + ", peso=" + peso + ", color="
				+ color + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
