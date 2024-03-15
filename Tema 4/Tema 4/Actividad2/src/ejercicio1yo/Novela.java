package ejercicio1yo;

public class Novela extends Libro {
	
	protected TipoNovela tipo;
	
	public Novela(String titulo, String autor,TipoNovela tipo) {
		
		super(titulo, autor);
		this.tipo = tipo;
		
	}

	@Override
	public String toString() {
		return "Novela [tipo=" + tipo + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	
	
	
	
}
