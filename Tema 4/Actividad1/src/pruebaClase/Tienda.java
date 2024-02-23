package pruebaClase;

public class Tienda {

	
	private Electrodomestico e[];
	private int numElectrodomesticos;
	
	/** Constructor de Tienda
	 */
	public Tienda() {
		
		this.e = new Electrodomestico [10];
		this.numElectrodomesticos = 0;
		
	}
	/** Metodo que añadi un electrodomoestico al vector de electrodomesticos 
	 * @param eNew : class Electrodomestico
	 */
	public void añadirElectrodomestico(Electrodomestico eNew) {
		
		for (int i = 0; i < e.length; i++) {
			
			if (e[i] == null) {
				System.out.println("Posicion libre en " + i);
				e[i] = eNew;
				numElectrodomesticos++;
				return;
			}
			
		}
		System.out.println("No hay huecos disponibles");
		
	}
	/** Borra un electrodomestico del vector electrodomesticos tras buscarlo con su id
	 * @param ide
	 */
	public void borrarElectrodomestico(String ide) {
		
		for (int i = 0; i < numElectrodomesticos; i++) {
			
			if (e[i].getId().compareTo(ide) == 0 && e[i].getEnStock() == false) {
				int pos = i;
				numElectrodomesticos--;
				for (int j = pos; j < numElectrodomesticos; j++) {
					e[j] = e[j+1];
				}
				return;
			}else if (e[i].getId().compareTo(ide) == 0 && e[i].getEnStock()) {
				System.out.println("Este electrodomestico " + e[i].getNombre() + " Se encuentra en stock, no puede "
									+ "borrarse");
				return;
			}
			
		}
		
		System.out.println("No hay ningun Electrodomestico con ese identificador");
		
	}
	/** Visualiza el vector de electrodomesticos
	 * 
	 */
	public void visualizar () {
		
		for (int i = 0; i < numElectrodomesticos; i++) {
			
			System.out.println(e[i].toString());
			
		}
		
		
	}
	
	/** Visualiza los electrodomesticos en Stock
	 * 
	 */
	public void visualizarStock() {
		
		for (int i = 0; i < numElectrodomesticos; i++) {
			
			if (e[i].getEnStock()) {
				System.out.println(e[i].toString());
			}
		}
			
	}
	/** Visualiza el precio de los electrodomesticos con la id introducida
	 * @param ide : String
	 */
	public void visualizarPrecio(String ide) {
		
		for (int i = 0; i < numElectrodomesticos; i++) {
			
			if (e[i].getId().compareTo(ide) == 0) {
				
				System.out.println("El precio de " + e[i].getNombre() + " es " + e[i].getPrecio());
				
			} 
		}
		
		
	}
	
	
}
