
/**
 * Copyright (c) 2016. F�brica de Software - Instituto de Inform�tica (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
 
package com.github.mvaof.aula02;
 /**
 * Implementa��o do m�todo Crivo de Erast�tenes.
 * @author Marcus
 */

public class CrivoErastotenes {

    /**
     * Servi�o para verificar o Crivo-Erat�stenes.
     * @param a vetor de inteiros.
     * @param n n�mero inteiro.
     * @throws IllegalArgumentException se n menor que 2.
     * @throws IllegalArgumentException para vetor com tamanho menor que n + 1.
     * @throws IllegalArgumentException para vetor com valor diferente de 0 a partir da posi��o 2 inclusive.
     */

    public static void crivoEratostenes(int[] a, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("N�mero n invalido");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("Este tamanho de vetor n�o pe suportado");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("valores de preenchimentos n�o s�o v�lidos");
            }
        }

        int i = 2;
        int c = 0;
        while (i <= n / 2) {
            if (a[i] == 0) {
                c = i + i;

                while (c <= n) {
                    a[c] = 1;
                    c += i;
                }
            }

            i += 1;
        }
    }
}