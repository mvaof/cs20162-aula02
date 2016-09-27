/**
 * Copyright (c) 2016. F�brica de Software - Instituto de Inform�tica (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;

/**
 * Implementa��o da verifica��o de a propriedade n�mero primo.
 * @author Marcus
 */

public class Primo {
	/**
	 * Verifica se o n�mero de entrada � primo.
	 * @param n N�mero de entrada (o qual se deseja verificar a propriedade). Valor maior ou igual a 1.
	 * @return True caso o n�mero de entrada for primo, caso contr�rio, retorna false.
	 * @throws IllegalArgumentException Se o n�mero for inv�lido (menor que 1)
	 */

	public static boolean primo(int n) throws IllegalArgumentException{

		if (n < 1) {
			throw new IllegalArgumentException("N�o � permitido n�mero menor ou igual a 1!");
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