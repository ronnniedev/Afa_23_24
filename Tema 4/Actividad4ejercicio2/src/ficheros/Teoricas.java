package ficheros;


public class Teoricas extends Clases {

	private String horaInicio;
	private String horaFin;
	private String aula;
	private Alumno a[];
	private Profesor p;
	
	/**
	 * @param fechaInicio
	 * @param horaInicio
	 * @param horaFin
	 * @param aula
	 */
	public Teoricas(String fechaInicio, String horaInicio, String horaFin, String aula,Profesor p) {
		super(fechaInicio);
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.aula = aula;
		this.p = p;
		this.a = new Alumno[0];
	}

	/**
	 * @return the horaInicio
	 */
	public String getHoraInicio() {
		return horaInicio;
	}

	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * @return the horaFin
	 */
	public String getHoraFin() {
		return horaFin;
	}

	/**
	 * @param horaFin the horaFin to set
	 */
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	/**
	 * @return the aula
	 */
	public String getAula() {
		return aula;
	}

	/**
	 * @param aula the aula to set
	 */
	public void setAula(String aula) {
		this.aula = aula;
	}
	
	public void añadirAlumnos(Alumno newA) {
		int newTam = a.length+1;
		
		
		Alumno newV[] = new Alumno [newTam];
		
		for (int i = 0; i < a.length; i++) {
			newV[i]=a[i];
		}
			
		newV[a.length] = newA;
			
		a = newV;
		
		
		
	}
	
	public void visualizarElementos() {
		System.out.println("-----------Clase------------");
		System.out.println(toString());
		System.out.println("----------Profesor------------");
		System.out.println(p.toString());
		System.out.println("------------Alumnos--------------");
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i].toString());
		}
		
	}

	@Override
	public String toString() {
		return "Teoricas [horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", aula=" + aula + ", fechaInicio=" + fechaInicio + "]";
	}

	

	
	
	
	
	
}
