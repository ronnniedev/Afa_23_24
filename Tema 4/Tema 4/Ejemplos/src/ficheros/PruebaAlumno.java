package ficheros;

public class PruebaAlumno {

	public static void main(String[] args) {
		Alumno al = new Alumno ("11111111E","pepe",15); // esto es un constructor, primero determinamos la clase
		// en la que vamos a meter datos y luego definimos los datos de los que esta compuesto
		al.mostrarDatos(); // al es el objeto
		Alumno a2 = new Alumno ();
		a2.mostrarDatos();
		Alumno a3 = new Alumno ("juan",15);
		System.out.println(a3);
		System.out.println(al.toString());
	}

}
