package ficheros;

public class Libreria {
	/**
	 * muestra el area de un cuadrado
	 * @param lado : entero
	 */
	public static void areaCuadrado(int lado) {
		
		int area = lado*lado;
		System.out.println("Area cuadrado " + area);

	}
	/**
	 * calcula el perimetro de un cuadrado
	 * @param lado : entero
	 * @return entero 
	 */
	public static int perimetroCuadrado(int lado) {
		
		int resul = lado * 4;
		return resul;
		
	}
	/**
	 * calcula el area del circulo
	 * @param r : double
	 */
	public static void calcularAreaCirculo (double r) {
		
		double resul = Math.PI*r*r;
		System.out.println("Area :" + resul);
		
	}
	/**
	 * Calcula el perimetro del circulo
	 * @param r : real
	 * @return real
	 */
	public static double perimetroCirculo (double r) {
		
		double resul = Math.PI*r*2;
		return resul;
		
	}
	/**
	 * Calcula el factorial de un numero
	 * @param num : entero
	 */
	public static int factorial (int num) {
		
		int resul = num;
		
		while (num != 1) {
			
			if (num != 2) {
				num = num - 1;	
				resul = resul * num;
			}else {
				num = num - 1;	
				resul = resul * num;
				
			}
			
		} return resul;
		
	}
	
	/**
	 * Calcula la raiz de un numero introducido
	 * @param num: entero
	 * @return entero
	 */
	public static int raizEntera (int num) {
		
		int resul = 0;
		int raiz =1;
		
		while (resul < num) {
			raiz++;
			resul= raiz*raiz;
			System.out.println(resul);
		}
		
		if (resul != num) {
			raiz = raiz - 1;
		}
			
		return raiz;
		
	}
	/**
	 *Comprueba si el año es bisiesto o no y lo imprime en pantalla
	 * @param year : entero
	 * @return boolean
	 */
	public static boolean bisiesto (int year) {
		
		boolean bisiesto = false;
		
		if (((year%4==0) && (year%100!=0)) || (year%400==0)) bisiesto = true;
		
		
		return bisiesto;
	}

	/**
	 * Analiza si un numero introducido es primo
	 * @param num: entero
	 * @return boolean
	 */
	public static boolean primos (int num) {
		
		int divisiones = 0;
		boolean primo = false;
		
		if (num < 0) num = num * -1;
			
		for (int cont = 1; cont<=num ; cont++) {
			
			int resul = num%cont; 
			
			if (resul==0) divisiones++;
			
		}
		
		if (divisiones == 2) primo = true;
		
		return primo;
	}
	
	/**
	 * Realiza una division de manera manual
	 * @param dividendo: entero
	 * @param divisor: entero
	 * @return boolean
	 */
	public static int divisionEntera(int dividendo,int divisor) {
		
		int resul = 0;
		int cociente = 0;
		boolean negativoDividendo = false;
		boolean negativoDivisor = false;
		
		
		if (dividendo<0 && divisor<0) {
			
			divisor = divisor * -1;
			dividendo = dividendo * -1;
			
		}else if (dividendo < 0) {
			
			dividendo = dividendo * -1;
			negativoDividendo = true;
			
		}else if (divisor < 0) {
			
			divisor = divisor * -1;
			negativoDivisor = true;
		}
		
		while (dividendo >= divisor) {
			
			dividendo = dividendo - divisor;
			cociente++;
			
		}
		
		if (negativoDividendo) {
			
			dividendo = dividendo * -1;
			
		}else if (negativoDivisor) {
			
			divisor = divisor * -1;
			
		}
		
		if (negativoDivisor && negativoDividendo) {
			
		}else if (negativoDivisor || negativoDividendo)cociente = cociente *-1;
			
		System.out.println("El resto de la divisiones es: " + dividendo + " y el cociente " + cociente); 
		return resul;
	}
	
