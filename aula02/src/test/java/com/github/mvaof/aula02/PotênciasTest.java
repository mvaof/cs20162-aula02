package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PotênciasTest {

	@Test(expected = IllegalArgumentException.class)
	public void testPrimeiroValorInvalido() {
		Potências.potencia(-1,3);
	}
	    @Test(expected = IllegalArgumentException.class)
	    public void testSegundoValorInvalido() throws Exception {
	        Potências.potencia(1, -9);
	}
	
	@Test
	public void potênciaTrivial(){
		assertEquals(4, Potências.potencia(2,2));
	}@Test
    public void testDeFronteira() {
        Assert.assertEquals(1, Potências.potencia(10, 0));
        Assert.assertEquals(1, Potências.potencia(5, 0));
}
	
	@Test
    public void testInstanciar() {
        new Potências();
    }

}
