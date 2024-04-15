package ejercicio1;


public class Habitacion implements Comparable{

	protected String codigo;
	protected int precio;
	protected TipoHabitacion tipo;
	
	
	public Habitacion(String codigo, TipoHabitacion tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.precio = escogerPrecio(this.tipo);
	}

	
	@Override
	public int compareTo(Object obj) {
		Habitacion h = (Habitacion) obj;
		return 1;
		
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
	public void setPrecio(int precio) {
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

	public static int escogerPrecio(TipoHabitacion hab) {
		int precio = -1;
		 switch (hab) {
         case SIMPLE:
             precio = 100;
             break;
         case DOBLE:
        	 precio = 200;
             break;
         case MATRIMONIAL:
             precio = 300;
             break;
         default:
             System.out.println("Error al procesar");
             break;
     }
		 
		 return precio;
		
	}

	@Override
	public String toString() {
		return "\n Habitacion [codigo=" + codigo + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
}
