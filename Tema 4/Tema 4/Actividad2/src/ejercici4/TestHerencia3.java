package ejercici4;

public class TestHerencia3 {

	public static void main(String[] args) {
		
		ProductosFrescos p1 = new ProductosFrescos ("26-4-1995",234,"20-4-1995","España");
		ProductosFrescos p2 = new ProductosFrescos ("26-7-1998",12,"20-6-1998","Mexico");
		ProductosRefrigerados pr1 = new ProductosRefrigerados ("28-7-1999",123,"20-6-1999","España",23,"Omensa");
		ProductosRefrigerados pr2 = new ProductosRefrigerados ("18-7-1997",321,"20-6-1996","Dinamarca",3,"Mariachi");
		CongeladosPorAgua pa1 = new CongeladosPorAgua ("16-2-2003", 583, "16-2-2002", "Jamaica",5, 12);
		CongeladosPorAgua pa2 = new CongeladosPorAgua ("16-2-2008", 54, "16-2-2007", "Maricarmen",8, 19);
		CongeladosPorAire par1 = new CongeladosPorAire ("26-7-1998", 42124, "26-7-1998","Venecia",5, 6, 8, 9,10);
		CongeladosPorAire par2 = new CongeladosPorAire ("26-7-2007", 42124, "26-7-1998","dasfa",2, 6, 9, 912,10);
		CongeladosPorNitrogeno nit = new CongeladosPorNitrogeno ("26-7-2007", 42124, "26-7-1998","dasfa",72,"platano",13);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(pr1.toString());
		System.out.println(pr2.toString());
		System.out.println(pa1.toString());
		System.out.println(pa2.toString());
		System.out.println(par1.toString());
		System.out.println(par2.toString());
		System.out.println(nit.toString());
	}

}
