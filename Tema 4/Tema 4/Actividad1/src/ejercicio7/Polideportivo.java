package ejercicio7;

public class Polideportivo {

	private String nombre;
	private String direccion;
	private String extension;
	private Usuarios u [];
	private Pistas p [];
	private int numUsuarios;
	private int numPistas;
	
	/** Constructor con 3 parametros para Polideportivo
	 * @param nombre : String
	 * @param direccion: String
	 * @param extension: String
	 */
	public Polideportivo(String nombre, String direccion, String extension) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.extension = extension;
		this.u = new Usuarios [3];
		this.numUsuarios = 0;
		this.p = new Pistas [2];
		this.numPistas = 0;
		
	}
	
	/** 
	 * Añade usuarios al vector de usuarios del polideportivo
	 * @param usuario : class
	 */
	public void añadir (Usuarios usuario) {
		
		this.u[numUsuarios] = usuario;
		numUsuarios++;
		
	}
	
	/** Metodo toString que enseña los 5 parametros de Polideportivos
	 */
	public String toString() {
		return "Polideportivo [nombre=" + nombre + ", direccion=" + direccion + ", extension=" + extension + "]";
	}
	/** Metodo visualizar, visualiza  cada pista y usuario de cada polideportivo
	 */
	public void visualizar () {
		
		System.out.println("\n\n-------Polideportivo--------");
		
		System.out.println(toString());
		
		System.out.println("------Pistas-----");
		
		for (int i = 0; i < numPistas; i++) {
			
			System.out.println(p[i].toString());
			System.out.println("----Reservas de pista "+ p[i].getCodigo());
			p[i].visualizarReservas();
		}
		
		
		System.out.println("\n------Usuarios-------");
		
		for (int i = 0; i < numUsuarios; i++) {
			
			System.out.println(u[i].toString());
		}
		
		
		
	}
	/** 
	 * Añade una pista dentro del vector de pistas de polideportivos
	 * @param codigo: int
	 * @param tipo : String
	 * @param operativo: boolean
	 * @param precio : int
	 * @param fechaReserva : String
	 */
	public void añadirPistas (int codigo, String tipo, boolean operativo, int precio, String fechaReserva) {
		
		Pistas contenedor = new Pistas (codigo,tipo,operativo,precio,fechaReserva);
		
		p[numPistas] = contenedor;
		
		numPistas++;
		
		
	}
	/** 
	 * Obtiene el precio mediante el codigo de pista introducido previamente
	 * @param codigoPista: int
	 * @return entero
	 */
	public  int obtenerPrecio (int codigoPista) {
	
		for (int i = 0; i < numPistas; i++) {
			if (codigoPista == p[i].getCodigo()) return p[i].getPrecio();
		}
		
		return -1;
	}
	
	public void añadirReserva(int codigoPista , String fechaReservaCreacion, String diaReserva, Usuarios u) {
		
		int i = buscarPista(codigoPista);
		
		if (i != -1) {
			
			p[i].añadirReserva(codigoPista,fechaReservaCreacion, diaReserva,p[i].getPrecio(),u);
			
		}else {
			System.out.println("No se encuentra esta pista");
		}
		
		
	}
	
	public int buscarPista (int codigoPista) {
		
		for (int i = 0; i < numPistas; i++) {
			
			if (p[i].getCodigo() == codigoPista) return i;
			
		}
		
		return -1;
		
	}
	
	
	
	
	
	
}
