package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoTest {

	@Test(expected = IllegalArgumentException.class)
	public void valorMenorQueUm() {
		Produto.produto(0, -1);
	}
	@Test
	public void produtoTrivial(){
		assertEquals(4, Produto.produto(2, 2) );
	}
	@Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new Produto();
    }

}
