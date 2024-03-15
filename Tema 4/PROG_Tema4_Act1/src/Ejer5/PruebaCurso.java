package Ejer5;

public class PruebaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Estudiante e1=new Estudiante("pepe1", "alonso1", 1, 1, 8.5);
		Estudiante e2=new Estudiante("pepe2", "alonso2", 2, 1, 6.5);
		Estudiante e3=new Estudiante("pepe3", "alonso3", 3, 2, 8.5);
		Estudiante e4=new Estudiante("pepe4", "alonso4", 4, 2, 6.5);
		Estudiante e5=new Estudiante("pepe5", "alonso5", 5, 1, 8.5);
		Estudiante e6=new Estudiante("pepe6", "alonso6", 6, 2, 6.5);
		
		Curso c=new Curso();
		c.addEstudiante(e1);
		c.addEstudiante(e2);
		c.addEstudiante(e3);
		c.addEstudiante(e4);
		c.addEstudiante(e5);
		c.addEstudiante(e6);
	
		
		c.listarAlumnos();

	}

}
