package ficheros;

public class Practicas extends Clases{

	protected Vehiculo v[];
	protected Alumno a;
	protected Profesor p;
	protected Coche c;
	protected Moto m;

	/**
	 * @param fechaInicio
	 * @param v
	 */
	public Practicas(String fechaInicio, Coche c,Alumno a,Profesor p) {
		super(fechaInicio);
		this.c = c;
		this.a = a;
		this.p = p;
	}
	
	/**
	 * @param fechaInicio
	 * @param v
	 */
	public Practicas(String fechaInicio, Coche c, Moto m,Alumno a,Profesor p) {
		super(fechaInicio);
		this.c = c;
		this.a = a;
		this.p = p;
		this.m = m;
	}
	
	


	@Override
	public String toString() {
		String texto = "";
		
		texto = texto + "Practicas [Alumno=" + a + ", Profesor=" + p;
		
		if (m != null) {
			texto = texto +", Moto=" + m + ",Apoyo Coche = " + c + ", fechaInicio=" + fechaInicio + "]";
		
		}else {
			texto = texto + "Coche = " + c + ", fechaInicio=" + fechaInicio + "]";
		}
		
		return texto;
	}

	
	
	
}
