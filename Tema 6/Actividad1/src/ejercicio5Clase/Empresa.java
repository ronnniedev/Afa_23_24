package ejercicio5Clase;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	private String cif;
	private List <Departamento> departamentos;
	
	public Empresa(String nombre, String cif) {
		this.nombre = nombre;
		this.cif = cif;
		this.departamentos = new ArrayList<Departamento>();
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
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}



	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}



	/**
	 * @return the departamentos
	 */
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}



	/**
	 * @param departamentos the departamentos to set
	 */
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}



	public void añadirDepartamento (Departamento departamento) {
		departamentos.add(departamento);
	}

	public void añadirEmpleado(String nombre, Empleado empleado) throws DepartamentoNotFoundException {
		boolean encontrado = false;
		for (int i = 0; i < departamentos.size(); i++) {
			if (departamentos.get(i).getNombre().compareTo(nombre) == 0) {
				departamentos.get(i).insertarEmpleado(empleado);
				encontrado = true;
			}
		}
		
		if (!encontrado) {
			throw new DepartamentoNotFoundException("Departamento" + nombre + " no encontrado");
		}
	}



	@Override
	public String toString() {
		String texto = "Empresa [nombre=" + nombre + ", cif=" + cif + "]";
		for (Departamento d: departamentos) {
			texto += d.toString();
		}
		return texto;
	}



	public void borrarDepartamento(String nombre) throws DepartamentoNotFoundException {
		for (int i = 0; i < departamentos.size();i++) {
			if (departamentos.get(i).getNombre().compareTo(nombre) == 0) {
				departamentos.remove(i);
				return;
			}
		}
		throw new DepartamentoNotFoundException("Departamento" + nombre + " no encontrado");
	}
	
	
	public List<Empleado> getEmpleadosDepartamento(String NombreDep) throws DepartamentoNotFoundException{
		
		Departamento d = null;
		
		for (int i = 0; i < departamentos.size() && d == null; i++) {
			Departamento dep = departamentos.get(i);
			if (dep.getNombre().compareTo(NombreDep)==0) {
				d=dep;
			} 
		}
		
		if (d==null) {
			throw new DepartamentoNotFoundException ("Departamento no encontrado");
		}else {
			return d.getEmpleados();
		}
	}
	
	public Departamento buscarDepartamento(String nombreDep) throws DepartamentoNotFoundException {
		for (Departamento d: departamentos) {
			if (d.getNombre().compareTo(nombreDep)== 0) {
				return d;
			}
		}
		throw new DepartamentoNotFoundException("Departamento no encontrado");
	}
	
	public Empleado buscarEmpleado(String nombre) throws EmpleadoNotFoundException {
		
		for (int i = 0; i < departamentos.size(); i++) {
			List <Empleado> empleados = departamentos.get(i).getEmpleados();
			System.out.println(i);
			for (int j = 0; j < empleados.size(); j++) {
				System.out.println(empleados.get(j).toString());
				if (empleados.get(j).getNombre().compareToIgnoreCase(nombre)== 0) {
					return empleados.get(j);
				}
			}
		}
		throw new EmpleadoNotFoundException("No se ha encontrado al empleado");
	}
	
}
