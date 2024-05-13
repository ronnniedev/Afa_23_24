package logica;

import java.util.Scanner;

import excepciones.IncorrectAgeException;
import excepciones.IncorrectGenderException;
import excepciones.IncorrectLengthException;
import excepciones.IncorrectNifException;
import interfaz.Principal;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Genero;

public class Gestion {
	
	static Scanner keyboard=new Scanner(System.in);

	/**
	 * Simula un tiempo de espera para que el usuario pueda leer la interfaz
	 * @param segundos
	 */
	public static void esperar (int segundos) {
		System.out.print("\n\nCargando");
		
		for (int i = 0; i < segundos; i++) {
			
			try{
			    Thread.sleep(1000);
			    
			}catch(InterruptedException ex){
				
			}
			System.out.print(".");
		}
	}


}
