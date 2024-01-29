package ficheros;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Actividad 6
		//Se tienen 3 variables A, B y C. escribe las instrucciones necesarias
		//para intercambiar sus valores, san cuales sean, de manera que:
		//• B tome el valor de A original B = 3
		//• C tome el valor de B original C = 2
		//• A tome el valor de C original A = 1
				
		int A = 3;
		int B = 2;
		int C = 1;
		int D;
			    
		D = A;
		A = C;
		C = B;
		B = D;
			    
		System.out.println("El valor de A es: "+ A);
		System.out.println("El valor de B es: "+ B);
		System.out.println("El valor de C es: "+ C);
				
		

	}

}
