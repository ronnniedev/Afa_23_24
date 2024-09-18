package ejercicio4;

import java.util.Scanner;

public class Main {
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) throws ElementoNoEncontrado {
		
		
		Edificio e = new Edificio("Teodoro Cuesta","Gijon",33207);
		Apartamento a1 = new Apartamento (1,'A');
		Apartamento a2 = new Apartamento (1,'B');
		Apartamento a3 = new Apartamento (1,'C');
		Apartamento a4 = new Apartamento (2,'A');
		Apartamento a5 = new Apartamento (2,'B');
		Apartamento a6 = new Apartamento (2,'C');
		
		e.añadirApartamentos(a1);
		e.añadirApartamentos(a2);
		e.añadirApartamentos(a3);
		e.añadirApartamentos(a4);
		e.añadirApartamentos(a5);
		e.añadirApartamentos(a6);
		e.añadirPropietario(1,'A',"Alvaro" ,"Cayetano Garcia");
		e.añadirPropietario(1,'A',"Veronica" ,"Cayetano Garcia");
		e.añadirPropietario(2,'C',"Pedro" ,"Cayetano Garcia");
		e.añadirPropietario(2,'C',"Diego" ,"Cayetano Garcia");
		e.listarApartamentos();
		
		boolean correcto = false;
		
		while (!correcto) {
			try {
				System.out.println("Introduce la direccion del edificio: ");
				String direccion = keyboard.nextLine();
				if(direccion.compareTo(e.getDireccion()) == 0) {
					correcto = true;
					
				}else {
					throw new ElementoNoEncontrado("No se encuentra la direccion, introduzca de nuevo");
				}	
				
			}catch(ElementoNoEncontrado e1){
				System.out.println(e1.getMessage());
				
			}
			
		}
		
		correcto = false;
		while (!correcto) {
			try {
				
				System.out.println("Introduce la ciudad del edificio: ");
				String municipio = keyboard.next();
				if(municipio.compareTo(e.getMunicipio()) == 0) {
					correcto = true;
					
				}else {
					System.out.println(correcto);
					throw new ElementoNoEncontrado("No se encuentra la ciudad, introduzca de nuevo");
				}
			}
			catch(ElementoNoEncontrado e1) {
				System.out.println(e1.getMessage());
				}
			}
			
		
		
		correcto = false;
		
		while (!correcto) {
		try {
				System.out.println("Introduce el codigo postal del edificio: ");
				int codigoPostal = keyboard.nextInt();
				if(codigoPostal == e.getCodigoPostal()) {
					correcto = true;
					
				}else {
					throw new ElementoNoEncontrado("No se encuentra el codigopostal, introduzca de nuevo");
				}
			
			}
			
		catch(ElementoNoEncontrado e1) {
			System.out.println(e1.getMessage());
			}
		}
		
		
		
		
		System.out.println("--------------Pruebas de get---------------");
		try {
			Apartamento apartamento = e.getApartamento(1, 'C');
			System.out.println(apartamento);
		} catch (noEncontradoException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		try {
			e.getPropietarios(1, 'A');
		} catch (noEncontradoException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}

		
	}

}
