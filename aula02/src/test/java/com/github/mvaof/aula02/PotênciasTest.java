package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Test;

public class PotênciasTest {

	@Test(expected = IllegalArgumentException.class)
	public void valorMenorOuIgualA0() {
		Soma.somaNaturais(-1);
	}
	@Test
	public void potênciaTrivial(){
		assertEquals(4, Potências.potencia(2,2));
	}
	@Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new Potências();
    }

}
