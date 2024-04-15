package ejercicio3clase;

public class Pruebas {

	public static void main(String[] args) {
		
		Centralita centralita= new Centralita();
		centralita.añadirLlamada(new Local ("1111","2222",10));
		centralita.añadirLlamada(new Local ("1111","3333",10));
		centralita.añadirLlamada(new Local ("2222","1111",10));
		centralita.añadirLlamada(new Local ("2222","4444",10));
		centralita.añadirLlamada(new Local ("4444","2222",10));
		
		centralita.añadirLlamada(new Provincial ("1111","5555",10));
		centralita.añadirLlamada(new Provincial ("1111","6666",110));
		centralita.añadirLlamada(new Provincial ("5555","5555",150));
		centralita.añadirLlamada(new Provincial ("6666","2222",400));
		centralita.añadirLlamada(new Provincial ("1111","5555",400));
		
		centralita.mostrarLlamadas();
		centralita.registroDeLlamadas("1111");
	}

}
