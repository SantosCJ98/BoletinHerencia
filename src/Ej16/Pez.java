package Ej16;

public class Pez {
	
	protected String nombre;
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Pez && nombre.equals(((Pez)obj).nombre)) {
				resultado=true;
		}
		return resultado;		
	}
	
	Pez(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	Pez(Pez pez) {
		
		this(pez.nombre);
		
	}

}
