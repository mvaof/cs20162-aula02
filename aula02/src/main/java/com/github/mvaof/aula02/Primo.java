/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;

/**
 * Implementação da verificação de a propriedade número primo.
 * @author Marcus
 */

public class Primo {
	/**
	 * Verifica se o número de entrada é primo.
	 * @param n Número de entrada (o qual se deseja verificar a propriedade). Valor maior ou igual a 1.
	 * @return True caso o número de entrada for primo, caso contrário, retorna false.
	 * @throws IllegalArgumentException Se o número for inválido (menor que 1)
	 */

	public static boolean primo(int n) throws IllegalArgumentException{

		if (n < 1) {
			throw new IllegalArgumentException("Não é permitido número menor ou igual a 1!");
		}
		
		int i = 2;
		while (i <= (n - 1)) {

			if (n % i == 0) {
				return false;
			}
			i++;
		}

		return true;
	}
}