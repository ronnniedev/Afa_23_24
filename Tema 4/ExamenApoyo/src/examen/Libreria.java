package examen;

public class Libreria {

	public static int [][] generarAvion (){
		
		
		int [][] avion  = {{1,7,13,19,25,31,37},
						{2,8,14,20,26,32,38},
						{3,9,15,21,27,33,39},
						{4,10,16,22,28,34,40},
						{5,11,17,23,29,35,41},
						{6,12,18,24,30,36,42}};
		
		return avion;
		
		
	}
	
	public static void visualizarAvion(int [][] avion) {
		
		for (int i = 0; i < avion.length; i++) {
			
			for (int j = 0; j < 8; j++) {
				if (i == 4) {
					System.out.print("|**|");
				}else {
					System.out.print("|"+ avion[i][j] + "|");
				}
			}
			System.out.println("\n");
		}
	}
}
