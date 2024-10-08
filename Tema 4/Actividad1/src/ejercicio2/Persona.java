package ejercicio2;

import java.util.Scanner;

public class Persona {
	static Scanner keyboard=new Scanner(System.in);
	private final char CTE_SEXO = 'H';
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	
	/** Contructor de 5 parametros de Persona
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad,char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		generaDNI();
		this.peso = peso;
		this.altura = altura;
	}
	/** Contructor con valores por defecto
	 */
	public Persona() {
		this.nombre=" ";
		this.edad=0;
		generaDNI();
		this.sexo = CTE_SEXO;
		this.peso=0;
		this.altura=0.0;
	}
	
	/** Constructor con parametros para persona
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre,int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		generaDNI();
		this.peso=0;
		this.altura=0.0;
	}
	
	/** Metodo toString que enseña los 6 parametros de Persona
	 * 
	 */
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo 
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	/** Calcula el IMC en base de peso y altura previamente introducidos, indica si este es correcto o no.
	 * @param peso
	 * @param altura
	 * @return entero
	 */
	public int calcularIMC() {
		
		double imc = 0;
		imc = this.peso/ Math.pow(this.altura, 2); 
		if (imc >= 20 && imc <= 25) return 0; //dentro de peso
		else if (imc > 25) return 1; //sobrepeso
		return -1; //bajo peso
	}
	/** Verifica si el usuario es mayor de edad
	 * @param edad
	 * @return booleano
	 */
	public boolean esMayorDeEdad () {
		
		if (this.edad >= 18) return true;
		else return false;
		
	}
	/** Comprobar si la letra de sexo introducido es correcto
	 * @param sexo
	 * @return caracter
	 */
	private char comprobarSexo (char sexo) {
		
		if (sexo == 'M' || sexo == 'H') {
			return sexo;	
		} 
		else return CTE_SEXO;
		
	}
	/** Genera un numero entre el 0 y el 99999999 
	 * @return
	 */
	public String generaDNI () {

	int suma = 0;
	
	this.dni = "";
	
	for (int i = 0; i < 8; i++) {
		int numero = Libreria.generaNumeros(0, 9);
	
		while (i == 0 && numero == 0) {
			
			numero = Libreria.generaNumeros(0, 9);
			
		}
		this.dni+= numero;
		suma = suma*10+numero;
	}
	
	char letra = 'H';
	
	
	
	switch (suma%23) { 
    case 0:
    	letra = 'T';
    	break;
    case 1:
    	letra = 'R';
    	break;
    case 2:
    	letra = 'W';
    	break;
    case 3:
    	letra = 'A';
        break;
    case 4:
    	letra = 'G';
        break;
    case 5:
    	letra = 'M';
        break;
    case 6:
    	letra = 'Y';
        break;
    case 7:
    	letra = 'F';
        break;
    case 8:
    	letra = 'P';
        break;
    case 9:
    	letra = 'D';
        break;
    case 10:
    	letra = 'X';
        break;
    case 11:
    	letra = 'B';
        break;
    case 12:
    	letra = 'N';
        break;  
    case 13:
    	letra = 'J';
        break;
    case 14:
    	letra = 'Z';
        break;
    case 15:
    	letra = 'S';
        break;
    case 16:
    	letra = 'Q';
        break;
    case 17:
    	letra = 'V';
        break;
    case 18:
    	letra = 'H';
        break;
    case 19:
    	letra = 'L';
        break;
    case 20:
    	letra = 'C';
        break;
    case 21:
    	letra = 'K';
        break;
    case 22:
    	letra = 'E';
        break;
    default:
     // Default secuencia de sentencias.
  }

	this.dni = this.dni + letra;
	return this.dni;
	}
	
	/** Metodo set para nombre de la clase persona
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/** Metodo set para edad de la clase persona
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/** Metodo set para sexo de la clase persona
	 * @param sexo
	 */
	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}
	/** Metodo set para peso de la clase persona
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/** Metodo set para altura de la clase persona
	 * @param altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/** Metodo get para nombre de la clase persona
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	/** Metodo get para edad de la clase persona
	 * @return entero
	 */
	public int getEdad() {
		return edad;
	}
	
	
}
