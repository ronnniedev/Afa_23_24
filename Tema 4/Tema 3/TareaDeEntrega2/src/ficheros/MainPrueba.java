package ficheros;

public class MainPrueba {

	public static void main(String[] args) {
		
		int [][] mat_mccdu={{ 5, 6, 2,-4},
							{ 6, 7, 8, 3},
							{10, 4, -5, 9},
							{ 4,-7, 1,12}};
		int [][] no_mat_mccdu={{ 5, 6, 2,-4},
							   { 6, 7, 8, 3},
							   {10, -5, 4, 9},
							   { 4,-7, 12,1}};

		
		if (LibreriaMatrices.mccud(mat_mccdu)) System.out.println("Es mccud");
		else System.out.println("No es mccud");
		
		if (LibreriaMatrices.mccud(no_mat_mccdu)) System.out.println("Es mccud");
		else System.out.println("No es mccud");
	}

}

