package com.github.mvaof.aula02;

/**
 * Implementa��o do c�lculo do N�mero-Harm�nico.
 *  @author Marcus
 */

public class Harmonico {

    /**
     * Ont�m o c�lculo do N�mero-Harm�nico.
     * @param n n�mero inteiro.
     * @throws IllegalArgumentException se n menor que 1.
     * @return n�mero harm�nico.
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