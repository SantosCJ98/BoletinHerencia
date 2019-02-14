package Ej3;

public class Principal {
	
	public static void main (String args[]) {
		
		FiguraGeometrica rec = new Rectangulo(0, 0, 5, 2);
		
		FiguraGeometrica tri = new Triangulo(5, 5, 10, 4);
		
		FiguraGeometrica cir = new Circulo(10, 10, 5);
		
		System.out.println(rec);
		
		System.out.println(tri);
		
		System.out.println(cir);
		
		

		
	}
	
	

}
