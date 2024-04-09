package ejercicio5;

import java.util.ArrayList;
import java.util.List;


public class Ticket {
	
	protected List<Productos> ventas;
	

	public Ticket() {
		this.ventas = new ArrayList<Productos>();
	}
	
	public void generarTicket (List<Productos> poll) {
		int total = 0;
		int cont = (int)((Math.random()*poll.size())+1);
		
		System.out.println("*********************Cantidad****Precio*****Total");
		
		for (int i = 0; i < cont; i++) {

			ventas.add(poll.get(i));
		}
		
		for (int i = 0; i < ventas.size(); i++) {
			cont = (int)((Math.random()*8)+1);
			total = total + cont*ventas.get(i).getPrecio();
			System.out.println(ventas.get(i).getNombre() + "               " + cont + "        " + cont*ventas.get(i).getPrecio() + "  ");
		}
		
		System.out.println("Precio final                                  " + total);
		
		
	}
	


}
