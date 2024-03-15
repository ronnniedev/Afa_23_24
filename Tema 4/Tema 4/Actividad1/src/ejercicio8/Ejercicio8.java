package ejercicio8;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Curso c1 = new Curso (1, "DAM", "AULA A1", "9-14");
		Curso c2 = new Curso (1, "DAM", "AULA A1", "9-14");
		
		Profesor p1 = new Profesor ("Maria","Gonzalez", "Pepito grillo", "ProfesorNazi@gmail.com");
		Profesor p2 = new Profesor ("Marcos","Gonzalez", "Pepito grillo", "ProfesorNazi@gmail.com");
		Profesor p3 = new Profesor ("Juan","Gonzalez", "Pepito grillo", "ProfesorNazi@gmail.com");
		
		
		Alumno a1 = new Alumno ("53784567D", 1, "Mariachi", "Gutierrez", "Calle velnagrado", "98231329",
				"Romenax@gmail.com");
		Alumno a2 = new Alumno ("2478421A", 2, "Mariachi", "Gutierrez", "Calle velnagrado", "98231329",
				"Romenax@gmail.com");
		Alumno a3 = new Alumno ("238123G", 3, "Mariachi", "Gutierrez", "Calle velnagrado", "98231329",
				"Romenax@gmail.com");
		Alumno a4 = new Alumno ("76127128H", 4, "Mariachi", "Gutierrez", "Calle velnagrado", "98231329",
				"Romenax@gmail.com");
		Alumno a5 = new Alumno ("28192121F", 5, "Mariachi", "Gutierrez", "Calle velnagrado", "98231329",
				"Romenax@gmail.com");
		c1.añadirTutor(p2); //esto añade tutores al curso
		
		c1.añadirAsignatura("Informatica", p3, 2);
		c1.añadirAsignatura("Lengua", p3, 5);
		c1.añadirAsignatura("Base de datos", p3, 3);
		c1.añadirAsignatura("Informatica", p3, 2);
		c1.añadirAsignatura("Lengua", p3, 5);
		c1.añadirAsignatura("Base de datos", p2, 3);
		c1.añadirAsignatura("Marica", p2, 5);
		c1.añadirAsignatura("Lengua", p3, 5);
		
		a1.añadirAsignatura("Lengua" , c1);
		a1.añadirAsignatura("Informatica" , c1);
		a1.añadirAsignatura("Base de datos" , c1);
		a1.añadirAsignatura("Marica" , c1);
		a1.añadirAsignatura("Madadrica" , c1); //no se refleja por que no existe
		a2.añadirAsignatura("Lengua" , c1);
		
		a1.añadirNota(1,"Lengua");
		a1.añadirNota(7,"Marica");
		a1.añadirCompañero(a2,"Lengua"); // añade un compañero de a1 seleccionando la asignatura
		a2.añadirNota(3,"Lengua");
		p2.añadirAnotacion(a1,"Lengua","Es muy tonto"); //añade una anotacion en el alumno a1
		p2.añadirAnotacion(a2,"Lengua","Es tontisimo");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		p1.comprobar();
		p2.comprobar();
		p3.comprobar();
		
		System.out.println(p1.toString()); //no puede haber profesores con menos de 1 asignatura
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		
		c1.visualizar();
		System.out.println("\n\n----------------------");
		a1.visualizarAlumnos();
		a2.visualizarAlumnos();
		
	}

}
