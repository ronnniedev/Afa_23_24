package ficheros;

import java.util.ArrayList;
import java.util.List;

public class Autobus {
	
	private Matricula matricula;
	private int plazas;
	private double precioDiario;
	private final double PRECIO_KILOMETRO = 100;
	private double precioKilometro;
	private List <Integer> calendario;
	
	public Autobus(String matricula, int plazas, double precioDiario) throws FormatoException {
		this.matricula = new Matricula (matricula);
		this.plazas = plazas;
		this.precioDiario = precioDiario;
		this.precioKilometro = PRECIO_KILOMETRO;
		this.calendario = new ArrayList<Integer>();
	}

	

	public void alquilar(String string, int i) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the matricula
	 */
	public Matricula getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the plazas
	 */
	public int getPlazas() {
		return plazas;
	}

	/**
	 * @param plazas the plazas to set
	 */
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	/**
	 * @return the precioDiario
	 */
	public double getPrecioDiario() {
		return precioDiario;
	}

	/**
	 * @param precioDiario the precioDiario to set
	 */
	public void setPrecioDiario(double precioDiario) {
		this.precioDiario = precioDiario;
	}

	/**
	 * @return the precioKilometro
	 */
	public double getPrecioKilometro() {
		return precioKilometro;
	}

	/**
	 * @param precioKilometro the precioKilometro to set
	 */
	public void setPrecioKilometro(double precioKilometro) {
		this.precioKilometro = precioKilometro;
	}

	/**
	 * @return the calendario
	 */
	public List<Integer> getCalendario() {
		return calendario;
	}

	/**
	 * @param calendario the calendario to set
	 */
	public void setCalendario(List<Integer> calendario) {
		this.calendario = calendario;
	}

	@Override
	public String toString() {
		return "Autobus [matricula=" + matricula + ", plazas=" + plazas + ", precioDiario=" + precioDiario
				+ ", precioKilometro=" + precioKilometro + ", calendario=" + calendario + "]";
	}



	public static int CalcularDia(String fecha) throws FormatoException {
		comprobarFecha(fecha);
		
		
		return 0;
	}
	
	public static void comprobarFecha(String fecha) throws FormatoException {
		String trozos[] = fecha.split("/");
		
		if(trozos.length != 3) {
			throw new FormatoException("Fecha mal construida");
			
		}
		
		
		
	}
	
	
	
	
	
	
	

}
