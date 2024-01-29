package ficheros;

import java.util.Scanner;

public class LibreriaEje2 {
	static Scanner keyboard = new Scanner(System.in);
	/**
	 * Comprueba si el año introducido es bisiesto
	 * @param year : entero
	 * @return boolean
	 */
	public static boolean anioBisiesto (int year) {
		
		boolean bisiesto = false;
		
		if (((year%4==0) && (year%100!=0)) || (year%400==0)) bisiesto = true;
		
		return bisiesto;
	}
	/**
	 * Comprueba si la fecha introducida es valida
	 * @param year : entero
	 * @param month: entero
	 * @param day  : entero
	 * @return boolean
	 */
	public static boolean validarFecha (int year, int month, int day) {
		
		boolean valido = false;
		boolean bisiesto = anioBisiesto(year);
		 if (year >= 1978 && month > 0 && month <= 12) {
			 if (month == 1|| month == 3 || month == 5 || month == 7 || month== 8 || month == 10 || month == 12) {
					
				 if (day > 0 && day <= 31)valido = true;
				 else return valido;			
			}
			 	
			 	else if (month == 2 && bisiesto && day > 0 && day <= 29)valido = true;
				else if (month == 2 && day >0 && day <= 28) valido = true;
		 		else if (month != 2 && day > 0 && day <= 30) valido = true;
							 
		 }
		System.out.println("ValidarFecha: " + valido);
		return valido;
	}
	/**
	 * Calcula los dias desde 1978
	 * @param year: entero
	 * @param month : entero
	 * @param day : entero
	 * @return entero
	 */
	public static int calcularDias (int year, int month , int day) {
		int days = 0;
		int bisiestos = 0;
		boolean bisiesto = anioBisiesto(year);
		
		if (bisiesto) bisiestos = bisiestos - 1;
		
		for (int cont = year;cont!=1978;cont--) { //contar los bisiestos que hay
			bisiesto = anioBisiesto(cont);
			if (bisiesto) bisiestos++;
				
		}
		
		bisiesto = anioBisiesto(year);
		for (int cont = month-1; cont != 0; cont--) { //contamos los dias que ha tenido ese año
			
			if (cont == 1|| cont == 3 || cont == 5 || cont == 7 || cont == 8 || cont == 10 || cont == 12) {
				days = days+31;
				 			
			}
			 
			 else if (cont == 2 && bisiesto) days = days + 29;
			 else if (cont == 2) days = days + 28;
			 else if (cont != 2) days = days + 30; 
							 
		 }
		
		days = days + (((year-1978)*365)+bisiestos+day);//cogemos los dias de los años completos le sumamos los dias de
		//los bisiestos y finalmente los dias del mes
		return days;
	}

}
