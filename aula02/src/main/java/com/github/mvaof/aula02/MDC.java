/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;
/**
* Implementação do cálculo do maior divisor comum.
* @author Marcus
*/
public class MDC {

    /**
     * Obtém o calculo do MDC.
     * @param a primeiro número.
     * @param b segundo número.
     * @throws IllegalArgumentException se a menor que b ou b menor que 1.
     * @return O maximo divisor comum entre os números de entrada.
     */

    public static int mdc(int a, int b) {
        if (a < b || b < 1) {
            throw new IllegalArgumentException("a ou b invalido");
        }

        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}