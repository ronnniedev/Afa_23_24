package ejercicio1_clase;

public class Habitacion implements Comparable{
	
	private String codigo;
	private double precio;
	private TipoHabitacion tipo;
	private boolean estaReservada;
	
	public Habitacion(int piso, char letra, double precio,TipoHabitacion tipo) {
		codigo = ""+piso+letra;
		this.precio = precio;
		this.tipo = tipo;
		this.estaReservada = false;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the tipo
	 */
	public TipoHabitacion getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoHabitacion tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the estaReservada
	 */
	public boolean isEstaReservada() {
		return estaReservada;
	}

	/**
	 * @param estaReservada the estaReservada to set
	 */
	public void setEstaReservada(boolean estaReservada) {
		this.estaReservada = estaReservada;
	}

	@Override
	public String toString() {
		return "Habitacion [codigo=" + codigo + ", precio=" + precio + ", tipo=" + tipo + ", estaReservada="
				+ estaReservada + "]";
	}

	@Override
	public int compareTo(Object o) {
		Habitacion obj = (Habitacion)o;
		
		if (this.codigo.compareTo(obj.codigo)== 0) return 0;
		if (this.codigo.compareTo(obj.codigo)<0) return -1;
		return 1;
	}
	
	
}
