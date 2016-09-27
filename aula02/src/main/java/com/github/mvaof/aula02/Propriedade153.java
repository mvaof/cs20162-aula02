/**
 * Copyright (c) 2016. F�brica de Software - Instituto de Inform�tica (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula02;
/**
 * Implementa a verifica��o da propriedade 153, na qual a soma dos cubos de cada algarismo � 153.
 * @author Marcus
 */
public class Propriedade153 {
	/**
	 * Verifica se o par�metro possui a propriedade 153.
	 * @param n N�mero cuja a exist�ncia da propriedade se quer verificar. Valor entre 0 e 9999, inclusive.
	 * @return True se a soma dos cubos dos algaritmos da entrada for igual a pr�pria entrada.
	 * @throws IllegalArgumentException Se a entrada for inv�lida (menor que 0 ou maior que 9999)
	 */

	public static boolean propriedade (int n) throws IllegalArgumentException {
		

		if (n < 0 || n > 9999) {
			throw new IllegalArgumentException("N�o � permitido n�mero negativo ou maior que 9999!");
			
		} 
		int i = n / 100;
		int j = (n - 100 * i) / 10;
		int k = n % 10;

		return (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3)) == n;

	}

}