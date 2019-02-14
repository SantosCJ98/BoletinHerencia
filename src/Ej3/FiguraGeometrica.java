package Ej3;

import static teclado.Teclado.*;

public abstract class FiguraGeometrica {

	protected int x;

	protected int y;
	
	FiguraGeometrica(int x, int y) {
		
		this.x = x;
		
		this.y = y;
		
	}
	
	protected abstract float calcularArea();
	
	public String toString() {
		
		return String.format("X = %d, Y = %d\n", x, y);
		
	}

}