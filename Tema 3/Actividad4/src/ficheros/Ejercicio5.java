package ficheros;

import java.util.Scanner;

public class Ejercicio5 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Cuantos columnas y filas tiene la matriz: ");
		int tam = keyboard.nextInt();
		
		int m [][] = new int [tam][tam];
		
		System.out.print("|   |");
		
		for (int j = 0; j < m[0].length; j++) {
			
			System.out.print(j + " |");
		}
		System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			System.out.print("| " + i + " |");
			if (i%2 == 0) {
				for (int j = 0; j < m[0].length; j++) {
					m [i][j] = 10;
					System.out.print(""+m[i][j]+ "|");
				}
			
			}else {
				
				for (int j = 0; j < m[0].length; j++) {
					if (j%2 == 0) { 
						m[i][j] = 0;
						System.out.print(" " +m[i][j]+ "|");
					}
					else { m[i][j] = 11;
					System.out.print(m[i][j]+ "|");
					}
				}
			}
			System.out.println();
		}
		

	}

}
