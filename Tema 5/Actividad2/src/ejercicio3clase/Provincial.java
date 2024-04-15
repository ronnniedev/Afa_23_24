package ejercicio3clase;

public class Provincial extends Llamada {

	public Provincial(String numOrigen, String numDestino, int duracionSeg) {
		super(numOrigen, numDestino, duracionSeg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporte() {
		double resultado = 0;
		if (this.getDuracionSeg() < 60) {
			resultado = 0.30 * this.getDuracionSeg();
		}else if (this.getDuracionSeg() >= 60 && this.getDuracionSeg() <= 300) {
			resultado = 0.25 * this.getDuracionSeg();
		}else {
			resultado = 0.20 * this.getDuracionSeg();
		}
		return resultado;
		
	}

}
