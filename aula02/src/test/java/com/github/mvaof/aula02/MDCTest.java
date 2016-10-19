package com.github.mvaof.aula02;

import org.junit.Assert;
import org.junit.Test;

public class MDCTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroCasoInvalido() throws Exception {
        MDC.mdc(-2, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoCasoInvalido() throws Exception {
    	 MDC.mdc(2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroCasoInvalido() throws Exception {
    	 MDC.mdc(15, -3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuartoCasoInvalido() throws Exception {
    	 MDC.mdc(5, 6);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(1,  MDC.mdc(1, 1));
        Assert.assertEquals(3,  MDC.mdc(3, 3));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(1, MDC.mdc(3, 1));
        
    }
    @Test
    public void testInstanciar() {
        new MDC();
    }

}