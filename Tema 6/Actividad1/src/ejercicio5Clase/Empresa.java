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
	
	
	

	
	
	
	
}
