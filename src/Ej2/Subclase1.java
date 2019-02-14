package Ej2;

import Ej2.Clase1;

public class Subclase1 extends Clase1 {

	



public static void main (String args[]) {
	
	Clase1 clase = new Clase1();
	
	Subclase1 subclase = new Subclase1();
	
	// clase.privado = subclase.privado; 
	
	clase.amigable = subclase.amigable;
	
	clase.protegido = subclase.protegido;
	
	clase.publico = subclase.publico;
}

}