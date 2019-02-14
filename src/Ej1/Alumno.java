package Ej1;

public class Alumno extends Colegio {

	private boolean repetidor;

//	Alumno(String nombre, int edad, String nacionalidad, boolean repetidor) {
//
//		super(nombre, edad, nacionalidad);
//		
//		this.repetidor = repetidor;
//	}

	// 1.2

	Alumno(String nombre, int edad, String nacionalidad) {

		super(nombre, edad, nacionalidad);

	}

	Alumno(String nombre, int edad, String nacionalidad, boolean repetidor) {

		this(nombre, edad, nacionalidad);

		this.repetidor = repetidor;

	}

	public String toString() {

		return String.format("Datos Alumno\nNombre: %s\nEdad: %d\nNacionalidad: %s\n¿Repetidor?: %s", nombre, edad,
				nacionalidad, repetidor ? "Sí" : "No");

	}

	public static void main(String args[]) {

//		1.1
//		
//		Alumno alu = new Alumno();

//      1.2

		Alumno alu = new Alumno("Santos", 20, "Española", false);

		System.out.println(alu.toString());

	}

}
