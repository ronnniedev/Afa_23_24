package ficheros;

public class Prueba {

	public static void main(String[] args) {
	
		int suma = 0;
		int i;
		
		for (i = 1; i<=10; i++) { // 7
			
			suma = 0;
			
			for (int j = i - 1; j>=1 ; j--) {
				
				if (i%j==0) {
					suma=suma+j; // 6
				}	
				
			}if (suma == i) {
				System.out.println(i + " ");
			}
			
		}
		
		
	}
}
