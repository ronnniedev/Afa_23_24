package ejercicio7;

import java.util.Date;

public class Prestamo {
	
	private Isbn isbn;
	private Date fechaAlquiler;
	private String nif;
	private Date fechaDevolucion;
	
	
	public Prestamo(Libro libro,Socio socio) {
		this.isbn = libro.getIsbn();
		this.fechaAlquiler = new Date();
		this.nif = socio.getNif();
		this.fechaDevolucion = null;
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
	 * @return the fechaAlquiler
	 */
	public Date getFechaAlquiler() {
		return fechaAlquiler;
	}


	/**
	 * @param fechaAlquiler the fechaAlquiler to set
	 */
	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}


	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}


	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}


	/**
	 * @return the fechaDevolucion
	 */
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}


	/**
	 * @param fechaDevolucion the fechaDevolucion to set
	 */
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}


	@Override
	public String toString() {
		return "Prestamo [isbn=" + isbn + ", fechaAlquiler=" + fechaAlquiler + ", nif=" + nif + ", fechaDevolucion="
				+ fechaDevolucion + "]";
	}
	
	
	
}
