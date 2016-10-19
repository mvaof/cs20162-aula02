/**
 * Copyright (c) 2016. F�brica de Software - Instituto de Inform�tica (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;
/**
* Implementa��o do c�lculo do maior divisor comum.
* @author Marcus
*/
public class MDC {

    /**
     * Obt�m o calculo do MDC.
     * @param a primeiro n�mero.
     * @param b segundo n�mero.
     * @throws IllegalArgumentException se a menor que b ou b menor que 1.
     * @return O maximo divisor comum entre os n�meros de entrada.
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