package modelo;

import java.util.Date;

/**
 * @author Veronica
 * @version 1.0
 */
public class Consignacion {

	private Cliente c;
	private int peso;
	private String descripcion;
	private int numObjetos;
	private Date fechaConsignacion;
	private Date fechaSalida;
	private final char LETRA = 'O';
	protected static int NUM_CONSIGNACIONES;
	private Id id;
	
	
	/**
	 * Constructor de 6 parametros de la clase Consignacion
	 * @param c
	 * @param peso
	 * @param descripcion
	 * @param numObjetos
	 * @param fechaConsignacion
	 */
	public Consignacion(Cliente c, int peso, String descripcion, int numObjetos) {
		this.c = c;
		this.peso = peso;
		this.descripcion = descripcion;
		this.numObjetos = numObjetos;
		this.fechaConsignacion = new Date();
		NUM_CONSIGNACIONES++;
		this.id = crearIdentificacion();
	}


	/**
	 * @return the nUM_CONSIGNACIONES
	 */
	public static int getNUM_CONSIGNACIONES() {
		return NUM_CONSIGNACIONES;
	}


	/**
	 * @param nUM_CONSIGNACIONES the nUM_CONSIGNACIONES to set
	 */
	public static void setNUM_CONSIGNACIONES(int nUM_CONSIGNACIONES) {
		NUM_CONSIGNACIONES = nUM_CONSIGNACIONES;
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
	 * @return the numObjetos
	 */
	public int getNumObjetos() {
		return numObjetos;
	}


	/**
	 * @param numObjetos the numObjetos to set
	 */
	public void setNumObjetos(int numObjetos) {
		this.numObjetos = numObjetos;
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
	public Date getFechaConsignacion() {
		return fechaConsignacion;
	}


	/**
	 * Metodo se de fechaConsignacion de la clase Consignacion
	 * @param fechaConsignacion the fechaConsignacion to set
	 */
	public void setFechaConsignacion(String fechaConsignacion) {
		this.fechaConsignacion = new Date();
	}


	/**
	 * Metodo get de fechaSalida de la clase Consignacion
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}


	/**
	 * Metodo set de fechaSalida de la clase Consignacion
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida() {
		this.fechaSalida = new Date();
	}

	/**
	 * Crea una identificacion concreta para cada Consignacion
	 * @return
	 */
	public Id crearIdentificacion() {
	Id id = new Id (LETRA +""+ NUM_CONSIGNACIONES);
	return id;
	}
	
	/**
	 * Metodo set de ID de la clase Consignacion
	 * @param id the id to set
	 */
	public void setId(Id id) {
		this.id = id;
	}
	/**
	 * Metodo get de id de la clase Consignacion
	 * @return the id
	 */
	public Id getId() {
		return id;
	}
	@Override
	public String toString() {
		
		String texto = "";
		 if (this.fechaSalida == null) {
			texto = "\n---------------------Consignacion " + id + "---------------------\n" + "\nConsignacion \n"
						+  id + "\npeso=" + peso + "\ndescripcion=" + descripcion + "\nnumObjetos=" + numObjetos
						+ "\nfechaConsignacion=" + fechaConsignacion + "\nfechaSalida=Aun consignado"+ "\n\n-----------"
						+ "----------Cliente de " + id + "-----------------------\n" + c.toString();
		}else {
			texto = "\n---------------------Consignacion " + id + "---------------------\n" + "\nConsignacion \n"
					+  id + "\npeso=" + peso + "\ndescripcion=" + descripcion + "\nnumObjetos=" + numObjetos
					+ "\nfechaConsignacion=" + fechaConsignacion + "\nfechaSalida=" + this.fechaSalida + "\n\n--------"
					+ "-------------Cliente de " + id + "-----------------------\n" + c.toString();
		}
		
		
		return texto;
	}


	

	
	
	
	
	
	
}
