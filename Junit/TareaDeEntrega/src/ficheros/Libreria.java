package ficheros;

public class Libreria {

	/**
	 * Simula un tiempo de espera para que el usuario pueda leer la interfaz
	 * @param segundos : int
	 */
	public static void esperar (int segundos) {
		System.out.print("\n\nCargando");
		
		for (int i = 0; i < segundos; i++) {
			
			try{
			    Thread.sleep(1000);
			    
			}catch(InterruptedException ex){
				
			}
			System.out.print(".");
		}
	}
}
