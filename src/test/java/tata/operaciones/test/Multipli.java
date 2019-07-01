package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tat.operaciones.ope.Operaciones;

public class Multipli {

	private Operaciones ope;
	@Before
	public void setUp() throws Exception {
		
		this.ope = new Operaciones();
	}

	@Test
	public void test() {
		int res = this.ope.multiplicar(15, 10);
		
		assertTrue("deberia ser 150 pero es: "+res, res==150);
	}
	
	@Test
	public void cuandoB0Entonces1() {
		int res = this.ope.multiplicar(15, 0);
		
		assertTrue("deberia ser 1 pero es: "+res, res==1);
	}
	
	
	@Test
	public void cuandomaxpormax() {
		int res = this.ope.multiplicar(Integer.MAX_VALUE,Integer.MAX_VALUE);
		
		assertTrue("deberia ser 1 pero es: "+res, res==1);
	}
	
	
	

}
