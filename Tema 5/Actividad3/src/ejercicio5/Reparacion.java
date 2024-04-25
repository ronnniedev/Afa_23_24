package ejercicio5;

public class Reparacion {

	private static int NUM_VECES = 0;
	private int id;
	private String dni; 
	private String matricula;
	private double precio;
	
	public Reparacion(String dni,String matricula) {
		NUM_VECES++;
		this.id = NUM_VECES;
		this.dni = dni;
		this.matricula = matricula;
		this.precio = Math.random()*100;
	}

	
	
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}



	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Reparacion [id=" + id + ", dni=" + dni + ", matricula=" + matricula + ", precio=" + precio + "]";
	}

	
	
	
	
	
}
