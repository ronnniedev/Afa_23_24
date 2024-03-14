package ficheros;

public class Venta {

	private static int CONT_VENTAS = 0;
	private int idVentas;
	private String nombreVendedor;
	private DetalleVenta dv[];
	
	
	/**
	 * @param idVentas
	 * @param nombreVendedor
	 * @param dv
	 */
	public Venta(int idVentas,String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
		this.dv = new DetalleVenta[0];
		CONT_VENTAS++;
		this.idVentas = CONT_VENTAS;
		
	}

	/**
	 * @return the idVentas
	 */
	public int getIdVentas() {
		return idVentas;
	}


	/**
	 * @param idVentas the idVentas to set
	 */
	public void setIdVentas(int idVentas) {
		this.idVentas = idVentas;
	}


	/**
	 * @return the nombreVendedor
	 */
	public String getNombreVendedor() {
		return nombreVendedor;
	}


	/**
	 * @param nombreVendedor the nombreVendedor to set
	 */
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}


	/**
	 * @return the dv
	 */
	public DetalleVenta[] getDv() {
		return dv;
	}


	/**
	 * @param dv the dv to set
	 */
	public void setDv(DetalleVenta[] dv) {
		this.dv = dv;
	}


	/**
	 * @return the contVentas
	 */
	public static int getContVentas() {
		return CONT_VENTAS;
	}
	
	public void añadirDetalle(DetalleVenta newDv) {
		int newTam = dv.length +1;
		
		DetalleVenta newV[] = new DetalleVenta[newTam];
		
		for (int i = 0; i < dv.length; i++) {
			
			newV[i] = dv[i];
		}
		
		newV[dv.length] = newDv;
		
		dv = newV;
		
		
	}
	
	public double calcularImporteTotal(Producto p) {
		double precioFinal = -1;
		
		
		
		return precioFinal;
	}
	
	
	
	
	
}
