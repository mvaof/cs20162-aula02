/**
 * Copyright (c) 2016. F�brica de Software - Instituto de Inform�tica (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;

/**
 * Implementa��o do c�lculo da soma dos n�meros naturais
 * @author Marcus
 *
 */


public class Soma {
/**
 * Obt�m a soma dos numeros naturais de 1 a n.
 * @param n O n�mero cuja soma dos antecessores somado a ele se quer obter. Valor maior ou igual a 1.
 * @return A soma dos n�meros inteiros partindo de 1 at� n.
 * @throws IllegalArgumentException Se o n�mero for invalido (n menor do que 1)
 */
	public static int somaNaturais(int n) {

		int i = 2;
		int s = 1;

		if (n <= 1) {
			throw new IllegalArgumentException("N�o � permitido n�mero negativo!");
		}
		while (i <= n) {
			s += i;
			i++;
		}

		return s;

	}

}
