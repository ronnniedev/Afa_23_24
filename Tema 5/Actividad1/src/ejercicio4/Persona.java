package ejercicio4;

public class Persona {
	
	protected String nombre;
	protected int edad;
	protected int precioEntrada;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = generarEdad();
		this.precioEntrada = generarPrecio(edad);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

	/**
	 * @return the precioEntrada
	 */
	public int getPrecioEntrada() {
		return precioEntrada;
	}
	
	

	/**
	 * @param precioEntrada the precioEntrada to set
	 */
	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public int generarEdad() {
		return (int)(Math.random()*85)+5;
	}
	
	public int generarPrecio(int e) {
		int precio = -1;
		
		if (e <= 10) {
			precio = 1;
			
		}else if(e > 10 && e <= 17){
			precio = 2;
			
		}else if (e > 17 && e <= 65) {
			precio = 7;
			
		}else {
			precio = 2;
			
		}
		
		return precio;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", precioEntrada=" + precioEntrada + "]";
	}
	
	
	
	
	
	
	
}
