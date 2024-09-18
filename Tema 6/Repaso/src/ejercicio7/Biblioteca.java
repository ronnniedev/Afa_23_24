package ejercicio7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Biblioteca {
	
	private String nombre;
	private Map <Isbn,Libro> libros;
	private Set <Socio> socios;
	private List <Prestamo> prestamos;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.libros = new HashMap<Isbn,Libro>();
		this.socios = new TreeSet<Socio>();
		this.prestamos = new LinkedList<Prestamo>();
	}
	
	public void añadirLibro(String titulo,String autor,String genero) throws YaEnListaException {
		Isbn isbn = new Isbn();
		Libro libro = new Libro (isbn,titulo,autor,genero);
		
		if(!libros.containsKey(isbn)) {
			libros.put(isbn, libro);
		}else {
			throw new YaEnListaException("Este libro ya existe");
		}
		
	}
	
	public void listarLibros() {
		System.out.println("------------Lista de libros------------");
		
		for(Libro l: libros.values()) {
			System.out.println(l);
		}
		
	}
	
	public void añadirSocio(Socio socio) throws YaEnListaException {
		
		if(!socios.add(socio)) {
			throw new YaEnListaException("Socio ya registrado");
		}else {
			System.out.println("Socio agregado");
		}
		
		
	}
	
	public void listarSocios() {
		
		System.out.println("-------------Lista de socios-------------");
		
		for(Socio s: socios) {
			System.out.println(s);
		}
	}
	
	public Socio encontradorSocio(String nif) throws SocioNotFoundException {
		Socio s = new Socio (nif);
		
		if (socios.contains(s)) {
			for(Socio socio : socios) {
				if(socio.getNif().compareTo(nif) == 0) {
					System.out.println(socio.toString());
					return socio;
					
				}
			}
		}else {
			
			throw new SocioNotFoundException("No se encontro el socio");
		}
		
		throw new SocioNotFoundException("Error inesperado");
		
	}
	
	public Libro encontradorLibro(String isbn) throws LibroNotFoundException {
		Isbn i = new Isbn(isbn);
		
		if (libros.containsKey(i)) {
			System.out.println(libros.get(i).toString());
			return libros.get(i);
		}else {
			throw new LibroNotFoundException("No se encontro el libro");
		}
		
		
	}
	
	
	public void prestar(String nif,String isbn) {
		Socio other = new Socio(nif);
		Isbn otherIsbn = new Isbn(isbn);
		if(socios.contains(other)) {
			if(libros.containsKey(otherIsbn)) {
				
			}
			
		}
		
	}
	
	

}
