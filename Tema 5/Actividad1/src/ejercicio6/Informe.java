package ejercicio6;

public class Informe {

	protected static int numVeces = 0;
	protected int idInforme;
	protected Tarea tarea;
	
	public Informe(Tarea tarea) {
		numVeces++;
		this.idInforme = numVeces;
		this.tarea = tarea;
	}

	/**
	 * @return the idInforme
	 */
	public int getIdInforme() {
		return idInforme;
	}

	/**
	 * @param idInforme the idInforme to set
	 */
	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
	}

	/**
	 * @return the tarea
	 */
	public Tarea getTarea() {
		return tarea;
	}

	/**
	 * @param tarea the tarea to set
	 */
	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	
	@Override
	public String toString() {
		return "Informe [idInforme=" + idInforme + ", tarea=" + tarea + "]";
	}
	
	
	
	
	
}
