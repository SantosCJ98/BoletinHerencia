package Ej3;

public class Rectangulo extends FiguraGeometrica {

	float base;
	
	float altura;
	
	private void setBase(float base) {
		
		if (base < 0) {
			
			throw new IllegalArgumentException("La base debe ser positiva");
				
				
		
			
		}
		
		this.base = base;
	}



	private void setAltura(float altura) {
		
		if (altura < 0) {
			
			throw new IllegalArgumentException("La altura debe ser positiva");
				
				
		
			
		}
		
		this.altura = altura;
	}



	Rectangulo(int x, int y, float base, float altura) {
		
		super(x, y);
		
		setBase(base);
		
		setAltura(altura);
		
	}
	
	protected float calcularArea() {
		
		return base*altura;
		
	}
	
	
	
	public String toString() {
		
		return String.format("%s\nBase: %.2f\nAltura: %.2f\nArea: %.2f\n", super.toString(), base, altura, calcularArea());
		
	}
	
}
