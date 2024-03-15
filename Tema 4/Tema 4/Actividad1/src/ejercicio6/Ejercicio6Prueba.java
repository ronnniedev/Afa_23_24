package ejercicio6;

public class Ejercicio6Prueba {

	public static void main(String[] args) {
		
		Equipo e = new Equipo ("nom1" , " pat" , "color1", "color2", "cat");
		Equipo e1 = new Equipo ("nom2" , " pat" , "color1", "color2", "cat");
		Equipo e2 = new Equipo ("nom3" , " pat" , "color1", "color2", "cat");
		
		Participantes p1 = new Participantes ("p1","ape",20,"dir", 21314);
		Participantes p2 = new Participantes ("p2","ape",20,"dir", 21314);
		Participantes p3 = new Participantes ("p3","ape",20,"dir", 21314);
		Participantes p4 = new Participantes ("p4","ape",20,"dir", 21314);
		Participantes p5 = new Participantes ("p5","ape",20,"dir", 21314);
		Participantes p6 = new Participantes ("p6","ape",20,"dir", 21314);
		Participantes p7 = new Participantes ("p7","ape",20,"dir", 21314);
		Participantes p8 = new Participantes ("p8","ape",20,"dir", 21314);
		Participantes p9 = new Participantes ("p9","ape",20,"dir", 21314);
		Participantes p10 = new Participantes ("p10","ape",20,"dir", 21314);
		
		e.añadirParticipantes(p1);
		e.añadirParticipantes(p2);
		e.añadirParticipantes(p3);
		e1.añadirParticipantes(p4);
		e1.añadirParticipantes(p5);
		e1.añadirParticipantes(p6);
		e2.añadirParticipantes(p7);
		e2.añadirParticipantes(p8);
		e2.añadirParticipantes(p9);
		e2.añadirParticipantes(p10);
		
		System.out.println(e.toString());
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		Campeonato c1=new Campeonato();
		c1.añadirPartido("1-0", "Marcarmen", "", e, e2);
		
		

	}

}
