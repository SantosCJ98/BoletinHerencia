package Ej18;

import java.util.Arrays;

public class Objetos {
	
	Objetos [][] miarray = new Objetos[2][2];
	
	Objetos(Objetos [][] miarray) {
		
		this.miarray = miarray;
		
	}
	
	Objetos(Objetos objetos) {
		
		this(Arrays.copyOf(objetos.miarray, objetos.miarray.length));
		
	}

}
