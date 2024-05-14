package ejercicio5Clase;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa ("Empresa","111X");
		
		try {
		empresa.añadirDepartamento(new Departamento("dep1"));
		empresa.añadirEmpleado("dep1",new Empleado("emp1","ape","puesto"));
		empresa.añadirEmpleado("dep1",new Empleado("emp2","ape","puesto"));
		empresa.añadirEmpleado("dep1",new Empleado("emp3","ape","puesto"));
		
		}catch(DepartamentoNotFoundException e1) {
			System.out.println(e1.toString());
		}
		
		try {
		empresa.añadirDepartamento(new Departamento("dep2"));
		empresa.añadirEmpleado("dep2",new Empleado("emp4","ape","puesto"));
		empresa.añadirEmpleado("dep2",new Empleado("emp5","ape","puesto"));
		empresa.añadirEmpleado("dep3",new Empleado("emp5","ape","puesto"));
		empresa.añadirEmpleado("dep2",new Empleado("emp6","ape","puesto"));
		}catch(DepartamentoNotFoundException e1) {
			System.out.println(e1.toString());
			try {
				empresa.borrarDepartamento("dep2");
			} catch (DepartamentoNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
		}
		
		//*****************************
		
		
		empresa.añadirDepartamento(new Departamento("dep2"));
		try {
			empresa.añadirEmpleado("dep2",new Empleado("emp4","ape","puesto"));
		} catch (DepartamentoNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al añadir el emp4");
		}try {
			empresa.añadirEmpleado("dep2",new Empleado("emp5","ape","puesto"));
		} catch (DepartamentoNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al añadir el emp5");
		}try {
			empresa.añadirEmpleado("dep3",new Empleado("emp6","ape","puesto")); // este no se añade
		} catch (DepartamentoNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al añadir el emp6");
		}try {
			empresa.añadirEmpleado("dep2",new Empleado("emp7","ape","puesto"));
		} catch (DepartamentoNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al añadir el emp7");
		}
		
		System.out.println(empresa.toString());
		

	}

}
