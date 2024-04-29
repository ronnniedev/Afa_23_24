package ficheros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Veronica
 * @version 1.0
 */
public class Consigna {
	static Scanner keyboard=new Scanner(System.in);

	private List<Empleado> empleados;
	private Map <Id,Consignacion>consignaciones;
	private int numEmpleados;
	private int numConsignaciones;
	private static int numConsignas;
	private String nombre;
	private String id;
	
	/**
	 * Constructor de 1 parametro de la clase Consigna
	 * @param nombre
	 */
	public Consigna(String nombre) {
		this.empleados = new ArrayList<Empleado>();
		this.consignaciones = new HashMap<Id,Consignacion>();
		this.numEmpleados = 0;
		this.numConsignaciones = 0;
		this.nombre = nombre;
		this.id = crearIdentificacion();
	}

	/**
	 * Metodo get de NumEmpleados de la clase Consigna
	 * @return the numEmpleados
	 */
	public int getNumEmpleados() {
		return numEmpleados;
	}


	/**
	 * Metodo get de numConsignaciones para clase Consigna
	 * @return the numConsignaciones
	 */
	public int getNumConsignaciones() {
		return numConsignaciones;
	}
	
	/**
	 * Metodo get de nombre de la clase Consigna
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set de nombre de la clase Consigna
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get Id de la clase Consigna
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Crea una identificacion para cada consigna
	 * @return String
	 */
	protected String crearIdentificacion() {
		return "Consig" + numConsignas;
	}
	
	/**
	 * Visualiza todos los elementos de la consigna
	 */
	public void visualizarElementos() {
		
		System.out.println("Datos de consigna " + nombre + "\n");
		
		System.out.println(toString());
		
		visualizarEmpleados();
	
		visualizarConsignaciones();
		
	}
	/**
	 * Añade una nueva consignacion a la consigna
	 * @param clienteNuevo
	 * @param peso
	 * @param descripcion
	 * @param numObjetos
	 * @param fechaConsignacion
	 */
	public void añadirElementos(Cliente clienteNuevo, int peso, String descripcion, int numObjetos) {
		Consignacion newC = new Consignacion(clienteNuevo,peso,descripcion,numObjetos);
		
		if (!consignaciones.containsKey(newC.getId())) {
			
			consignaciones.put(newC.getId(), newC);
			numConsignaciones++;
		}else {
			System.err.println("ERROR al introducir la nueva consignacion");
		}
		
	}
	/**
	 * Añade un nuevo empleado a la consigna
	 * @param newE
	 */
	public void añadirElementos(Empleado newE) {
		empleados.add(newE);
		numEmpleados++;
	}
	/**
	 * Elimina un elemento concreto previamente habiendolo buscado, retorna un boolean para indicar si se encontro el
	 * registro
	 * @param idBuscar
	 * @return boolean : encontrado
	 */
	public boolean eliminarElementos(String idBuscar) {
		
		boolean encontrado = false;
		
		Id id = new Id(idBuscar);
		
		if (consignaciones.containsKey(id)){
			consignaciones.remove(id);
			System.out.println("Consignacion eliminada");
			numConsignaciones--;
			encontrado = true;
		}
		
		for (int i = 0; i <empleados.size() ;i++) {
			if (empleados.get(i).getId().compareTo(idBuscar)==0) {
				System.out.println("Empleado eliminado");
				empleados.remove(i);
				numEmpleados--;
				encontrado = true;
			}
			
		}
		
		return encontrado;
	}
	
	/**
	 * Metodo que visualiza el vector de Empleados e[]
	 */
	public void visualizarEmpleados () {
		
		System.out.println("\n---------Empleados de " +this.getNombre()+ "---------");
		for (int i = 0; i <empleados.size() ;i++) {
			System.out.println(empleados.get(i).toString());
		}
		
		
	}
	/**
	 * Metodo que visualiza el vector de Consignaciones c[]
	 */
	public void visualizarConsignaciones() {
		
		System.out.println("\n---------Consignaciones de " + this.getNombre() + "---------");
		for (Consignacion c: consignaciones.values()) {
			System.out.println(c.toString());
		}
		
		
	}
	/**
	 * Metodo que busca elementos dentro de los vectores de Consignaciones y Empleados de la clase Consigna
	 * @param id
	 * @return boolean : encontrado
	 */
	public boolean buscarElementos(String id) {
		boolean encontrado = false;
		Id idBuscar = new Id (id);
	
			if (consignaciones.containsKey(idBuscar)) {
				System.out.println("!!!!!!ENCONTRADO!!!!!!");
				System.out.println(consignaciones.get(idBuscar));
				encontrado = true;
		}
		
		for (int i = 0; i < empleados.size();i++) {
			if (empleados.get(i).getId().compareTo(id)== 0) {
				System.out.println("!!!!!!ENCONTRADO!!!!!!");
				System.out.println(empleados.get(i).toString());
				encontrado = true;
			}
			
		}	
		
		return encontrado;
		
	}
	/**
	 * Metodo que introduce una fecha concreta y , si ya no hay ninguna introducida, la cambia dentro del objeto
	 * Consignacion
	 * @param pos
	 */
	public void setFecha(Id id) {
		if (consignaciones.containsKey(id)) {
			if (consignaciones.get(id).getFechaSalida() == null) {
				consignaciones.get(id).setFechaSalida();
				System.out.println("Actualizada la fecha");
				System.out.println(consignaciones.get(id).toString());
			}else {
				System.out.println("El objeto ya no esta consignado");
			}
		}else {
			System.out.println("Id introducida no encontrada");
		}
		
		
	}
	/**
	 * Metodo toString de 4 parametros de la clase Consigna
	 */
	public String toString() {
		return "Consigna [numEmpleados=" + numEmpleados + ", numConsignaciones=" + numConsignaciones + ", nombre="
				+ nombre + ", id=" + id + "]";
	}
	
	

	

	
	
	
	
	
	
	
}
