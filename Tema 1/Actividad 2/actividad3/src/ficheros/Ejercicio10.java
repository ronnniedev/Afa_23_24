package ficheros;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int altura,num,numMemoria;
		
		altura = 26;
		num = 90;
		numMemoria = num;
		
		while (altura != 0) {
			num = numMemoria;
			altura--;
			
			while (num !=64) {
				
				if (num == 65) { //65 es la ultima letra A en numero normal
					System.out.println((char) num);
					
				}else {
					System.out.print((char) num);
					
				}num--;
				
			}numMemoria--;
			
			
			
		}
		

	}

}
