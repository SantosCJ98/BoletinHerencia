package Ej15;

public class Principal {
	
	public static void main (String args[]) {
		
		Mercancia producto = new Planta(6.5f, "Es una planta", 51, false);
		
		Mercancia producto2 = new Alfareria(10.2f, "Es un producto de alfarería", true, 25);
		
		dameDatos(producto);
		
		dameDatos(producto2);
		
	}
	
	public static void dameDatos(Mercancia producto) {
		
		System.out.println(producto.toString());
			
		}
		
	}


