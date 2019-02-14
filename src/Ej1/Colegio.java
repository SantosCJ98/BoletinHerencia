package Ej1;

import static teclado.Teclado.*;

public class Colegio {

	protected String nombre;

	protected int edad;

	protected String nacionalidad;

//	1.1
//	
//	Colegio() {
//
//		this.nombre = "Sin nombre";
//
//		this.edad = 0;
//
//		this.nacionalidad = "Sin nacionalidad";
//	}
	
	Colegio(String nombre, int edad, String nacionalidad) {
		
		this.nombre = nombre;
		
		this.edad = edad;
		
		this.nacionalidad = nacionalidad;
		
	}

	public String toString() {

		return String.format("Datos\nNombre: %s\nEdad: %d\nNacionalidad: %s\nSueldo: %.2f", nombre, edad, nacionalidad);

	}
// 1.1
//	public static void main(String args[]) {
//
//		Colegio cole = new Colegio();
//
//		System.out.println("Elige:\n1. Profesor\n2. Alumno");
//
//		int eleccion = readRange(1, 2, Rangos.AMBOSIN);
//
//		switch (eleccion) {
//
//		case 1:
//
//			Profesor profe = new Profesor();
//
//			cole = profe;
//
//			break;
//
//		case 2:
//
//			Alumno alu = new Alumno();
//
//			cole = alu;
//
//			break;
//
//		}
//
//		System.out.println(cole.toString());
//
//	}
//
}
