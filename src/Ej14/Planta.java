package Ej14;

public class Planta implements MercanciaViva {

	private float precio;
	
	private String descripcion;
	
	private boolean regada;
	
	public double damePrecio() {
		
		return precio;
		
	}
	
	public String dameDescripcion() {
		
		return descripcion;
		
	}
	
	
	Planta(float precio, String descripcion) {
		
		this.precio = precio;
		
		this.descripcion = descripcion;
		
	}
	
	public String toString() {
		
		return String.format("Planta\nPrecio: %.2f €\nDescripción: %s", damePrecio(), dameDescripcion());
		
	}
	
}
