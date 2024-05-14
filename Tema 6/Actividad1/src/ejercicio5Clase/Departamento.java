package ejercicio5Clase;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nombre;
	private List<Empleado> empleados;

	public Departamento(String nombre) {
		this.empleados = new ArrayList<Empleado>();
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void insertarEmpleado(Empleado e) {
		empleados.add(e);
		
	}

	@Override
	public String toString() {
		String texto = "Departamento [nombre=" + nombre + ", empleados=" + empleados + "]\n";
		for (Empleado e: empleados) {
			texto+=e.toString()+"\n";
		}
		return texto;
	}
	
	
	
	
}
