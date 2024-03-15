package ficheros;

import java.util.Scanner;

public class NumerosEnteros {
	
	public static void main(String[] args) {
		
		char opcion;  // hay que declarar cada variable por separado
		
		int numeroUno;
		
		int numeroDos=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n******INTRODUCE LA OPCION*****\n");
		
		System.out.println("a-PAR\nb-POSITIVO\nc-NEGATIVO\nd-NULO\ne-suma\n$-FIN\n\n\n");
		opcion=sc.next().toUpperCase().charAt(0);
		
		while(opcion != '$') {
			
			System.out.println("Introduzca el numero ");
			numeroUno=sc.nextInt();
			
			if(opcion == 'E'
				||opcion == 'F' 
				||opcion == 'G'){
				
			System.out.println("Introduzca el numero ");
			numeroDos=sc.nextInt();
			
			} //esta barra debe estar en su sitio correspondiente a misma altura
			
			switch(opcion){
			case 'A': 
				
				if(esPar(numeroUno)) {
					
					System.out.println("El numero " + numeroUno + " es par");
					
					}else{
						System.out.println("El numero " + numeroUno + " no es par");
						
					}
				break;
				
			case 'B':
				System.out.println("POSITIVO: ");
				break;
				
			case 'C':
				System.out.println("NEGATIVO: ");
				break;
				
			case 'D':
				System.out.println("NULO: ");
				break;
				
			case 'E':
				
				System.out.println("La suma de los numeros es "
									+ sumaNumerosPara(numeroUno,numeroDos)); 
				break;
				
			//Borrado opcion F Y G debido a que es codigo muerto que el usuario no va a visualizar
			default:
				System.out.println("Error en la opcion");
			}
			System.out.println("\n******INTRODUCE LA OPCION*****\n");
			System.out.println("a-PAR\nb-POSITIVO\nc-NEGATIVO\nd-NULO\ne-suma\n$-FIN\n\n\n");
			opcion=sc.next().toUpperCase().charAt(0);
		}

		
		System.out.println("\nFIN PROGRAMA");
	}
	
	
	
	
		public static boolean esPar(int a) {
			return(a%2==0); //simplificamos el codigo
		}
	
	
		public static void esPositivo(int a) {
			
			if(a >= 0) {
				
				System.out.println("El numero " + a + " es positivo");
				
			}else if(a < 0) {
				
				System.out.println("El numero " + a + " es negativo");
				
			}else {
				
				System.out.println("El numero " + a + "  es nulo");
				
			}
		}
		
		//Metodos con bucles
		public static int sumaNumerosPara(int a, int b) {
			
			int sumaTotal=0;
			
			for(int i = a;i <= b;i++) {
				
				sumaTotal += i;
				
			}
			
			if(sumaTotal == 0) 
				
				sumaTotal =- 1;
			
			return sumaTotal;
		}
		
		//Suma numeros mientras y repetir borrados debido a que no se usan y es codigo muerto
		

}
