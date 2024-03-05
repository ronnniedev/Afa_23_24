package tareaExtra;

public class Producto {

	protected int id;
	protected int caducidad;
	protected String tipo;
	protected boolean apilable;
	protected int planta;
	protected int cantidad;
	protected int limite;
	
	/**
	 * Constructor de 4 parametros de Clase producto
	 * @param id
	 * @param caducidad
	 * @param tipo
	 * @param apilable
	 */
	public Producto(int id, int caducidad, String tipo, boolean apilable) {
		this.id = id;
		this.caducidad = caducidad;
		this.tipo = tipo;
		this.apilable = apilable;
		this.planta = obtenerPlanta(caducidad,apilable);
		this.limite = 0;
	}


	/**
	 * @return the limite
	 */
	public int getLimite() {
		return limite;
	}


	/**
	 * @param limite the limite to set
	 */
	public void setLimite(int limite) {
		this.limite = limite;
	}


	/**
	 * Metodo get id de clase Producto 
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * Metodo set de id de clase Producto
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * Metodo get de caducidad de clase Producto
	 * @return the caducidad
	 */
	public int getCaducidad() {
		return caducidad;
	}


	/**
	 * Metodo set de parametro caducidad de clase Prodcusto
	 * @param caducidad the caducidad to set
	 */
	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}


	/**
	 * Metodo get de tipo de clase Producto
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * Metodo de set tipo de clase Producto
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	/**
	 * Metodo is de Apilable de clase producto
	 * @return the apilable
	 */
	public boolean isApilable() {
		return apilable;
	}


	/**
	 * Metodo set de Apilable de clase Producto
	 * @param apilable the apilable to set
	 */
	public void setApilable(boolean apilable) {
		this.apilable = apilable;
	}
	/**
	 * Metodo que obtiene la planta en funcion de la caducidad y si es apilable o no
	 * @param caducidad
	 * @param apilable
	 * @return
	 */
	public int obtenerPlanta (int caducidad,boolean apilable) {
		
		int planta = -1;
		
		if (caducidad < 1 && caducidad >= 0) {
			planta = 1;
		}else if (apilable && caducidad >= 1) {
			
			planta = 2;
			
		}else if (apilable && caducidad == -1) {
			
			planta = 3;
		}else {
			
			planta = 4;
		}
		
		return planta;
		
	}


	/**
	 * Metodo to String de 5 parametros de clase Producto
	 */
	public String toString() {
		return "Producto [id=" + id + ", caducidad=" + caducidad + ", tipo=" + tipo + ", apilable=" + apilable
				+ ", planta=" + planta +"]";
	}


	/**
	 * Metodo get de Planta de clase Producto
	 * @return the planta
	 */
	public int getPlanta() {
		return planta;
	}


	/**
	 * Metodo set de Planta de Clase Producto
	 * @param planta the planta to set
	 */
	public void setPlanta(int planta) {
		this.planta = planta;
	}


	/**
	 * Metodo get de Cantidad de Clase Productos
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}


	/**
	 * Metodo set de Cantidad de Clase Productos
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	
	
	
	
	
	
	
	
}
