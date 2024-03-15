package ejercicio7Clase;

public class Pistas {
	
	private int cod;
	private TipoPista tipo;
	private boolean estaOperativa;
	private double precio;
	private String fechaUltimaReserva;
	
	
	public Pistas(int cod, TipoPista tipo, boolean estaOperativa, double precio, String fechaUltimaReserva) {
		this.cod = cod;
		this.tipo = tipo;
		this.estaOperativa = estaOperativa;
		this.precio = precio;
		this.fechaUltimaReserva = fechaUltimaReserva;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public TipoPista getTipo() {
		return tipo;
	}
	public void setTipo(TipoPista tipo) {
		this.tipo = tipo;
	}
	public boolean isEstaOperativa() {
		return estaOperativa;
	}
	public void setEstaOperativa(boolean estaOperativa) {
		this.estaOperativa = estaOperativa;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFechaUltimaReserva() {
		return fechaUltimaReserva;
	}
	public void setFechaUltimaReserva(String fechaUltimaReserva) {
		this.fechaUltimaReserva = fechaUltimaReserva;
	}
	@Override
	public String toString() {
		return "Pistas [cod=" + cod + ", tipo=" + tipo + ", estaOperativa=" + estaOperativa + ", precio=" + precio
				+ ", fechaUltimaReserva=" + fechaUltimaReserva + "]";
	}
	
	
	
	

}
