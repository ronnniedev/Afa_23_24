package ficheros;

import java.util.Scanner;

public class Ejercicio22b {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*/*
		 * Actividad 22
		 * Suma todos los números impares que hay entre 1 y 20 mostrando el
		 * resultado al final (a) . Generaliza lueg este ejercicio para dos números
		 * cualquier pedidos por teclado, deberá ir de menor a mayor (b) .
		 */
		int numeroUno,numeroDos,suma;
		
		suma = 0;
		
		System.out.println("Introduce el primer numero: ");
		numeroUno = keyboard.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		numeroDos = keyboard.nextInt();
		
		if (numeroUno < numeroDos) {  //lo hacemos al reves de como nos lo pidieron en el anterior ejercicio
									  //al hacer las equivalencias al rever funciona de menor a mayor
		
		while (numeroUno < numeroDos) { //si numeroUno superior que numerodos
			if (numeroUno%2 != 0) {
				suma= numeroUno + suma;
				System.out.println("N: "+ numeroUno + "S: "+ suma);
				numeroUno++;
			}else {
				numeroUno++;
			}
		}
		}if (numeroDos < numeroUno) {
				
				while (numeroDos < numeroUno) { 
					if (numeroDos%2 != 0) {
						suma= numeroDos + suma;
						System.out.println("N: "+ numeroDos + "S: "+ suma);
						numeroDos++;
					}else {
						numeroDos++;
					}
				}
				}System.out.println("La suma total es: " + suma);
		}
			
		
	}
		

