package Ej4;

public class Encargado extends Empleado {

	protected float calcularSueldo() {

		return sueldo*1.10f;

	}
	
	public String toString() {
		
		return String.format("Sueldo Encargado: %.2f", calcularSueldo());
		
	}

}
