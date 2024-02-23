package ejercicio8_2;

public class Hotel {

	private Clientes c[];
	private Habitacion h[];
	private int numClientes;
	private int numHabitaciones;
	
	public Hotel() {
		
		this.c = new Clientes [0];
		this.h = new Habitacion [0];
		this.numClientes = 0;
		this.numHabitaciones = 0;
		
	}
	
	public void añadirCliente(Clientes cliente) {
		int tam = c.length;
		int newTam = tam+1;
		this.numClientes++;
		
		Clientes nuevoVector[] = new Clientes [newTam];
		
	
		for (int i = 0; i < this.c.length; i++) {
			  nuevoVector[i] = this.c[i];
			
		}
		nuevoVector[newTam-1] = cliente;
		this.c=nuevoVector;
		System.out.println(c.length);
		
	}
	
	public void visualizarClientes () {
		
		for (int i = 0; i < c.length; i++) {
			
			System.out.println(c[i].toString());
			
		}
		
	}
	
	
}
