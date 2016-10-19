package com.github.mvaof.aula02;

import org.junit.Assert;
import org.junit.Test;

public class HarmonicoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Harmonico.harmonico(-3);
    }

    @Test
    public void testDeFronteira() {
        Assert.assertEquals(1, Harmonico.harmonico(1), 0.00001d);
    }

    @Test
    public void testTrivial() {
        Assert.assertEquals(1, Harmonico.harmonico(10), 0.001d);
    }
    @Test
    public void testInstanciar() {
        new Harmonico();
    }
}