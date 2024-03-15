package ejercicio1;

public class Triangulo extends Figura {
	private int base;
	private int altura;
	
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura;
	}

}
