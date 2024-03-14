package ficheros;

import java.util.Scanner;

/**
 * @author Veronica
 * @version 1.0
 */
public class Pruebas {
	static Scanner keyboard=new Scanner(System.in);
	public static Cliente c[] = new Cliente[0];
	public static int numClientes = 0;
	
 	public static void main(String[] args) {
		
		Consigna con1 = new Consigna ("Consigna en pruebas");
		
		
		System.out.println("BIENVENIDA AL SISTEMA DE GESTION DE '" + con1.getNombre() + "'" );
		
		cargaDatos(con1);
		int opcion = menu();
		
		while (opcion != 0) {
			switch (opcion) {
			case 1:{
				prepararEmpleado(con1);
				break;
			}
			case 2:{
				prepararCliente();
				break;
			}
			case 3:{
				prepararConsignacion(con1);
				break;
				}
			case 4:{
				asignarFechaSalida(con1);
				break;
				}
			case 5:{
				listar(con1);	
				break;
			}
			case 6:{
				buscar(con1);	
				break;
			}
			case 7:{
				prepararEliminacion(con1);	
				break;
			}default:{
				System.out.println("Numero introducido no valido");
			}
			}
			
			opcion = menu();
		}
		
		System.out.println("SISTEMA APAGADO");

	}
	
	/**
	 * Inicia los datos basicos para las baterias de pruebas
	 * @param con
	 */
	public static void cargaDatos(Consigna con) {
		
		Empleado e1 = new Empleado("Diego","De los Rios", "58799021Q", 987654321,Genero.HOMBRE,21);
		Empleado e2 = new Empleado("Maria","Remilgos", "84937023L", 638172937,"Jaimita@gmail.com",Genero.MUJER,19);
		Empleado e3 = new Empleado("Manuel","Franchesco", "98671223M", 692123417,Genero.HOMBRE,38);
		Cliente c1 = new Cliente("Marina","Ramirez", "623574890M", 73279873,"marina@gmail.com",Genero.MUJER,67);
		añadirClientes(c1);
		Cliente c2 = new Cliente("Eric","Gonzalez", "348917289Ñ", 896432789,Genero.HOMBRE,36);
		añadirClientes(c2);
		Cliente c3 = new Cliente("Marisa","Meniscos", "372134678M", 985320654,"correoEstandar@gmail.com"
								,Genero.MUJER,17);
		añadirClientes(c3);
		con.añadirElementos(c1, 1,"Reloj diamantino,mochila skitty,Gafas recfacheras",3, "03/03/2024");
		con.añadirElementos(c2, 3,"Ordenador Gygabyte",1, "05/03/2024");
		con.añadirElementos(c3, 2,"Mochila portatil,chaqueta cara",2, "03/03/2024");
		con.añadirElementos(e1);
		con.añadirElementos(e2);
		con.añadirElementos(e3);
		
		
		
		
	}
	/**
	 * Menu basico con las 8 opciones para el usuario, que debera escribir un numero para cada una de ellas
	 * @return int : opcion
	 */
	public static int menu() {
		System.out.println("\n\n*******************");
		System.out.println("1.- Insertar Empleado");
		System.out.println("2.- Insertar Cliente");
		System.out.println("3.- Realizar consignacion");
		System.out.println("4.- Introducir fecha de entrega (final de consignacion)");
		System.out.println("5.- Listar");
		System.out.println("6.- Buscar una entrada");
		System.out.println("7.- Borrar una entrada");
		System.out.println("0.- Salir ");
		int opcion = keyboard.nextInt();
		return opcion;
	}
	/**
	 * Pide los datos necesarios para la creacion de un objeto empleado
	 * @param con 
	 */
	public static void prepararEmpleado(Consigna con) {
		
		System.out.println("Escriba el nombre del empleado:");
		String nombre = keyboard.next();
		
		System.out.println("Escriba los apellidos del empleado");
		String apellidos = keyboard.next();
		
		System.out.println("Escriba el nif del empleado incluyendo la letra");
		String nif = keyboard.next();
		
		System.out.println("Escriba el telefono del empleado");
		int telefono = keyboard.nextInt();
		
		System.out.println("Escriba el email del empleado");
		String email = keyboard.next();
		
		System.out.println("Escriba el genero del empleado en mayusculas entre HOMBRE/MUJER: ");
		String gender = keyboard.next();
		Genero genero = comprobarGenero(gender);
		
		while (genero == null) {
			System.out.println("Genero introducino no valido introduzcalo de nuevo");
			gender = keyboard.next();
			genero = comprobarGenero(gender);
		}
		
		System.out.println("Introduzca la edad del empleado: ");
		int edad = keyboard.nextInt();
		
		
		Empleado contenedor = new Empleado (nombre,apellidos,nif,telefono,email,genero,edad);
		con.añadirElementos(contenedor);
		
		
	}
		/**
		 * Pide los datos necesarios para la creacion d eun objeto Cliente
		 */
		public static void prepararCliente() {
		
		System.out.println("Escriba el nombre del cliente:");
		String nombre = keyboard.next();
		
		System.out.println("Escriba los apellidos del cliente");
		String apellidos = keyboard.next();
		
		System.out.println("Escriba el nif del cliente incluyendo la letra");
		String nif = keyboard.next();
		
		System.out.println("Escriba el telefono del cliente");
		int telefono = keyboard.nextInt();
		
		System.out.println("Escriba el email del cliente");
		String email = keyboard.next();
		
		System.out.println("Escriba el genero del cliente en mayusculas entre HOMBRE/MUJER: ");
		String gender = keyboard.next();
		Genero genero = comprobarGenero(gender);
		
		while (genero == null) {
			System.out.println("Genero introducino no valido introduzcalo de nuevo");
			gender = keyboard.next();
			genero = comprobarGenero(gender);
		}
		System.out.println("Introduzca la edad del cliente: ");
		int edad = keyboard.nextInt();
		
		
		Cliente contenedor = new Cliente (nombre,apellidos,nif,telefono,email,genero,edad);
		añadirClientes(contenedor);
		
		
	}
	
