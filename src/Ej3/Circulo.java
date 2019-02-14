package Ej3;

public class Circulo extends FiguraGeometrica {

	float radio;
	
	private void setRadio(float radio) {
		
		if (radio < 0) {
			
			throw new IllegalArgumentException("La base debe ser positiva");
				
				
		
			
		}
		
		this.radio = radio;
	}




	Circulo(int x, int y, float radio) {
		
		super(x, y);
		
		this.radio = radio;
		
		
	}
	
	protected float calcularArea() {
		
		return (float)(Math.PI*Math.pow(radio, 2));
		
	}
	
	
	
	public String toString() {
		
		return String.format("%s\nRadio: %.2f\nArea: %.2f\n", super.toString(), radio, calcularArea());
		
	}
	
}
