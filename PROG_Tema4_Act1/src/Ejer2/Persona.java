package Ejer2;

public class Persona {
	private final char CTE_SEXO='H';
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private int peso;
	private double altura;

	
	/**
	 * constructor por defecto
	 */
	public Persona() {
		this.nombre="";
		this.edad=0;
		generarDni();
		this.sexo=CTE_SEXO;
		this.peso=0;
		this.altura=0.0;	
	}
	

	/**
	 * constructor con parametros
	 * @param nombre string
	 * @param edad entero
	 * @param sexo char
	 */
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		generarDni();
		if(comprobarSexo(sexo)==true) {
		    this.sexo = sexo;
		}else {
			this.sexo=CTE_SEXO;
		}
		
		this.peso=0;
		this.altura=0.0;
	}
	/** 
	 * constructor con los parametros
	 * @param nombre string
	 * @param edad entero
	 * @param sexo char
	 * @param peso entero
	 * @param altura real
	 */
	public Persona(String nombre, int edad, char sexo, int peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		generarDni();
		if(comprobarSexo(sexo)==true) {
		    this.sexo = sexo;
		}else {
			this.sexo=CTE_SEXO;
		}
		
		this.peso = peso;
		this.altura = altura;
	}


	private void generarDni() {
		this.dni="";
		for(int i=1;i<=8;i++) {
			int digito=(int)(Math.random()*10);
			dni+=digito;
		}
		char letra=calcularLetra();
		dni=dni+letra;
	}

	/**
	 * Calcula la letra asociada al dni segun :
	 * calcula la suma de todos los digitos y lo divide entre 4
	 * resto =0 A
	 * resto =1 B
	 * resto =2 C
	 * resto =3 D
	 * @return
	 */
	private char calcularLetra() {
		// TODO Auto-generated method stub
		int suma=0;
		for(int i=0;i<8;i++) {
			char digitoChar=dni.charAt(i);
			int valorDigito=digitoChar-0x30; // '5'-30h= 5(35h-30h)
			suma+=valorDigito;
		}
		int resto=suma%4;
		if(resto==0) return 'A';
		if(resto==1) return 'B';
		if(resto==2) return 'C';
		return 'D';
	}

	/**
	 * metodo get del atributo nombre
	 * @return string
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * metodo get del atributo edad
	 * @return int
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * metodo get del atributo dni
	 * @return String
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * Metodo get del atributo Sexo
	 * @return char
	 */
	public char getSexo() {
		return sexo;
	}


	/**
	 * metodo get del atributo peso
	 * @return int
	 */
	public int getPeso() {
		return peso;
	}


	/**
	 * Metodo get del atributo altura
	 * @return real
	 */
	public double getAltura() {
		return altura;
	}


	/**
	 * Metodo set del nombre
	 * @param nombre : string
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Metodo set del atributo edad
	 * @param edad entero
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * Metodo set del atriobuto sexo
	 * @param sexo char
	 */
	public void setSexo(char sexo) {
		if(comprobarSexo(sexo)==true) {
		    this.sexo = sexo;
		}else {
			this.sexo=CTE_SEXO;
		}
		
	}


	/**
	 * Metodo set del atributo peso
	 * @param peso entero
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}


	/**
	 * Metodo set del atributo altura 
	 * @param altura real
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * calculara si la persona esta en su peso ideal (peso en kg/(altura^2 en m)), 
	 * si esta fórmula devuelve un valor menor que 20, => -1 
	 * si devuelve un número entre 20 y 25 (incluidos), => 0 
	 * si devuelve un valor mayor que 25 => 1
	 * @return entero
	 */
	public int calcularIMC() {
		double valor=peso/(altura*altura);
		if(valor<20) return -1;
		else if(valor>=20 && valor<=25) return 0;
		else return 1;
	}
	
	/**
	 * Determina si edad >= 18
	 * @return boolean
	 */
	public boolean esMayorDeEdad() {
		if(edad>=18) return true;
		else return false;
	}

	/**
	 * comprobar que el char retperesneta un valor correcto
	 * @param letra char
	 * @return boolean
	 */
	private boolean comprobarSexo(char letra) {
		if(letra=='H' || letra=='h')return true;
		if(letra=='M' || letra=='m')return true;
		return false;
	}


	/**
	 * retorna el toString de la clase
	 * @return boolean
	 */
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}



	
	

}



