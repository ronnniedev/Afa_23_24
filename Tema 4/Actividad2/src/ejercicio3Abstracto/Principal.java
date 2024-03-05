package ejercicio3Abstracto;

public class Principal {

	public static void main(String[] args) {
		
		Empleado v[] = new Empleado[5];
		v[0] = new Directivo("Paco");
		v[1] = new Oficial ("Ofi1");
		v[2] = new Tecnico ("Jose");
		v[3] = new Directivo ("Paco2");
		v[4] = new Oficial ("Juan2");
		
		
		for (int i = 0; i < v.length; i++) {
			v[i].categoria();
			// tratar a todos como empleados
			// down cast
		}
		
		// upcast o casting
		v[0] = new Directivo ("DirectNuevo");
		Directivo d1 =(Directivo) v[0];
		System.out.println(d1.mostrarNombre());
		
		/*
		 * No genera error de compilacion
		 * pero si genera excepcion = ruptura traumatica del sistema
		 * Tecnico t1 = (Tecnico) v[0];
		 * System.out.println(t1.mostrarNombre());
		 * 
		 */
		
		
	}

}
