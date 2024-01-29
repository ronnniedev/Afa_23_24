package ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		double deuda,cuota;
		int mes; //lo pongo con int para que el numero me salga entero
		
		cuota = 10;
		mes = 1;
		
		System.out.println("Introduzca su deuda: ");
		deuda = keyboard.nextDouble();
		
		deuda = deuda + ( deuda* 0.05 ); // añadimos el tipo de interes
	
		if (deuda <= 0) { //para no introducir valores erroneos
			System.out.println("Valor introducido no valido");
		
		}else {
			
			System.out.println("Su deuda final es " + deuda + " \n");
			
			System.out.println("Sus mensualidades son las sisguientes: \n");
			
			while ( deuda > 0 ) {
			
				deuda = deuda - cuota;
			
				if (deuda < 0) { //este salto ocurre si el numero es negativo para calcular la cuota final
				
					cuota = deuda + cuota; // al ser negativa la deuda final se la quitamos a la cuota
					deuda = deuda - deuda; // si restamos deuda con deuda obtenemos 0
				}
			
				mes++;
				System.out.println("Mes " + mes + ": " + cuota +" euros " + " (cantidad pendiente " 
					+ deuda + " )" );
			
				cuota = 10 * Math.pow(2, mes); // MULTIPLICA * 2 CADA VEZ QUE HAY UNA CUOTA
			
					//subimos el numero de mensualidad
			
			}
			System.out.println("\n Se acaba la deuda tras " + mes + " cuotas ");
				
		}
		
	}
		
}
