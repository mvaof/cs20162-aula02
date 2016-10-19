package com.github.mvaof.aula02;

/**
 * Implementação do cálculo do Número-Harmônico.
 *  @author Marcus
 */

public class Harmonico {

    /**
     * Ontém o cálculo do Número-Harmônico.
     * @param n número inteiro.
     * @throws IllegalArgumentException se n menor que 1.
     * @return número harmônico.
     */

    public static double harmonico(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        double s = 1;
        for (int i = 2; i <= n ; i++) {
            s = s + 1 / i;
        }

        return s;
    }
}