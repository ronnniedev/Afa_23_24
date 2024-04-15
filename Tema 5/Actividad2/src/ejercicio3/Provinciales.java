package ejercicio3;

public class Provinciales extends Llamada{

	public Provinciales(String numeroOrigen, String numeroDestino, int segundos) {
		super(numeroOrigen, numeroDestino, segundos);
		this.importe = getImporte(segundos);
		this.tarifa = "Provincial";
	}

	@Override
	double getImporte(double segundos) {
		double resultado = 0;
		if (segundos < 60) {
			resultado = 0.30 * segundos;
		}else if (segundos >= 60 && segundos <= 300) {
			resultado = 0.25 * segundos;
		}else {
			resultado = 0.20 * segundos;
		}
		return resultado;
	}

}
