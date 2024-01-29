package ficheros;


import java.util.Scanner;

public class ejercicioDeLasActividades01cambiarlugar {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia, mes, anio;
		boolean bisiesto;
		
		anio = -1;
		mes = -1;
		dia = 0;
		bisiesto = false;
		

		
		while (dia < 1 || dia > 31 ) {
		
		System.out.println("introduce dia: ");
		dia = teclado.nextInt();
		}
		
		while (mes < 1 || mes > 13) {
				
		System.out.println("introduce mes");
		mes = teclado.nextInt();
		}
		
			while (mes==2 && dia < 1 || dia > 29 )	{
			System.out.println("introduce dia");
			dia = teclado.nextInt();
			}
			
			
		while (anio < 0) {
			System.out.println("introduce año");
			anio = teclado.nextInt();
		
		}
		
		if (anio%4==0 && anio%100!=0 || anio%400==0) {
			
			bisiesto = true;
			
		}
		
		dia++;
		
		
		if (mes==4 || mes==6 || mes==11) {
			if(dia == 31) {
				dia=1;
				mes++;				
			}
		}
			if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)	{
				if(dia == 32)	{
					dia=1;
					mes++;
				}
		} 
			if (mes==2) {
				if (bisiesto)	{
					if (dia==29)	{
						dia=1;
						mes++;}
				}else if (dia==28) {
						dia=1;
						mes++;
					}
			}	
			if (mes == 13)	{
				anio++;
				dia = 1;
			}
			System.out.println("resultado: "+dia+","+mes+","+anio);	
	}
}
	

