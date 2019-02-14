package Ej7;

import Ej6.Forma;
import Ej6.Cuadrado;

import Ej6.Rombo;

import Ej6.Triangulo;

import Ej6.Circulo;

class TestForma {
	public static void main(String[] args) {
		Forma f = new Circulo();
		f.identidad();
		Circulo c = new Circulo();
// ((Forma)c).identidad(); 				Forma es abstracta.
//((Circulo)f).identidad();				Linea innecesaria, porque f ya es un circulo.
// Forma f2=new Forma(); 				 Al ser una clase abstracta, no se pueden crear objetos de la clase Forma.
// f2.identidad();
// (Forma)f.identidad();
		f = c;
// c=f;                  				 //No se le puede asignar una clase hija a una padre;
	}
}
