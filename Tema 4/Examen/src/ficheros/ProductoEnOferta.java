package ficheros;

public class ProductoEnOferta extends Producto{
	private int cantidadMinina;
	private int porcentaje;
	public ProductoEnOferta(int cod,String descripcion, int existencias, double precio,int cantidadMinima,int porcentaje) {
		super(cod,descripcion, existencias, precio);
		this.cantidadMinina = cantidadMinima;
		this.porcentaje = porcentaje;
	}
	/**
	 * @return the cantidadMinina
	 */
	public int getCantidadMinina() {
		return cantidadMinina;
	}
	/**
	 * @param cantidadMinina the cantidadMinina to set
	 */
	public void setCantidadMinina(int cantidadMinina) {
		this.cantidadMinina = cantidadMinina;
	}
	/**
	 * @return the porcentaje
	 */
	public int getPorcentaje() {
		return porcentaje;
	}
	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	@Override
	public String toString() {
		return "ProductoEnOferta [cod = " + getCod() + ", Descripcion= " + getDescripcion() + ", Existencias=" + getExistencias() + 
				", Precio="+ getPrecio()+"cantidadMinina=" + cantidadMinina + ", porcentaje=" + porcentaje
				 + "]";
	}
	
	
	
	
	
	
}
