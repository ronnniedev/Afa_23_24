package tareaExtra;

public class Tienda implements Crud{

	protected Producto leche[]; //20
	protected Producto huevo[]; //10
	protected Producto dvd[]; //30
	protected Producto cd[];
	protected Producto impresora[];
	protected Producto tv[];
	
	public Tienda() {
		this.leche = new Producto [20];
		this.huevo = new Producto [10];
		this.dvd = new Producto [30];
		this.cd = new Producto[30];
		this.impresora = new Producto [5];
		this.tv = new Producto [5];
	}
	
	public void añadirProducto(Producto p, ProductoEnAlmacen a) {
		Producto contenedor = a.sacarDeAlmacen(p.getTipo());
		boolean encontrado = false;
		
		if (contenedor.getTipo().compareTo("Leche de soja") == 0) {
			for (int i = 0; i < leche.length; i++) {
				if (leche[i]==null) {
					leche[i]= contenedor;
					encontrado = true;
				}
			}
			
		}else if (contenedor.getTipo().compareTo("Huevos de avestruz") == 0) {
			for (int i = 0; i < huevo.length; i++) {
				if (huevo[i]==null) {
					huevo[i]= contenedor;
					encontrado = true;
				}
			}
			
		}else if (contenedor.getTipo().compareTo("DVDS") == 0) {
			for (int i = 0; i < cd.length; i++) {
				if (dvd[i]==null) {
					dvd[i]= contenedor;
					encontrado = true;
				}
			}
			
		}else if (contenedor.getTipo().compareTo("CDS") == 0) {
			for (int i = 0; i < cd.length; i++) {
				if (cd[i]==null) {
					cd[i]= contenedor;
					encontrado = true;
				}
			}
			
		}else if (contenedor.getTipo().compareTo("IMPRESORAS") == 0) {
			for (int i = 0; i < impresora.length; i++) {
				if (impresora[i]==null) {
					impresora[i]= contenedor;
					encontrado = true;
				}
			}
			
		}else if (contenedor.getTipo().compareTo("tvs") == 0) {
			for (int i = 0; i < tv.length; i++) {
				if (tv[i]==null) {
					tv[i]= contenedor;
					encontrado = true;
				}
			}
			
		}
		
		if (encontrado == false) {
			System.out.println("El producto " + contenedor.getTipo() + " esta lleno o no existe");
		}
		
		
	}

	public void inicializarIds (Producto v[]) {
		
	boolean lleno = true;
		
	for (int i = 0; i < v.length; i++) {
		
		if (v[i]==null) {
			lleno = false;
		} 
	}	
	if (lleno == true) {
		System.out.println("El producto" + v[0].getTipo() + "tiene el stock lleno");
	}
		
	}
	

	@Override
	public void visualizar() {
		int cont = 0;
		for (int i = 0; i < tv.length; i++) {
			if (tv[i] == null) {
				System.out.println("Hay " + cont + "cds");
			}
			cont++;
		}
		
	}
	
	
}
