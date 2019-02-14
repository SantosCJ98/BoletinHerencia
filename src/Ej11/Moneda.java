package Ej11;

import java.util.Random;

public class Moneda extends Sorteo {
	
	Moneda() {
		
		posibilidades = 2;
		
	}
	
	public int lanzar() {
		
		Random random = new Random();
		
		return random.nextInt(posibilidades);
		
	}
	
	public String toString() {
		
		return String.format("Moneda: %s", (lanzar() == 0) ? "Cara" : "Cruz");
		
	}

}
