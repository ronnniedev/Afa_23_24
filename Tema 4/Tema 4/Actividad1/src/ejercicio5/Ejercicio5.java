package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Cuanta memoria quieres que tenga la base de datos, si pones "
				+ "menos de 3 se ajustara la memoria a ese minimo:");
		int dim = keyboard.nextInt();
		
		if (dim < 3) {
			dim = 3;
		}
		
		Curso c = new Curso (dim);
		
		c.inicializar();
		c.visualizar();
		c.añadir();
		
		System.out.println("Que codigo buscas en las base: ");
		int codigo = keyboard.nextInt();
		c.buscador(codigo);
		
		System.out.println("Que codigo buscas en las base para eliminar: ");
		codigo = keyboard.nextInt();
		c.eliminar(codigo);
		System.out.println("La media del curso es " + c.calcularPromedio());
		c.estadisticasCurso();
		
		
			}

}
