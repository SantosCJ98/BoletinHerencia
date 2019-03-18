package Ej21;

//Clase Interna dentro de un método.

public class ClaseLocal {
	public int numero = 0;

	public ClaseLocal(int numero) {
		this.numero = numero;
	}

	public String muestraContenido() {
		class Mostrador {
			public String muestraDato() {
				return "Número = " + numero;
			}
		}
		Mostrador m = new Mostrador();
		return m.muestraDato();
	}
}

