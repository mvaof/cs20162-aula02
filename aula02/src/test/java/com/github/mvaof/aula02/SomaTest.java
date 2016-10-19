
package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomaTest {

	@Test(expected = IllegalArgumentException.class)
	public void valorMenorQueUm() {
		Soma.somaNaturais(-1);
	}
	@Test
	public void somaTrivial(){
		assertEquals(3, Soma.somaNaturais(2));
	}
	@Test
    public void testInstanciar() {
        new Soma();
    }
}
