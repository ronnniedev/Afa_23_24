package pruebaClase;

/**
 * @author Veronica Gonzalez
 * @version 1.0
 */
public class Habitacion {

	private int id;
	private int planta;
	private String tipo;
	private double precio;
	private boolean ocupado;
	private boolean tieneVistaExterior;
	
	
	/** 
	 * Constructor de 6 parametros para habitacion
	 * @param id
	 * @param planta
	 * @param tipo
	 * @param precio
	 * @param ocupado
	 * @param tieneVistaExterior
	 */
	public Habitacion(int id, int planta, String tipo, double precio, boolean ocupado, boolean tieneVistaExterior) {
		this.id = id;
		this.planta = planta;
		this.tipo = tipo;
		this.precio = precio;
		this.ocupado = ocupado;
		this.tieneVistaExterior = tieneVistaExterior;
	}
	/** 
	 * metodo get de id para clase Habitacion
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * metodo set de id para clase Habitacion 
	 */
	public void setId(int id) {
		this.id = id;
	}
	/** 
	 * metodo get planta para clase Habitacion
	 * @return 
	 */
	public int getPlanta() {
		return planta;
	}
	/**  
	 * metodo set planta para clase Habitacion
	 * @param planta
	 */
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	/** 
	 * Metodo get para tipo de clase Habitacion
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}
	/** 
	 * Metodo set para Tipo para clase Habitacion
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/** 
	 * Metodo get para precio de clase Habitacion
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}
	 /**
	  *  Metodo set Precio para clase Habitacion
	  * @param precio
	  */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/** 
	 * Metodo is para Ocupado de clase Habitacion
	 * @return
	 */
	public boolean isOcupado() {
		return ocupado;
	}
	/** 
	 * Metodo set para Ocupado de clase Habitacion
	 * @param ocupado
	 */
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	/** 
	 * Metodo is para tieneVistaExterior para clase habitacion
	 * @return
	 */
	public boolean isTieneVistaExterior() {
		return tieneVistaExterior;
	}
	/** 
	 * Metodo Set apra tieneVistaExterior para clase Habitacion
	 * @param tieneVistaExterior
	 */
	public void setTieneVistaExterior(boolean tieneVistaExterior) {
		this.tieneVistaExterior = tieneVistaExterior;
	}

	/** 
	 * Metodo to String de 6 parametros para clase Habitacion
	 */
	public String toString() {
		return "Habitacion [id=" + id + ", planta=" + planta + ", tipo=" + tipo + ", precio=" + precio + ", ocupado="
				+ ocupado + ", tieneVistaExterior=" + tieneVistaExterior + "]";
	}
	
	
	
	
	
}
