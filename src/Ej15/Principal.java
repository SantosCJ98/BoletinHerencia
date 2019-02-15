package Ej15;

public class Principal {
	
	public static void main (String args[]) {
		
		Mercancia producto = new Planta(6.5f, "Es una planta", 50, true);
		
	}
	
	public static void dameDatos(Mercancia producto) {
		
		if (producto instanceof Planta) {
			
			System.out.println(producto);
			
		}
		
		else {
			
			System.out.println(producto.);
			
		}
		
	}

}
