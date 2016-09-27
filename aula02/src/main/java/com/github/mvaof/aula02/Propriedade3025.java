/**
 * Copyright (c) 2016. F�brica de Software - Instituto de Inform�tica (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;
/**
 * Implementa a verifica��o da propriedade 3025.
 * @author Marcus
 */

public class Propriedade3025 {
	/**
	 * Verifica se o par�metro possui a propriedade 3025.
	 * @param n N�mero cuja a exist�ncia da propriedade se quer verificar. Valor entre 0 e 9999, inclusive.
	 * @return True se o quadrado da soma de i e j for igual a n.
	 * @throws IllegalArgumentException Se a entrada for inv�lida (menor que 0 ou maior que 9999)
	 */

	public static boolean propriedade(int n) throws IllegalArgumentException{

		if (n < 0 || n > 9999) {
			throw new IllegalArgumentException("N�o � permitido n�mero negativo ou maior que 9999!");
			
		} 
			int i = n / 100;
			int j = n % 100;

		return ((i + j) * (i + j)) == n;

	}
}
	