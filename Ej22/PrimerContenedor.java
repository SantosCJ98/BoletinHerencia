package Ej22;

public class PrimerContenedor {
	public int numero = 0;
	static public int numero3 = 13;

	public PrimerContenedor(int numero) {
		this.numero = numero;
	}

	public String muestraContenedor(Contenido refCont) {
		return "Nº contenedor= " + numero + "Nº contenido= " + refCont.numero2;
	}

	//Clase Interna estática.
	
	static class Contenido {
		public int numero2;

		public Contenido(int numero) {
			numero2 = numero;
		}

		public String muestraContenido() {
			return "Nº contenedor= " + numero3 + " Nº contenido= " + numero2;
		}
	}
}