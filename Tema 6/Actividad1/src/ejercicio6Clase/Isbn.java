package ejercicio6Clase;

import java.util.Objects;

public class Isbn {

	private String isbn;

	public Isbn(String isbn) {
		this.isbn = isbn;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Isbn other = (Isbn) obj;
		return this.isbn.compareTo(other.isbn)==0;
	}



	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Isbn [isbn=" + isbn + "]";
	}
	
}
