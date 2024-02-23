package ejercicio7Clase;

public class Reservas {

	private String fechaReserva;
	private String fechaEjecucion;
	private Pistas pista;
	private double precio;
	private Usuarios usuarios[];
	private int contUsuarios;
	
	/** Constructor de 6 parametros para Reservas
	 * @param fechaReserva
	 * @param fechaEjecucion
	 * @param pista
	 * @param precio
	 * @param usuarios
	 * @param contUsuarios
	 */
	public Reservas(String fechaReserva, String fechaEjecucion, Pistas pista) {
		this.fechaReserva = fechaReserva;
		this.fechaEjecucion = fechaEjecucion;
		this.pista = pista;
		this.precio = pista.getPrecio();
		this.usuarios =  new Usuarios[10];
		this.contUsuarios = 0;
	}
	
	public void añadirUsuario(Usuarios u) {
		if (contUsuarios<usuarios.length) {
			int pos = contUsuarios;
			usuarios[pos] = u;
			contUsuarios++;
		}
		
	}

	@Override
	public String toString() {
		String texto ="Reservas [fechaReserva=" + fechaReserva + ", fechaEjecucion=" + fechaEjecucion + ", pista=" + pista
				+ ", precio=" + precio + "]\n";
		for (int i = 0; i < contUsuarios; i++) {
			Usuarios u = this.usuarios[i];
			texto+=u.toString()+"\n";
			
		}
		
		return texto;
	}

	public String getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getFechaEjecucion() {
		return fechaEjecucion;
	}

	public void setFechaEjecucion(String fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}

	public Pistas getPista() {
		return pista;
	}

	public void setPista(Pistas pista) {
		this.pista = pista;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Usuarios[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios[] usuarios) {
		this.usuarios = usuarios;
	}

	public int getContUsuarios() {
		return contUsuarios;
	}

	public void setContUsuarios(int contUsuarios) {
		this.contUsuarios = contUsuarios;
	}
	
	
	
	
}
