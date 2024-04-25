package Act3.TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GestorLogin {
	private Map<NombreUsuario,Usuario> usuarios;
	
	public GestorLogin() {
		usuarios=new TreeMap<NombreUsuario,Usuario>();
	}
	
	public void añadirUsuario(String nombre, String contraseña) {
		if(NombreUsuario.comprobarNombreUsuario(nombre)==true &&
				Contraseña.comprobarcontraseña(contraseña)==true) {
			Usuario u=new Usuario(nombre, contraseña);
			usuarios.put(u.getNombreUsuario(), u);
		}else {
			System.out.println("ERROR al insertar usuario");
		}
	}
	
	public void mostrarUsuarios() {
		for(Usuario u: usuarios.values()) {
			System.out.println(u.toString());
		}
	}
	
	public void logearse(String nombre, String contraseña) {
		if(NombreUsuario.comprobarNombreUsuario(nombre)==false) {
			System.out.println("ERROR nombre usuario incorrecto");
		}else {
			NombreUsuario nombreUsuario=new NombreUsuario(nombre);
			Usuario u=usuarios.get(nombreUsuario);
			if(u==null) {
				System.out.println("ERROR usuario no registrado");
				System.out.println("Desea darse de alta??");
			}else {
				// comparar contraseñas
				if(contraseña.compareTo
						  (u.getContraseña().getValorContraseña())==0) {
					System.out.println("LOGIN CORRECTO!!!!!");
				}else {
					System.out.println("ERROR contraseña incorrecta");
				}
			}
		}
	}
}
