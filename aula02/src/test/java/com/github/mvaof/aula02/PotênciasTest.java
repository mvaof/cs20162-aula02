package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Pot�nciasTest {

	@Test(expected = IllegalArgumentException.class)
	public void testPrimeiroValorInvalido() {
		Pot�ncias.potencia(-1,3);
	}
	    @Test(expected = IllegalArgumentException.class)
	    public void testSegundoValorInvalido() throws Exception {
	        Pot�ncias.potencia(1, -9);
	}
	
	@Test
	public void pot�nciaTrivial(){
		assertEquals(4, Pot�ncias.potencia(2,2));
	}@Test
    public void testDeFronteira() {
        Assert.assertEquals(1, Pot�ncias.potencia(10, 0));
        Assert.assertEquals(1, Pot�ncias.potencia(5, 0));
}
	
	@Test
    public void testInstanciar() {
        new Pot�ncias();
    }

}
