package ficheros;
/**
 * @author Veronica
 * @version 1.1
 */
public class Tienda {

	public static void main(String[] args) {
		
		Lavadora l1 = new Lavadora ();
		Lavadora l2 = new Lavadora(432,Color.GRIS);
		Television t1 = new Television ();
		Television t2 = new Television (300,32);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		Electrodomestico v[] = new Electrodomestico[8];
		v[1] = l1;
		v[2] = l2;
		v[3] = t1;
		v[4] = t2;
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] == null) {
				
			}else {
				System.out.println("El precio final de el caso " + i + " es: " + v[i].precioFinal());
			}
		}
		
	}

}
