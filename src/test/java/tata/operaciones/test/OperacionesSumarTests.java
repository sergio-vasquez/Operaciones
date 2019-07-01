package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tat.operaciones.ope.Operaciones;

public class OperacionesSumarTests {
	
	private Operaciones ope;

	@Before
	public void setUp() throws Exception {
		this.ope = new Operaciones();
	}

	@Test
	public void cuando15mas20entonces35() {
		int res = this.ope.sumar(15, 20);
		assertEquals(35, res);
	}
	
	@Test
	public void cuandoA0entonces0() {
		int res = this.ope.sumar(0, 20);
		assertEquals(0, res);
	}
	

	@Test
	public void cuandoB0entonces0() {
		int res = this.ope.sumar(15, 0);
		assertEquals(4, res);
	}
	
	
	@Test
	public void cuandoMaxMasMaxentoncesMenos2() {
		int res = this.ope.sumar(Integer.MAX_VALUE, Integer.MAX_VALUE);
		assertEquals(-2, res);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
