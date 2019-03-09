import java.util.Arrays;

public class Operatii extends Monom{
	
	int [] puteri = getPutere();
	
	
	public String adunare (Monom x, Monom y){
		String rezReturnat = "";
		int [] a = x.getCoeficienti();
		int [] b = y.getCoeficienti();
		int [] rezSuma = new int[a.length + b.length];
		int ok = 0;
		for(int i = 0; i < a.length; i ++){
				rezSuma[i] = a[i] + b[i];
				if(rezSuma[i] != 0){
					ok = 1;
				}
				
		}
		
		if(ok == 0)
			return "0";
		
		rezReturnat= transcriere (rezSuma, 0, 0);
		
		return rezReturnat;
	}
	
	
	public String scadere (Monom x, Monom y){
		String rezReturnat = "";
		int ok = 0;
		int [] a = x.getCoeficienti();
		int [] b = y.getCoeficienti();
		int [] rezDif = new int[a.length + b.length];
		for(int i = 0; i < a.length; i ++){
				rezDif[i] = a[i] - b[i];
				if(rezDif[i] != 0){
					ok = 1;
				}
		}
		if(ok == 0)
			return "0";
		
		rezReturnat = transcriere (rezDif, 0, 0);
		
		return rezReturnat;
	}
	
	
	public String inmultire ( Monom x, Monom y){
		String rezReturnat = "";
		int [] a = x.getCoeficienti();
		int [] b = y.getCoeficienti();
		int [] rezInm = new int[a.length * b.length];
		int ok = 0;
		for(int i = 0; i < a.length; i ++){
			for(int j = 0; j < b.length; j ++){
				rezInm[i + j] += a[i] * b[j];
				if(rezInm[i] != 0){
					ok = 1;
				}
			}
			
		}
		if(ok == 0)
			return "0";
		
		rezReturnat = transcriere (rezInm, 0, 0);
		return rezReturnat;
	}

	
	public String impartire ( Monom x, Monom y){
		String rezCat = "Catul : ", rezRest = " Restul : ", rezReturnat = "";
		double [] deimpartit = Arrays.stream(x.getCoeficienti()).asDoubleStream().toArray();
		double [] impartitor = Arrays.stream(y.getCoeficienti()).asDoubleStream().toArray();
		double [] dubluraImpartitor = new double[deimpartit.length];
		double [] rest = new double[deimpartit.length];
		double [] cat = new double[deimpartit.length];
		int gradDeimpartit = calculGradPolinom(deimpartit);
		int gradImpartitor = calculGradPolinom(impartitor);
		int gradDubluraImpartitor = calculGradPolinom(dubluraImpartitor);
		int ok = 0;
		
		if( gradImpartitor <= 0 ){return "eroare";}
		
		for(double i: deimpartit){
			if (i != 0){
				ok =1;
			}
		}
		if( ok == 0){
			return "0";
		}
		
		while( gradDeimpartit >= gradImpartitor ){
			for( int i = (dubluraImpartitor.length-(gradDeimpartit - gradImpartitor)-1); i >= 0; i --){
				dubluraImpartitor[i+(gradDeimpartit - gradImpartitor)] = impartitor[i];
			}
			gradDubluraImpartitor = calculGradPolinom(dubluraImpartitor);
			double a =  ( deimpartit[gradDeimpartit] / dubluraImpartitor[gradDubluraImpartitor]);
		    cat[(gradDeimpartit - gradImpartitor)] = a;
		    
		    for(int i = 0; i < dubluraImpartitor.length; i ++){
		    	dubluraImpartitor[i] = dubluraImpartitor[i] * cat[calculGradPolinom(deimpartit) - calculGradPolinom(impartitor)];
		    }
		    for(int i = 0; i < deimpartit.length; i ++){
		    	deimpartit [i] = deimpartit [i] - dubluraImpartitor[i];
		    }
		    gradDeimpartit = calculGradPolinom(deimpartit);
			gradImpartitor = calculGradPolinom(impartitor);
			gradDubluraImpartitor = calculGradPolinom(dubluraImpartitor);
		}
		for(int i = 0; i < rest.length; i ++){
			rest[i] = deimpartit [i];
		}
		
		for(int i = 0; i < cat.length; i ++){ cat[i] = Math.round( cat[i]*100.0)/100.0; }
			
		for(int i = 0; i < rest.length; i ++){ rest[i] = Math.round( rest[i]*100.0)/100.0; } 
		
		rezCat = transcriereD(cat, 0, 0);
		rezRest = transcriereD(rest, 0, 0);
		rezReturnat = "Catul :" + rezCat + "    Restul: " + rezRest;
		return rezReturnat;
	}
	
	
	public String derivare ( Monom x){
		String rezReturnat = "";
		int [] a = x.getCoeficienti();
		int ok = 0;
		for(int i = 1; i < a.length; i ++){
			a[i] = a[i] * i;
			if(a[i] != 0){
				ok = 1;
			}
		}
		
		if ( ok == 0)
			return "0";
		
		rezReturnat= transcriere(a,1,-1);
		//System.out.println("\n Rez2 derivare->  " + rez2);
		return rezReturnat;
	}
	
	
	public String integrare ( Monom x){
		String rezReturnat = "";
		int [] a = x.getCoeficienti();
		double [] ad = Arrays.stream(a).asDoubleStream().toArray();
		int ok = 0;
		for(int i = 1; i < ad.length; i ++){
			ad[i] = Math.round( ad[i] / ((double)i+1)*100.0)/100.0;
			if(ad[i] != 0){
				ok = 1;
			}
		}
		if ( ok == 0)
			return "0";
		
		rezReturnat = transcriereD(ad, 0, 1);
		//System.out.println("\n Rez2 integrare--->  " + rez2);
		return rezReturnat;
	}
	
	
	public String transcriereD( double[] x, int indexInceput, int putere){
		String rez = null;
		String rezReturnat = "";
		for(int i = indexInceput; i < x.length; i ++){
			if(x[i] != 0){
				rez = ( x[i] + "x^"+ (i + putere));
				rezReturnat = rezReturnat + "+" + rez;
			}
		}
		rezReturnat = rezReturnat.replace("+-", "-");
		return rezReturnat;
		}
	
	
	public String transcriere( int[] x, int indexInceput, int putere){
		String rez = null;
		String rezReturnat = "";
		for(int i = indexInceput; i < x.length; i ++){
			if(x[i] != 0){
				rez = ( x[i] + "x^"+ (i + putere));
				rezReturnat = rezReturnat + "+" + rez;
			}
		}
		rezReturnat = rezReturnat.replace("+-", "-");
		return rezReturnat;
		}
	

}