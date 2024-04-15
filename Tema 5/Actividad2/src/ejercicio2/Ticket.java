package ejercicio2;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ticket {

	private Date fecha;
	private String dependienta;
	private Set <DetalleTicket> detalles;
	private static int NUM_VECES;
	
	public Ticket( String dependienta) {
		
		this.fecha = new Date();
		this.dependienta = dependienta;
		this.detalles = new HashSet <DetalleTicket>();
		NUM_VECES++;
		
	}
	
	public void añadirDetallePedido(Producto p,int cantidad) {
		DetalleTicket d = new DetalleTicket(p,cantidad);
		
		if (d.getNombreProducto() == null) {
			
			System.out.println("No se puede añadir el producto, intentelo de nuevo");
		}else {
			detalles.add(d);
		}
		
	}
	
	
	

	/**
	 * @return the dependienta
	 */
	public String getDependienta() {
		return dependienta;
	}

	/**
	 * @param dependienta the dependienta to set
	 */
	public void setDependienta(String dependienta) {
		this.dependienta = dependienta;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(detalles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(detalles, other.detalles);
	}

	public void mostrarTicket() {
		int totalFinal = 0;
		System.out.println("******************Ticket" + NUM_VECES +"***********************");
		System.out.println(this.toString());
		for (DetalleTicket t: detalles) {
			totalFinal = totalFinal + t.getTotal();
		}
		System.out.println("Total de este pedido = " + totalFinal);
		System.out.println("Sigue");
		
	}

	@Override
	public String toString() {
		return "fecha=" + fecha + ", dependienta=" + dependienta + ""
				+ "\n*************detalles**************\n"
				+ "" + detalles;
	}
		
	
}
