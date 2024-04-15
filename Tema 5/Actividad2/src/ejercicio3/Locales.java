package ejercicio3;

public class Locales extends Llamada{

	public Locales(String numeroOrigen, String numeroDestino, int segundos) {
		
		super(numeroOrigen, numeroDestino, segundos);
		this.importe = getImporte(segundos);
		this.tarifa = "Local";
		
	}

	@Override
	double getImporte(double segundos) {
		return segundos*0.15;
	}
	
	

	
	
}
