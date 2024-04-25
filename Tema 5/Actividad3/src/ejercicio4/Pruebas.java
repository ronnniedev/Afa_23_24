package ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {
	
	private static Map<DireccionHttp,Integer> contador = new HashMap<DireccionHttp,Integer>();
	
	public static void main(String[] args) {
		
		DireccionHttp d = new DireccionHttp ("http://www.host.com:80/datos/fichero.txt");
		DireccionHttp f = new DireccionHttp ("http://www.host.com:12930/datos");
		DireccionHttp h = new DireccionHttp ("http://www.pornhub.com:90/datos");
		
		System.out.println(f.toString());
		
		agregarDireccion(d);
		contarVisita(d);
		contarVisita(f);
		contarVisita(h);
		
		System.out.println(d.equals(f));
		
	}
	
	public static void agregarDireccion(DireccionHttp d) {
		Integer visitas = 0;
		if (contador.containsKey(d) == false) { // no contiene la direccion
			System.out.println("Añadido con exito");
			contador.put(d, visitas);
			
		}else {
			
			System.out.println("Direccion ya añadida en el contador");
		}
		
	}
	
	public static void contarVisita(DireccionHttp d) {
	
		if (contador.containsKey(d) == true) {
			Integer visitasActuales = contador.get(d);
			visitasActuales++;
			contador.remove(d);
			contador.put(d, visitasActuales);
			System.out.println(d.toString() + " Visitas: " + contador.get(d));
			
			
		}else {
			System.out.println("Pagina no se encuentra en el DDNS");
		}
		
	}

}
