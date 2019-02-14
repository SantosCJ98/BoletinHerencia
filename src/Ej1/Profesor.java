package Ej1;

public class Profesor extends Colegio {

	private float sueldo;
//  1.1
//	Profesor(String nombre, int edad, String nacionalidad, float sueldo) {
//
//		super(nombre, edad, nacionalidad);
//		
//		this.sueldo = sueldo;
//		
//	}
	
	//1.2
	
		Profesor(String nombre, int edad, String nacionalidad) {
			
			super(nombre, edad, nacionalidad);
			
		}
		
		Profesor(String nombre, int edad, String nacionalidad, float sueldo) {
			
			this(nombre, edad, nacionalidad);
			
			this.sueldo = sueldo;
			
		}
	
	public String toString() {
		
		return String.format("Datos Profesor\nNombre: %s\nEdad: %d\nNacionalidad: %s\nSueldo: %.2f €", nombre, edad, nacionalidad, sueldo);
		
	}
	
	public static void main(String args[]) {
		
//		1.1
//		
//		Profesor profe = new Profesor();
		
//		1.2 

		Profesor profe = new Profesor("Lino", 50, "Española", 50);

		System.out.println(profe.toString());

	}
	
}
