package ficheros;

public class Ejercicio7p {

	public static void main(String[] args) {
		int total = 0;
		
		for (int a=1;a<=4;a++) {	
			for (int b = 1; b<=4;b++) {
				for (int c=1;c<=4;c++) {
					for (int d=1;d<=4;d++) {
						System.out.print(a+ "," + b + "," + c + "," + d + "\t");
						total++;
					} 
					System.out.println();
				}
			
			
		}
		
		} 
		System.out.println("Hay " + total + " permutaciones");

	}

}
