package Ej2;

public class Clase2 {

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

		Clase1 mismopaquete = new Clase1();

		// mismopaquete.privado = 0;

		mismopaquete.amigable = 0;

		mismopaquete.protegido = 0;

		mismopaquete.publico = 0;

		mismopaquete.met_publico();

		mismopaquete.met_amigable();

		// mismopaquete.met_privado();

		mismopaquete.met_protegido();
	}
	
}

