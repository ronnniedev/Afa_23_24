package ejercicio3;

public class Pruebas {

	public static void main(String[] args) {
			
			String contraseña = "qyJkH9kfpvwoBqweBt13geYWwIHCUi";
			char letra = 'a';
			int contDigitos = 0;
			int contMinusculas= 0;
			int contMayusculas= 0;
			
			for (int i = 0; i < contraseña.length(); i++) {
				
				letra = contraseña.charAt(i);
				
				if (Character.isDigit(letra)) contDigitos++;
				else if (Character.isLowerCase(letra)) contMinusculas++;
				else if (Character.isUpperCase(letra)) contMayusculas++;
				
				
			}
			
			if (contDigitos > 5 && contMinusculas > 1 && contMayusculas > 2) System.out.println("es fuerte");
			else System.out.println("No es fuerte");
				
			System.out.println("Minus " + contMinusculas + "Mayus " + contMayusculas + " Digitos: " + contDigitos);
	}
}
