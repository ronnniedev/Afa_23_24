package ficheros;
/**
 * @author Veronica
 * @version 1.0
 */
public class Lavadora extends Electrodomestico{

	protected int carga;
	protected final int CARGA_BASE = 5;

	/**
	 * Construcor por defecto de la clase Lavadora, que incluye el por defecto de Electrodomestico
	 * @param altura
	 */
	public Lavadora() {
		super();
		this.carga= CARGA_BASE;
		this.precio = PRECIO_BASE;
	}
	/**
	 * Contructor de 2 parametros de clase Lavadora, el resto por defecto
	 * @param precio
	 * @param color
	 */
	public Lavadora(int precio,Color color) {
		super(precio,color);
		this.carga= CARGA_BASE;
	}

	/**
	 * Metodo get de Carga de la clase Lavadora
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Metodo get de CARGA_BASE de la clase Lavadora
	 * @return the CARGA_BASE
	 */
	public int getCARGA_BASE() {
		return CARGA_BASE;
	}
	/**
	 * Metodo que devuelve el precio final de Lavadora
	 */
	public int precioFinal() {
		return this.precio+precioPeso()+precioCarga()+precioConsumo();
		
	}
	/**
	 * Metodo que calcula el incremento de precio de Lavadora en funcion de su carga
	 * @return int
	 */
	public int precioCarga() {
		int precio = 0;
		
		if (this.carga > 5) { //MAYOR QUE 5 NO 5
			precio = 50;
		}
		return precio;
	}

	/**
	 * Metodo toString de 5 parametros de la clase Lavadora
	 */
	public String toString() {
		return "Lavadora [carga=" + carga + ", consumo=" + consumo + ", precio=" + precio + ", peso=" + peso
				+ ", color=" + color + "]";
	}
	
	
}
