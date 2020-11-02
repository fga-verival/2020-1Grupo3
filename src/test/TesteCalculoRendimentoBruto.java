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
}