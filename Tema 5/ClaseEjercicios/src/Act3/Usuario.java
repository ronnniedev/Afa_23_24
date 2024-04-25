package Act3;

public class Usuario {
	private NombreUsuario nombreUsuario;
	private Contraseña contraseña;
	
	public Usuario(String valorNombre, String valorContraseña) {
		if(NombreUsuario.
				      comprobarNombreUsuario(valorNombre)==false) {
			System.err.println("ERROR nombre no valido");
		}else {
			if(Contraseña.
					 comprobarcontraseña(valorContraseña)==false) {
				System.err.println("ERROR contraseña no valida");
			}else {
				nombreUsuario=new NombreUsuario(valorNombre);
				contraseña=new Contraseña(valorContraseña);
			}
		}
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario.getNombreValor() 
				+ ", contraseña=" + contraseña.getValorContraseña() + "]";
	}

	public NombreUsuario getNombreUsuario() {
		return nombreUsuario;
	}

	public Contraseña getContraseña() {
		return contraseña;
	}
	
	
	
}
