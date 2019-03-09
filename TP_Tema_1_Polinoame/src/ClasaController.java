	import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		
public class ClasaController {
	
	private Interfata inter;
	private Operatii oper;
	private Polinom polinom;
	private Monom monom;
	
	
	public ClasaController(Interfata i, Operatii o, Polinom p, Monom m){
		
		inter = i;
		oper = o;
		polinom = p;
		monom = m;
		inter.setAddListener(new AddListener());
		inter.setMultListener(new MultListener());
		inter.setDifListener(new DifListener());
		inter.setDivListener(new DivListener());
		inter.setDerivListener(new DerivListener());
		inter.setIntegListener(new IntegListener());	
		};
	

		class AddListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int ok = 0;
				System.out.println("Add");
				String a = inter.getNr1();
				String b = inter.getNr2();
				System.out.println("Polinom 1: " + a);
				System.out.println("Polinom 2: " + b);
				
				
				if(polinom.validare(a) == false || polinom.validare(b) == false){
					ok = 1;
				}
				if(ok == 0){	
					Polinom p = new Polinom(a);
					Polinom p2 = new Polinom(b);
					Monom m = new Monom(p);
					Monom m2 = new Monom(p2);
				
					String res = oper.adunare(m,m2);
					inter.setResult(res);
				}
				else
					inter.setResult("Polinomul nu contine caractere valide");
				
			}
			
		}
		
		
		class DifListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int ok = 0;
				System.out.println("Sub");
				String a = inter.getNr1();
				String b = inter.getNr2();

				System.out.println("Polinom 1: " + a);
				System.out.println("Polinom 2: " + b);
				
				if(polinom.validare(a) == false || polinom.validare(b) == false){
					ok = 1;
				}
				if(ok == 0){	
					Polinom p = new Polinom(a);
					Polinom p2 = new Polinom(b);
					Monom m = new Monom(p);
					Monom m2 = new Monom(p2);
				
					String res = oper.scadere(m,m2);
					inter.setResult(res);
				}
				else
					inter.setResult("Polinomul nu contine caractere valide");
			}
			
		}
		
		
		class MultListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int ok = 0;
				System.out.println("Mul");
				String a = inter.getNr1();
				String b = inter.getNr2();

				System.out.println("Polinom 1: " + a);
				System.out.println("Polinom 2: " + b);
				
				if(polinom.validare(a) == false || polinom.validare(b) == false){
					ok = 1;
				}
				if(ok == 0){	
					Polinom p = new Polinom(a);
					Polinom p2 = new Polinom(b);
					Monom m = new Monom(p);
					Monom m2 = new Monom(p2);
				
					String res = oper.inmultire(m,m2);
					inter.setResult(res);
				}
				else
					inter.setResult("Polinomul nu contine caractere valide");
			}
			
		}
		
		
		class DivListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int ok = 0;
				System.out.println("Div");
				String a = inter.getNr1();
				String b = inter.getNr2();
				
				System.out.println("Polinom 1: " + a);
				System.out.println("Polinom 2: " + b);
				
				if(polinom.validare(a) == false || polinom.validare(b) == false){
					ok = 1;
				}
				if(ok == 0){	
					Polinom p = new Polinom(a);
					Polinom p2 = new Polinom(b);
					Monom m = new Monom(p);
					Monom m2 = new Monom(p2);
				
					String res = oper.impartire(m,m2);
					inter.setResult(res);
				}
				else
					inter.setResult("Polinomul nu contine caractere valide");
			}
			
		}
		
		
		class DerivListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int ok = 0;
				System.out.println("Deriv");
				String a = inter.getNr3();
				
				System.out.println("Polinom 3: " + a);
		
				
				if (polinom.validare(a) == false)
					ok = 1;
				
				if(ok == 0){
					Polinom p = new Polinom(a);
					Monom m = new Monom(p);
				
					String res = oper.derivare(m);
					inter.setResult2(res);
				}
				else
					inter.setResult2("Polinomul nu contine caractere valide");

			}
			
		}
		
		
		class IntegListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int ok = 0;
				System.out.println("Integr");
				String a = inter.getNr4();
				
	
				System.out.println("Polinom 3: " + a);
				
				if (polinom.validare(a) == false)
					ok = 1;
				
				if(ok == 0){
					Polinom p = new Polinom(a);
					Monom m = new Monom(p);
				
					String res = oper.integrare(m);
					inter.setResult2(res);
				}
				else
					inter.setResult2("Polinomul nu contine caractere valide");
			}
			
		}
	}