	/**
	 * Recibe un String que distingue entre hombre y mujer para establecerlo como enumeracion de genero
	 * @param gender
	 * @return Genero : genero
	 */
	public static Genero comprobarGenero(String gender) {
		Genero genero = null;
		
		if (gender.compareTo("HOMBRE") == 0) {
			
			genero = Genero.HOMBRE;
		}else if (gender.compareTo("MUJER") == 0){
			
			genero = Genero.MUJER;
		}
		
		return genero;
	}
	/**
	 * Menu de listado de la opcion lista del menu padre
	 * @param con
	 */
	public static void listar(Consigna con) {
		int opcion = menuListado(con);
		
		while (opcion != 0) {
			switch (opcion) {
			case 1:{
				con.visualizarEmpleados();
				System.out.println("\n\nIntroduzca un caracter cualquiera para continuar: ");
				keyboard.next();
				break;
			}
			case 2:{
				con.visualizarConsignaciones();
				System.out.println("\n\nIntroduzca un caracter cualquiera para continuar: ");
				keyboard.next();
				break;
			}
			case 3:{
				visualizarClientes(con);
				System.out.println("\n\nIntroduzca un caracter cualquiera para continuar: ");
				keyboard.next();
				break;
				}
			case 4:{
				con.visualizarElementos();
				System.out.println("\n\nIntroduzca un caracter cualquiera para continuar: ");
				keyboard.next();
				break;
				}
			default:{
				System.out.println("Numero introducido no valido");
			}
			}
			opcion = menuListado(con);
		}
		
		
		
	}
	/**
	 * Menu interactivo apra usuario que define las funciones de listar de la Clase Pruebas
	 * @param con
	 * @return int : opcion
	 */
	public static int menuListado(Consigna con) {
		int opcion = -1;
			System.out.println("\n\n----------Menu de listado de " + con.getNombre() + "----------------");
			System.out.println("\n*******************");
			System.out.println("1.- Listar Empleados");
			System.out.println("2.- Listar Consignaciones");
			System.out.println("3.- Listar Clientes");
			System.out.println("4.- Listar Todo");
			System.out.println("0.- Salir ");
			opcion = keyboard.nextInt();
		
		return opcion;
		
	}
	/**
	 * Metodo que añade clientes a un vector dentro de la clase Pruebas
	 * @param newC
	 */
	public static void añadirClientes(Cliente newC) {
		
		int newTam = numClientes+1;
		Cliente v[] = new Cliente[newTam];
		
		
		for (int i = 0; i < c.length; i++) {
			v[i] = c[i];
		}
		
		v[c.length] = newC;
		c = v;
		numClientes++;
		
	}
	/**
	 * Metodo que visualiza los clientes del vector c de la clase Pruebas
	 * @param con
	 */
	public static boolean visualizarClientes(Consigna con) {
		boolean funciona = true;
		System.out.println("\n-----------Clientes de la consigna '" + con.getNombre() +"'------------");
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].toString());
			
		}
		
		return funciona;
	}
	/**
	 * Metodo que busca entre los tres tipos de objetos que contiene la consigna 
	 * @param con
	 */
	public static void buscar (Consigna con) {
		boolean encontrado = false;
		
		System.out.println("Introduce una ID para que sea buscada:\n\n"
							+ "Ejemplos de id:\n\n"+ "-Empleado (E1,E2...)\n"+ "-Cliente (C1,C2...)\n" 
							+ "-Consigna (O1,O2...)");
		String id = keyboard.next();
		encontrado = con.buscarElementos(id);
		
		if (encontrado == false) {
			encontrado = buscarClientes(id);
		}
		
		if (encontrado == false) {
			System.out.println("No se ha encontrado ningun objeto con la id " + id);
		}
		
		
	}
	/**
	 * Metodo que muestra una clase Cliente a partir de una id introducida, devuelve un booleano indicando si ha sido
	 * encontrada
	 * @param id
	 * @return encontrado : boolean
	 */
	public static boolean buscarClientes(String id) {
		boolean encontrado = false;
		
		
		for (int i = 0; i < c.length && encontrado == false; i++) {
			if (c[i].getId().compareTo(id)==0) {
				System.out.println("!!!!!!ENCONTRADO!!!!!");
				System.out.println(c[i].toString());
				encontrado = true;
			} 
		}
		return encontrado;
	}
	/**
	 * Metodo que retorna una clase cliente del vector de la clase pruebas
	 * @param id
	 * @return Cliente
	 */
	public static Cliente localizarCliente(String id) {
		
		for (int i = 0; i < c.length; i++) {
			if (c[i].getId().compareTo(id)==0) {
				
				return c[i];
			} 
		}
		return null;
	}
	/**
	 * Metodo que pide los datos necesarios para una consignacion
	 * @param con : Consigna
	 */
	public static void prepararConsignacion(Consigna con) {
		
		System.out.println("Estos son los clientes escritos en la consigna");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].toString());
			
		}
		// c1, 1,"Reloj diamantino,mochila skitty,Gafas recfacheras",3, "03/03/2024"
		System.out.println("De las ids escritas arriba escriba una para asociarla a la nueva consignacion: ");
		String id = keyboard.next();
		
		while (localizarCliente(id)== null) {
			System.out.println("Id introducida no valida introduzacala de nuevo o "
								+ "escriba 0 para volver al menu anterior");
			id = keyboard.next();
			
			if (id == "0") {
				return;
			}
		}
		
		System.out.println("Escriba el peso en kilos y unidades enteras:");
		int peso = keyboard.nextInt();
		
		System.out.println("Escriba una descripcion con la lista de objetos sin espacios: ");
		String descripcion = keyboard.next();
		
		System.out.println("Escriba el numero de objetos de la consignacion: ");
		int numObjetos = keyboard.nextInt();
		
		System.out.println("Introduzca la fecha de ingreso en la consigna con el siguiente formato XX/XX/XXXX:");
		String fecha = keyboard.next();
		
		con.añadirElementos(localizarCliente(id),peso,descripcion,numObjetos,fecha);
		System.out.println("\n\n Entrada añadida\n\n Listando Consignaciones.....\n\n");
		con.visualizarConsignaciones();
		
	}
	/**
	 * Metodo que pide los datos necesarios para una eliminacion de un objeto de la Consigna
	 * @param con
	 */
	public static void prepararEliminacion(Consigna con) {
		
		System.out.println("\nA continuacion se le listara todos los datos de la consigna para que escoga "
							+ "la id a eliminar");
		

		
		Libreria.esperar(3);
		
		con.visualizarElementos();
		
		
		
		
		System.out.println("\n\n--------------------------CLIENTES REGISTRADOS-----------------------------");
		visualizarClientes(con);
		System.out.println("\n\nNota: Recuerde, si elimina un cliente eso no significa que dejara de estar asociado a"
							+ " su consignacion, para borrar \ntodo rastro del cliente debera borrar "
							+ "tambien la consignacion");
		System.out.println("\nIntroduzca la ID a eliminar: ");
		String id = keyboard.next();
		boolean encontrado = false;
		
		
		if (localizarCliente(id) != null) {
			encontrado = true;
			System.out.print("Buscando");
			
			Libreria.esperar(5);
			
			System.out.println("\n ¡POP!");
			eliminarCliente(localizarCliente(id));
		}
		
		if (encontrado == false) {
			encontrado = con.eliminarElementos(id);
		}
		
		if (encontrado == false) {
			System.out.println("ID INTRODUCIDA NO VALIDA, VOLVIENDO AL MENU PRINCIPAL");
		}
		
		
	}
	/**
	 * Metodo que elimina un cliente previamente introducido y reajusta el vector
	 * @param Cliente : caEliminar
	 * @return encontrado: boolean
	 */
	public static boolean eliminarCliente(Cliente caEliminar) {
		boolean encontrado = true;
		int pos = localizarPosCliente(caEliminar);
		
		numClientes--;
		Cliente v[] = new Cliente [numClientes];
		System.out.println("ENCONTRADO: " + caEliminar.getId() + " sera eliminado");
	
		for (int i = 0 ; i < pos; i++) {
			v[i] = c[i];
		}
		for (int i = pos ; i < numClientes; i++) {
			v[i] = c[i+1];
		}
		
		c = v;
		return encontrado;
	}
	/**
	 * Metodo que devuelve la posicion donde se localiza el objeto cliente dentro del vector localizado en la clase
	 * Pruebas
	 * @param CBuscar 
	 * @return pos : int
	 */
	public static int localizarPosCliente(Cliente cBuscar) {
		int pos = -1;
		
		for (int i = 0; i < c.length; i++) {
			if (cBuscar == c[i]) {
				pos = i;
			}
		}
	
		return pos;
	}
	/**
	 * Metodo que pide la id de una consignacion para actualizar su fecha de salida
	 * @param con
	 */
	public static void asignarFechaSalida(Consigna con) {
		System.out.println("Escoge una consignacion a la que asignarle una fecha de extracion (si ya no ha sido"
							+ "introducida):");
		System.out.println("A continuacion se le muestran las consignaciones actuales: ");
		con.visualizarConsignaciones();
		System.out.println("\n Escriba la id de la fecha a actualizar");
		String id = keyboard.next();
		
		if (id.charAt(0) == 'O') {
			int pos = con.buscarPosElementos(id);
			if (pos == -1) {
				System.out.println("La id introducida no es valida o en su defecto es de otro registro");
			}else {
				con.setFecha(pos);
			}
			
		}else{
			System.out.println("La id introducida no es valida o en su defecto es de otro registro");
		}
		
	}

}
