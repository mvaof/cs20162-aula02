package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pot�nciasTest {

	@Test(expected = IllegalArgumentException.class)
	public void valorMenorOuIgualA0() {
		Soma.somaNaturais(-1);
	}
	@Test
	public void pot�nciaTrivial(){
		assertEquals(4, Pot�ncias.potencia(2,2));
	}
	@Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new Pot�ncias();
    }

}
