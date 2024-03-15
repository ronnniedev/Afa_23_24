package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		double limiteInferior,limiteSuperior,numero,suma,fueraIntervalo,iguales;
		boolean igual; //para saber si es igual algo
		
		numero = 1;
		suma = 0;
		fueraIntervalo = 0;
		iguales = 0;
		igual = false;
	
		
		
		System.out.println("Introduce el limite inferior: ");
		limiteInferior = keyboard.nextDouble();
		
		System.out.println("Introduce el limite superior: ");
		limiteSuperior = keyboard.nextDouble();
		
		while (limiteInferior >= limiteSuperior) { //mientras el usuaruio introduzca mal las variables repite
			
			System.out.println("Introduce de nuevo el limite inferior: ");
			limiteInferior = keyboard.nextDouble();
			
			System.out.println("Introduce de nuevo el limite superior: ");
			limiteSuperior = keyboard.nextDouble();
		}
		
		while (numero != 0) { //mientras sea diferente a 0 carga este proceso
			
			System.out.println("Introduce un numero");
			numero = keyboard.nextDouble();
			
			if (numero < limiteSuperior && numero > limiteInferior) {
				
				suma = numero + suma;
				
			}else if (numero  == limiteSuperior || numero == limiteInferior) { //activamos el igual
				
				igual = true;
				iguales++;
				fueraIntervalo++;
				
			}else if (numero != 0){
				
				fueraIntervalo++; //suma un numero a los numeros que estan fuera
				
				
			}
			
		}if (igual) {
			
			System.out.println( iguales + " introducidos ha sido igual a los limites \n");
			
		}else {
			
			System.out.println("Ninguno de los numeros introducidos han sido igual a los intervalos \n");
			
		}
		
		System.out.println("La suma de todos los numeros dentro de intervalo es " + suma + " y se han introducido " + 
		fueraIntervalo + " numeros fuera de intervalo");

	}

}
