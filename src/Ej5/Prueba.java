package Ej5;

class Prueba {
	protected String nombre;
	protected int id;

	public String getIdent() {

		return nombre;

	}

	public int getIdent() {
		return id;
	}
}

//Esta clase tiene 2 metodos get con el mismo nombre. Por lo tanto, no compilara hasta que uno de los dos
//tenga un nombre diferente.


//Lo correcto sería llamar al primer get "getNombre", por poner un ejemplo.
