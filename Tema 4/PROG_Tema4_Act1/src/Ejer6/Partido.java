package Ejer6;

public class Partido {
	private String resultado;  // "1-0"
	private String campos;
	private String arbitro;
	private String incidencias;
	
	private Equipo local;
	private Equipo visitante;
	/**
	 * @param resultado
	 * @param campos
	 * @param arbitro
	 * @param incidencias
	 * @param local
	 * @param visitante
	 */
	public Partido(String resultado, String campos, 
			String arbitro, String incidencias, 
			Equipo local,
			Equipo visitante) {
		this.resultado = resultado;
		this.campos = campos;
		this.arbitro = arbitro;
		this.incidencias = incidencias;
		this.local = local;
		this.visitante = visitante;
	}
	
	
	/**
	 * @param resultado
	 * @param campos
	 * @param arbitro
	 * @param local
	 * @param visitante
	 */
	public Partido(String resultado, String campos, 
			String arbitro, Equipo local, 
			Equipo visitante) {
		this.resultado = resultado;
		this.campos = campos;
		this.arbitro = arbitro;
		this.local = local;
		this.visitante = visitante;
		this.incidencias="";
	}


	/**
	 * @return the resultado
	 */
	public String getResultado() {
		return resultado;
	}
	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	/**
	 * @return the campos
	 */
	public String getCampos() {
		return campos;
	}
	/**
	 * @param campos the campos to set
	 */
	public void setCampos(String campos) {
		this.campos = campos;
	}
	/**
	 * @return the arbitro
	 */
	public String getArbitro() {
		return arbitro;
	}
	/**
	 * @param arbitro the arbitro to set
	 */
	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}
	/**
	 * @return the incidencias
	 */
	public String getIncidencias() {
		return incidencias;
	}
	/**
	 * @param incidencias the incidencias to set
	 */
	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}
	/**
	 * @return the local
	 */
	public Equipo getLocal() {
		return local;
	}
	/**
	 * @param local the local to set
	 */
	public void setLocal(Equipo local) {
		this.local = local;
	}
	/**
	 * @return the visitante
	 */
	public Equipo getVisitante() {
		return visitante;
	}
	/**
	 * @param visitante the visitante to set
	 */
	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}
	@Override
	public String toString() {
		String texto="Partido [resultado=" + resultado + ", campos=" + campos + ", arbitro=" + arbitro + ", incidencias="
				+ incidencias + "]\n";
		texto+=" local=" + local.toString()+"\n";
		texto+=" visitante=" + visitante.toString();
		return texto;
	}
	
	
}
