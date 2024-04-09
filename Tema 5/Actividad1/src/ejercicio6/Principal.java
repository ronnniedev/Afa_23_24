package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Informe admin = new Informe (Tarea.ADMINISTRATIVO);
		Informe emp = new Informe (Tarea.EMPRESARIAL);
		Informe per = new Informe (Tarea.PERSONAL);
		Informe admin2 = new Informe (Tarea.ADMINISTRATIVO);
		Informe emp2 = new Informe (Tarea.EMPRESARIAL);
		Informe per2 = new Informe (Tarea.PERSONAL);
		Informe emp3 = new Informe (Tarea.EMPRESARIAL);
		Informe per3 = new Informe (Tarea.PERSONAL);
		Informe admin3 = new Informe (Tarea.PERSONAL);
		Carpeta cp = new Carpeta("Basica");
		
		cp.añadirInforme(per);
		cp.añadirInforme(emp);
		cp.añadirInforme(admin);
		cp.añadirInforme(admin2);
		cp.añadirInforme(per2);
		cp.añadirInforme(emp2);
		
		cp.mostrarContenido();
		
		cp.quitarInforme();
		cp.quitarInforme();
		cp.quitarInforme();
		cp.quitarInforme();
		
		cp.mostrarContenido();
		
		cp.añadirInforme(admin3);
		cp.añadirInforme(per3);
		cp.añadirInforme(emp3);
		
		cp.mostrarContenido();
		
		cp.quitarInforme();
		
		cp.mostrarContenido();

	}

}
