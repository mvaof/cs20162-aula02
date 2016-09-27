/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;

/**
 * Implementação do cálculo da soma dos números naturais
 * @author Marcus
 *
 */


public class Soma {
/**
 * Obtém a soma dos numeros naturais de 1 a n.
 * @param n O número cuja soma dos antecessores somado a ele se quer obter. Valor maior ou igual a 1.
 * @return A soma dos números inteiros partindo de 1 até n.
 * @throws IllegalArgumentException Se o número for invalido (n menor do que 1)
 */
	public static int somaNaturais(int n) {

		int i = 2;
		int s = 1;

		if (n <= 1) {
			throw new IllegalArgumentException("Não é permitido número negativo!");
		}
		while (i <= n) {
			s += i;
			i++;
		}

		return s;

	}

}
