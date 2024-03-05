package ejercicio2yo;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Vero","Gonzalez","53783768Q");
		CuentaAhorro ch1 = new CuentaAhorro(132124124,p1,1000);
		
		ch1.ingresar(10000);	
		
		System.out.println(ch1.toString());
		
		ch1.cambiarInteres();
		ch1.actualizarSaldo();
		
		System.out.println(ch1.toString());
		
		ch1.cambiarInteres();
		ch1.actualizarSaldo();
		
		System.out.println(ch1.toString());
		
		ch1.retirar(8000);
		
		System.out.println(ch1.toString());
		
	}
}
