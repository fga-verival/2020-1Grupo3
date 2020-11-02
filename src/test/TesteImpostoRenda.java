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
	public void testCalcularImpostoRenda() {
		cdb.redimentoBruto(60, 1000f, 8.5f);
		assertEquals(3.14f, cdb.getImposto(),0.01);	
   }
}