package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.CDB;

public class TesteCalculoRendimentoLiquido {

	private CDB cdb;

	@Before
	public void setup() {
		cdb = new CDB();
	}
	
	@Test
	public void testCalcularRendimentoLiquido() {
		// fail("Not yet implemented");

		cdb.redimentoBruto(550, 400f, 8.0f);
		assertEquals(9.945f, cdb.calcularRendimentoLiquido(), 0);
	}
}
