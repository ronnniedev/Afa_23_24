package ejercicio4clase;

import java.util.HashSet;
import java.util.Set;

public class Directivo extends Empleado {
	
	private String categoria;
	private Set<Empleado>empleados;
	
	public Directivo(String nombre, int edad, double sueldo, String categoria) {
		super(nombre, edad, sueldo);
		this.categoria = categoria;
		empleados = new HashSet<Empleado>();
	}
	public void añadirEmpleado(String nombre,int edad,double sueldo) {
		Empleado e = new Empleado(nombre,edad,sueldo);
		boolean resul = empleados.add(e);
		if (resul == true) {
			System.out.println("Insertado correctamente ");
		}else {
			System.out.println("Error al insertar");
		}
	}
	@Override
	public String toString() {
		String texto = "Directivo [categoria=" + categoria + ", nombre=" + nombre + ", edad=" + edad + "]\n";
		for (Empleado e:empleados) {
			texto+="\t"+e.toString();
			
		}
		return texto;
	}
	
	

	
}
