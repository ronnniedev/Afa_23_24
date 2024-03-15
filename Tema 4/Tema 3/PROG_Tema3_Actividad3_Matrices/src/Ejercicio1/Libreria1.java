package Ejercicio1;

public class Libreria1 {
	
	/**
	 * generar una matriz [filas][columnas] con valores aleatorios entre 0 y 9
	 * @param filas : entero
	 * @param columnas : entero
	 * @return matriz enteros
	 */
	public static int [][] generarMatriz(int filas, int columnas){
		int m[][]=new int[filas][columnas];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				m[i][j]=(int) (Math.random()*10);
			}
		}
		return m;
	}
	/**
	 * funcion que muestra los valores de una matriz por filas
	 * @param m matriz de enteros
	 */
	public static void mostrarMatriz(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.print (m[i][j]+"\t");
				// \t sirve para que salga tabulada
			}
			System.out.println();
		}
	}
	/**
	 * Funcion qe busca un valor dentro de una matriz. Muestra el indice de las
	 * filas y el indice de las columnas si lo encuentra.
	 * Si no lo encuentra muestra un mensaje
	 * @param m
	 * @param valor
	 */
	public static void buscarValor(int m[][], int valor) {
		int posFilas=-1;
		int posColumnas=-1;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				if(m[i][j]==valor) {
					posFilas=i;
					posColumnas=j;
				}
			}
		}
		if(posFilas==-1 && posColumnas==-1) {
			System.out.println("Valor no encontrado");
		}else {
			System.out.println("Valor encontrado ["+posFilas+","+posColumnas+"]");
		}
	}

	/**
	 * funcion que retorna un vector v[filas] donde cada posicion
	 * es la suma de los elementos de la fila i
	 * @param m matriz enteros
	 * @return vector enteros
	 */
	public static int[] sumaPorFilas(int m[][]) {
		int v[]=new int[m.length];
		for(int i=0;i<m.length;i++) {
			int suma=0;
			for(int j=0;j<m[0].length;j++) {
				suma+=m[i][j];
			}
			v[i]=suma;
		}
		return v;
	}
	
	/**
	 * Funcion que retorna un vector v[columnas] donde cada posicion
	 * es la suma de los elementos de la columna j
	 * @param m matriz enteros
	 * @return vector enteros
	 */
	public static int[] sumaPorColumnas(int m[][]) {
		int v[]=new int[m[0].length];
		for(int j=0;j<m[0].length;j++) {
			int suma=0;
			for(int i=0;i<m.length;i++) {
				suma+=m[i][j];
			}
			v[j]=suma;
		}
		return v;
	}
	/**
	 * calculamos la matriz traspuestam, que se consigue 
	 * cambiando filas por columnas
	 * @param m matriz enteros
	 * @return matriz enteros
	 */
	public static int [][] calcularTraspuesta(int m[][]){
		int filas=m.length;
		int columnas=m[0].length;
		int retorno[][]=new int[columnas][filas];
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				retorno[j][i]=m[i][j];
			}
		}
		return retorno;
	}
	
	/**
	 * funcionq ue suma dos matrices de iguales dimensiones
	 * @param a matriz enteros
	 * @param b matriz enteros
	 * @return matriz enteros
	 */
	public static int [][] sumaMatrices(int a[][], int b[][]){
		int filas=a.length;
		int columnas=a[0].length;
		int retorno[][]=new int[columnas][filas];
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				retorno[i][j]=a[i][j]+b[i][j];
			}
		}
		return retorno;
	}
	/**
	 * retornamos el producto de dos matrices. Para poder multiplicar dos matrices
	 * el numer de columnas de la primera tiene que ser igual al numero de filas de la segunda
	 * @param a matriz enteros
	 * @param b matriz enteros
	 * @return matriz enteros
	 */
	public static int [][] productoMatrices(int a[][], int b[][]){
		int retorno[][]=new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				int resul=0;
				for(int k=0;k<a[0].length;k++) {
					resul=resul+(a[i][k]*b[k][j]);
				}
				retorno[i][j]=resul;
			}
		}
		return retorno;
	}
	/**
	 * calcula la suma de los elementos de la diagonal principal
	 * @param m matriz cuadrada enteros
	 * @return entero
	 */
	public static int calcularSumaDiagonal(int m[][]){
		int suma=0;
		for(int i=0;i<m.length;i++) {
				suma+=m[i][i];
		}
		return suma;
	}
	/**
	 * calcula la suma de los elementos de la diagonal secundaria
	 * @param m matriz cuadrada enteros
	 * @return entero
	 */
	public static int calcularSumaDiagonalInversa(int m[][]) {
		int dim=m.length;
		int suma=0;
		for(int i=dim-1;i>=0;i--) {
				suma+=m[(dim-1)-i][i];
		}
		return suma;
	}

	
	/**
	 * diagonizar un vector, es buscar un vector que consiga hacer ceros en la diagonal 
	 * mediante la resta de los valores de la diagonal con el vector de autovalores
	 * es recomendable que la matriz sea cuadrada
	 * @param m matriz enteros
	 * @return vector enteros
	 */
	public static int [] diagonalizarMatriz(int m[][]){
		int v[]=new int [m.length];
		for(int i=0;i<m.length;i++) {
				v[i]=(-1)*m[i][i];
		}
		
		for(int i=0;i<m.length;i++) {
			m[i][i]=m[i][i]-v[i];
		}
		return v;
	}
	/**
	 * comprobar si todos los elemento que se encuentran 
	 * por encima de la diagonal princpal son 0
	 * @param m matriz de enteros
	 * @return boleano
	 */
	public static boolean matrizTriangularSuperior(int m[][]){
		for(int i=0;i<m.length;i++) {
			for(int j=i+1;j<m[0].length;j++) {
				if(m[i][j]!=0) return false;
			}
		}
		return true;
	}
	
	/**
	 * comprobar si todos los elemento que se encuentran 
	 * por diagonal de la diagonal princpal son 0
	 * @param m matriz de enteros
	 * @return boleano
	 */
	public static boolean matrizTriangularInferior(int m[][]){
		for(int i=1;i<m.length;i++) {
			for(int j=0;j<m[0].length-(m[0].length-i);j++) {
				if(m[i][j]!=0) return false;
			}
		}
		return true;
	}
	

}
