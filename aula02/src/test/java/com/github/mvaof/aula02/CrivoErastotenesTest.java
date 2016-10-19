package com.github.mvaof.aula02;

import org.junit.Assert;
import org.junit.Test;

public class CrivoErastotenesTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() {
        CrivoErastotenes.crivoEratostenes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVetorDeTamanhoUm() {
    	CrivoErastotenes.crivoEratostenes(new int[]{1}, 2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testVetorMenorInvalido() {
    	CrivoErastotenes.crivoEratostenes(new int[]{1, 3, 5, 6, 8}, 2);
    }


    @Test
    public void testVetorTresPosicao() {
        int[] a = {1, 2, 0};
        CrivoErastotenes.crivoEratostenes(a, 2);
        Assert.assertEquals(0, a[2]);
    }

    @Test
    public void testVetorSetePosicao() {
        int[] a = {1, 2, 0, 0, 0, 0, 0};
        CrivoErastotenes.crivoEratostenes(a, 6);
        Assert.assertEquals(1, a[6]);
    }
    @Test
    public void testInstanciar() {
        new CrivoErastotenes();
    }

}
