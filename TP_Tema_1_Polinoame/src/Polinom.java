//import java.awt.Component;
//import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Polinom {
	public ArrayList <String> listaMonoame;
	
	public Polinom(){}
	
	
	public Polinom(String polinom){
		
		polinom = polinom.replace("-", "+-");
		polinom = polinom.replace(" ", "");
		
		System.out.println("Polinomul dupa inlocuirea minusului: " + polinom);
		
		listaMonoame= new ArrayList<String>(Arrays.asList(polinom.split("[+]")));
		
		System.out.println("Lista de monoame: " + Arrays.toString(listaMonoame.toArray()));

	}
	
	
	public ArrayList<String> getList(){
		return listaMonoame;
	}
	
	
	public static boolean validare(String polinom){
		int ok = 0;
		for(int i = 0; i < polinom.length(); i ++){
			ok = 0;
			if( (polinom.charAt(i) == '^')||
				 polinom.charAt(i) == '-' ||
				 polinom.charAt(i) == '+' ||
				 polinom.charAt(i) == 88 || 
				 polinom.charAt(i) == 120 )
			{
				ok = 1;
				break;
			}
			
		}
		if(ok == 0){
			System.out.println("Polinomul contine caractere invalide");
			return false;
		}
		
		System.out.println("Polinomul contine caractere valide");
		return true;
	}
}
