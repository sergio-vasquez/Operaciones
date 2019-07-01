package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tat.operaciones.ope.Operaciones;

public class OperacionesRestarTest {
	
	private Operaciones ope;

	@Before
	public void setUp() throws Exception {
		this.ope = new Operaciones();
	}

	@Test
	public void cuando15menos5Entonces10() {
		int res = this.ope.restar(15, 5);
		
		assertTrue("deberia ser 10 pero es. "+res, res==10);
	}
	
	
	@Test
	public void cuandoBmayorAEntonces0() {
		
		int res = this.ope.restar(0,15);
		
		assertTrue("deberia ser 0 pero es. "+res, res==0);
	}
	
	@Test
	public void cuandomaxmenosmaxEntonces0() {
		
		int res = this.ope.restar(Integer.MAX_VALUE, Integer.MAX_VALUE);
		
		assertTrue("deberia ser 0 pero es. "+res, res==0);
	}

}
