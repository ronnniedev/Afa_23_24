package envios;

public class EnviosEjec {

	public static void main(String[] args) {
		int numero=25;
		double numero2=34.7;
		
		numero= (int) (numero2);
		
		Envios paqueteJuan, paqueteLuis;
		Persona p1,p2;
		p1=new Persona("1111111a","LUIS");
		p2=new Persona("2222222b","JUAN");
		paqueteJuan=new Envios(p1,p2,"urgente");
		System.out.println(paqueteJuan.toString());
		System.out.println("Tipo envio"+paqueteJuan.tip+"Importe Envio "+paqueteJuan.calculaImporte(5));
		

	}

}
