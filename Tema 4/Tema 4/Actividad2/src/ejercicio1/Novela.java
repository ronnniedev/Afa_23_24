package ejercicio1;

public class Novela extends Libro{
	
	protected TipoNovela tipo;


	public Novela(String titulo, String autor, TipoNovela tipo) {
		super(titulo, autor);
		this.tipo = tipo;
	}
	
	/**
	 * @return the tipo
	 */
	public TipoNovela getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoNovela tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Novela [tipo=" + tipo + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	
}
