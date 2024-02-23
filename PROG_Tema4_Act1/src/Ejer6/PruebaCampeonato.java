package Ejer6;

public class PruebaCampeonato {

	public static void main(String[] args) {
		Participante p1=new Participante
				("p1", "ape", 20, "dir", "XXX");
		Participante p2=new Participante
				("p2", "ape", 20, "dir", "XXX");
		Participante p3=new Participante
				("p3", "ape", 20, "dir", "XXX");
		Participante p4=new Participante
				("p4", "ape", 20, "dir", "XXX");
		Participante p5=new Participante
				("p5", "ape", 20, "dir", "XXX");
		Participante p6=new Participante
				("p6", "ape", 20, "dir", "XXX");
		Participante p7=new Participante
				("p7", "ape", 20, "dir", "XXX");
		
		
		Equipo e=new Equipo
				("nom1","pat","color1","color2","cat");
	
		e.añadirParticipante(p1);
		e.añadirParticipante(p2);
		e.añadirParticipante(p3);
		//System.out.println(e.toString());
		
		Equipo e2=new Equipo
				("nom2","pat","color1","color2","cat");
	
		e2.añadirParticipante(p4);
		e2.añadirParticipante(p5);
		e2.añadirParticipante(p6);
		
		
		Campeonato c1=new Campeonato();
		c1.añadirPartido("1-0", "camp1", "paco","", e, e2);
		
	}

}
