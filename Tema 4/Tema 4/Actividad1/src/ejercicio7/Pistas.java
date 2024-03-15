package ejercicio7;


public class Pistas {

	private int codigo;
	private String tipo;
	private boolean operativo;
	private int precio;
	private String fechaReserva;
	private Reservas r[];
	private int numReservas;
	
	/** Constructor con 4 parametros para Pistas
	 * @param codigo : int
	 * @param tipo : String
	 * @param operativo : boolean
	 * @param precio : int
	 */
	public Pistas(int codigo, String tipo, boolean operativo, int precio, String fechaReserva) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.operativo = operativo;
		this.precio = precio;
		this.fechaReserva = fechaReserva;
		this.numReservas = 0;
		this.r = new Reservas [2];
	}

	/** Metodo get para precio de la clase computadoras
	 */
	public int getPrecio() {
		return precio;
	}

	/** Metodo set para precio de la clase computadoras
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}


	/** Metodo toString que enseña los 5 parametros de Pistas
	 */
	public String toString() {
		return "Pistas [codigo=" + codigo + ", tipo=" + tipo + ", operativo=" + operativo + ", precio=" + precio
				+ ", fechaReserva=" + fechaReserva + "]";
	}

	/** Metodo get para codigo de la clase computadoras
	 */
	public int getCodigo() {
		return codigo;
	}

	/** Metodo set para codigo de la clase computadoras
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void añadirReserva (int codigoPista ,String fechaReservaCreacion, String diaReserva,int precio, Usuarios u) {
		
	
		Reservas contenedor = new Reservas (codigoPista,fechaReservaCreacion,diaReserva,u.getNombre(),precio);
		r[numReservas] = contenedor;
		numReservas++;
		
	}
	
	public void visualizarReservas () {
	
		
		for (int i = 0; i < numReservas; i++) {
		
			System.out.println(r[i].toString());
			
		}
		
	}
	
	
	
	
	
	
}
