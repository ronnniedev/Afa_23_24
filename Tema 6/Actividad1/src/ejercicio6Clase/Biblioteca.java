package ejercicio6Clase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Biblioteca {

	private String nombre;
	private Set <Socio> socios;
	private List <Prestamo> prestamos;
	private Map<Isbn,Libro> libros;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Socio>();
		this.prestamos = new LinkedList<Prestamo>();
		this.libros = new HashMap<Isbn,Libro>();
	}

	public void addSocio(Socio socio) {
		socios.add(socio);
	}
	
	public void addLibro(Libro libro) {
		Isbn isbn = libro.getIsbn();
		libros.put(isbn, libro);
	}

	public void addPrestamos(String nif, String isbn, String fechaEntrada, String fechaSalida) {
		// Prestamo p = new Prestamo(nif,isbn,fechaEntrada,fechaSalida);
		
	}

	public Libro  buscarLibro(String isbn) throws LibroNotFoundException {
		Isbn buscar = new Isbn(isbn);
		Libro l = libros.get(buscar);
		
		if (l == null) {
			throw new LibroNotFoundException("No se ha encontrado el libro");
		}
		
		return l;
	}
	
	public Socio buscarSocio(String nif) throws SocioNotFoundException {
		
		for (Socio s: socios) {
			if(s.getNif().compareTo(nif)==0) {
				return s;
			}
		}
		
		throw new SocioNotFoundException("No se encontro el socio");
		
	}
	
}
