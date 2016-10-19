package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PrimoTest {

	@Test(expected = IllegalArgumentException.class)
	public void valorMenorQueUm() {
		Primo.primo(-1);
	}

	@Test
	public void testTrivial() {
		assertEquals(true, Primo.primo(2));
		assertEquals(false, Primo.primo(4));
	}

	@Test
	public void testDeFronteira() {
		Assert.assertEquals(true, Primo.primo(1));
	}

	@Test
	public void testInstanciar() {
		new Primo();
	}

}
