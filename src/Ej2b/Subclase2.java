package Ej2b;

import Ej2.Clase1;

public class Subclase2 extends Clase1 {

	



public static void main (String args[]) {
	
	Clase1 clase = new Clase1();
	
	Subclase2 subclase = new Subclase2();
	
	// clase.privado = subclase.privado; 
	
	//clase.amigable = subclase.amigable;
	
	//clase.protegido = subclase.protegido;
	
	clase.publico = subclase.publico;
}

}