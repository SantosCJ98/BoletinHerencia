package Ej11;

import java.util.Random;

public class Dado extends Sorteo {
	
	Dado() {
		
		posibilidades = 6;
		
	}
	
	public int lanzar() {
		
		Random random = new Random();
		
		return random.nextInt(posibilidades)+1;
		
	}

}
