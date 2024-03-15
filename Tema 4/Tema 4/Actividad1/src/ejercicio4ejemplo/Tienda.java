package ejercicio4ejemplo;

public class Tienda {
	private String nombre;
	private String propietario;
	private int numeroTributario;
	private Computador v[];
	private int numeroComputadores;
	
	public Tienda(String nombre, String propietario, int numeroTributario,int tam) {
		this.nombre = nombre;
		this.propietario = propietario;
		this.numeroTributario = numeroTributario;
		v = new Computador [tam];
		this.numeroComputadores=0;
	}
	/** Comprueba que el vector esta lleno
	 * @return boolean
	 */
	public boolean tiendaLlena() {
		if (numeroComputadores== v.length) {
			return true;
		}else return false;
		
	}
	/** Comprueba que el vector esta vacio
	 * @return boolean
	 */
	public boolean tiendaVacia() {
		if (numeroComputadores== 0) {
			return true;
		}else return false;
		
	}
	
	public void añadir (Computador c) {
		System.out.println("entra");
		if (this.tiendaLlena()==false) {
			// añadimos a la primera posicion vacia
			int posVacia = this.numeroComputadores;
			v[posVacia]=c;
			
			this.numeroComputadores++;
			
		}else System.out.println("ERROR la tienda llena");
		System.out.println("sale");
		
	}
	
	public void imprimir() {
		String texto = "Tienda [nombre=" + nombre + ", propietario=" + propietario + ", numeroTributario=" + numeroTributario
				+ ", numeroComputadores=" + numeroComputadores + "]\n";
		
		for (int i = 0; i < this.numeroComputadores; i++) {
			
				Computador c= v[i];
				texto+="\t" +c.toString()+"\n";
			
			
			
		}
		System.out.println(texto);
		
	}
	
	public int buscar (String marca) {
		for (int i = 0; i<this.numeroComputadores; i++) {
			Computador c= v[i];
			if (c.getMarca().compareTo(marca) == 0) {
				System.out.println("Resultado encontrado");
				return i;
			}
		}
		return -1; //indica error de posicion
		
		
	}
	
	public void eliminar (String marca) {
		int pos = buscar(marca);
		
		if (pos!=-1) {
			for (int i = pos; i < this.numeroComputadores-1; i++) {
					if (v[i+1] != null) {
						v[i] = v[i+1];
					}
				this.numeroComputadores--;
			}
			
		}
		
	}
	
	
	
	
	
	
}
