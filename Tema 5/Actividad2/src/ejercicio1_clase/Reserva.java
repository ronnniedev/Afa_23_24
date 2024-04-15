package ejercicio1_clase;

import java.util.Date;

public class Reserva {
	private static int CONT_RESERVAS = 0;
	private int numReserva;
	private Date fecha;
	private Cliente c;
	private Habitacion habitacion;
	private int numDias;
	
	public Reserva(Cliente c, Habitacion habitacion, int numDias) {
		this.c = c;
		this.habitacion = habitacion;
		this.numDias = numDias;
		//DATOS AUTOMATICOS
		this.numReserva =++CONT_RESERVAS;
		this.fecha = new Date();
		habitacion.setEstaReservada(true);
		
	}

	@Override
	public String toString() {
		String texto =  "Reserva [numReserva=" + numReserva + ", fecha=" + fecha + ", c=" + c + ", habitacion=" + habitacion
				+ ", numDias=" + numDias + "]\n";
				texto+="\t"+c.toString()+"\n";
				texto+="\t"+habitacion.toString()+"\n";
				
		return texto;
	}
	
	
	
}
