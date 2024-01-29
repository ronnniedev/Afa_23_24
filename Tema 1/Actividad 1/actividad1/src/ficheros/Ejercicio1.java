package ficheros;

public class Ejercicio1 {

	public static void main(String[] args) {
				//Se tienen las siguientes variables:
				//• A y B de tipo entero
				//• C y D de tipo real
				//• E y F de tipo carácter
				//• G de tipo lógico
				//Comprobar cuales de las siguientes expresiones de asignación no son
				//validar por qué
				//1.- A = 20 4.- B = 5500 7.- E = F 10 G =
				//verdadero
				//2.- B = 12 5.- C = 0 8.- E = ‘F’ 11 G = false
				//3.- F = ‘C’ 6.- D = C 9.- A = 12.56 12 F = G 
				
				int A;
				int B;
				double C;
				double D;
				char E;
				char F;
				boolean G;
				
				//1
				A = 20; // Funciona
				System.out.println("El primer caso funciona");
				//2
				B = 12; // Funciona
				System.out.println("El segundo caso funciona");
				//3
				F = 'C'; // Funciona
				System.out.println("El tercer caso funciona");
				//4
				B = 5500; // Funciona
				System.out.println("El cuarto caso funciona");
				//5
				C = 0; // Funciona
				System.out.println("El quinto caso funciona");
				//6
				D = C; // Funciona
				System.out.println("El sexto caso funciona");
				//7
				E = F; // Funciona
				System.out.println("El septimo caso funciona");
				//8
				E = 'F'; // Funciona
				System.out.println("El octavo caso funciona");
				//9 
				// A = 12.56; No funciona, las variables declaradas como enteros no pueden leer valores reales.
				System.out.println("El noveno caso no funciona");
				//10
				//G = verdadero; // No funciona, en todo caso para que se vea el valor deberia escribirse como true o false
				System.out.println("El decimo caso no funciona");
			    //11 Funciona
				G = false;
				System.out.println("El undecimo caso funciona");
				//12 No funciona, la variable F es de tipo caracter mientras que el valor de G es booleano
				// F = G;
				System.out.println("El duodecimo caso no funciona");
						

			}

		}

	


