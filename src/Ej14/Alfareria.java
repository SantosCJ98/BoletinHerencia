package Ej14;

public class Alfareria implements Mercancia {

	private float precio;
	
	private String descripcion;
	
	private boolean fragil;
	
	public double damePrecio() {
		
		return precio;
		
	}
	
	public String dameDescripcion() {
		
		return descripcion;
		
	}
	
	
	Alfareria(float precio, String descripcion) {
		
		this.precio = precio;
		
		this.descripcion = descripcion;
		
	}
	
	public String toString() {
		
		return String.format("Alfareria\nPrecio: %.2f €\nDescripción: %s", damePrecio(), dameDescripcion());
		
	}
	
}
