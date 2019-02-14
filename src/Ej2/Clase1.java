package Ej2;

public class Clase1 {

	private int privado;

	int amigable;

	protected int protegido;

	public int publico;

	private void met_privado() {

	}

	void met_amigable() {

	}

	protected void met_protegido() {

	}

	public void met_publico() {

	}

	public static void main(String[] args) {

		Clase1 mismaclase = new Clase1();

		mismaclase.privado = 0;

		mismaclase.amigable = 0;

		mismaclase.protegido = 0;

		mismaclase.publico = 0;

		mismaclase.met_publico();

		mismaclase.met_amigable();

		mismaclase.met_privado();

		mismaclase.met_protegido();
		
		
	}
	
	
	
}


