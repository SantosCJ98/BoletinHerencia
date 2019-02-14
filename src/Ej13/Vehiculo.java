package Ej13;

public abstract class Vehiculo {
	private int peso;

	public final void setPeso(int p) {
		peso = p;
	}

	public abstract int getVelocidadActual();
}


//Esta clase puede tener descendencia, ya que es abstracta y esta pensado para ello.

//El metodo setPeso es constante. Por lo tanto, no puede sobreescribirse.

//getVelocidadActual es un metodo abstracto y esta pensado para realizar distintas acciones en las subclases de Vehiculo.