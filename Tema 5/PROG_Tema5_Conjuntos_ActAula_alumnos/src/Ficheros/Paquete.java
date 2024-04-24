package Ficheros;

import java.util.Objects;

public class Paquete {
	private String codigo;
	private String direccion;
	private int cp;
	
	public Paquete(String codigo,String direccion,int cps) {
		this.codigo = codigo;
		this.direccion = direccion;
		this.cp = cps;
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getCp() {
		return cp;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paquete other = (Paquete) obj;
		return Objects.equals(codigo, other.codigo);

	}

	@Override
	public String toString() {
		return "Paquete [codigo=" + codigo + ", direccion=" + direccion + ", cp=" + cp + "]\n";
	}
	
	
}
