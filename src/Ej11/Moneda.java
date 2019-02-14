package Ej11;

import java.util.Random;

public class Moneda extends Sorteo {
	
	Moneda() {
		
		posibilidades = 2;
		
	}
	
	public int lanzar() {
		
		Random random = new Random();
		
		int x = random.nextInt(posibilidades)+1;
		
		if (x == 1) {
			
			System.out.println("Cara");
			
		}
		
		else {
			
			System.out.println("Cruz");
			
		}
		
		return x;
		
	}

}
