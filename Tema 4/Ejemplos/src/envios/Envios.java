package envios;

public class Envios {
	private Persona des;
	public Persona rem;
	public String tip;
	
	public Envios(Persona d,Persona r,String t) {
		this.des=d;
		this.rem=r;
		this.tip=t;
	}
		
	
	public double calculaImporte(double peso) {
		double total=0;
		switch(this.tip) {
		case "normal":
		return(3*peso);
		case "especial":
		return(5*peso);
		case "urgente":
		return(10*peso);
				}
		return total;}
	
	public String toString() {
		return "DATOS DESTINATARIO\n"+des.toString()+"DATOS REMITENTE\n"+rem.toString()+"TIPO ENVIO: "+this.tip;
	}
	
}
