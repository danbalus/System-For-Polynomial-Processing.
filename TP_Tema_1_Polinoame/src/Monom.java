import java.util.ArrayList;
//import java.util.Arrays;
//import java.lang.Iterable;
import java.util.Arrays;
import java.util.*;

public class Monom {

	int [] coeficienti = new int[50];
	int [] puteri = new int[50];
	String [] aux;
    int [] ajutator;
    
	public Monom() {}

	private Polinom polinom = new Polinom();
	
	private ArrayList<String> monom = new ArrayList<String>();

	
	public Monom(Polinom p) {
		polinom = p;
		monom = polinom.getList();

		System.out.println("\nContinutul listei de monoame: " + Arrays.toString(monom.toArray()));
		
		for (Iterator<String> iterator = monom.iterator(); iterator.hasNext();) {
			String x = iterator.next();
			calculCoeficientiPutere(x);
		}
		
		System.out.println("Puteri: ");
		for(int j: puteri){
			//if(j != 0)
				System.out.printf("%d ",j);}
		
		System.out.println("\nCoeficienti: ");
		for(int j: coeficienti){
			if(j != 0)
				System.out.printf("%d ",j);}
	}
	
	
	public void calculCoeficientiPutere(String aux2){
		int [] helpint;
		int PUTERE = -1 ;
		int COEFICIENT = -1;
		String [] help = aux2.split("[x]\\^");
		
		try{
			helpint= Arrays.asList(help).stream().mapToInt(Integer::parseInt).toArray();
			System.out.println("Lista monoame: " + Arrays.toString(helpint));
			COEFICIENT = helpint[0];
			PUTERE = helpint[1];
			coeficienti[PUTERE] = COEFICIENT;
			puteri[PUTERE] = 1;
			}catch(NumberFormatException ex){ 
			   
			}
		}
	
	
	public int[] getCoeficienti(){
		return coeficienti;}
	
	
	public int[] getPutere(){
		return puteri;}
	
	
	public int calculGradPolinom(double [] puteri){
		int MAX = -1;
		for(int i = 0; i < puteri.length; i ++){
			if(puteri[i] != 0)
				MAX = i;
		}
		return MAX;
	}
	
}