	/**
	 * Suma un segundo a un tiempo introducido
	 * @param hora: entero
	 * @param minuto: entero
	 * @param sec: entero
	 */
	public static void sumarTiempo (int hora,int minuto,int sec) {
		
		sec++;
		if (sec >= 60){
			sec = sec - 60; 
			minuto++;
		}
		
		if (minuto >= 60){
			minuto = minuto -60;
			hora++;	
		}
		if (hora >= 25){
			hora = hora - 24;
		}
		System.out.println(hora + ":" + minuto + ":" + sec);
		
		
	}
	/**
	 * Realiza una ecuacion de segundo grado indicandonos si tiene 1,2 o 0 soluciones imprimiendolas en pantalla
	 * @param a: entero
	 * @param b: entero
	 * @param c: entero
	 */
	public static void ecuacionSegundoGrado(double a,double b,double c) {
		
		double resul =Math.pow(b,2)-4*a*c;
		
		if (resul < 0) System.out.println("No existe solucion posible.");
		else if (resul == 0) {
			
			resul = -b/(2*a);
			
			System.out.println("Solo hay una solucion, x: " + resul);
		}else {
			
			System.out.println("Tiene dos soluciones");
			resul =(-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
			System.out.println("\n1- x: "+ resul);
			resul =(-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
			System.out.println("\n2- x: "+ resul);
		}
	}
	/**
	 * Nos calcula las monedas que necesitamos para cambio
	 * @param money: entero
	 */
	
	public static void calcularCambio(double money) {
		
		int resul = 0;
	
		for (; money >= 1; money--) {
			
			resul++;
		}
		System.out.println("- " + resul + " monedas de 1 euro");
		resul = 0;
		
		for (; money >= 0.5; money-=0.5) {
			
			resul++;
		}
		System.out.println("- " + resul + " monedas de 50 centimos");
		resul = 0;
		for (; money >= 0.2; money-=0.2) {
			
			resul++;
		}
		System.out.println("- " + resul + " monedas de 20 centimos");
		resul = 0;
		for (; money >= 0.1; money-=0.1) {
			
			resul++;
		}
		System.out.println("- " + resul + " monedas de 10 centimos");
		resul = 0;
		for (; money >= 0.05; money-=0.05) {
			
			resul++;
		}
		System.out.println("- " + resul + " monedas de 5 centimos");
		resul = 0;
		for (; money >= 0.02; money-=0.02) {
			
			resul++;
		}
		System.out.println("- " + resul + " monedas de 2 centimos");
		resul = 0;
		for (; money >= 0.0099; money-=0.01) {
			
			resul++;
		}
		System.out.println("- " + resul + " monedas de 1 centimo");
		resul = 0;
	}
	/**
	 *Comprueba si el año es bisiesto o no y lo imprime en pantalla
	 * @param year : entero
	 * @return boolean
	 */
	public static boolean anioBisiesto (int year) {
		
		boolean bisiesto = false;
		
		if (((year%4==0) && (year%100!=0)) || (year%400==0)) bisiesto = true;
		
		return bisiesto;
	}
	
	/**
	 * Calcula los dias desde un año introducido
	 * @param year: entero
	 * @param month : entero
	 * @param day : entero
	 * @return entero
	 */
	public static int calcularDias (int year, int month , int day , int yearOrigin) {
		int days = 0;
		int bisiestos = 0;
		boolean bisiesto = anioBisiesto(year);
		
		if (bisiesto) bisiestos = bisiestos - 1;
		
		for (int cont = year;cont!=yearOrigin;cont--) { //contar los bisiestos que hay
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
		
		days = days + (((year-yearOrigin)*365)+bisiestos+day);//cogemos los dias de los años completos le sumamos los dias de
		//los bisiestos y finalmente los dias del mes
		return days;
	}
	
	
	/**
	 *Valida una fecha introducida y si es coherente
	 * @param year : entero
	 * @param month : entero
	 * @param day : entero
	 * @return boolean
	 */
	public static boolean validarFecha (int year, int month, int day) {
		
		boolean valido = false;
		boolean bisiesto = anioBisiesto(year);
		 if (year >= 0 && month > 0 && month <= 12) {
			 if (month == 1|| month == 3 || month == 5 || month == 7 || month== 8 || month == 10 || month == 12) {
					
				 if (day > 0 && day <= 31)valido = true;
				 else return valido;			
			}
			 	
			 	else if (month == 2 && bisiesto && day > 0 && day <= 29)valido = true; 
				else if (month == 2 && day >0 && day <= 28) valido = true;
		 		else if (month != 2 && day > 0 && day <= 30) valido = true;
							 
		 }
		return valido;
	}
	
	/**
	 *Calcula la edad de un usuario introduciendo su fecha de nacimiento y la actual
	 * @param year : entero
	 * @param month : entero
	 * @param day : entero
	 * @param yearOrigin : entero
	 * @param monthOrigin : entero
	 * @param dayOrigin : entero
	 * @return boolean
	 */
	public static void calcularEdad (int year,int month, int day,int yearOrigin, int monthOrigin, int dayOrigin) {
		
		int edad = 0;
		edad = edad + (year - yearOrigin-1);
		day = day - dayOrigin;
		
		month = month - monthOrigin;
		if (month > 0) {
			
		edad++;
		
		}else if (month == 0 && day >= 0) edad++;
		
		System.out.println("Manu tiene: " + edad + " años");
		
	}
	
	/**
	 *Ejemplo de introduccion de elementos para la misma funcion
	 * @param param1: entero
	 */
	public static void funcion (int param1) {
		
		System.out.println("Funcion 1 param entero");
	}
	/**
	 *Ejemplo 2 de introduccion de elementos para la misma funcion
	 * @param param1: entero
	 * @param param2: entero
	 */
	public static void funcion (int param1, int param2) {
		
		System.out.println("Funcion 2 param entero");
	}
	/**
	 *Ejemplo 3 de introduccion de elementos para la misma funcion
	 * @param param1: real
	 */
	public static  void funcion (double param1) {
		
		System.out.println("Funcion 1 param double");
	}
	/**
	 *Ejemplo de introduccion de elementos para la misma funcion
	 * @param param1: boolean
	 */
	public static void funcion (boolean param1) {
		
		System.out.println("Funcion 1 param boolean");
	}
	
	/**
	 *Ordena 3 numeros introducidos y los imprime
	 * @param numA: entero
	 * @param numB: entero
	 * @param numC: entero
	 */
	public static void compararNumeros (int numA, int numB, int numC) {
		
		if (numC<numB && numC<numA) {
			System.out.print(numC + "<");
			if (numA < numB) {
				System.out.print(numA + "<");
				System.out.print(numB);
				
			} 
			else {
				System.out.print(numB + "<");
				System.out.print(numA);	
			}
		}
		if (numA<numB && numA<numB) {
			System.out.print(numA + "<");
			if (numB < numC) {
				System.out.print(numB + "<");
				System.out.print(numC);
			} 
			else {
				System.out.print(numC + "<");
				System.out.print(numB);	
			}
			
		}
		if (numB<numA && numB<numC) {
			System.out.print(numB + "<");
			if (numA < numC) {
				System.out.print(numA + "<"); 
				System.out.print(numC);
			} 
			else {
				System.out.print(numC + "<"); 
				System.out.print(numA);	
			}
			
		}
		
	}
	/**
	 *Transforma de decimal a Binario
	 * @param num: entero
	 */
	public static void decimalaBinario (int num) {

	for (int cont = 7; cont > -1 ; cont--) {
		
		if ((Math.pow(2, cont)) <= num && num != 0) {
			
			num = num - (int) Math.pow(2, cont);
			System.out.print("1");
			
		}else System.out.print("0");
		
	}
		
		
	}
	
	/**
	 *Transforma de binario a decimal
	 * @param num: entero
	 */
	public static void binarioaDecimal (int num) {
		
		int suma = 0;
		
		for (int cont = 0; cont < 8 && num != 0 ; cont++) {
			
			
			
			if (num%10 == 1) {
				
				suma = suma + (int) Math.pow(2, cont);
				
			} 
			
			num = num/10; 
			
		}
		
		System.out.println("El numero es " + suma);
	}
	
	/**
	 *Cuenta los digitos pares de un numero introducido
	 * @param num: entero
	 * @return boolean
	 */
	public static int contarPares(int num) {
		int pares = 0;
		
		while (num != 0) {
			if (num%2 == 0) pares++;
			num = num/10;
		}
		
		return pares;
		
	}
	
	/**
	 *Cuenta los digitos impares de un numero introducido
	 * @param num: entero
	 * @return boolean
	 */
	public static int contarImpares (int num) {
		int impares = 0;
		
		while (num != 0) {
			if (num%2 != 0) impares++;
			num = num/10;
		}
		
		return impares;
				
	}
	/**
	 *Suma los digitos de un numero
	 * @param num: entero
	 * @return entero
	 */
	public static int sumarDigitos (int num) {
		
		int suma = 0;
		
		while (num != 0) {
			
			suma = suma + num%10;
			num = num/10;
			
		}
		
		return suma;
	}
	
	/**
	 *Nos indica cual es el siguiente primo consecutivo a un numero introducido
	 * @param num: entero
	 */
	public static void siguientePrimo (int num) {
		
		int divisiones = 0;
		
		while (divisiones != 2) {
			
			num++;
			divisiones = 0;
			for (int cont = 1; cont <= num; cont++) {
				
				int resul = num%cont;
				if (resul == 0)divisiones++;
			}
			
		}
		System.out.println(num + " es el siguiente numero primo");
	
	}
}

