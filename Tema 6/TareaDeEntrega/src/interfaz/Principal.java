package interfaz;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import excepciones.DateException;
import excepciones.ErrorAtRemovingException;
import excepciones.IncorrectAgeException;
import excepciones.IncorrectGenderException;
import excepciones.IncorrectLengthException;
import excepciones.IncorrectNifException;
import excepciones.NifYaEnListaException;
import excepciones.NotFoundException;
import logica.Consigna;
import logica.Gestion;
import modelo.Cliente;
import modelo.Consignacion;
import modelo.Empleado;
import modelo.Genero;
import modelo.Id;
import tester.CargaDatos;

/**
 * @author Veronica
 * @version 1.0
 */
public class Principal {
	static Scanner keyboard=new Scanner(System.in);
	public static Set<Cliente>clientes = new HashSet<Cliente>();
	public static Consigna con1 = new Consigna("Con1");
	
	
 	public static void main(String[] args) {
		
	
		System.out.println("BIENVENIDA AL SISTEMA DE GESTION DE '" + con1.getNombre() + "'" );
		
		CargaDatos.cargaDatos(con1);
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
				modificarPerfiles(con1);
				break;
			}
			case 7:{
				buscar(con1);	
				break;
			}
			case 8:{
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
	 * Pide los datos necesarios para la creacion de un objeto empleado
	 * @param con 
 	 * @throws IncorrectGenderException 
 	 * @throws IncorrectLengthException 
	 */
	public static void prepararEmpleado(Consigna con) {

		System.out.println("Escriba el nombre del empleado:");
		String nombre = keyboard.next();
		
		System.out.println("Escriba los apellidos del empleado");
		keyboard.nextLine();
		String apellidos = keyboard.nextLine();
		
		String nif = introducirNif();
		
		int telefono = introducirTelefono();
		
		System.out.println("Escriba el email del empleado");
		String email = keyboard.next();
		
		System.out.println("Escriba el genero del empleado en mayusculas entre HOMBRE/MUJER: ");
		Genero genero= introducirGenero();
		
		int edad = introducirEdad();
	
		
		Empleado contenedor = new Empleado (nombre,apellidos,nif,telefono,email,genero,edad);

		try {
			con.añadirEmpleados(contenedor);
			System.out.println("Empleado añadido con exito");
		} catch (NifYaEnListaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Volviendo al menu principal");
		}
		
		
		
	}
	/**
	 * Bucle con trycatch para introducir genero
	 * @return
	 */
	public static Genero introducirGenero() {
		Genero genero = null;
		String gender = "";
		while (genero == null) {
			try {
				gender = keyboard.next();
				genero = Consigna.comprobarGenero(gender);
			} catch (IncorrectGenderException e) {
				System.out.println(e.getMessage());
			}
		}
		return genero;
	}
	/**
	 * Encapsulacion para introducir un telefono y hacer control de errores
	 * @return
	 */
	public static int introducirTelefono() {
		boolean correcto = false;
		int telefono = -1;
		
		while(!correcto) {
			try {
				System.out.println("Escriba el telefono del empleado con este formato en 9 numeros XXXXXXXXX");
				telefono = keyboard.nextInt();
				Consigna.comprobarTelefono(telefono);
				correcto = true;
			}catch(IncorrectLengthException e1){
				System.out.println(e1.getMessage());
			
			}catch(InputMismatchException e2) {
				System.out.println("ERROR: introduzca un telefono de manera numerica");
				keyboard.nextLine();
			}
		}
		
		return telefono;
	}
	/**
	 * Controlador para introducir una edad dentro del sistema
	 * @return
	 */
	public static int introducirEdad() {
		int edad = -1;
		boolean correcto = false;
		
		while(!correcto) {
			try {
				System.out.println("Introduzca la edad del empleado (18-120)");
				edad = keyboard.nextInt();
				
				correcto = Consigna.comprobarEdad(edad);
			}catch(InputMismatchException e1) {
				System.out.println("Debe introducir un numero");
				keyboard.nextLine();
					
			}catch(IncorrectAgeException e2) {
				System.out.println(e2.getMessage());
				
			}
		}
		
		return edad;
	}
	/**
	 * Controlador para introducir nif dentro del sistema
	 * @return
	 */
	public static String introducirNif() {
		System.out.println("Escriba el nif del cliente incluyendo la letra en formato 123456789M no minuscula");
		boolean correcto = false;
		String nif = "";
		while (!correcto) {
			try {
				nif = keyboard.next();
				correcto = Consigna.comprobarDni(nif);
			} catch (IncorrectNifException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		return nif;
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
		System.out.println("6 - Modificar perfiles");
		System.out.println("7.- Buscar una entrada");
		System.out.println("8.- Borrar una entrada");
		System.out.println("0.- Salir ");
		int opcion = -1;
		try {
		opcion = keyboard.nextInt();
			
		} catch (InputMismatchException e1) {
			System.out.println("Debe introducir un numero");
			keyboard.nextLine();
		}
		return opcion;
	}
	
		/**
		 * Pide los datos necesarios para la creacion de un objeto Cliente
		 * @throws IncorrectGenderException 
		 * @throws IncorrectAgeException 
		 */
		public static void prepararCliente()  {
		
		System.out.println("Escriba el nombre del cliente:");
		String nombre = keyboard.next();
		
		System.out.println("Escriba los apellidos del cliente");
		keyboard.nextLine();
		String apellidos = keyboard.nextLine();
		
		String nif = introducirNif();
		
		int telefono = introducirTelefono();
		
		System.out.println("Escriba el email del cliente");
		String email = keyboard.next();
		
		System.out.println("Escriba el genero del empleado en mayusculas entre HOMBRE/MUJER: ");
		Genero genero= introducirGenero();

		int edad = introducirEdad();
		
		Cliente contenedor = new Cliente (nombre,apellidos,nif,telefono,email,genero,edad);
		
		if (!añadirClientes(contenedor)) {
			System.out.println("Dni de cliente ya previamente introducido, abortando introduccion, volviendo al menu");
		}else {
			System.out.println("Cliente añadido con exito");
		}
		
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
				System.out.println(con.visualizarEmpleados());
				System.out.println("\n\nIntroduzca un caracter cualquiera para continuar: ");
				keyboard.nextLine();
				break;
			}
			case 2:{
				System.out.println(con.visualizarConsignaciones());
				System.out.println("\n\nIntroduzca un caracter cualquiera para continuar: ");
				keyboard.nextLine();
				break;
			}
			case 3:{
				visualizarClientes(con);
				System.out.println("\n\nIntroduzca un caracter cualquiera para continuar: ");
				keyboard.nextLine();
				break;
				}
			case 4:{
				System.out.println("********Datos de consigna " + con.getNombre() + "********\n");
				con.visualizarElementos();
				System.out.println("\n\nIntroduzca un caracter cualquiera para continuar: ");
				keyboard.nextLine();
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
			try {
			opcion = keyboard.nextInt();
				
			} catch (InputMismatchException e1) {
				System.out.println("Debe introducir un numero");
			}
		return opcion;
		
	}
	/**
	 * Metodo que añade clientes a un vector dentro de la clase Pruebas
	 * @param newC
	 */
	public static boolean añadirClientes(Cliente newC) {
		boolean encontrado = clientes.add(newC);
		if (!encontrado) {
			Cliente.setNUM_CREACIONES();
		}
		return encontrado;
		
	}
	/**
	 * Metodo que visualiza los clientes del vector c de la clase Pruebas
	 * @param con
	 */
	public static boolean visualizarClientes(Consigna con) {
		boolean funciona = true;
		System.out.println("\n-----------Clientes de la consigna '" + con.getNombre() +"'------------");
		
		for (Cliente c: clientes) {
			System.out.println(c.toString());
		}
		
		return funciona;
	}
	/**
	 * Submenu para la modificacion de perfiles, te da a escoger entre las 3 clases modificables
	 * @param con
	 * @throws IncorrectGenderException
	 */
	public static void modificarPerfiles(Consigna con){
		System.out.println("\n\n*******************");
		System.out.println("Bienvenida al sistema de moficacion de perfiles introduzca la id del "
							+ "registro a modificar: ");
		System.out.println("Ejemplos de id:\n\n"+ "-Empleado (E1,E2...)\n"+ "-Cliente (C1,C2...)\n "
							+ "-Consigna (O1,O2...)");
		String id = keyboard.next();
		
		if (id.charAt(0) == 'C' && buscarClientes(id) != null) {
			Cliente c = buscarClientes(id);
			modificarClientes(c);
		}else if (id.charAt(0) == 'E' && con.buscarEmpleados(id) != null) {
			Empleado e = con.buscarEmpleados(id);
			modificarEmpleados(e);
		}else if (id.charAt(0) == 'O' && con.buscarConsignaciones(id) != null) {
			Consignacion o = con.buscarConsignaciones(id);
			modificarConsignacion(o);
		}else {
			System.out.println("ID no encontrada");
		}
		
	}
	/**
	 * Submeno para la modificacion de clientes
	 * @param c
	 * @throws IncorrectGenderException
	 */
	public static void modificarClientes(Cliente c){
		int opcion = -1;
		String input = "";
		
		while (opcion != 0) {
			System.out.println("*************CLIENTE************");
			System.out.println(c.toString());
			System.out.println("**************************");
			System.out.println("Bienvenida seleccione una de las siguiente opciones: ");
			System.out.println("1.- Modificar nombre");
			System.out.println("2.- Modificar apellidos");
			System.out.println("3.- Modificar telefono");
			System.out.println("4.- Modificar correo");
			System.out.println("5.- Modificar genero");
			System.out.println("0.- Salir ");
			try {
			opcion = keyboard.nextInt();
				
			} catch (InputMismatchException e1) {
				System.out.println("Debe introducir un numero");
				keyboard.nextLine();
			}
			switch (opcion) {
			case 1:{
				System.out.println("Introduzca el nombre nuevo del cliente");
				input = keyboard.next();
				c.setNombre(input);
				System.out.println("Nombre de " + c.getId() + "actualizados");
				break;
			}
			case 2:{
				System.out.println("Introduzca loss nuevos apellidos del cliente");
				keyboard.nextLine();
				input = keyboard.nextLine();
				c.setApellidos(input);
				System.out.println("Apellidos de " + c.getId() + "actualizados");
				break;
			}
			case 3:{
				int telefono = introducirTelefono();
				c.setTelefono(telefono);
				System.out.println("Telefono de " + c.getId() + " actualizado");
				break;
				}
			case 4:{
				System.out.println("Introduzca el correo a modificar");
				input = keyboard.next();
				c.setCorreo(input);
				System.out.println("Correo de " + c.getId() + "actualizado");
				break;
				}
			case 5:{
				System.out.println("Introduca el nuevo genero HOMBRE/MUJER");
				Genero g= introducirGenero();
				if (g != null) {
					c.setGenero(g);
					System.out.println("Genero de " + c.getId() + "actualizado");
				}
				break;
			}
			case 0:{
				break;
			}default:{
				System.out.println("Numero introducido no valido");
			}
			
			}
			
		}	
	}
	/**
	 * Modificacion que te da las opciones concretas para la modificacion de consignaciones
	 * @param o
	 */
	public static void modificarConsignacion(Consignacion o){
		int opcion = -1;
		String input = "";
		boolean correcto = false;
		
		while (opcion != 0) {
			System.out.println("******************CONSIGNACION*********************");
			System.out.println(o.toString());
			System.out.println("**************************");
			System.out.println("Bienvenida seleccione una de las siguiente opciones: ");
			System.out.println("1.- Modificar peso");
			System.out.println("2.- Modificar descripcion");
			System.out.println("3.- Modificar numero de objetos");
			System.out.println("0.- Salir ");
			try {
			opcion = keyboard.nextInt();
				
			} catch (InputMismatchException e1) {
				System.out.println("Debe introducir un numero");
				keyboard.nextLine();
			}
			switch (opcion) {
			case 1:{
				int peso = -1;
				try {
				correcto = false;
				System.out.println("Introduzca el nuevo peso  en numero enteros: ");
				peso = keyboard.nextInt();
				correcto = true;
				}catch(InputMismatchException e1) {
					System.out.println("ERROR: No introduzca caracteres, volviendo a menu...");
					keyboard.nextLine();
				}
				if (correcto) {
					o.setNumObjetos(peso);
					System.out.println("Peso de " + o.getId() + " actualizado");
				}
				break;
			}
			case 2:{
				System.out.println("Introduzca la nueva descripcion: ");
				keyboard.nextLine();
				input = keyboard.nextLine();
				o.setDescripcion(input);
				System.out.println("Descripcion de  " + o.getId()+ "actualizados");
				break;
			}
			case 3:{
				int numObjetos = -1;
				try {
				correcto = false;
				System.out.println("Introduzca el numero de objetos nuevo: ");
				numObjetos = keyboard.nextInt();
				correcto = true;
				}catch(InputMismatchException e1) {
					System.out.println("ERROR: No introduzca caracteres, volviendo a menu...");
					keyboard.nextLine();
				}
				if (correcto) {
					o.setNumObjetos(numObjetos);
					System.out.println("Numero de objetos de " + o.getId() + " actualizado");
				}
				break;
				}
			case 0:{
				break;
			}default:{
				System.out.println("Numero introducido no valido");
			}
		
			
			}
			
		}	
	}
	/**
	 * Submenu que te da las opciones pertinenentes para la modificacion de empleados
	 * @param e
	 * @throws IncorrectGenderException
	 */
	public static void modificarEmpleados(Empleado e) {
		int opcion = -1;
		String input = "";
		
		while (opcion != 0) {
			System.out.println("******************EMPLEADO*********************");
			System.out.println(e.toString());
			System.out.println("**************************");
			System.out.println("Bienvenida al menu de modificacion de " + e.getId() + "  una de las siguiente "
								+ "opciones: ");
			System.out.println("1.- Modificar nombre");
			System.out.println("2.- Modificar apellidos");
			System.out.println("3.- Modificar telefono");
			System.out.println("4.- Modificar correo");
			System.out.println("5.- Modificar genero");
			System.out.println("0.- Salir ");
			try {
			opcion = keyboard.nextInt();
				
			} catch (InputMismatchException e1) {
				System.out.println("Debe introducir un numero");
			}
			switch (opcion) {
			case 1:{
				System.out.println("Introduzca el nombre nuevo del empleado");
				input = keyboard.next();
				e.setNombre(input);
				System.out.println("Nombre de " + e.getId() + "actualizados");
				break;
			}
			case 2:{
				System.out.println("Introduzca loss nuevos apellidos del empleado");
				keyboard.nextLine();
				input = keyboard.nextLine();
				e.setApellidos(input);
				System.out.println("Apellidos de "  + e.getId() + " actualizados");
				break;
			}
			case 3:{
				int telefono = introducirTelefono();
				e.setTelefono(telefono);
				System.out.println("Telefono de " + e.getId() + " actualizado");
				break;
				}
			case 4:{
				System.out.println("Introduzca el correo a modificar");
				input = keyboard.next();
				e.setCorreo(input);
				System.out.println("Correo de " + e.getId() + "actualizado");
				break;
				}
			case 5:{
				System.out.println("Introduca el nuevo genero HOMBRE/MUJER");
				Genero g = introducirGenero();
				if (g != null) {
					e.setGenero(g);
					System.out.println("Genero de " + e.getId() + "actualizado");
				}
				break;
			}
			case 0:{
				break;
			}default:{
				System.out.println("Numero introducido no valido");
			}
			
			}
			
		}	
	}
	/**
	 * Metodo que busca entre los tres tipos de objetos que contiene la consigna 
	 * @param con
	 */
	public static void buscar (Consigna con) {
		boolean encontrado = false;
		
		System.out.println("Introduce una ID para que sea buscada:\n\n"
							+ "Ejemplos de id:\n\n"+ "-Empleado (E1,E2...)\n"+ "-Cliente (C1,C2...)\n" 
							+ "-Consignacion (O1,O2...)");
		String id = keyboard.next();
		

		encontrado = buscarClientesMostrando(id);
		
		if (encontrado == false) {
			if (id.charAt(0) == 'O') {
				Consignacion c = con.buscarConsignaciones(id);
				if (c != null) {
					System.out.println("!!!!!!ENCONTRADO!!!!!!");
					System.out.println(c.toString());
					encontrado = true;
				}
			}
		}
		
		if (encontrado == false) {
			if (id.charAt(0) == 'E') {
				Empleado e = con.buscarEmpleados(id);
				if (e != null) {
					System.out.println("!!!!!!ENCONTRADO!!!!!!");
					System.out.println(e.toString());
					encontrado = true;
				}
			}
		}
		 
		
		
	}
	/**
	 * Metodo que muestra una clase Cliente a partir de una id introducida, devuelve un booleano indicando si ha sido
	 * encontrada, ademas lo muestra
	 * @param id
	 * @return encontrado : boolean
	 */
	public static boolean buscarClientesMostrando(String id){
		boolean encontrado = false;
		
		for (Cliente c: clientes) {
			if (c.getId().compareTo(id)==0) {
				System.out.println("!!!!!!ENCONTRADO!!!!!");
				System.out.println(c.toString());
				encontrado = true;
			} 
		}
		
		return encontrado;
	}
	
	/**
	 * Metodo que muestra una clase Cliente a partir de una id introducida, devuelve un booleano indicando si ha sido
	 * encontrada
	 * @param id
	 * @return encontrado : boolean
	 */
	public static Cliente buscarClientes(String id) {
		Cliente cNew = null;
	
		for (Cliente c: clientes) {
			if (c.getId().compareTo(id)==0) {
				cNew = c;
			} 
		}
		return cNew;
	}
	/**
	 * Metodo que retorna una clase cliente del vector de la clase pruebas
	 * @param id
	 * @return Cliente
	 */
	public static Cliente localizarCliente(String id) {
		
		for (Cliente c: clientes) {
			if (c.getId().compareTo(id)==0) {
				
				return c;
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
		visualizarClientes(con);
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
		boolean correcto = false;
		int peso = -1;
		while (!correcto) {
			try {
			System.out.println("Escriba el peso en kilos y unidades enteras:");
			peso = keyboard.nextInt();
			correcto = true;
			}catch(InputMismatchException e1) {
				System.out.println("ERROR: Introduzca el peso con numeros enteros");
				keyboard.nextLine();
				
			}
		}
		
		
		System.out.println("Escriba una descripcion con la lista de objetos sin espacios: ");
		keyboard.nextLine();
		String descripcion = keyboard.nextLine();
	
		correcto = false;
		int numObjetos = -1;
		while (!correcto) {
			try {
			System.out.println("Escriba el numero de objetos de la consignacion: ");
			numObjetos = keyboard.nextInt();
			correcto = true;
			}catch(InputMismatchException e1) {
				System.out.println("ERROR: Introduzca la cantidad de objetos con numeros enteros");
				keyboard.nextLine();
			}
		}
		
		con.añadirConsignacion(localizarCliente(id),peso,descripcion,numObjetos);
		System.out.println("\n\n Entrada añadida\n\n Listando Consignaciones.....\n\n");
		System.out.println(con.visualizarConsignaciones());

		
	}
	/**
	 * Metodo que pide los datos necesarios para una eliminacion de un objeto de la Consigna
	 * @param con
	 */
	public static void prepararEliminacion(Consigna con) {
		
		System.out.println("\nA continuacion se le listara todos los datos de la consigna para que escoga "
							+ "la id a eliminar");
	
		Gestion.esperar(3);
		System.out.println("Datos de consigna " + con.getNombre() + "\n");
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
			
			Gestion.esperar(5);
			
			System.out.println("\n ¡POP!");
			eliminarCliente(id);
			System.out.println("ENCONTRADO: " + id + " sera eliminado");
		}
		
		if (encontrado == false) {
			try {
				encontrado = con.eliminarElementos(id);
				if (encontrado && id.charAt(0) == 'O') {
					System.out.println("Consignacion eliminado");
				}else if (encontrado && id.charAt(0) == 'E') {
					System.out.println("Empleado eliminado");
				}
				
			} catch (ErrorAtRemovingException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
	}
	/**
	 * Metodo que elimina un cliente previamente introducido y reajusta el vector
	 * @param Cliente : caEliminar
	 * @return encontrado: boolean
	 */
	public static boolean eliminarCliente(String id) {
		boolean encontrado = false;
		
		if (localizarCliente(id) != null) {
			clientes.remove(localizarCliente(id));	
			encontrado = true;
		}
	
		return encontrado;
	}
	/**
	 * Metodo que pide la id de una consignacion para actualizar su fecha de salida
	 * @param con
	 */
	public static void asignarFechaSalida(Consigna con) {
		System.out.println("Escoge una consignacion a la que asignarle una fecha de extracion (si ya no ha sido"
							+ "introducida):");
		System.out.println("A continuacion se le muestran las consignaciones actuales: ");
		System.out.println(con.visualizarConsignaciones());
		System.out.println("\n Escriba la id de la fecha a actualizar");
		String id = keyboard.next();
		
		if (id.charAt(0) == 'O') {
			Id newId = new Id (id);
			try {
				con.setFecha(newId);
				System.out.println("Actualizada la fecha");
				// hay que meter aqui que se visualize la consigna
			} catch (DateException e) {
				System.out.println(e.getMessage());
			}
		}else{
			System.out.println("La id introducida no es valida o en su defecto es de otro registro");
		}
		
	}

}
