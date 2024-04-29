package EjemTreeSet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colegio col=new Colegio();
		col.añadir(new Alumno("al1",10));
		col.añadir(new Alumno("al2",12));
		col.añadir(new Alumno("al3",13));
		col.añadir(new Alumno("al4",14));
		
		col.añadir(new Profesor("prof1",100.0));
		col.añadir(new Profesor("prof2",120.0));
		col.añadir(new Profesor("prof3",130.0));
		col.añadir(new Profesor("prof4",140.0));
		
		// duplicados
		col.añadir(new Profesor("prof4",140.0));
		col.añadir(new Profesor("prof4",160.0));
		col.añadir(new Alumno("prof4",10));
		
		System.out.println("******************************************");
		col.mostrarColegio();
		
		System.out.println("******************************************");
		System.out.println("Buscar al1");
		col.buscarPersona("al1");
		
		System.out.println("******************************************");
		System.out.println("Buscar alXXX");
		col.buscarPersona("alXXX");
		
		System.out.println("******************************************");
		System.out.println("Borrar al1");
		col.borrarPersona("al1");
		
		System.out.println("******************************************");
		System.out.println("Borrar alXXX");
		col.borrarPersona("alXXX");
		
		System.out.println("******************************************");
		col.mostrarColegio();
		
		
	}

}
