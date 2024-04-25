package Act2;

public class Contacto {
	private String nombre;
	private Telefono telefono;
	private String direccion;
	
	public Contacto(String nombre, String numero, String direccion) {
		if(Telefono.comprobarTelefono(numero)==false) {
			nombre="";
			telefono=new Telefono(numero);
			direccion="";
		}else {
			this.nombre=nombre;
			telefono=new Telefono(numero);
			this.direccion=direccion;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" 
					+ telefono.getValor() + ", direccion=" 
				    + direccion + "]";
	}
	
	
}
