package ficheros;
/**
 * @author Veronica
 * @version 1.0
 */
public class Consignacion {

	private Cliente c;
	private int peso;
	private String descripcion;
	private final String FECHA_BASE = "Aun consignado";
	private int numObjetos;
	private String fechaConsignacion;
	private String fechaSalida;
	protected static int numConsignaciones;
	private String id;
	
	
	/**
	 * Constructor de 6 parametros de la clase Consignacion
	 * @param c
	 * @param peso
	 * @param descripcion
	 * @param numObjetos
	 * @param fechaConsignacion
	 * @param fechaSalida
	 */
	public Consignacion(Cliente c, int peso, String descripcion, int numObjetos, String fechaConsignacion) {
		this.c = c;
		this.peso = peso;
		this.descripcion = descripcion;
		this.numObjetos = numObjetos;
		this.fechaConsignacion = fechaConsignacion;
		this.fechaSalida = FECHA_BASE;
		numConsignaciones++;
		this.id = crearIdentificacion();
	}


	/**
	 * Metodo get Peso de la clase Consignacion
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}


	/**
	 * Metodo set peso de la clase Consignacion
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}


	/**
	 * Metodo get Descripcion de la clase Consignacion
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 * Metodo set Descripcion de la clase Consignacion
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Metodo get de fechaConsignacion de la clase Consignacion
	 * @return the fechaConsignacion
	 */
	public String getFechaConsignacion() {
		return fechaConsignacion;
	}


	/**
	 * Metodo se de fechaConsignacion de la clase Consignacion
	 * @param fechaConsignacion the fechaConsignacion to set
	 */
	public void setFechaConsignacion(String fechaConsignacion) {
		this.fechaConsignacion = fechaConsignacion;
	}


	/**
	 * Metodo get de fechaSalida de la clase Consignacion
	 * @return the fechaSalida
	 */
	public String getFechaSalida() {
		return fechaSalida;
	}


	/**
	 * Metodo set de fechaSalida de la clase Consignacion
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * Crea una identificacion concreta para cada Consignacion
	 * @return
	 */
	public String crearIdentificacion() {
	return "O" + numConsignaciones;
	}
	
	/**
	 * Metodo set de ID de la clase Consignacion
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * Metodo get de id de la clase Consignacion
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "\n---------------------Consignacion " + id + "---------------------\n" + "\nConsignacion \nid="
				+  id + "\n peso=" + peso + "\n descripcion=" + descripcion + "\n numObjetos=" + numObjetos
				+ "\n fechaConsignacion=" + fechaConsignacion + "\n fechaSalida=" + fechaSalida 
				+ "\n\n---------------------Cliente de " + id + "-----------------------\n" + c.toString();
	}


	

	
	
	
	
	
	
}
