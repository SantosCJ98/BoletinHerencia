package Ej14;

public class Principal {

	public static void main(String args[]) {

		Mercancia producto = new Planta(6.9f, "Es una planta");
		
		Mercancia producto2 = new Alfareria(20, "Es un producto de alfareria");

		dameDatos(producto);
		
		dameDatos(producto2);

	}

	public static void dameDatos(Mercancia producto) {

		System.out.println(producto.toString());

	}
}
