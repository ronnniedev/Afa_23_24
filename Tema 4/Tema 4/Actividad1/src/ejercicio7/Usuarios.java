package ejercicio7;

public class Usuarios {

	private String nombre;
	private String apellidos;
	private String email;
	private int telefono;
	private String dni;
	private Reservas r[];
	private int numReservas;
	private String nacimiento;
	
	
	public Usuarios(String nombre, String apellidos, String email, int telefono, String dni, String nacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.dni = dni;
		this.nacimiento = nacimiento;
		this.numReservas = 0;
		this.r = new Reservas[1];
	}


	/** Metodo toString que enseña los 5 parametros de Pistas
	 */
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono=" + telefono
				+ ", dni=" + dni + ", nacimiento=" + nacimiento + "]";
	}

	/** Metodo get para nombre de la clase Usuarios
	 */
	public String getNombre() {
		return nombre;
	}

	/** Metodo set para nombre de la clase Usuarios
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/** Añade una reserva al vector de reservas de Usuarios 
	 * @param codigoPista : int 
	 * @param fechaReservaCreacion : String
	 * @param diaReserva : String
	 * @param precio : int
	 */
	public void añadirReserva(int codigoPista , String fechaReservaCreacion, String diaReserva,int precio) {
		if (precio !=-1) {
			System.out.println("calcula");
			Reservas contenedor = new Reservas (codigoPista,fechaReservaCreacion,diaReserva,getNombre(),precio);
			r[numReservas] = contenedor;
			numReservas++;
		}else System.out.println("No se puede realizar la reserva por que la pista no existe");	

	}
	/** Visualiza las reservas dentro del vector de reservas en Usuarios.
	 */
	public void visualizarReservas () {
		
		for (int i = 0; i < numReservas; i++) {
			System.out.println("----Usuario----");
			System.out.println(this.toString());
			System.out.println("----Reserva----");
			System.out.println(r[i].toString());
			
		}
		
	}
	
	
}
