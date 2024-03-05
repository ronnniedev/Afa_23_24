package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Figura v[] = new Figura[3];
		v[0] = new Cuadrado(2);
		v[1] = new Triangulo(2,5);
		v[2] = new Circulo(2.45);
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Area :" + v[i].toString());
		}

	}

}
