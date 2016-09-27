/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;

/**
 * Implementação do cálculo do produto de dois números naturais através do menor número de soma.
 * @author Marcus
 */

public class Produto {
	
	/**
	 * Obtém o produto de dois numeros naturais.
	 * @param a Primeiro fator da multiplicação. Valor maior ou igual a 0.
	 * @param b Segundo fator da multiplicação. Valor maior ou igual a 0.
	 * @return Retorna o valor correspondente da soma dos dois parâmetros.
	 * @throws IllegalArgumentException Se o número for inválido (menor ou igual a 0)
	 */

	public static int produto(int a, int b) throws IllegalArgumentException{

		int i = 1;
		int s = 0;

		if (a <= 0 && b <= 0) {
			throw new IllegalArgumentException("Não é permitido número negativo!");
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