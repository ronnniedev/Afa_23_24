package ejercicio7;

public class Reservas {
	private int codigoPista;
	private String fechaReservaCreacion;
	private String diaReserva;
	private String nombreUsuario;
	private int precio;
	
	
	public Reservas(int codigoPista, String fechaReservaCreacion, String diaReserva, String nombreUsuario, int precio) {
		this.codigoPista = codigoPista;
		this.fechaReservaCreacion = fechaReservaCreacion;
		this.diaReserva = diaReserva;
		this.nombreUsuario = nombreUsuario;
		this.precio = precio;
	}


	/** Metodo toString que enseña los 5 parametros de Reservas
	 */
	public String toString() {
		return "Reservas [codigoPista=" + codigoPista + ", fechaReservaCreacion=" + fechaReservaCreacion
				+ ", diaReserva=" + diaReserva + ", nombreUsuario=" + nombreUsuario + ", precio=" + precio + "]";
	}


	
	
	
	
	
}
