public class ClasaPrincipala {
	
	public static void main(String [] args){
		
		Interfata i = new Interfata();
		Operatii o = new Operatii();
		Polinom p = new Polinom();
		Monom m = new Monom();
		ClasaController c = new ClasaController(i, o, p,m);
	}
}
