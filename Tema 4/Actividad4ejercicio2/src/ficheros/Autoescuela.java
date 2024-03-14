package ficheros;

public class Autoescuela {

	public static void main(String[] args) {
		Profesor p1 = new Profesor ("Mauricio" , "92103124");
		Moto m1 = new Moto ("1312HJK",123,120);
		Coche c1 = new Coche("1312HMK",13456,3,"Rojo");
		Alumno a1 = new Alumno("Looney","89290124","26/4/1995");
		Alumno a2 = new Alumno("a2","89290124","26/4/1995");
		Alumno a3 = new Alumno("a3","89290124","26/4/1995");
		Alumno a4 = new Alumno("a4","89290124","26/4/1995");
		Teoricas t1 = new Teoricas("1562","12:43","15:00","Aula12",p1);
		
		t1.añadirAlumnos(a1);
		t1.añadirAlumnos(a2);
		t1.añadirAlumnos(a3);
		t1.añadirAlumnos(a4);
		
		Practicas prac1 = new Practicas("16/4/7868",c1,m1,a1,p1);
		Practicas prac2 = new Practicas("16/4/7868",c1,a1,p1);
		
	
		
		t1.visualizarElementos();

	}
	
}
