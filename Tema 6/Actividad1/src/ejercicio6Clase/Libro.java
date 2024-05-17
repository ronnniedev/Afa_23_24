package ejercicio6Clase;

public class Libro {
	
	private Isbn isbn;
	private String titulo;
	private String autor;
	private Genero genero;
	
	
	public Libro(String isbn, String titulo, String autor, Genero genero) {
		Isbn newIsbn = new Isbn(isbn);
		this.isbn = newIsbn;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
	}
	/**
	 * @return the isbn
	 */
	public Isbn getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
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
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + "]";
	}
	
	
	
	

}
