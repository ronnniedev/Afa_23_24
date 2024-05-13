package ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Edificio {

	private String direccion;
	private String municipio;
	private int codigoPostal;
	private List <Apartamento> apartamentos;
	
	
	public Edificio(String direccion, String municipio, int codigoPostal) {
		this.direccion = direccion;
		this.municipio = municipio;
		this.codigoPostal = codigoPostal;
		this.apartamentos = new LinkedList<Apartamento>();
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getMunicipio() {
		return municipio;
	}


	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	public int getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}


	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}
	
	public void añadirApartamentos(Apartamento a) {
		apartamentos.add(a);
		
	}
	
	public void listarApartamentos() {
		System.out.println("*********Lista de apartamentos*********");
		
		for (int i = 0; i < apartamentos.size(); i++) {
			System.out.println(apartamentos.get(i).toString());
		}
		
	}
	
	public void getApartamento(int piso,char letra) throws ApartamentoNotFoundException {
		boolean encontrado = false;
		try {
		for (int i = 0; i < apartamentos.size(); i++) {
			if (piso == apartamentos.get(i).getNumeroDePlanta() && letra == apartamentos.get(i).getPuerta()) {
				System.out.println("Encontrado");
				encontrado = true;
			}
		}
		
		
		if (!encontrado) {
			throw new ApartamentoNotFoundException("Apartamento no encontrado");
		}
		}catch(ApartamentoNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
		
	}

	public void getPropietarios(int piso,char letra) throws ApartamentoNotFoundException {
		boolean encontrado = false;
		
		try {
		for (int i = 0; i < apartamentos.size(); i++) {
			if (piso == apartamentos.get(i).getNumeroDePlanta() && letra == apartamentos.get(i).getPuerta()) {
				System.out.println("Encontrado");
				System.out.println(apartamentos.get(i).getPropietarios());
				encontrado = true;
			}
		}
	
		if (!encontrado) {
			throw new ApartamentoNotFoundException("Apartamento no encontrado");
		}
		}catch(ApartamentoNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
		
	}
	
	public void añadirPropietarios(int piso,char letra, String nombre, String apellidos) {
		boolean encontrado = false;
		try {
			for (int i = 0; i < apartamentos.size(); i++) {
				if (piso == apartamentos.get(i).getNumeroDePlanta() && letra == apartamentos.get(i).getPuerta()) {
					System.out.println("Encontrado");
					apartamentos.get(i).añadirPropietarios(nombre, apellidos);
					encontrado = true;
				}
			}
		
			if (!encontrado) {
				throw new ApartamentoNotFoundException("Apartamento no encontrado");
			}
			}catch(ApartamentoNotFoundException e1) {
				System.out.println(e1.getMessage());
			}
		
		
	}

	@Override
	public String toString() {
		return "Edificio [direccion=" + direccion + ", municipio=" + municipio + ", codigoPostal=" + codigoPostal
				+ ", apartamentos=" + apartamentos + "]";
	}
	
	
	
	
	
}
