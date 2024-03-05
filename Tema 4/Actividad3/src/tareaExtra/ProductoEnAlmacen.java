package tareaExtra;

public class ProductoEnAlmacen implements Crud{
	
	protected Producto p[];
	protected int numProductos;

	public ProductoEnAlmacen() {
		this.p = new Producto[0];
		numProductos = 0;
	}
	
	
	public  void añadirProducto(Producto cesta[]) {
		
		for (int i = 0; i < 200; i++) {
			
			int num =(int) (Math.random()*cesta.length);
			
			if (comprobarLimite(cesta[num].getId())) {
				int newTam = numProductos +1;
				
				Producto newV[] = new Producto[newTam];
				
				for (int j = 0; j < numProductos; j++) {
					newV[j] = p[j];
				}
				
				newV[numProductos] = cesta[num];
				
				this.numProductos++;
				
				this.p = newV;
				
			}else {
				i--;
			}
			
		}
		
		
	}
	
	public boolean comprobarLimite(int id) {
		int cont = 0;
		
		for (int i = 0; i < numProductos; i++) {
			
			if (id == p[i].getId()) {
				cont++;
			}
			
		}
		if (cont < 50) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void visualizar () {
		
		System.out.println("\n Almacen \n");
		
		for (int i = 0; i < numProductos; i++) {
			
			System.out.println(p[i].toString());
			
		}
		
	}
		
	
	public void visualizarContando (int longitud) {
		
		for (int i = 0; i < longitud; i++) {
			int cont = 0;
			
			for (int j = 0; j < numProductos; j++) {
				
				if (p[j].getId() == i) {
					cont++;	
				}
			}
			System.out.println("Para el producto " + i + " hay " + cont + "productos");
			
		}
		
		
		
	}
	
}
