package Act2;

public class PruebaAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda=new Agenda();
		agenda.nuevaEntrada("123123123","nombre1","dir1");
		agenda.nuevaEntrada("456456465","nombre2","dir2");
		agenda.nuevaEntrada("789789789","nombre3","dir3");
		
		// error telefono no tiene log 9
		agenda.nuevaEntrada("123456","nombre4","dir4");
		// error el telefono no tiene solo digitos
		agenda.nuevaEntrada("12D456X89","nombre5","dir5");
		// error telefono duplicado
		agenda.nuevaEntrada("789789789","nombre6","dir6");
		
		for(int i=0;i<1000000000;i++);
		
		
		agenda.mostrarAgenda();
		
		Contacto c1=agenda.buscaContactoTelefono("123123123");
		if(c1==null) {
			System.err.println("ERROR 123123123 no encontrado");
		}else {
			System.out.println("Buscamos 123123123");
			System.out.println(c1.toString());
		}
		
		Contacto c2=agenda.buscaContactoTelefono("147147147");
		if(c2==null) {
			System.err.println("ERROR 147147147 no encontrado");
		}else {
			System.out.println("Buscamos 147147147");
			System.out.println(c2.toString());
		}
		
		Contacto c3=agenda.buscaContactoNombre("nombre1");
		if(c3==null) {
			System.err.println("ERROR nombre1 no encontrado");
		}else {
			System.out.println("Buscamos nombre1");
			System.out.println(c3.toString());
		}
		
		Contacto c4=agenda.buscaContactoNombre("nombreXXX");
		if(c4==null) {
			System.err.println("ERROR nombreXXX no encontrado");
		}else {
			System.out.println("Buscamos nombreXXX");
			System.out.println(c4.toString());
		}
		
	}

}
