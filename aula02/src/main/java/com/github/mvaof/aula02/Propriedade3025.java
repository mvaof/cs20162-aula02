/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;
/**
 * Implementa a verificação da propriedade 3025.
 * @author Marcus
 */

public class Propriedade3025 {
	/**
	 * Verifica se o parâmetro possui a propriedade 3025.
	 * @param n Número cuja a existência da propriedade se quer verificar. Valor entre 0 e 9999, inclusive.
	 * @return True se o quadrado da soma de i e j for igual a n.
	 * @throws IllegalArgumentException Se a entrada for inválida (menor que 0 ou maior que 9999)
	 */

	public static boolean propriedade(int n) throws IllegalArgumentException{

		if (n < 0 || n > 9999) {
			throw new IllegalArgumentException("Não é permitido número negativo ou maior que 9999!");
			
		} 
			int i = n / 100;
			int j = n % 100;

		return ((i + j) * (i + j)) == n;

	}
}
	