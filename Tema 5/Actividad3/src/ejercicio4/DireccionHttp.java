package ejercicio4;

import java.util.Objects;

public class DireccionHttp {

	private String servidor;
	private int puerto;
	private String direccion;
	
	
	public DireccionHttp(String direccion) {
		boolean puertoRecortado = false;
		int contPuntos = 0;
		this.servidor = "";
		this.direccion = "";
		boolean primeraFase= false;
		String contenedor = "";
		
		
		for (int i = 0; i < direccion.length(); i++) {
			if (!primeraFase) {
				if (direccion.charAt(i) == 'w') {
					primeraFase= true;
					this.servidor = this.servidor + direccion.charAt(i);
				}
			}else if (contPuntos != 1){
				System.out.print(direccion.charAt(i));
				if (direccion.charAt(i) == ':') {
					contPuntos++;
				}else {
					this.servidor = this.servidor + direccion.charAt(i);
				}
			}else if (puertoRecortado == false) {
				System.out.println("2");
				if (Character.isDigit(direccion.charAt(i)) != true) {
					this.puerto = Integer.parseInt(contenedor);
					this.direccion = this.direccion + '/';
					puertoRecortado = true;
				}else {
					contenedor = contenedor + direccion.charAt(i);
				}
			}else {
				this.direccion = this.direccion + direccion.charAt(i);
			}
			
		}
		
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(servidor);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("entra");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DireccionHttp other = (DireccionHttp) obj;
		System.out.println(this.servidor);
		System.out.println(other.servidor);
		System.out.println(this.servidor.compareTo(other.servidor) == 0);
		return this.servidor.compareTo(other.servidor) == 0;
	}


	


	/**
	 * @return the servidor
	 */
	public String getServidor() {
		return servidor;
	}




	/**
	 * @param servidor the servidor to set
	 */
	public void setServidor(String servidor) {
		this.servidor = servidor;
	}




	/**
	 * @return the puerto
	 */
	public int getPuerto() {
		return puerto;
	}




	/**
	 * @param puerto the puerto to set
	 */
	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}




	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}




	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	@Override
	public String toString() {
		return "DireccionHttp [servidor=" + servidor + ", puerto=" + puerto + ", direccion=" + direccion + "]";
	}
	
	
	
	
}
