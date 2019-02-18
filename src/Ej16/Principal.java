package Ej16;

public class Principal {

	public static void main(String[] args) {
		Pez merluza = new Pez("Merluza");
		
		Pez merluza2 = new Pez(merluza);
		
		System.out.println(merluza.equals(merluza2));

	}

}
