//import java.awt.Button;
//import java.awt.FlowLayout;
//import java.awt.Frame;
import java.awt.Label;
//import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfata extends JFrame {
	private JPanel mainPanel = new JPanel();
	
	private JTextField polinom1 = new JTextField();
	private JTextField polinom2 = new JTextField();
	private JTextField polinom3 = new JTextField();
	private JTextField polinom4 = new JTextField();
	private JTextField result = new JTextField();
	private JTextField result2 = new JTextField();

	private JButton addBtn = new JButton("+");
	private JButton multBtn = new JButton("*");
	private JButton divBtn = new JButton("/");
	private JButton difBtn = new JButton("-");
	private JButton derivBtn = new JButton("'");
	private JButton integBtn = new JButton("S");
	
	private Label label1= new Label("Polinomul 1 :");   
	private Label label2= new Label("Polinomul 2 :"); 
	private Label label3= new Label("Rezultatul :"); 
	private Label label4= new Label("P Derivare :");   
	private Label label5= new Label("P Integrare :"); 
	private Label label6= new Label("Rezultatul :"); 

	
	public Interfata(){
		add(mainPanel);
		mainPanel.setLayout(null);
		addComponents();
		jFrameSetup();
	}

	
	private void addComponents() {

			polinom1.setBounds(110,10,300,20);//x y width height
			polinom2.setBounds(110,50,300,20);
			polinom3.setBounds(110,200,300,20);//x y width height
			polinom4.setBounds(110,250,300,20);
			result.setBounds(110,150,300,20);
			result2.setBounds(110,350,300,20);
			
			addBtn.setBounds(10,100,50,20);
			multBtn.setBounds(80,100,50,20);
			divBtn.setBounds(150,100,50,20);
			difBtn.setBounds(220,100,50,20);
			derivBtn.setBounds(10,300,50,20);
			integBtn.setBounds(80,300,50,20);
			
			label1.setBounds(10, 10, 100, 20);
			label2.setBounds(10, 50, 100, 20);
			label3.setBounds(10, 150, 100, 20);
			label4.setBounds(10, 200, 100, 20);
			label5.setBounds(10, 250, 100, 20);
			label6.setBounds(10, 350, 100, 20);

			
			mainPanel.add(polinom1);
			mainPanel.add(polinom2);
			mainPanel.add(polinom3);
			mainPanel.add(polinom4);
			mainPanel.add(result);
			mainPanel.add(result2);
			
			mainPanel.add(addBtn);
			mainPanel.add(difBtn);
			mainPanel.add(multBtn);
			mainPanel.add(divBtn);
			mainPanel.add(derivBtn);
			mainPanel.add(integBtn);
			
			mainPanel.add(label1); 
			mainPanel.add(label2); 
			mainPanel.add(label3);
			mainPanel.add(label4); 
			mainPanel.add(label5); 
			mainPanel.add(label6);
	}

	
	private void jFrameSetup() {
		setSize(450,450);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public void setAddListener(ActionListener a ){
		addBtn.addActionListener(a);
	}
	
	
	public void setMultListener(ActionListener a ){
		multBtn.addActionListener(a);
	}
	
	
	public void setDifListener(ActionListener a ){
		difBtn.addActionListener(a);
	}
	
	
	public void setDivListener(ActionListener a ){
		divBtn.addActionListener(a);
	}
	
	
	public void setDerivListener(ActionListener a ){
		derivBtn.addActionListener(a);
	}
	
	
	public void setIntegListener(ActionListener a ){
		integBtn.addActionListener(a);
	}
	
	
	public String getNr1(){
		return (polinom1.getText());
	}
	
	
	public String getNr2(){
		return (polinom2.getText());
	}
	
	
	public String getNr3(){
		return (polinom3.getText());
	}
	
	
	public String getNr4(){
		return (polinom4.getText());
	}
	
	
	public void setResult(String res){
		result.setText(" "+res);
	}
	
	
	public void setResult2(String res2){
		result2.setText(" "+res2);
	}
	
}
