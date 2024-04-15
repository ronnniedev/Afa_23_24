package ejercicio3clase;

public class Local extends Llamada {


	public Local(String numOrigen, String numDestino, int duracionSeg) {
		super(numOrigen, numDestino, duracionSeg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporte() {
		return 0.15*getDuracionSeg();
	}

}
