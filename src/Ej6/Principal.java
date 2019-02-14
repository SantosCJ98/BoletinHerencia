package Ej6;

public class Principal {

	public static void main(String args[]) {

		Forma rom = new Rombo();

		Forma tri = new Triangulo();

		Forma cir = new Circulo();

		Forma cua = new Cuadrado();

		Forma[] formas = new Forma[4];

		formas[0] = rom;

		formas[1] = tri;

		formas[2] = cir;

		formas[3] = cua;

		for (int i = 0; i < formas.length; i++) {

			formas[i].identidad();

		}

	}

}
