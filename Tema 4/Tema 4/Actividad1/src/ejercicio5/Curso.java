package ejercicio5;
import java.util.Scanner;

public class Curso {
	static Scanner keyboard=new Scanner(System.in);
	private Alumno v[];
	private int numAlumnos;

	
	public Curso(int dim) {
		
		this.v = new Alumno [dim];
		this.numAlumnos = 0;
	}
	
	public void inicializar () {
		
		
		Alumno a1 = new Alumno ("Marcos","Gutierrez Bimenes",1,2,1.2); 
		Alumno a2 = new Alumno ("Andrea","Diaz Segovia",2,2,5.2); 
		Alumno a3 = new Alumno ("Eric","Motorola Jupiter",3,3,8.1); 
		
		
		this.v[0] = a1;
		this.v[1] = a2;
		this.v[2] = a3;
		this.numAlumnos = 3;
	
	}
	
	public void visualizar () {
		
		for (int i = 0; i < numAlumnos; i++) {
			
			System.out.println(this.v[i].toString());     
			
		}
		
	}
	
	public boolean comprobarCodigo (int codigo) {
		
		for (int i = 0; i < numAlumnos; i++) {
			if (v[i].getCodigo() == codigo) {
				System.out.println("El perfil " + i + "Tiene el codigo " + codigo + " como se muestra "
						+ "a continuacion");
				
				System.out.println("\n" + v[i].toString());
				return false;
			}
			
		}
	
		return true;
	}
	
	public void añadir () {
		System.out.println("Dime el nombre del estudiante: ");
		String nombre = keyboard.next();
		
		System.out.println("Dime los apellidos del estudiante: ");
		String apellidos = keyboard.next();
		
		System.out.println("Dime el codigo del estudiante: ");
		int codigo = keyboard.nextInt();
		
		while (comprobarCodigo(codigo) == false) {
			System.out.println("ERROR ese codigo ya esta siendo usado\n");
			System.out.println("Dime el codigo del estudiante: ");
			codigo = keyboard.nextInt();
			
		}
		
		System.out.println("El semestre en el que se encuentra el alumno: ");
		int semestre = keyboard.nextInt();
		
		System.out.println("Dime la nota final del alumno: ");
		double notaFinal = keyboard.nextDouble();
		
		for (int i = 0; i < v.length; i++) {
			if (v[i]==null) {
				Alumno carrito = new Alumno (nombre,apellidos,codigo,semestre,notaFinal);
				v[i] = carrito;
				this.numAlumnos++;
				visualizar();
				return;
			}
		}
		
		System.out.println("No hay hueco para añadir un nuevo estudiante");
		
		
	}
	
	public int buscador (int codigo) {
		for (int i = 0; i < numAlumnos; i++) {
			if (v[i].getCodigo() == codigo) {
				System.out.println("El perfil " + i + "Tiene el codigo " + codigo + " como se muestra "
						+ "a continuacion");
				
				System.out.println("\n" + v[i].toString());
				return i;
			}
			
		}
		
		System.out.println("No se ha encontrado el alumno con el codigo " + codigo);
		return -1;
	}
	
	public void eliminar (int codigo) {
		int pos = buscador(codigo);
		
		System.out.println("---------------Eliminar--------------------\n");
		this.numAlumnos--;
		if (pos != -1 && pos < this.numAlumnos) {
			for (int i = pos; i < this.numAlumnos; i++) {
				v[i] = v[i+1];
				if (i+1 == this.numAlumnos) {
					v[i+1] = null;
				}
			
			}
			
		}
		visualizar();
	}	
	
	public void visualizarMemoria () {
		
		System.out.println("--------Visualizar Memoria-----------");
		
		for (int i = 0; i < v.length; i++) {
			
			if (v[i]== null) {
				System.out.println("Perfil " + i + "vacio");
				
			}else System.out.println(this.v[i].toString());   
			
		}
		
		
	}
	
	public double calcularPromedio() {
		double suma = 0;
		
		for (int i = 0; i < numAlumnos; i++) {
			suma = suma + v[i].getNotaFinal();
			System.out.println(v[i].getNotaFinal());
		}
		System.out.println(suma);
		double media = suma/numAlumnos;
		return media;
	}
	
	public void estadisticasCurso () {
		int contAprobados = 0;
		double resultado = 0;
		
		for (int i = 0; i < numAlumnos; i++) {
			 if (v[i].getNotaFinal() >= 5) {
				
				 contAprobados++;
				
			}
		}
		
		System.out.println((contAprobados/numAlumnos)*100);
		
		resultado =(contAprobados/(double)numAlumnos)*100;
		
		System.out.printf("El numero de aprobados ha sido de " + contAprobados + " y el porcentaje %.2f",resultado);
		
	}
	
	
	
}
