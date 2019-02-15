package Ej15;

public class Planta implements MercanciaViva {

	private float precio;
	
	private String descripcion;
	
	private int hambre;
	
	private boolean regada;
	
	public double damePrecio() {
		
		return precio;
		
	}
	
	public String dameDescripcion() {
		
		return descripcion;
		
	}
	
	public boolean necesitaComida() {
		
		if (hambre <= 50) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	public boolean necesitaRiego() {
		
		if (!regada) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	
	Planta(float precio, String descripcion, int hambre, boolean regada) {
		
		this.precio = precio;
		
		this.descripcion = descripcion;
		
		this.hambre = hambre;
		
		this.regada = regada;
		
	}
	
	public String toString() {
		
		return String.format("Planta\nPrecio: %.2f €\nDescripción: %s\n¿Necesita Comida?: %s\n¿Necesita Riego?: %s", damePrecio(), dameDescripcion(), necesitaComida()?"Sí":"No", necesitaRiego()?"Sí":"No");
		
	}
	
}
