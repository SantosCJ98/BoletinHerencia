package Ej20;

import Ej20.Contenedor.Contenido;

//Clase Interna Regular

public class Contenedor {
	public int numero = 0;

	public Contenedor(int numero) {
		this.numero = numero;
	}

	public String muestraContenedor(Contenido refCont) {
		return "N. contenedor= " + numero + " N. contenido= " + refCont.numero2;
	}

	public class Contenido {
		public int numero2;

		public Contenido(int numero) {
			numero2 = numero;
		}

		public String muestraContenido() {
			return "N.contenedor= " + numero + " N.contenido= " + numero2;
		}

	}
}
