package tester;

import interfaz.Principal;
import logica.Consigna;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Genero;

public class CargaDatos {

	/**
	 * Inicia los datos basicos para las baterias de pruebas
	 * @param con
	 */
	public static void cargaDatos(Consigna con) {
		
		Empleado.setNUM_CREACIONES(0);
		Cliente.NUM_CREACIONESa0(0);
		Empleado e1 = new Empleado("Diego","De los Rios", "58799021Q", 987654321,Genero.HOMBRE,21);
		Empleado e2 = new Empleado("Maria","Remilgos", "84937023L", 638172937,"Jaimita@gmail.com",Genero.MUJER,19);
		Empleado e3 = new Empleado("Manuel","Franchesco", "98671223M", 692123417,Genero.HOMBRE,38);
		Cliente c1 = new Cliente("Marina","Ramirez", "62357489M", 732798732,"marina@gmail.com",Genero.MUJER,67);
		Principal.añadirClientes(c1);
		Cliente c2 = new Cliente("Eric","Gonzalez", "34891728Ñ", 896432789,Genero.HOMBRE,36);
		Principal.añadirClientes(c2);
		Cliente c3 = new Cliente("Marisa","Meniscos", "37213467M", 985320654,"correoEstandar@gmail.com"
								,Genero.MUJER,17);
		Principal.añadirClientes(c3);
	
		con.añadirConsignacion(c1, 1,"Reloj diamantino,mochila skitty,Gafas recfacheras",3);
		con.añadirConsignacion(c2, 3,"Ordenador Gygabyte",1);
		con.añadirConsignacion(c3, 2,"Mochila portatil,chaqueta cara",2);
		con.añadirElementos(e1);
		con.añadirElementos(e2);
		con.añadirElementos(e3);
		
	}
}
