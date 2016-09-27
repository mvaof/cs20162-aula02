/**
 * Copyright (c) 2016. F�brica de Software - Instituto de Inform�tica (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;

/**
 * Implementa��o do c�lculo do produto de dois n�meros naturais atrav�s do menor n�mero de soma.
 * @author Marcus
 */

public class Produto {
	
	/**
	 * Obt�m o produto de dois numeros naturais.
	 * @param a Primeiro fator da multiplica��o. Valor maior ou igual a 0.
	 * @param b Segundo fator da multiplica��o. Valor maior ou igual a 0.
	 * @return Retorna o valor correspondente da soma dos dois par�metros.
	 * @throws IllegalArgumentException Se o n�mero for inv�lido (menor ou igual a 0)
	 */

	public static int produto(int a, int b) throws IllegalArgumentException{

		int i = 1;
		int s = 0;

		if (a <= 0 && b <= 0) {
			throw new IllegalArgumentException("N�o � permitido n�mero negativo!");
		}
		int totalParcelas = a;
		int parcelas = b;

		if (b < a) {
			totalParcelas = b;
			parcelas = a;
		}

		while (i <= totalParcelas) {
			s += parcelas;
			i++;
		}

		return s;

	}

}