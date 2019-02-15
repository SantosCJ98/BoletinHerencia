package Ej15;

public class Alfareria implements MercanciaFragil {

	private float precio;
	
	private String descripcion;
	
	private boolean fragil;
	
	private float peso;
	
	public double damePrecio() {
		
		return precio;
		
	}
	
	public String dameDescripcion() {
		
		return descripcion;
		
	}
	
	public String dameEmbalaje() {
		
		return toString();
		
	}
	
	public double damePeso() {
		
		return peso;
		
	}
	
	
	Alfareria(float precio, String descripcion, boolean fragil, float peso) {
		
		this.precio = precio;
		
		this.descripcion = descripcion;
		
		this.fragil = fragil;
		
		this.peso = peso;
	}
	
	public String toString() {
		
		return String.format("Alfareria\nPrecio: %.2f €\nDescripción: %s\n¿Frágil?: %s\nPeso: %.2f", damePrecio(), dameDescripcion(), fragil, damePeso());
		
	}
	
}
