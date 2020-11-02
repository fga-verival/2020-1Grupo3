package test;

import org.junit.Before;
import org.junit.Test;

import app.CDB;

import static org.junit.Assert.assertEquals;

public class TesteCalculoRendimentoBruto{
	private CDB cdb;
	
    @Before
    public void setup(){
    	cdb = new CDB();
    }

    @Test
    public void testeCalculoRendimento(){
    	float val = cdb.redimentoBruto(60, 1000f, 8.5f);
        assertEquals(13.97f, val, 0); 
    }
    
    @Test
    public void testeCalculoRendimento2(){
    	float val = cdb.redimentoBruto(120, 500f, 8f);
        assertEquals(13.15f, val, 0); 
    }
}