package Ej4;

public class Empleado {

	protected float sueldo;
	
	Empleado() {
		
		sueldo = 950.20f;
		
	}

	
	protected float calcularSueldo() {
		
		return sueldo;
		
	}
	
	public String toString() {
		
		return String.format("Sueldo Empleado: %.2f €", calcularSueldo());
		
	}
	
}
