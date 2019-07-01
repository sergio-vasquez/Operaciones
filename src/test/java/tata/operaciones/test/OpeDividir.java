package tata.operaciones.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tat.operaciones.ope.Operaciones;

public class OpeDividir {
	
	private Operaciones ope;
	

	@Before
	public void setUp() throws Exception {
		this.ope =  new Operaciones();
	}

	@Test
	public void cuandoB0Entonces0() {
		
		double res =  this.ope.dividir(152, 0);
		
		assertTrue("es: "+ res  +" pero deberia ser 0 : "+res, res==0);
	}
	
	
	@Test
	public void cuando15div20entonces0_75() {
		
		double res =  this.ope.dividir(15,20);
		
		assertTrue("es: "+ res  +" pero deberia ser 0.75 : "+res, res==0.75d);
	}


}
