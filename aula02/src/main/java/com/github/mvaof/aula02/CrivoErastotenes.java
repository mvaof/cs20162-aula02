
/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
 
package com.github.mvaof.aula02;
 /**
 * Implementação do método Crivo de Erastótenes.
 * @author Marcus
 */

public class CrivoErastotenes {

    /**
     * Serviço para verificar o Crivo-Eratóstenes.
     * @param a vetor de inteiros.
     * @param n número inteiro.
     * @throws IllegalArgumentException se n menor que 2.
     * @throws IllegalArgumentException para vetor com tamanho menor que n + 1.
     * @throws IllegalArgumentException para vetor com valor diferente de 0 a partir da posição 2 inclusive.
     */

    public static void crivoEratostenes(int[] a, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Número n invalido");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("Este tamanho de vetor não pe suportado");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("valores de preenchimentos não são válidos");
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