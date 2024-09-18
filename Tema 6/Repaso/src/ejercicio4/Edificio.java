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
	
	
	
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}



	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}



	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}



	/**
	 * @return the codigoPostal
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}



	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}



	public Apartamento getApartamento(int piso,char puerta) throws noEncontradoException {
		
		for(int i = 0; i < apartamentos.size();i++) {
			Apartamento apartamento = apartamentos.get(i);
			if(apartamento.getPiso() == piso && apartamento.getPuerta() == puerta) {
				
				return apartamento;
			}
			
		}
		throw new noEncontradoException("Apartamento no encontrado");
		
	}
	
	public void getPropietarios(int piso,char puerta) throws noEncontradoException {
		
		for(int i = 0; i < apartamentos.size();i++) {
			Apartamento apartamento = apartamentos.get(i);
			if(apartamento.getPiso() == piso && apartamento.getPuerta() == puerta) {
				System.out.println("Encontrado\n");
				apartamento.listarPropietarios();
				return;
			}
			
		}
		throw new noEncontradoException("Apartamento no encontrado");
		
	}
	
	
	
	public void añadirApartamentos(Apartamento apartamento) {
		apartamentos.add(apartamento);
		
	}

	
	public void añadirPropietario(int piso,char puerta,String nombre,String apellidos) {
		
		for(int i = 0; i < apartamentos.size();i++) {
			Apartamento apartamento = apartamentos.get(i);
			if(apartamento.getPiso() == piso && apartamento.getPuerta() == puerta) {
				System.out.println("Encontrado, añadiendo propietario " + nombre);
				apartamento.añadirPropietarios(nombre,apellidos);
				return;
			}
			
		}
		
	}
	
	public void listarApartamentos() {
		System.out.println("----------------Lista apartamentos-----------------");
		for (int i = 0; i < apartamentos.size();i++) {
			Apartamento apartamento = apartamentos.get(i);
			System.out.println(apartamento.toString());
			if (apartamento.getPropietarios().size() != 0) {
				apartamento.listarPropietarios();
			}
		}
	}
	
	
	
}
