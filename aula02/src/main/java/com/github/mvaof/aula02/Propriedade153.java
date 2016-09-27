/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;
/**
 * Implementa a verificação da propriedade 153, na qual a soma dos cubos de cada algarismo é 153.
 * @author Marcus
 */
public class Propriedade153 {
	/**
	 * Verifica se o parâmetro possui a propriedade 153.
	 * @param n Número cuja a existência da propriedade se quer verificar. Valor entre 0 e 9999, inclusive.
	 * @return True se a soma dos cubos dos algaritmos da entrada for igual a própria entrada.
	 * @throws IllegalArgumentException Se a entrada for inválida (menor que 0 ou maior que 9999)
	 */

	public static boolean propriedade (int n) throws IllegalArgumentException {
		

		if (n < 0 || n > 9999) {
			throw new IllegalArgumentException("Não é permitido número negativo ou maior que 9999!");
			
		} 
		int i = n / 100;
		int j = (n - 100 * i) / 10;
		int k = n % 10;

		return (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3)) == n;

	}

}