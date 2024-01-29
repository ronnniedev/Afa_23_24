package ficheros;

public class Banco {

	private Cuenta v[];
	
	/** Constructor de la clase banco, dimension el vector a 4 psociones
	 * 
	 */
	public Banco() {
		
		v =new Cuenta[4];
	}
	/** Insertar en la posicion un nuevo objeto de tipo cuenta
	 * @param c objeto cuenta
	 * @param pos entero
	 */
	public void addCuenta (Cuenta c , int pos) {
		if (pos>=0 && pos<v.length) {
			v[pos]=c;
		}else System.out.println("Error en pos");
		
	}
	
	public void mostrarCuentas() {
		for (int i = 0; i < v.length; i++) {
			Cuenta c = v[i];
			System.out.println(c.toString());
		}
		
	}
	

}
