package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimoTest {

		@Test(expected = IllegalArgumentException.class)
		public void valorMenorQueUm() {
			Soma.somaNaturais(-1);
		}
		@Test
		public void testTrivial(){
			assertEquals(true, Primo.primo(2));
		}
		@Test
	    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
	        new Soma();
	    }

}
