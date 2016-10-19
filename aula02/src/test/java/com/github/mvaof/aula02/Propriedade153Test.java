package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Test;

public class Propriedade153Test {

	@Test(expected = IllegalArgumentException.class)
	public void valorMenorQue0() {
		Propriedade153.propriedade(-1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void valorMaiorQue9999() {
		Propriedade153.propriedade(10000);
	}
	@Test
	public void testTrivial(){
		assertEquals(true, Propriedade153.propriedade(153));
		assertEquals(false, Propriedade153.propriedade(150));
	}
	@Test
    public void testInstanciar() {
        new Propriedade153();
    }

}
