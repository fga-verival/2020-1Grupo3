package test;

import org.junit.Before;
import org.junit.Test;

import app.CDB;

import static org.junit.Assert.assertEquals;

public class TesteImpostoRenda{
	
	private CDB cdb;
	
	@Before
	public void setup(){
		cdb = new CDB();
		
	}

	@Test
	public void testGetImpostoImpostoRenda() {
		cdb.qtDias=180;
		cdb.rendBruto=20;
		float result = cdb.getImposto();
		assertEquals(result, cdb.getImposto(), 0.01);	
	}
	
	@Test
	public void testGetImpostoImpostoRenda2() {
		cdb.qtDias=90;
		cdb.rendBruto=20;
		float result = cdb.getImposto();
		assertEquals(result, cdb.getImposto(), 0.01);	
	}
	


}
