package Ejer5;

public class Estudiante {
	
	private String nombre;
	private String apelllidos;
	private int codigo;
	private int numeroSemestre;
	private double notaFinal;
	/**
	 * @param nombre
	 * @param apelllidos
	 * @param codigo
	 * @param numeroSemestre
	 * @param notaFinal
	 */
	public Estudiante(String nombre, String apelllidos, int codigo, int numeroSemestre, double notaFinal) {
		this.nombre = nombre;
		this.apelllidos = apelllidos;
		this.codigo = codigo;
		this.numeroSemestre = numeroSemestre;
		this.notaFinal = notaFinal;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apelllidos
	 */
	public String getApelllidos() {
		return apelllidos;
	}
	/**
	 * @param apelllidos the apelllidos to set
	 */
	public void setApelllidos(String apelllidos) {
		this.apelllidos = apelllidos;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the numeroSemestre
	 */
	public int getNumeroSemestre() {
		return numeroSemestre;
	}
	/**
	 * @param numeroSemestre the numeroSemestre to set
	 */
	public void setNumeroSemestre(int numeroSemestre) {
		this.numeroSemestre = numeroSemestre;
	}
	/**
	 * @return the notaFinal
	 */
	public double getNotaFinal() {
		return notaFinal;
	}
	/**
	 * @param notaFinal the notaFinal to set
	 */
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apelllidos=" + apelllidos + ", codigo=" + codigo
				+ ", numeroSemestre=" + numeroSemestre + ", notaFinal=" + notaFinal + "]";
	}
	
	
}
