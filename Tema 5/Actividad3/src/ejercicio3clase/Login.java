package ejercicio3clase;

public class Login {
	private NombreUsuario nombreUsuario;
	private Contraseña contraseña;
	
	public Login(String nombreUsuario, String cont) {
		this.nombreUsuario =new  NombreUsuario(nombreUsuario);
		this.contraseña = new Contraseña(cont);
	}

	
	
	/**
	 * @return the nombreUsuario
	 */
	public NombreUsuario getNombreUsuario() {
		return nombreUsuario;
	}



	/**
	 * @return the contraseña
	 */
	public Contraseña getContraseña() {
		return contraseña;
	}



	@Override
	public String toString() {
		return "Login [nombreUsuario=" + nombreUsuario.getValor() + ", contraseña=" + contraseña.getValorContraseña() + "]";
	}
	
	
	
	

}
