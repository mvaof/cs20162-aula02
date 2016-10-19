package com.github.mvaof.aula02;

import static org.junit.Assert.*;

import org.junit.Assert;
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
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Produto.produto(0, 1));
        Assert.assertEquals(0, Produto.produto(1, 0));
        Assert.assertEquals(10, Produto.produto(1, 10));
        Assert.assertEquals(10, Produto.produto(10, 1));
}
	@Test
    public void testInstanciar() {
        new Produto();
    }

}
