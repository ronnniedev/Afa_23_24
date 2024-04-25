package Act1;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Taller {
	private Map<Matricula,Vehiculo> mapa;
	
	public Taller() {
		mapa=new HashMap<Matricula, Vehiculo>();
	}
	
	public void añadirVehiculo(Vehiculo v) {
		if(mapa.containsKey(v.getMatricula())==true) {
			System.out.println("ERROR matricula ya incluida");
		}else {
			if(v.getMatricula().getValor().compareTo("X")==0) {
				System.out.println("ERROR matricula error");
			}else {
				mapa.put(v.getMatricula(), v);
				System.out.println("Vehiculo incluido");
			}		
		}
	}
	
	public void mostrarTaller() {
		for(Vehiculo v: mapa.values()) {
			System.out.println(v.toString());
		}
	}
	
	public void mostrarTaller_2() {
		for(Entry<Matricula, Vehiculo> par: mapa.entrySet()) {
			System.out.println("Clave "+par.getKey().toString());
			System.out.print("Valor : "+par.getValue().toString());
		}
	}
	
	public Vehiculo buscarPorMatricula(String m) {
		Vehiculo resul=null;
		if(Matricula.comprobarMatricula(m)==false) {
			System.out.println("ERROR matricula mal formada");
		}else {
			resul=mapa.get(new Matricula(m));
		}
		return resul;
	}
}



