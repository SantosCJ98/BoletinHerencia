package Ej12;

class Testfinal {
	public static void main(String[] args) {
		final String s1 = new String("Hola");
		String s2 = new String(" Mundo");
		s1 = s1 + s2;
	}
}

//s1 es una cadena constante. Por lo intentar modificarla es imposible.
