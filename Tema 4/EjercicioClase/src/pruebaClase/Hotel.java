package pruebaClase;

public class Hotel {

	
	private Habitacion h[];
	private int numeroHabitaciones;
	private Habitacion reservas[];
	private int numReservas;
	
	/** Contructor para clase Hotel
	 */
	public Hotel() {
		
		this.h = new Habitacion [10];
		this.numeroHabitaciones = 0;
		this.reservas = new Habitacion [10];
		this.numReservas = 0;
		
	}
	
	/** Metodo que añade una nueva habitacion al hotel
	 * @param hab
	 */
	public void nuevaHabitacion(Habitacion hab) {
		boolean huecoEncontrado = false;
		if (numeroHabitaciones == h.length) {
			
			System.out.println("ERROR \n No se pueden añadir habitaciones nuevas");
			
		} else {
			
			for (int i = 0; i < h.length && huecoEncontrado == false; i++) {
				if (h[i] == null) {
					huecoEncontrado = true;
					h[i] = hab;
					this.numeroHabitaciones++;
					
				}
				
			}

		}
		
		
	}
	/** Metodo que lista las habitaciones del hotel
	 */
	public void listarHabitaciones () {
		
		System.out.println("-----Habitaciones del castillo-----");
		
		for (int i = 0; i < numeroHabitaciones; i++) {
			
			System.out.println(h[i].toString());
			
		}
		
	}
	/** Metodo que te dice las habitaciones disponibles
	 */
	public void habitacionesDisponibles () {
		
		System.out.println("\n-----Habitaciones disponibles-----");
		
		for (int i = 0; i < h.length; i++) {
			
			if (h[i].isOcupado() == false) {
				System.out.println(h[i].toString());
			} 
			
		}
		
	}
	/** Metodo que obtiene el precio de la habitacion indicada y lo imprime
	 * @param ide
	 */
	public void obtenerPrecio (int ide) {
		boolean Encontrado = false;
		
		System.out.println("\n-----Busqueda de precio " + ide + " -----");
		
		for (int i = 0; i < h.length && Encontrado == false; i++) {
			
			if (h[i].getId() == ide) {
				
				Encontrado = true;
				System.out.println("Habitacion " + ide + " encontrada y su precio es " + h[i].getPrecio());
			
				
			}
			
		}
	
		if (Encontrado == false) {
			System.out.println("No se ha encontrado dicha habitacion");
		}
		
		
		
	}
	/** Metodo que borra la habitacion indicada
	 * @param ide
	 */
	public void borrarHabitacion (int ide) {
		
		boolean Encontrado = false;
		
		System.out.println("-----Borrado de habitacion " + ide + " -----");
		
		for (int i = 0; i < numeroHabitaciones && Encontrado == false; i++) {
			
			if (h[i].getId() == ide) {
				System.out.println("Se ha borrado la habitacion " + ide);
				Encontrado = true;
				numeroHabitaciones--;
				for (int j = i; j < numeroHabitaciones; j++) {
					h[j] = h[j+1];
					
				}
				
			}
			
		}
		
		if (Encontrado == false) {
			System.out.println("No se ha encontrado dicha habitacion");
		}
	}
	/** Metodo que hace una reserva y lo incluye en un nuevo vector
	 * @param ide
	 */
	public void hacerReserva(int ide) {
		boolean existe = buscarId(ide);
		
		
		for (int i = 0; i < numeroHabitaciones && existe; i++) {
			
			if (h[i].getId() == ide && h[i].isOcupado() == false){
				
				h[i].setOcupado(existe);
				reservas[numReservas] = h[i];
				numReservas++;
				
			}else if (h[i].getId() == ide && h[i].isOcupado()) {
				System.out.println("Esa habitacion se encuentra ocupada");
			}
			
		}
		
		
	}
	/** Metodo que busca una id en el vector de habitaciones
	 * @param ide
	 * @return
	 */
	public boolean buscarId (int ide) {
		
		for (int i = 0; i < h.length; i++) {
			
			if (h[i].getId() == ide) {
				 return true;
			}
			
		}
		
		return false;
		
	}
	/** Metodo que lista las habitaciones reservadas
	 */
	public void habitacionesReservadas() {
		
		System.out.println("\n----- Habitaciones reservadas-----\n");
		
		for (int i = 0; i < numReservas; i++) {
			
			System.out.println(reservas[i].toString());
			
					
			
		}
		
	}
	
	
	
}
