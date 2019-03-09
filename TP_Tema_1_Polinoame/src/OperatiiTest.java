import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class OperatiiTest extends TestCase {

	public void testAdunare() {
		 Operatii test = new Operatii();
		 Monom monom1 = new Monom();
		 Monom monom2 = new Monom();
		 Polinom polinom = new Polinom("3x^3+4x^2-5x^1-10 x^0");
		 Polinom polinom2 = new Polinom("3x^3+4x^2-5x^1-10 x^0");
		 polinom.getList().add("3x^3");
		 polinom.getList().add("4x^2");
		 polinom.getList().add("-5x^1");
		 polinom.getList().add("-10x^0");
		 polinom2.getList().add("3x^3");
		 polinom2.getList().add("4x^2");
		 polinom2.getList().add("-5x^1");
		 polinom2.getList().add("-10x^0");
		 monom1.calculCoeficientiPutere("3x^3");
		 monom1.calculCoeficientiPutere("4x^2");
		 monom1.calculCoeficientiPutere("-5x^1");
		 monom1.calculCoeficientiPutere("-10x^0");
		 monom2.calculCoeficientiPutere("3x^3");
		 monom2.calculCoeficientiPutere("4x^2");
		 monom2.calculCoeficientiPutere("-5x^1");
		 monom2.calculCoeficientiPutere("-10x^0");
		 String result = test.adunare(monom1, monom2);
		assertEquals("-20x^0-10x^1+8x^2+6x^3", result);
	}

	
	public void testScadere() {
		 Operatii test = new Operatii();
		 Monom monom1 = new Monom();
		 Monom monom2 = new Monom();
		 Polinom polinom = new Polinom("3x^3+4x^2-5x^1-10 x^0");
		 Polinom polinom2 = new Polinom("3x^3+4x^2-5x^1-10 x^0");
		 polinom.getList().add("3x^3");
		 polinom.getList().add("4x^2");
		 polinom.getList().add("-5x^1");
		 polinom.getList().add("-10x^0");
		 polinom2.getList().add("3x^3");
		 polinom2.getList().add("4x^2");
		 polinom2.getList().add("-5x^1");
		 polinom2.getList().add("-10x^0");
		 monom1.calculCoeficientiPutere("3x^3");
		 monom1.calculCoeficientiPutere("4x^2");
		 monom1.calculCoeficientiPutere("-5x^1");
		 monom1.calculCoeficientiPutere("-10x^0");
		 monom2.calculCoeficientiPutere("3x^3");
		 monom2.calculCoeficientiPutere("4x^2");
		 monom2.calculCoeficientiPutere("-5x^1");
		 monom2.calculCoeficientiPutere("-10x^0");
		 String result = test.scadere(monom1, monom2);
		assertEquals("0", result);
	}
	
	public void testImpartire() {
		 Operatii test = new Operatii();
		 Monom monom1 = new Monom();
		 Monom monom2 = new Monom();
		 Polinom polinom = new Polinom("1x^3-12x^2-42x^0");
		 Polinom polinom2 = new Polinom("1x^1-3x^0");
		 polinom.getList().add("1x^3");
		 polinom.getList().add("-12x^2");
		 polinom.getList().add("-42x^0");
		 polinom2.getList().add("1x^1");
		 polinom2.getList().add("-3x^0");
		 monom1.calculCoeficientiPutere("1x^3");
		 monom1.calculCoeficientiPutere("-12x^2");
		 monom1.calculCoeficientiPutere("-42x^0");
		 monom2.calculCoeficientiPutere("1x^1");
		 monom2.calculCoeficientiPutere("-3x^0");
		 String result = test.impartire(monom1, monom2);
		assertEquals("Catul :-27.0x^0-9.0x^1+1.0x^2    Restul: -123.0x^0", result);
	}
	
	public void testInmultire() {
		 Operatii test = new Operatii();
		 Monom monom1 = new Monom();
		 Monom monom2 = new Monom();
		 Polinom polinom = new Polinom("1x^3-12x^2-42x^0");
		 Polinom polinom2 = new Polinom("1x^1-3x^0");
		 polinom.getList().add("1x^3");
		 polinom.getList().add("-12x^2");
		 polinom.getList().add("-42x^0");
		 polinom2.getList().add("1x^1");
		 polinom2.getList().add("-3x^0");
		 monom1.calculCoeficientiPutere("1x^3");
		 monom1.calculCoeficientiPutere("-12x^2");
		 monom1.calculCoeficientiPutere("-42x^0");
		 monom2.calculCoeficientiPutere("1x^1");
		 monom2.calculCoeficientiPutere("-3x^0");
		 String result = test.inmultire(monom1, monom2);
		assertEquals("+126x^0-42x^1+36x^2-15x^3+1x^4", result);
	}
	
	public void testDerivare() {
		 Operatii test = new Operatii();
		 Monom monom1 = new Monom();
		 Polinom polinom = new Polinom("4x^2-14x^1+9x^0");
		 polinom.getList().add("4x^2");
		 polinom.getList().add("-14x^1");
		 polinom.getList().add("9x^0");
		 monom1.calculCoeficientiPutere("4x^2");
		 monom1.calculCoeficientiPutere("-14x^1");
		 monom1.calculCoeficientiPutere("9x^0");
		 String result = test.derivare(monom1);
		assertEquals("-14x^0+8x^1", result);
	}
	
	public void testIntegrare() {
		 Operatii test = new Operatii();
		 Monom monom1 = new Monom();
		 Polinom polinom = new Polinom("4x^2-14x^1+9x^0");
		 polinom.getList().add("4x^2");
		 polinom.getList().add("-14x^1");
		 polinom.getList().add("9x^0");
		 monom1.calculCoeficientiPutere("4x^2");
		 monom1.calculCoeficientiPutere("-14x^1");
		 monom1.calculCoeficientiPutere("9x^0");
		 String result = test.integrare(monom1);
		assertEquals("+9.0x^1-7.0x^2+1.33x^3", result);
	}
	
	
	double [] a = {1.0, 2.0, 3.0, 4.0, 13.0, 8.0};
	public void testGradpolinom(){
		Monom test = new Monom();
		int result = test.calculGradPolinom( a);
		assertEquals(5, result);
	}
	
	
	int [] x = {1, 4, 2};
	public void testTranscriere(){
		Operatii test = new Operatii();
		String result = test.transcriere(x, 0, 0);
		assertEquals("+1x^0+4x^1+2x^2", result);
	}
	
	
	public void testPolinom(){
		Polinom polinom = new Polinom("4x^2-14x^1+9x^0");
		ArrayList<String> result = polinom.getList();
		assertEquals( new ArrayList<String>(polinom.getList()), new ArrayList<String>(result));
	}
	
	public void testValidare(){
		 Polinom test = new Polinom();
		 boolean result = test.validare("4x^2-14x^1+9x^0");
		 assertTrue(result);
		 
	}
	
	public void setUp(){
		System.out.println("\n\n\nset up");
	}
	
	
	public void tearDown(){
		System.out.println("final");
	}
}
