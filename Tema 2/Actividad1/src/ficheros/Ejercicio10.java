package ficheros;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 10
		 * Los empleados de una fabrica trabajan por turnos: diurno y nocturno.
		 * Se debe calcular mediante una función, el sueldo diario de acuerdo a
		 * las siguientes especificaciones:
		 * • La tarifa por horas diurnas es de 20€
		 * • La tarifa por horas nocturnas es de 35€
		 * • Caso de ser domingo, la tarifa se incrementa en 10€ más por
		 * turno diurno y 15€ más para el nocturno.
		 */
		
		final int hours = 10;
		
		
		System.out.println("¿Turno nocturno o diurno?");
		System.out.println("1-Diurno");
		System.out.println("2-Nocturno");
		int sel = keyboard.nextInt();
		
		boolean diurno = turnoHora(sel);
		
		System.out.println("¿Es domingo?");
		System.out.println("1-Si");
		System.out.println("2-No");
		sel = keyboard.nextInt();
		
		boolean domingo = domingo(sel);
		
		int sueldo = calcularSueldo(diurno , hours , domingo);
	
		System.out.println("El sueldo diario seria de " + sueldo + " euros ");
		

	}
	/**
	 * Determina la hora del turno
	 * @param sel : entero
	 * @return boolean
	 */
	
	public static boolean turnoHora (int sel) {
		boolean diurno = false;
		
		if (sel == 1) diurno = true;
		else if (sel != 2) System.out.println("ERROR \n Numero introducido no valido");
		
		return diurno;
		
	}
	/**
	 * Determina si es domingo
	 * @param sel : entero
	 * @return boolean
	 */
	
	public static boolean domingo (int sel) {
		boolean domingo = false;
		
		if (sel == 1) domingo = true;
		else if (sel != 2) System.out.println("ERROR \n Numero introducido no valido");
		
		return domingo;
		
	}
	/**
	 *  Calcula el sueldo introducido
	 * @param diurno : boolean
	 * @param hours : entero
	 * @param domingo : boolean
	 * @return resul : entero
	 */
	public static int calcularSueldo (boolean diurno , int hours , boolean domingo) {
		int resul = 0;
		
		if (diurno) resul = hours * 20;
		else resul = hours * 35;
		
		if (domingo && diurno) resul = resul + 10;
		else if (domingo) resul = resul + 15;
		
		return resul;
		
	}

}
