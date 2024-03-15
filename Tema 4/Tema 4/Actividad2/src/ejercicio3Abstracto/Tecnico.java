package ejercicio3Abstracto;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void categoria() {
		System.out.println("Tecnico :D");
		
	}

	public String mostrarNombre () {
		return toString();
	}
	
	

	
}
