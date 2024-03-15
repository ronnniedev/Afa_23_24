package ejercicio1;

public class LibroTextoFacultad extends LibroTexto {

	protected String facultad;
	
	public LibroTextoFacultad(String titulo, String autor,int curso, String facultad) {
		
		super(titulo,autor,curso);
		this.facultad = facultad;
		
	}

	/**
	 * @return the facultad
	 */
	public String getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "LibroTextoFacultad [facultad=" + facultad +", curso=" + curso + ", titulo=" + titulo + ", autor=" + autor + ", precio="
				+ precio + "]";
	}



	

	
	
	
}
