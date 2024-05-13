package ejercicio4;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) throws ElementoIncorrecto, ApartamentoNotFoundException{
		
		Edificio e = new Edificio("Teodoro Cuesta","Gijon",33207);
		Apartamento a1 = new Apartamento (1,'A');
		Apartamento a2 = new Apartamento (1,'B');
		Apartamento a3 = new Apartamento (1,'C');
		Apartamento a4 = new Apartamento (2,'A');
		Apartamento a5 = new Apartamento (2,'B');
		Apartamento a6 = new Apartamento (2,'C');
		
		boolean correcto = false;
		while(!correcto) {
			try {
			
				System.out.println("Escribe la calle");
				String calle = keyboard.nextLine();
				
				if(calle.compareTo(e.getDireccion()) != 0) {
					
					throw new ElementoIncorrecto("La direccion ha sido mal introducida");
				}else {
					correcto = true;
				}
			}catch(ElementoIncorrecto e1) {
				System.out.println(e1.getMessage()); // si el sistema no encuentra la calle lanza este mensaje
			
			}
		
		}
		correcto = false;
		while(!correcto) {
			try {
			
				System.out.println("Escribe la calle");
				String ciudad = keyboard.next();
				
				if(ciudad.compareTo(e.getMunicipio()) != 0) {
					
					throw new ElementoIncorrecto("La ciudad ha sido mal introducida");
				}else {
					correcto = true;
				}
			}catch(ElementoIncorrecto e1) {
				System.out.println(e1.getMessage()); // si el sistema no encuentra la calle lanza este mensaje
			
			}
		
		}
		correcto = false;
		while(!correcto) {
			try {
				System.out.println(correcto);
				System.out.println("Escribe el codigo postal");
				int codPostal = keyboard.nextInt();
				if(codPostal != e.getCodigoPostal()) {
					
					throw new ElementoIncorrecto("El codigo postal ha sido mal introducido");
				}else {
					correcto = true;
				}
			}catch(ElementoIncorrecto e1) {
				System.out.println(e1.getMessage()); // si el sistema no encuentra la calle lanza este mensaje
			
			}catch(InputMismatchException e2) {
				System.out.println("ERROR: Debe introducir caracteres numericos");
				keyboard.nextLine(); //limpia el token erroneo del tecladoCu
			}
		
		}
		
		
		e.añadirApartamentos(a1);
		e.añadirApartamentos(a2);
		e.añadirApartamentos(a3);
		e.añadirApartamentos(a4);
		e.añadirApartamentos(a5);
		e.añadirApartamentos(a6);
		e.añadirPropietarios(1,'A',"Alvaro" ,"Cayetano Garcia");
		e.añadirPropietarios(1,'A',"Veronica" ,"Cayetano Garcia");
		e.añadirPropietarios(2,'C',"Pedro" ,"Cayetano Garcia");
		e.añadirPropietarios(2,'C',"Diego" ,"Cayetano Garcia");
		e.listarApartamentos();
		
		System.out.println("**************PruebaObtencionPropietarios********************");
		
		e.getPropietarios(1, 'A');
		e.getPropietarios(2, 'C');
		e.getPropietarios(2, 'D'); // ESTO LANZA ERROR
		e.getPropietarios(3, 'A'); // ESTO LANZA ERROR
		
		System.out.println("**************PruebaObtencionApartamentos********************");
		e.getApartamento(1,'A');
		e.getApartamento(2,'B');
		e.getApartamento(5,'B'); // esto lanza error
		e.getApartamento(2,'D'); // esto lanza error
		
			
	}	

}
