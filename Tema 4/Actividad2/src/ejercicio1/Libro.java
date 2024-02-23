package ejercicio1;

public class Libro {

		protected String titulo;
		protected String autor;
		protected double precio;
		
		/** Constructor para clase Libro de 2 paraemtros
		 * @param titulo
		 * @param autor
		 */
		public Libro(String titulo, String autor) {
			this.titulo = titulo;
			this.autor = autor;
			this.precio = 0;
		}

		/** Metodo setPrecio para clase Libro
		 * @param precio the precio to set
		 */
		public void setPrecio(double precio) {
			this.precio = precio;
		}

		/**
		 * @return the titulo
		 */
		public String getTitulo() {
			return titulo;
		}

		/**
		 * @return the autor
		 */
		public String getAutor() {
			return autor;
		}

		/**
		 * @return the precio
		 */
		public double getPrecio() {
			return precio;
		}
		
		@Override
		public String toString() {
			return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
		}
		
		/** iva =125 => recibimos 12
		 * @param iva
		 * @return
		 */
		public double precioConIva (int iva) {
			double precioFinal = precio+(precio*iva/100);
			return precioFinal;
			
		}
		
}
