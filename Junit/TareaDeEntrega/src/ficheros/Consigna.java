package ficheros;

import java.util.Scanner;

/**
 * @author Veronica
 * @version 1.0
 */
public class Consigna {
	static Scanner keyboard=new Scanner(System.in);

	private Empleado e[];
	private Consignacion c[];
	private int numEmpleados;
	private int numConsignaciones;
	private static int numConsignas = 0;
	private String nombre;
	private String id;
	
	/**
	 * Constructor de 1 parametro de la clase Consigna
	 * @param nombre
	 */
	public Consigna(String nombre) {
		this.e = new Empleado [0];
		this.c = new Consignacion [0];
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

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	public void setNumConsignaciones(int numConsignaciones) {
		this.numConsignaciones = numConsignaciones;
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
		
		System.out.println("\n---------Empleados---------");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].toString());
			
		}
		
		System.out.println("\n---------Consignaciones---------");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].toString());
			
		}
		
	}
	/**
	 * Añade una nueva consignacion a la consigna
	 * @param clienteNuevo
	 * @param peso
	 * @param descripcion
	 * @param numObjetos
	 * @param fechaConsignacion
	 */
	public void anadirElementos(Cliente clienteNuevo, int peso, String descripcion, int numObjetos,
								String fechaConsignacion) {
		int newTam = numConsignaciones+1;
		Consignacion newC = new Consignacion(clienteNuevo,peso,descripcion,numObjetos
											,fechaConsignacion);
		Consignacion []v = new Consignacion[newTam];
		
		for (int i = 0; i < this.c.length; i++) {
			v[i] = c[i];
		}
		
		v[numConsignaciones] = newC;
		this.c = v;
		numConsignaciones++;
		
	}
	/**
	 * Añade un nuevo empleado a la consigna
	 * @param newE
	 */
	public void anadirElementos(Empleado newE) {
		int newTam = numEmpleados+1;
		Empleado []v = new Empleado[newTam];
		
		for (int i = 0; i < this.e.length; i++) {
			v[i] = e[i];
		}
		
		v[numEmpleados] = newE;
		this.e = v;
		numEmpleados++;
		
	}
	/**
	 * Elimina un elemento concreto previamente habiendolo buscado, retorna un boolean 
	 * para indicar si se encontro el registro
	 * @param idBuscar : String
	 * @return boolean : encontrado
	 */
	public boolean eliminarElementos(String idBuscar) {
		boolean encontrado = false;
		
		for (int i = 0; i < c.length && encontrado == false; i++) {
			if (c[i].getId().compareTo(idBuscar) == 0) {
				eliminar(c[i],i);
				encontrado = true;
				
			}
			
		}
		
		for (int i = 0; i < e.length && encontrado == false; i++) {
			if (e[i].getId().compareTo(idBuscar) == 0) {
				eliminar(e[i],i);
				encontrado = true;
				
			}
			
		}
		
		return encontrado;
	}
	/**
	 * Metodo que realiza la eliminacion de una consigna a partir de su posicion en el vector c[]
	 * @param borrarC
	 * @param pos
	 */
	public void eliminar (Consignacion borrarC, int pos) {
		int newTam = numConsignaciones-1;
		System.out.println("La consignacion " + borrarC.getId() + " sera eliminada");
		Consignacion v[] = new Consignacion[newTam];
		
		for (int i = pos; i < newTam; i++) {
			c[i] = c[i+1];
		}
		
		for (int i = 0; i < newTam; i++) {
			v[i] = c[i];
		}
		
			this.c = v;
			numConsignaciones--;
			
		
	}
	
	/**
	 * Metodo que realiza la eliminacion de un empleado a partir de su posicion en el vector e[]
	 * @param borrarE
	 * @param pos
	 */
	public void eliminar (Empleado borrarE,int pos) {
		int newTam = numEmpleados-1;
		System.out.println(" El empleado " + borrarE.getId() + " sera eliminado");
		Empleado v[] = new Empleado[newTam];
		
		for (int i = pos; i < newTam; i++) {
			e[i] = e[i+1];
		}
		
		for (int i = 0; i < newTam; i++) {
			v[i] = e[i];
		}
		
			this.e = v;
			numEmpleados--;
		
	}
	/**
	 * Metodo que visualiza el vector de Empleados e[]
	 */
	public void visualizarEmpleados () {
		
		System.out.println("\n---------Empleados de " +this.getNombre()+ "---------");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].toString());
		}
		
		
	}
	/**
	 * Metodo que visualiza el vector de Consignaciones c[]
	 */
	public void visualizarConsignaciones() {
		
		System.out.println("\n---------Consignaciones de " + this.getNombre() + "---------");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].toString());
		}
		
		
	}
	/**
	 * Metodo que busca elementos dentro de los vectores de Consignaciones y Empleados 
	 * de la clase Consigna
	 * @param id : String
	 * @return encontrado : boolean
	 */
	public boolean buscarElementos(String id) {
		boolean encontrado = false;
		
		for (int i = 0; i < c.length && encontrado == false; i++) {
			if (c[i].getId().compareTo(id) == 0) {
				System.out.println("!!!!!!ENCONTRADO!!!!!!");
				System.out.println(c[i].toString());
				encontrado = true;
				
			}
			
		}
		
		for (int i = 0; i < e.length && encontrado == false; i++) {
			if (e[i].getId().compareTo(id) == 0) {
				System.out.println("!!!!!!ENCONTRADO!!!!!!");
				System.out.println(e[i].toString());
				encontrado = true;
				
			}
			
		}	
		
		return encontrado;
		
	}
	/**
	 * Busca la posicion de la ID introducida
	 * @param id : String
	 * @return pos : entero
	 */
	public int buscarPosElementos(String id) {
		boolean encontrado = false;
		int pos = -1;
		
		for (int i = 0; i < c.length && encontrado == false; i++) {
			if (c[i].getId().compareTo(id) == 0) {
				pos = i;
			}
			
		}
		
		for (int i = 0; i < e.length && encontrado == false; i++) {
			if (e[i].getId().compareTo(id) == 0) {
				pos = i;
			}
			
		}	
		
		return pos;
		
	}
	/**
	 * Metodo que introduce una fecha concreta y , si ya no hay ninguna introducida, la cambia 
	 * dentro del objeto
	 * Consignacion
	 * @param pos
	 */
	public String actualizarFecha(int pos,String FechaSalida) {
		String fechaActualizada= null;
		
		if (c[pos].getFechaSalida() == "Aun consignado") {
			c[pos].setFechaSalida(FechaSalida);
			System.out.println("Actualizada la fecha");
			System.out.println(c[pos].toString());
			fechaActualizada = c[pos].getFechaSalida();
		}else {
			System.out.println("El objeto ya no esta consignado");
		}
		
		return fechaActualizada;
		
	}
	/**
	 * Metodo toString de 4 parametros de la clase Consigna
	 */
	public String toString() {
		return "Consigna [numEmpleados=" + numEmpleados + ", numConsignaciones=" + numConsignaciones 
				+ ", nombre="+ nombre + ", id=" + id + "]";
	}
	
	

	

	
	
	
	
	
	
	
}
