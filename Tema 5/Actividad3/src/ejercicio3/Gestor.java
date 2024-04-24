package ejercicio3;


import java.util.LinkedList;
import java.util.List;

public class Gestor {

	private List <Login> logins;
	
	public Gestor () {
		
		this.logins = new LinkedList<Login>();
	}
	/**
	 * Genera una clase longi para cargarla en la lista, si no es efectivo no se carga
	 * @param nombreUsuario
	 * @param password
	 */
	public void logearse (String nombreUsuario,String password) {
		NombreUsuario u = new NombreUsuario(nombreUsuario);
		Contraseña c = new Contraseña (password);
		
		Login l = new Login (u,c);
		
		if (l.getContraseña() != null) {
			logins.add(l);
		}
		
	}
	
	/**
	 * Imprime los logins del sistema de tal manera que pueda observarse un historial
	 */
	public void registroDeLogins () {
		
		System.out.println("*************Logins del sistema**************");
		
		for (Login l: logins) {
			
			System.out.println(l.toString());
			
		}
	}

}
