package Ej18;

public class Primitivos {
	
	int [][] miarray = new int [3][3];
	
	
	
	public int [][] clonado (int [][] miarray) {
		
		int [][] clonado = new int [3][3];
		
		for (int i = 0; i < miarray.length; i++) {
			
			for (int j = 0; j < miarray[i].length; i++) {
				
				clonado[i][j] = miarray[i][j];
				
			}
			
		}
		
		return clonado;
		
	}

}
