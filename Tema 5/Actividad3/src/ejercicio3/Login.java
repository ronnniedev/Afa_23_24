package ejercicio3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Login {

	private Date fechaLogin;
	private NombreUsuario nombre;
	private Contraseña contraseña;
	private static Map<NombreUsuario,Contraseña> usuarios = new HashMap<NombreUsuario,Contraseña>();
	
	public Login(NombreUsuario nombre, Contraseña contraseña) {
		login(nombre.getValor(),contraseña.getValor());
	}

	/**
	 * Clase que crea un nuevo registro dentro de usuarios
	 * @param nombre
	 * @param password
	 */
	public static void nuevoRegistro(String nombre,String password) {
		NombreUsuario nuevoUser = new NombreUsuario(nombre);
		Contraseña nuevaPass = new Contraseña (password);
		
		boolean userCorrecto = nuevoUser.getValor() != "ERROR";
		boolean passCorrecta = nuevoUser.getValor() != "ERROR";
		
		if (userCorrecto == true && passCorrecta == true) {
			usuarios.put(nuevoUser, nuevaPass);
			System.out.println("Registro realizado con exito");
		}
		
	}
	
	/**
	 * Crea un login tras b
	 * @param nombre
	 * @param contraseña
	 */
	public void login (String nombre, String contraseña) {
		NombreUsuario u = new NombreUsuario(nombre);
		Contraseña c = new Contraseña (contraseña);
		
		if (c.getValor().compareTo("ERROR") != 0) {
			if (usuarios.containsKey(u) == false) {
				System.out.println("Usuario introducido no localizado");
			}else if (usuarios.get(u).getValor().compareTo(contraseña) == 0) {
					System.out.println("Login efectuado con exito");
					this.contraseña = c;
					this.nombre = u;
					this.fechaLogin = new Date();	
			}else {
				System.out.println("Contraseña no valida");
			}
		}else {
			System.out.println("Contraseña introducida no valida");
		}
		
		
	}
	/**
	 * Crea  una nueva contraseña solo y siempre que la nueva este bien escrita
	 * @param nombreUsuario
	 * @param contraseña
	 * @param contraseñaNueva
	 */
	public static void nuevaContraseña(String nombreUsuario, String contraseña,String contraseñaNueva) {
		NombreUsuario u = new NombreUsuario(nombreUsuario);
		Contraseña c = new Contraseña (contraseña);
		
		if (c.getValor().compareTo("ERROR") != 0) {
			if (usuarios.containsKey(u) == false) {
				System.out.println("Usuario introducido no localizado");
			}else if (usuarios.get(u).getValor().compareTo(contraseña) == 0) {
					usuarios.get(u).setValor(contraseñaNueva);
			}else {
				System.out.println("Contraseña no valida");
			}
		}else {
			System.out.println("Contraseña introducida no valida");
		}
		
	}
	
	/**
	 * @return the fechaLogin
	 */
	public Date getFechaLogin() {
		return fechaLogin;
	}

	/**
	 * @param fechaLogin the fechaLogin to set
	 */
	public void setFechaLogin(Date fechaLogin) {
		this.fechaLogin = fechaLogin;
	}

	/**
	 * @return the nombre
	 */
	public NombreUsuario getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(NombreUsuario nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the contraseña
	 */
	public Contraseña getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(Contraseña contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Login [fechaLogin=" + fechaLogin + ", nombre=" + nombre + ", contraseña=" + contraseña + "]";
	}
	
}
