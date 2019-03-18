package Ej19;

public class Huevo {
	
	public class Clara {
		
		public class Yema {
			
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Huevo huevo = new Huevo();
		
		Huevo.Clara clara = huevo.new Clara();
		
		
		Huevo.Clara.Yema yema = clara.new Yema();
		
		System.out.println(yema.getClass());
		
		
		
	}

}
