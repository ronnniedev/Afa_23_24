package Ejer6;

public class Campeonato {
	private Partido partidos[];
	private int contPartidos;
	/**
	 * 
	 */
	public Campeonato() {
		partidos=new Partido[10];
		contPartidos=0;
	}
	
	public void añadirPartido(String resultado, String campos, 
			String arbitro, String incidencias, 
			Equipo local,
			Equipo visitante) {
		if(contPartidos<partidos.length) {
			Partido nuevo=new Partido(resultado, campos, 
					arbitro, local, visitante);
			int pos=contPartidos;
			partidos[pos]=nuevo;
			contPartidos++;
		}

		
	}
	
	
}
