package ejercicio1yo;

public class Libro {

	protected String titulo;
	protected String autor;
	protected double precio;
	
	
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
	
}
